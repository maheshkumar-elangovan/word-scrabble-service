**Word Scrabble App**
Clone Repo with the URL: https://github.com/maheshkumar-elangovan/word-scrabble-service.git

Service is written with following technologies

**Kotlin**, **SpringBoot**, **Maven** and **H2** as database

Required dependencies are added in POM.xml

Required properties for application and H2 are added in application.properties

To run the application please follow the below

    Mount the source in IntelliJ
    Do Maven clean install
    Open ScrabbleApplication and Right click and Choose Run ScrabbleApplicationKt
    Application will be started at default port 8080
    SQl query for H2 Db is available under resources, table will be created when starting the application
    
    To save score call the api with post request with below URL
        http://localhost:8080/scrabble/api/savescore
    with JSON
        {
            "word": "hello",
            "score": 10
        }

    To get top scores call the api with get request with below URL
        http://localhost:8080/scrabble/api/topscores
  
    To execute the test cases run
        mvn test
