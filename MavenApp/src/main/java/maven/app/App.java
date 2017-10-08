package maven.app;

import org.slf4j.*;

public class App 
{
	private static Logger logger = LoggerFactory.getLogger(App.class);
    
	public static void main( String[] args ) {
        //System.out.println( "Maven App has been created." );
		logger.info("Maven App logger message.");
    }
}
