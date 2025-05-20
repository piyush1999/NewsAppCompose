package com.example.newsapp.domain.usecases.news

import androidx.paging.PagingData
import com.example.newsapp.domain.model.Article
import com.example.newsapp.domain.repository.NewsRepository
import com.example.newsapp.presentation.search.SearchEvent
import kotlinx.coroutines.flow.Flow

class SearchNews(private val newsRepository: NewsRepository) {
    operator fun invoke(searchQuery: String ,sources: List<String>): Flow<PagingData<Article>> {
        return newsRepository.getSearchNews(searchQuery,sources)
    }
}