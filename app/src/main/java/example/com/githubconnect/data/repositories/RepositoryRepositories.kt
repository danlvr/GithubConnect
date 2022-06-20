package example.com.githubconnect.data.repositories

import example.com.githubconnect.data.model.Repository
import kotlinx.coroutines.flow.Flow

interface RepositoryRepositories {
    suspend fun listRepositories(user: String) : Flow<List<Repository>>
}