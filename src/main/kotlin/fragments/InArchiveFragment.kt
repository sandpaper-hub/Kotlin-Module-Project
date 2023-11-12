package fragments

import InputReader
import dataPack.Archive
import dataPack.Menu
import enums.Command
import enums.FragmentName
import printMenu

class InArchiveFragment(private val archive: Archive?) {
    private val menu = Menu(
        "${FragmentName.ARCHIVE_MENU} \"${archive?.name}\"", mutableMapOf(
            1 to Command.CREATE_NOTE.toString(),
            2 to Command.NOTE_LIST.toString(),
            3 to Command.BACK.toString()
        )
    )

    fun startFragment() {
        while (true) {
            printMenu(menu)
            when (InputReader.readCommand()) {
                1 -> NoteCreateFragment(archive)
                2 -> NoteListFragment(archive).startFragment()
                3 -> return
            }
        }
    }
}