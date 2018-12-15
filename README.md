grammarbot-java libraray
Grammar Bot provides spelling and grammar check. Signup for an API key at https://www.grammarbot.io/ for increased usage limits. The API still works with no key, but the daily usage limit is lower.

Installation

# Usage
See the example below

# import the client library
from grammarbot import GrammarBotClient

# Creating the client
# ===================
 Default Client, Here the client have default values for the
Language = en-US, Api-Key = java-default , Base-url= http://api.grammarbot.io:80
GrammarBotClient botClient = new GrammarBotBuilder().build();


# or, signup for an API Key to get higher usage limits here: https://www.grammarbot.io/
GrammarBotClient botClient = new GrammarBotBuilder().setApiKey("ur api key").build();
				
# you can even set the base URI to a different server
GrammarBotClient botClient = new     GrammarBotBuilder().setBaseURI("http://api.grammarbot.io:80").build();

# You can  specify all  the parameters while creating the client
GrammarBotClient botClient = new GrammarBotBuilder().setLanguage("en-us")
				.setBaseURI("http://api.grammarbot.io:80").setApiKey("ur api key").build();
# Analyzing the text
# ==================

# There is only one method to perform the analysis, viz. GrammarBotClient.check
# method.

text = 'I cant remember how to go their'

# check the text, returns GrammarBotResponse object
GrammarBotResponse [software=Software [name=GrammarBot, version=4.3.1, apiVersion=1.0, premium=false,....

# you can even specify the language of input text
res = client.check(text, "en-GB")

