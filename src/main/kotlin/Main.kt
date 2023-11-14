import util.printMessage
import fragments.ArchiveListFragment

fun main() {
    util.SystemMessage.HELLO.printMessage()
    val archiveListFragment = ArchiveListFragment()
    archiveListFragment.startFragment()
}