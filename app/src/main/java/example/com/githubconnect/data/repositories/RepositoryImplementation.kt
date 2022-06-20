package example.com.githubconnect.data.repositories

import example.com.githubconnect.core.RemoteException
import example.com.githubconnect.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepositoryImplementation(private val service: GitHubService) : RepositoryRepositories {

    override suspend fun listRepositories(user: String) = flow {

        try {

            val repositoriesList = service.listRepositories(user)
            emit(repositoriesList)

        } catch (ex: HttpException) {

            throw RemoteException(ex.message ?: "Unable to search at this time!")

        }


    }
}