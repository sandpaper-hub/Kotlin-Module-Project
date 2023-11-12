package enums

enum class SystemMessage(private val content: String) {
    HELLO("Добро пожаловать в NoteApp"),
    NON_EXISTENT_COMMAND("Несуществующая команда"),
    INPUT_ARCHIVE_NAME("Введите имя архива"),
    EMPTY_ARCHIVE_LIST("Список архивов пуст"),
    EMPTY_NOTE_LIST("Список заметок пуст"),
    ARCHIVE_NAME_ALREADY_EXIST("Архив с таким именем уже существует"),
    INPUT_NOTE_NAME("Введите название заметки"),
    NOTE_NAME_ALREADY_EXIST("Заметка с таким именем уже существует"),
    INPUT_NOTE_CONTENT("Введите текст заметки"),
    INPUT_COMMAND("Введите число, соответствующее команде"),
    INCORRECT_DATA("Некорректные данные"),
    INCORRECT_NAME("Имя не должно быть пустым и длиннее 100 символов"),
    INCORRECT_CONTENT("Содержание заметки не может быть пустым"),
    CREATE_NOTE("Создаем заметку...");


    fun printMessage() {
        println(this)
    }

    override fun toString(): String {
        return content
    }


}