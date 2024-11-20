package com.example.onboardingapp.onBoardViews


import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController
import com.example.onboardingapp.R
import com.example.onboardingapp.data.PageData
import com.example.onboardingapp.dataStore.StoreBoarding

annotation class ExperimentalPagerApi

@OptIn(ExperimentalFoundationApi::class,
    ExperimentalPagerApi::class)
@Composable
fun MainOnBoarding(navController: NavController, store:StoreBoarding){
    val items = ArrayList<PageData>()

    items.add(
        PageData(
            R.raw.page1,
            "Título 1",
            "Descripción 1"
        )
    )

    items.add(
        PageData(
            R.raw.page2,
            "Título 2",
            "Descripción 2"
        )
    )

    items.add(
        PageData(
            R.raw.page3,
            "Título 3",
            "Descripción 3"
        )
    )

    val pagerState = rememberPagerState(
        pageCount = { items.size },
        initialOffscreenLimit = 2,
        infiniteLoop = false,
        initialPage = 0
    )


    OnBoardingPager(
        item = items,
        pagerState = pagerState,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(Color.White),
        navController = navController,
        store
    )
}



