package enums

enum class FragmentName(private val fragmentName: String) {
    MAIN_MENU("Главное меню"),
    ARCHIVE_MENU("Меню архива"),
    NOTE_IN_ARCHIVE_MENU("Меню заметок в архиве");

    override fun toString(): String {
        return fragmentName
    }


}