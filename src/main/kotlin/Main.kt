import enums.SystemMessage
import fragments.MainFragment

fun main() {
    SystemMessage.HELLO.printMessage()
    val mainFragment = MainFragment()
    mainFragment.startFragment()
}