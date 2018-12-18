grammarbot-java libraray
Grammar Bot provides spelling and grammar check. Signup for an API key at https://www.grammarbot.io/ for increased usage limits. The API still works with no key, but the daily usage limit is lower.

## Installation
Clone the project 
https://github.com/sadath42/grammarbot-java-client
From project root directory run the belows commands
1. mvn clean install
2. mvn install:install-file -Dfile=target\grammarbot-client-0.0.1.jar  -DgroupId=com.grammarbot.client  -DartifactId=grammarbot-client -Dversion=0.0.1 -Dpackaging=jar -DpomFile=pom.xml

### Importing the client library in maven project.
maven dependency
```xml
 <dependency>
      <groupId>com.grammarbot.client</groupId>
      <artifactId>grammarbot-client</artifactId>
      <version>0.0.1</version>
  </dependency>
```
### Importing the client library in Gradle project.
```groovy
  compile group: 'com.grammarbot.client', name: 'grammarbot-client', version: '0.0.1'
  Add mavenLocal() to the repositeries as first line in repositories as shown below in build.gradle
  repositories {
	mavenLocal()
	...
	}
 ``` 
## Creating the client
```java
Default Client, Here the client have default values for the
# Language = en-US, Api-Key = java-default , Base-url= http://api.grammarbot.io:80
GrammarBotClient botClient = new GrammarBotBuilder().build();

# or, signup for an API Key to get higher usage limits here: https://www.grammarbot.io/
GrammarBotClient botClient = new GrammarBotBuilder().setApiKey("ur api key").build();
				
# you can even set the base URI to a different server
GrammarBotClient botClient = new     GrammarBotBuilder().setBaseURI("http://api.grammarbot.io:80").build();

 You can  specify all  the parameters while creating the client
GrammarBotClient botClient = new GrammarBotBuilder().setLanguage("en-us")
				.setBaseURI("http://api.grammarbot.io:80").setApiKey("ur api key").build();
```

## Analyzing the text
```java
# There is only one method to perform the analysis, viz. GrammarBotClient.check method.

text = 'I cant remember how to go their'

## check the text, returns GrammarBotResponse object
GrammarBotResponse [software=Software [name=GrammarBot, version=4.3.1, apiVersion=1.0, premium=false,....

## you can even specify the language of input text on the fly.
GrammarBotClient botClient = client.check(text, "en-GB")
```
## Inspecting the GrammarBotResponse object
### check detected language
```java
Language language = response.getLanguage();
DetectedLanguage detectedLanguage = language.getDetectedLanguage();
detectedLanguage.getCode(); # en-US
detectedLanguage.getName();  # English (US)
```
## Inspecting the GrammarBotMatch objects
```java
List<Matches> matches = response.getMatches();
for (Matches matchedObj : matches) {
#inspect the context object
Context context = matchedObj.getContext();
context.getLength() # 9
context.getText() # I cant remember how to go their

#inspect the replacement object
ArrayList<Replacement> replacements = matchedObj.getReplacements(
for (Replacement replacement : replacements) {
replacement.getValue() #there
}
#inspect the rule object
Rule rule = matchedObj.getRule(
rule.getDescription()
rule.getCategory()
rule.getIssueType()
}
```
For more information you will have access to the complete response in GrammarBotResponse

Please refer the test case for complete example of usage of client. 



