package enums

enum class Command(private val content: String) {
    CREATE_ARCHIVE("Создать архив"),
    ARCHIVE_LIST("Список архивов"),
    EXIT("Выход"),
    CREATE_NOTE("Создать заметку"),
    NOTE_LIST("Список заметок"),
    BACK("Назад");

    override fun toString(): String {
        return content
    }


}