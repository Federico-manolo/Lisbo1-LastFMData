package ayds.lisboa1.lastfm

import retrofit2.Response

interface LastFMService {

    fun getArtistData(artistName : String): LastFMArtistData?

}

internal class LastFMServiceImpl(
    private val lastFMAPI : LastFMAPI,
    private val lastFMToArtistDataResolver: LastFMToArtistDataResolver
) : LastFMService {

    override fun getArtistData(artistName: String): LastFMArtistData? {
        val callResponse = getArtistFromAPI(artistName)
        return lastFMToArtistDataResolver.getArtistFromExternalData(callResponse.body())
    }

    private fun getArtistFromAPI(query: String): Response<String> {
        return lastFMAPI.getArtistInfo(query).execute()
    }

}