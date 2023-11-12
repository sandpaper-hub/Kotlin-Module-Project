package fragments

import InputReader
import dataPack.Archive
import dataPack.DataManager
import dataPack.Menu
import enums.Command
import enums.FragmentName
import enums.SystemMessage
import printMenu

class NoteListFragment(private val archive: Archive?) {
    private val menu = Menu("${FragmentName.NOTE_IN_ARCHIVE_MENU} ${archive?.name}", mutableMapOf())

    init {
        var count = 1
        for (command in DataManager.archiveMap[archive?.name]?.notesList!!) {
            menu.mapOfCommand[count] = command.name
            count++
        }
    }

    private fun showMenu() {
        if (DataManager.archiveMap[archive?.name]?.notesList?.isEmpty()!!) {
            SystemMessage.EMPTY_NOTE_LIST.printMessage()
        } else {
            printMenu(menu)
        }
        println("${menu.mapOfCommand.size + 1} ${Command.BACK}")
    }

    fun startFragment() {
        val commandQuantity = menu.mapOfCommand.size
        while (true) {
            showMenu()
            when (val command = InputReader.readCommand()) {
                in 1..commandQuantity -> NoteFragment(DataManager.archiveMap[archive?.name]?.notesList?.get(command-1)).showContent()
                commandQuantity + 1 -> return
                else -> SystemMessage.NON_EXISTENT_COMMAND.printMessage()
            }
        }
    }
}