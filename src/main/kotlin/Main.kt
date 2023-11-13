import enums.SystemMessage
import fragments.ArchiveListFragment

fun main() {
    SystemMessage.HELLO.printMessage()
    val archiveListFragment = ArchiveListFragment()
    archiveListFragment.startFragment()
}