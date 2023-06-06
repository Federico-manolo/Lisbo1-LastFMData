# Lisbo1-LastFMData
Este es el submodulo para utilizar el servicio ofrecido por LastFM. Para llevar a cabo la ejecución del mismo, debemos obtener el servicio LastFMService a través del injector ofrecido:

lastFMService : LastFMService = LastFMInjector.getLastFMService()

Para hacer uso del servicio debemos hacer la llamada al método público con el parámetro correspondiente que será el nombre del artista (String):

lastFMService.getArtistData(artistName)

El resultado de ejecutar este método será o bien, un tipo de dato LastFMArtistData con el nombre del artista, la información y url relacionada (siempre y cuando el artista haya sido encontrado por el servicio), o NULL (en caso de que la búsqueda no haya sido exitosa).

El submodulo contiene además la URL con el logo del servicio LastFM.

Para acceder a la URL se debe importar y utilizar la constante LASTFM_IMAGE.
