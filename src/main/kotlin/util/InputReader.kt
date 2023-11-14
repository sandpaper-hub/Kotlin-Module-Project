package util

import java.lang.NumberFormatException
import java.util.Scanner

object InputReader {
    private val scanner: Scanner = Scanner(System.`in`)
    fun readCommand(): Int {
        SystemMessage.INPUT_COMMAND.printMessage()
        val input = scanner.nextLine()
        return try {
            input.toInt()
        } catch (e: NumberFormatException) {
            -1
        }
    }

    fun readName(): String {
        var name: String
        while (true) {
            name = scanner.nextLine()
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
            content = scanner.nextLine()
            if (content.isNotBlank()) {
                break
            } else {
                SystemMessage.INCORRECT_CONTENT.printMessage()
            }
        }
        return content
    }
}