
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.*;
import twitter4j.*;
import twitter4j.http.AccessToken;
import twitter4j.http.RequestToken;

public class real {
	/*public static void main(String args[]) throws Exception{
	    // The factory instance is re-useable and thread safe.
	    Twitter twitter = new TwitterFactory().getInstance();
	    twitter.setOAuthConsumer("gi00VVuh4rFH8BUwQGP3g", "uHNyACtft8nGIZs18G3dIqaGXZ7GkdOJBBjIiCJEYGo");
	    RequestToken requestToken = twitter.getOAuthRequestToken();
	    AccessToken accessToken = null;
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    while (null == accessToken) {
	      System.out.println("Open the following URL and grant access to your account:");
	      System.out.println(requestToken.getAuthorizationURL());
	      System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
	      String pin = br.readLine();
	      try{
	         if(pin.length() > 0){
	           accessToken = twitter.getOAuthAccessToken(requestToken, pin);
	         }else{
	           accessToken = twitter.getOAuthAccessToken();
	         }
	      } catch (TwitterException te) {
	        if(401 == te.getStatusCode()){
	          System.out.println("Unable to get the access token.");
	        }else{
	          te.printStackTrace();
	        }
	      }
	    }
	 
	    //persist to the accessToken for future reference.
	    storeAccessToken(twitter.verifyCredentials().getId() , accessToken);
	    Status status = twitter.updateStatus(args[0]);
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	    System.exit(0);
	  }
	
	  private static void storeAccessToken(int useId, AccessToken accessToken){
	   System.out.println("AccessToken : "+accessToken.getToken());
	   System.out.println("AccessToken Secret : "+accessToken.getTokenSecret());
	   System.out.println(accessToken);
	  }*/
	private static AccessToken loadAccessToken(int useId){
	    String token = "167716477-D5JESmqg6yDBXUqjopK53PNWLIWGFJcrsemluiT1"; // load from a persistent store
	    String tokenSecret = "6hUSCHKRIA48kCujkXHcAVSN8OUfuOz91RAHCfHhJVY"; // load from a persistent store
	    return new AccessToken(token, tokenSecret);
	  }

	public static void main(String args[]) throws Exception{
	    // The factory instance is re-useable and thread safe.
	    TwitterFactory factory = new TwitterFactory();
	    Twitter twitter = factory.getInstance();
	    twitter.setOAuthConsumer("gi00VVuh4rFH8BUwQGP3g", "uHNyACtft8nGIZs18G3dIqaGXZ7GkdOJBBjIiCJEYGo");
	    AccessToken accessToken = loadAccessToken(167716477);
	    twitter.setOAuthAccessToken(accessToken);
	    //Status status = twitter.updateStatus("날씨가 너무 추워요"); // 트위터에 글을 올리는 부분
	   // System.out.println("Successfully updated the status to [" + status.getText() + "].");
	  
	    String str=twitter.getMentions().toString(); 
	  String str2 = null;
	  String str3 = null;
	  String val1 = null;
	  String val2 = null;
	  
	    StringTokenizer tokens = new StringTokenizer(str,"@");
	    for(int x=1;x<=2;x++){
	    	if(x==1){
	    		tokens.nextToken();
	    	}
	    	
	    	if(x==2){
	    		str2=tokens.nextToken();
	    	}	    	
	   }
	    
	    StringTokenizer tokens1 = new StringTokenizer(str2,"'");
	  
	    for( int x = 1;x<=2; x++ ){

	    	if(x==1){;
	    		str2=tokens1.nextToken();
	    	}

	    }
	    
	    StringTokenizer tokens2 = new StringTokenizer(str2," ");
	    
	    for( int x = 1;x<=2;x++)
	    {
	    	if(x==1){
	    		tokens2.nextToken();
	    	}
	    	if(x==2){
	    		str3 = tokens2.nextToken();
	    	}
	    }
	    System.out.println(str3);
	    
	    StringTokenizer value1 = new StringTokenizer(str3,"+");
	    for(int x=1;x<=3;x++)
	    {
	    	if(x==1){
	    		val1 = value1.nextToken();
	    	}
	    	if(x==2){
	    		val2 = value1.nextToken();
	    	}
	    }
	    
	   /* StringTokenizer value2 = new StringTokenizer(val2,"=");
	    for(int x=1;x<=1;x++){
	    	if(x==1)
	    		val2=value2.nextToken();
	    }
	    
	    System.out.println(val1 + "  " + val2);
	    */
	    System.exit(0);
	    
	}
}
