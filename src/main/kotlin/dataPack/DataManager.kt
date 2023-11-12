package dataPack

import InputReader
import enums.SystemMessage

object DataManager {
    val archiveMap: MutableMap<String, Archive> = mutableMapOf()

    fun addArchive() {
        val name = InputReader.readName()
        if (archiveMap.contains(name)) {
            SystemMessage.ARCHIVE_NAME_ALREADY_EXIST.printMessage()
        } else {
            archiveMap[name] = Archive(name, arrayListOf())
            println("Архив \"$name\" успешно создан!")
        }
    }

    fun addNote(archive: Archive?) {
        SystemMessage.INPUT_NOTE_NAME.printMessage()
        val noteName = InputReader.readName()
        for (note in archive?.notesList!!) {
            if (note.name == noteName) {
                SystemMessage.NOTE_NAME_ALREADY_EXIST.printMessage()
                return
            }
        }
        SystemMessage.INPUT_NOTE_CONTENT.printMessage()
        val content = InputReader.readContent()
        archive.notesList.add(Note(noteName, content))
        println("Заметка $noteName успешно создана")
    }
}