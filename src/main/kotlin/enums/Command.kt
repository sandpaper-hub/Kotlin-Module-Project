package enums

enum class Command(private val content: String) {
    CREATE_ARCHIVE("Создать архив"),
    EXIT("Выход"),
    CREATE_NOTE("Создать заметку"),
    BACK("Назад");

    override fun toString(): String {
        return content
    }


}