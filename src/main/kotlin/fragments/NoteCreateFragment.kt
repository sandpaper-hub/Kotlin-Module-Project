package fragments

import dataPack.Archive
import dataPack.DataManager
import enums.SystemMessage

class NoteCreateFragment(archive: Archive) {
    init {
        SystemMessage.CREATE_NOTE.printMessage()
        DataManager.addNote(archive)
    }
}