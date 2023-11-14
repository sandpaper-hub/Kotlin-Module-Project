package fragments

import dataPack.DataManager
import util.printMessage

class ArchiveCreateFragment {
    init {
        util.SystemMessage.INPUT_ARCHIVE_NAME.printMessage()
        DataManager.addArchive()
    }
}