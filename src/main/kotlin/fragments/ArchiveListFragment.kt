package fragments

import InputReader
import dataPack.DataManager
import dataPack.Menu
import enums.Command
import enums.SystemMessage
import printMenu

class ArchiveListFragment {
    private val menu = Menu("Список архивов", mutableMapOf())

    init {
        var count = 1
        for (command in DataManager.archiveMap) {
            menu.mapOfCommand[count] = command.key
            count++
        }
    }

    private fun showMenu() {
        if (DataManager.archiveMap.isEmpty()) {
            SystemMessage.EMPTY_ARCHIVE_LIST.printMessage()
        } else {
            printMenu(menu)
        }
        println("${menu.mapOfCommand.size+1} ${Command.BACK}")
    }

    fun startFragment() {
        val commandQuantity = menu.mapOfCommand.size
        while (true) {
            showMenu()
            when (val command = InputReader.readCommand()) {
                in 1..commandQuantity -> InArchiveFragment(DataManager.archiveMap[menu.mapOfCommand[command].toString()]).startFragment()
                commandQuantity + 1 -> return
                else -> SystemMessage.NON_EXISTENT_COMMAND.printMessage()
            }
        }
    }
}