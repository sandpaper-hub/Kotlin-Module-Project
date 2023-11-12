import enums.SystemMessage
import java.util.Scanner

object InputReader {
    private val scanner: Scanner = Scanner(System.`in`)
    fun readCommand(): Int {
        SystemMessage.INPUT_COMMAND.printMessage()
        while (true) {
            val input: Int
            if (scanner.hasNextInt()) {
                input = scanner.nextInt()
                return input
            } else {
                SystemMessage.INCORRECT_DATA.printMessage()
                scanner.next()
            }
        }
    }

    fun readName(): String {
        var name: String
        while (true) {
            name = scanner.next()
            if (name.isNotBlank() && name.length <= 100) {
                break
            } else {
                SystemMessage.INCORRECT_NAME.printMessage()
            }
        }
        return name
    }

    fun readContent(): String {
        var content: String
        while (true) {
            content = scanner.next()
            if (content.isNotBlank()) {
                break
            } else {
                SystemMessage.INCORRECT_CONTENT.printMessage()
            }
        }
        return content
    }
}