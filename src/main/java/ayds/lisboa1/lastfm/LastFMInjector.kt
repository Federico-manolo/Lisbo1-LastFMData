package ayds.lisboa1.lastfm

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val ARTIST_BASE_URL = "https://ws.audioscrobbler.com/2.0/"

object LastFMInjector {

        fun getLastFMService(): LastFMService = LastFMServiceImpl(createLastFMAPI(),JSONToArtistDataResolver())

        private fun createLastFMAPI(): LastFMAPI {
            val retrofit = Retrofit.Builder().baseUrl(ARTIST_BASE_URL)
                .addConverterFactory(ScalarsConverterFactory.create()).build()
            return retrofit.create(LastFMAPI::class.java)
        }
}