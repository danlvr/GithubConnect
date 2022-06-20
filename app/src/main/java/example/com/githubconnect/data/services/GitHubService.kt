package example.com.githubconnect.data.services

import example.com.githubconnect.data.model.Repository
import retrofit2.http.GET
import retrofit2.http.Path

interface GitHubService {
    @GET("users/{user}/repos")
    suspend fun listRepositories(@Path("user") user: String): List<Repository>
}