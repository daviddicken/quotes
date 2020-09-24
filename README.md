# Quotes
This app will take in a json file full of objects containing quotes and info about the quote. This app will allow the user to search for a quote by a certain author of search for a quote containing a certain key word or phrase. If the user wishes this app will also generate a random quote and display it to the screen.

To search for a quote containing a certian key word or phrase you will need to pass 'contains' as your first argument and your search word or phrase as your second argument. If your search word or pharse contains spaces please wrap the entire phase in double quotes like "search words".

To search for a quote from a particular author you will need to pass 'author' as your first argument and the authors name as your second argument. If the name you are searching contains more then one word please wrap the name in double quotes like "Patrick Ness".

An example command line search would look like this:  ./gradlew run --args 'author "Patrick Ness"'

The searches are not case sensitive and if you forget and put in too many arguments or do not use the coorect key words for your first argument the program will remind you.

You may also run the program without any arguments to get a random quote.

Enjoy

# Depenencies

jSonReader is needed for this program to read the json file.

If you do not have gson already you can find it here:
https://bintray.com/bintray/jcenter/com.google.code.gson:gson

or 

Gradle snippet: (place this snipet in the gradle.build file in the dependencies secion and refresh gradle)

implementation 'com.google.code.gson:gson:2.8.6'

Maven snippet:

<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.8.6</version>
  <type>pom</type>
</dependency>

Ivy snippet:

<dependency org='com.google.code.gson' name='gson' rev='2.8.6'>
  <artifact name='gson' ext='pom' ></artifact>
</dependency>
