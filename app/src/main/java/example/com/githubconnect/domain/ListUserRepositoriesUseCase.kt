package example.com.githubconnect.domain

import example.com.githubconnect.core.UseCase
import example.com.githubconnect.data.model.Repository
import example.com.githubconnect.data.repositories.RepositoryRepositories
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(private val repository: RepositoryRepositories) :
    UseCase<String, List<Repository>>() {

    override suspend fun execute(param: String): Flow<List<Repository>> {
        return repository.listRepositories(param)
    }
}