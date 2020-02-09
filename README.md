# ThoughtWorks-HTTP-Hunt

Hi Jay

Thanks for confirming your availability to take-up "HTTP Hunt" Game Coding Challenge.

Your registered User Id is: <*****>

In this game, you’ll have to solve series of programming challenges till you hit the finish line. But there's a bit of a twist to it. The whole game is driven by HTTP REST APIs. 

Few important guidelines:

For every API call, pass your UserID as an HTTP header with key "userId". Your userId is <USER_ID>. If you don't do this step, you will receive an "Invalid user!” error.
For every POST API call, you need to pass "content-type" as "application/json" as well.
For every API call, use the host as https://http-hunt.thoughtworks-labs.net
 So how should you start playing?

Hit an endpoint GET https://http-hunt.thoughtworks-labs.net/challenge which would give you further instructions. Please complete this “HTTP Hunt” game challenge within two days but incase you need more time, request your Recruiter for the same.

-----------------------------------------------------------------------------------------------------------

{
  "stage": "1/4",
  "statement": "Return the count of characters in the paragraph. Including spaces and punctuations.",
  "instructions": "You can 'GET' the input from /challenge/input and output should be 'POST' json to /challenge/output. Important note: The time between request 'GET' input and 'POST' requests should not exceed 2 secs.",
  "sampleInput": {
    "input": {
      "text": "This specification does not indicate the behavior, rendering or otherwise, of space characters other than those explicitly identified here as white space characters. For this reason, authors should use appropriate elements and styles to achieve visual formatting effects that involve white space, rather than space characters.For all HTML elements except PRE, sequences of white space separate 'words' (we use the term 'word' here to mean 'sequences of non-white space characters'). When formatting text, user agents should identify these words and lay them out according to the conventions of the particular written language (script) and target medium."
    }
  },
  "sampleOutput": {
    "output": {
      "count": 653
    }	
  }
}
------------------------------------------------------------------------------------------------------------

{
  "stage": "2/4",
  "statement": "Return the count of words in the paragraph.",
  "instructions": "You can 'GET' the input from /challenge/input and output should be 'POST' json to /challenge/output. Important note: The time between request 'GET' input and 'POST' requests should not exceed 2 secs.",
  "sampleInput": {
    "input": {
      "text": "Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a blender. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that still must be done. There is a coolness, a calmness, when the sun does set."
    }
  },
  "sampleOutput": {
    "output": {
      "wordCount": 84
    }
  }
}

-----------------------------------------------------------------------------------------------------------------------

{
  "stage": "3/4",
  "statement": "Return the number of sentences in a paragraph. Sentences will always be terminated by either fullstop (.) or question mark (?).There will be a space after each sentence, except last one",
  "instructions": "You can 'GET' the input from /challenge/input and output should be 'POST' json to /challenge/output. Important note: The time between request 'GET' input and 'POST' requests should not exceed 2 secs.",
  "sampleInput": {
    "input": {
      "text": "How often do you find yourself using an interrogation point in your everyday writing? What about an eroteme? You might be surprised to know that both of these appeared in the last two sentences. These terms might be unfamiliar, but you may know this punctuation mark by its more common name: the question mark. The question mark has a very simple function in writing—it indicates a question. If a sentence ends with a question mark, then it is asking a question, just as the name suggests."
    }
  },
  "sampleOutput": {
    "output": {
      "sentenceCount": 6
    }
  }
}
------------------------------------------------------------------------------------------------------------------------------

{
  "stage": "4/4",
  "statement": "Return the number of vowels in the paragraph. Ex. {a: 20, e: 32, i: 19, o: 2, u: 15}",
  "instructions": "You can 'GET' the input from /challenge/input and output should be 'POST' json to /challenge/output. Important note: The time between request 'GET' input and 'POST' requests should not exceed 2 secs.",
  "sampleInput": {
    "input": {
      "text": "Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a blender. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that still must be done. There is a coolness, a calmness, when the sun does set."
    }
  },
  "sampleOutput": {
    "output": {
      "a": 20,
      "e": 49,
      "i": 23,
      "o": 27,
      "u": 11
    }
  }
}



