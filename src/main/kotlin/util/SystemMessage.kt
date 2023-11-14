package util

class SystemMessage {
    companion object {
        const val HELLO = "Добро пожаловать в NoteApp"
        const val NON_EXISTENT_COMMAND = "Несуществующая команда"
        const val INPUT_ARCHIVE_NAME = "Введите имя архива"
        const val EMPTY_ARCHIVE_LIST = "\u001B[31m↑↑↑ Список архивов пуст ↑↑↑\u001B[0m"
        const val EMPTY_NOTE_LIST = "\u001B[31m↑↑↑ Список заметок пуст ↑↑↑\u001B[0m"
        const val ARCHIVE_NAME_ALREADY_EXIST = "Архив с таким именем уже существует"
        const val INPUT_NOTE_NAME = "Введите название заметки"
        const val NOTE_NAME_ALREADY_EXIST = "Заметка с таким именем уже существует"
        const val INPUT_NOTE_CONTENT = "Введите текст заметки"
        const val INPUT_COMMAND = "Введите число, соответствующее команде"
        const val INCORRECT_NAME = "Имя не должно быть пустым и длиннее 100 символов"
        const val INCORRECT_CONTENT = "Содержание заметки не может быть пустым"
        const val CREATE_NOTE = "Создаем заметку..."
        const val INCORRECT_DATA = "Некорректные данные! Введите номер команды без пробелов и других символов"
    }

}

fun String.printMessage() {
    println(this)
}
