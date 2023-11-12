package fragments

import InputReader
import dataPack.Menu
import enums.Command
import enums.FragmentName
import enums.SystemMessage
import printMenu
import kotlin.system.exitProcess

class MainFragment {
    private val menu = Menu(
        FragmentName.MAIN_MENU.toString(), mutableMapOf(
            1 to Command.CREATE_ARCHIVE.toString(),
            2 to Command.ARCHIVE_LIST.toString(),
            3 to Command.EXIT.toString()
        )
    )

    fun startFragment() {
        while (true) {
            printMenu(menu)
            when (InputReader.readCommand()) {
                1 -> ArchiveCreateFragment()
                2 -> ArchiveListFragment().startFragment()
                3 -> exitProcess(0)
                else -> SystemMessage.NON_EXISTENT_COMMAND.printMessage()
            }
        }
    }
}