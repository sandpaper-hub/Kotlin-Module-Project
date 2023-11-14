package fragments

import dataPack.Archive
import dataPack.DataManager
import util.printMessage

class NoteCreateFragment(archive: Archive) {
    init {
        util.SystemMessage.CREATE_NOTE.printMessage()
        DataManager.addNote(archive)
    }
}