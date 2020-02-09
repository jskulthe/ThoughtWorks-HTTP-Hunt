package apptest;

import org.json.JSONObject;

import com.solution.impl.Solution4;

public class Main {

	public static void main(String[] args) throws Exception {

		String input = "{\"phonetype\":\"N95\",\"cat\":\"WP\"}";
		
			JSONObject jObj = new JSONObject(input);
	    
			System.out.println(jObj);
			String inputtext = jObj.getString("cat");
		
	        	System.out.println(inputtext.length());

	        	String text2  = "This specification does not indicate the behavior, rendering or otherwise, of space characters other than those explicitly identified here as white space characters. For this reason, authors should use appropriate elements and styles to achieve visual formatting effects that involve white space, rather than space characters.For all HTML elements except PRE, sequences of white space separate 'words' (we use the term 'word' here to mean 'sequences of non-white space characters'). When formatting text, user agents should identify these words and lay them out according to the conventions of the particular written language (script) and target medium.";

	        	
	        	System.out.println(text2.length());
	
	
	        	String inputtext1 = "How often do you find yourself using an interrogation point in your everyday writing? What about an eroteme? You might be surprised to know that both of these appeared in the last two sentences. These terms might be unfamiliar, but you may know this punctuation mark by its more common name: the question mark. The question mark has a very simple function in writing—it indicates a question. If a sentence ends with a question mark, then it is asking a question, just as the name suggests.";
	    		String[] words = inputtext1.split("[\\?.]");

	    		
	    		
	    		System.out.println("sentens count "+words.length);
	    		
	String vowel = "Sunset is the time of day when our sky meets the outer space solar winds. There are blue, pink, and purple swirls, spinning and twisting, like clouds of balloons caught in a blender. The sun moves slowly to hide behind the line of horizon, while the moon races to take its place in prominence atop the night sky. People slow to a crawl, entranced, fully forgetting the deeds that still must be done. There is a coolness, a calmness, when the sun does set.";
	    		
	    			Solution4 solution4 =  new Solution4();
	    			solution4.getVowelCount(vowel);
	
	
	}
		
}