package example.com.githubconnect.data.model

data class Repository (
    val data: List<Datum>
)

data class Datum (
    val id: Long,
    val nodeID: String,
    val name: String,
    val fullName: String,
    val private: Boolean,
    val owner: Owner,
    val htmlURL: String,
    val description: String,
    val fork: Boolean,
    val url: String,
    val forksURL: String,
    val keysURL: String,
    val collaboratorsURL: String,
    val teamsURL: String,
    val hooksURL: String,
    val issueEventsURL: String,
    val eventsURL: String,
    val assigneesURL: String,
    val branchesURL: String,
    val tagsURL: String,
    val blobsURL: String,
    val gitTagsURL: String,
    val gitRefsURL: String,
    val treesURL: String,
    val statusesURL: String,
    val languagesURL: String,
    val stargazersURL: String,
    val contributorsURL: String,
    val subscribersURL: String,
    val subscriptionURL: String,
    val commitsURL: String,
    val gitCommitsURL: String,
    val commentsURL: String,
    val issueCommentURL: String,
    val contentsURL: String,
    val compareURL: String,
    val mergesURL: String,
    val archiveURL: String,
    val downloadsURL: String,
    val issuesURL: String,
    val pullsURL: String,
    val milestonesURL: String,
    val notificationsURL: String,
    val labelsURL: String,
    val releasesURL: String,
    val deploymentsURL: String,
    val createdAt: String,
    val updatedAt: String,
    val pushedAt: String,
    val gitURL: String,
    val sshURL: String,
    val cloneURL: String,
    val svnURL: String,
    val homepage: String? = null,
    val size: Long,
    val stargazersCount: Long,
    val watchersCount: Long,
    val language: Language? = null,
    val hasIssues: Boolean,
    val hasProjects: Boolean,
    val hasDownloads: Boolean,
    val hasWiki: Boolean,
    val hasPages: Boolean,
    val forksCount: Long,
    val mirrorURL: Any? = null,
    val archived: Boolean,
    val disabled: Boolean,
    val openIssuesCount: Long,
    val license: License? = null,
    val allowForking: Boolean,
    val isTemplate: Boolean,
    val topics: List<String>,
    val visibility: Visibility,
    val forks: Long,
    val openIssues: Long,
    val watchers: Long,
    val defaultBranch: DefaultBranch
)

enum class DefaultBranch {
    Master,
    Trunk
}

enum class Language {
    Groovy,
    Java,
    JavaScript,
    Kotlin,
    Shell
}

data class License (
    val key: Key,
    val name: Name,
    val spdxID: SpdxID,
    val url: String,
    val nodeID: LicenseNodeID
)

enum class Key {
    Apache20,
    LGPL30,
    MIT
}

enum class Name {
    ApacheLicense20,
    GNULesserGeneralPublicLicenseV30,
    MITLicense
}

enum class LicenseNodeID {
    MDc6TGljZW5ZZTEy,
    MDc6TGljZW5ZZTEz,
    MDc6TGljZW5ZZTI
}

enum class SpdxID {
    Apache20,
    LGPL30,
    MIT
}

data class Owner (
    val login: Login,
    val id: Long,
    val nodeID: OwnerNodeID,
    val avatarURL: String,
    val gravatarID: String,
    val url: String,
    val htmlURL: String,
    val followersURL: String,
    val followingURL: FollowingURL,
    val gistsURL: GistsURL,
    val starredURL: StarredURL,
    val subscriptionsURL: String,
    val organizationsURL: String,
    val reposURL: String,
    val eventsURL: EventsURL,
    val receivedEventsURL: String,
    val type: Type,
    val siteAdmin: Boolean
)

enum class EventsURL {
    HTTPSAPIGithubCOMUsersJakeWhartonEventsPrivacy
}

enum class FollowingURL {
    HTTPSAPIGithubCOMUsersJakeWhartonFollowingOtherUser
}

enum class GistsURL {
    HTTPSAPIGithubCOMUsersJakeWhartonGistsGistID
}

enum class Login {
    JakeWharton
}

enum class OwnerNodeID {
    MDQ6VXNlcjY2NTc3
}

enum class StarredURL {
    HTTPSAPIGithubCOMUsersJakeWhartonStarredOwnerRepo
}

enum class Type {
    User
}

enum class Visibility {
    Public
}