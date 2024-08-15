package com.loc.newsapp.presentation.navgraph

sealed class Route(
    val route : String
) {

    // Navigations
    object OnBoardingScreen : Route(route = "onBoardingScreen")
    object HomeScreen : Route(route = "homeScreen")
    object SearchScreen : Route(route = "searchScreen")
    object BookmarkScreen  : Route(route = "bookmarkScreen")
    object DetailsScreen  : Route(route = "detailsScreen")

    // Sub-Navigations
    object AppStartNavigation : Route(route = "appStartNavigation")
    object NewsNavigation : Route(route = "newsNavigation")
    object NewsNavigatorScreen : Route(route = "newsNavigatorScreen")
}