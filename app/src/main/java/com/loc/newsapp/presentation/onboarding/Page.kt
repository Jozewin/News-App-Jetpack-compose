package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title : String,
    val description : String,
    @DrawableRes val image :Int
)

val pages = listOf(
    Page(
        title = "News Tailored to You",
        description = "Craft your personalized news feed by selecting your interests and trusted sources. Dive into the stories that matter most, all in one place.",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Go Beyond the Headlines",
        description = "Get the full picture with in-depth analyses, diverse perspectives, and fact-checking tools. Go beyond the surface and understand the stories shaping our world.",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Knowledge is Power, Stay Informed",
        description = "Dive into the latest headlines and insightful stories with our News App.",
        image = R.drawable.onboarding3
    ),
)