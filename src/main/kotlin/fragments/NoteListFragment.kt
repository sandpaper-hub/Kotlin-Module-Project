package fragments

import util.InputReader
import dataPack.Archive
import dataPack.Menu
import enums.Command
import enums.FragmentName
import util.printMenu
import util.printMessage

class NoteListFragment(private val archive: Archive) {
    private val menu = Menu(
        "${FragmentName.NOTE_IN_ARCHIVE_MENU} ${archive.name}", mutableMapOf(
            0 to Command.BACK.toString(),
            1 to Command.CREATE_NOTE.toString()
        )
    )

    private fun initializeMenu() {
        var count = 2
        for (command in archive.notesList) {
            menu.mapOfCommand[count] = command.name
            count++
        }
    }

    private fun showMenu() {
        initializeMenu()
        printMenu(menu)
        if (archive.notesList.isEmpty()) {
            util.SystemMessage.EMPTY_NOTE_LIST.printMessage()
        }
    }

    fun startFragment() {
        while (true) {
            val noteListSize = archive.notesList.size + 1
            showMenu()
            when (val command = InputReader.readCommand()) {
                -1 -> util.SystemMessage.INCORRECT_DATA.printMessage()
                0 -> return
                1 -> NoteCreateFragment(archive)
                in 2..noteListSize -> NoteFragment(archive.notesList[command - 2]).showContent()
                else -> util.SystemMessage.NON_EXISTENT_COMMAND.printMessage()
            }
        }
    }
}