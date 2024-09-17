package seven.smart.app.navigation

import org.jetbrains.compose.resources.StringResource
import scheduler.composeapp.generated.resources.Res
import scheduler.composeapp.generated.resources.initial_screen
import scheduler.composeapp.generated.resources.main_screen

enum class Screens(val title: StringResource) {
    Start(title = Res.string.initial_screen),
    Home(title = Res.string.main_screen),
}