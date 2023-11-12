import dataPack.Menu

fun printMenu(menu: Menu) {
    println("\n★★★ ${menu.name} ★★★")
    for (command in menu.mapOfCommand) {
        println("${command.key} ${command.value}")
    }
}