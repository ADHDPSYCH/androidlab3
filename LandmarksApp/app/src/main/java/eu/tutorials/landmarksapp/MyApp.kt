package eu.tutorials.landmarksapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.gson.Gson

@Composable
fun MyApp(navController: NavHostController = rememberNavController()) {

    NavHost(navController = navController, startDestination = Screen.MainScreen.route) {
        composable(route = Screen.MainScreen.route) {
            MainScreen(navController = navController)
        }
        composable(route = Screen.DetailScreen.route) { backStackEntry ->
            val itemJson = backStackEntry.arguments?.getString("itemJson")
            val item = Gson().fromJson(itemJson, ItemsData::class.java)
            DetailScreen(navController = navController, itemsData = item)
        }
    }


}