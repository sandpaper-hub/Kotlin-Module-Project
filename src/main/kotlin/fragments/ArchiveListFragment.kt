package fragments

import InputReader
import dataPack.DataManager
import dataPack.Menu
import enums.Command
import enums.SystemMessage
import printMenu
import kotlin.system.exitProcess

class ArchiveListFragment {
    private val menu = Menu(
        "Список архивов", mutableMapOf(
            0 to Command.EXIT.toString(),
            1 to Command.CREATE_ARCHIVE.toString()
        )
    )

    private fun initializeMenu() {
        var count = 2
        for (command in DataManager.archiveMap) {
            menu.mapOfCommand[count] = command.key
            count++
        }
    }

    private fun showMenu() {
        initializeMenu()
        printMenu(menu)
        if (DataManager.archiveMap.isEmpty()) {
            SystemMessage.EMPTY_ARCHIVE_LIST.printMessage()
        }
    }

    fun startFragment() {
        while (true) {
            val archiveListSize = DataManager.archiveMap.size + 1
            showMenu()
            when (val command = InputReader.readCommand()) {
                0 -> exitProcess(0)
                1 -> ArchiveCreateFragment()
                in 2..archiveListSize -> NoteListFragment(DataManager.archiveMap[menu.mapOfCommand[command].toString()]!!).startFragment()
                else -> SystemMessage.NON_EXISTENT_COMMAND.printMessage()
            }
        }
    }
}