package seven.smart.app.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import seven.smart.app.screens.HomeScreen
import seven.smart.app.screens.StartScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    NavHost(navController, startDestination = Screens.Start.name) {
        composable(Screens.Start.name) { StartScreen(navController) }
        composable(Screens.Home.name) { HomeScreen(navController) }
    }
}