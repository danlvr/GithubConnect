package example.com.githubconnect.data.repositories

import example.com.githubconnect.data.services.GitHubService
import kotlinx.coroutines.flow.flow

class RepositoryImplementation(private val service: GitHubService) : RepositoryRepositories {

    override suspend fun listRepositories(user: String) = flow {
        val repositoriesList = service.listRepositories(user)
        emit(repositoriesList)
    }
}