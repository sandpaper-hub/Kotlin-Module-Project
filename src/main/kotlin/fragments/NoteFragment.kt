package fragments

import dataPack.Note

class NoteFragment(private val note: Note?) {
    fun showContent() {
        println("───────────────────────────────────")
        println("Текст заметки \"${note?.name}\"")
        println(note?.content)
        println("───────────────────────────────────")
    }
}