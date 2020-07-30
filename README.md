# backend-coding-challenge-two-java
# Backend Coding Challengeel 

#se uso Mongodb,Spring boot, maven, java.18, Mongo Atlas en la nube, Google Cloud App Engine.
#Me decidid por esa base datos por la practicidad y su menejo nativo de JSON por que solo hice un mapeo con Bean Java y solo basto contruir el controller en Spring
#Faltaron algunos detalles

# las urls funcionales son 
#Para listar todos los ZIP CODE cargados(solo cargue dos zip codes por cuestiones de tiempo)
#https://java-zipcode.uc.r.appspot.com/zip_codes/
#buscar zip code por id
#https://java-zipcode.uc.r.appspot.com/zip_codes/{id_zip}

{
  "zip_code": "04369",
  "locality": "CIUDAD DE MEXICO",
  "federal_entity": "CIUDAD DE MEXICO",
  "settlements": [
    {
      "name": "Pedregal de Santo Domingo",
      "zone_type": "Urbano",
      "settlement_type": "Colonia"
    }
  ],
  "municipality": "COYOACAN"
}

{
  "zip_code": "06140",
  "locality": "CIUDAD DE MEXICO",
  "federal_entity": "CIUDAD DE MEXICO",
  "settlements": [
    {
      "name": "CONDESA",
      "zone_type": "Urbano",
      "settlement_type": "Colonia"
    }
  ],
  "municipality": "CUAUHTEMOC"
}
