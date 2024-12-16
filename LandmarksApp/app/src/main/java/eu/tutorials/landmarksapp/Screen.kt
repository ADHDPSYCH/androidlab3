package eu.tutorials.landmarksapp

sealed class Screen(val route: String) {
    object MainScreen : Screen("main_screen")
    object DetailScreen : Screen("detail_screen/{itemJson}") {
        fun createRoute(itemJson: String): String = "detail_screen/$itemJson"
    }
}