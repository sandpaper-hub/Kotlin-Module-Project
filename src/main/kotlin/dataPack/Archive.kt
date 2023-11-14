package dataPack

data class Archive(val name: String, val notesList: ArrayList<Note>) {

    override fun toString(): String {
        return "Архив \"$name\""
    }
}