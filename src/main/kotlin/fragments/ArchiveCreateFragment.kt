package fragments

import dataPack.DataManager
import enums.SystemMessage

class ArchiveCreateFragment {
    init {
        SystemMessage.INPUT_ARCHIVE_NAME.printMessage()
        DataManager.addArchive()
    }
}