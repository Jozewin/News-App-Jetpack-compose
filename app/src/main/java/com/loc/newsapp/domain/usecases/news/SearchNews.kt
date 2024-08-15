package com.loc.newsapp.domain.usecases.news

import androidx.paging.PagingData
import com.loc.newsapp.domain.model.Article
import com.loc.newsapp.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow

class SearchNews(
    private val newsRepository: NewsRepository
) {
    operator fun invoke(source : List<String>, searchQuery : String) : Flow<PagingData<Article>> {
        return newsRepository.searchNews(searchQuery,source)
    }
}