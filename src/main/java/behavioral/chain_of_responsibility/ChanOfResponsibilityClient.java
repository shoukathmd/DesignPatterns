package behavioral.chain_of_responsibility;

public class ChanOfResponsibilityClient {

    public static void main(String... args) {
        Logger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(Logger.INFO, "This is an information.");
        loggerChain.logMessage(Logger.DEBUG, "This is a debug level information.");
        loggerChain.logMessage(Logger.ERROR, "This is an error information.");

       // loggerChain.logMessage(Logger.ERROR, "This is me " + Logger.ERROR);
    }

    private static Logger getChainOfLoggers() {
        Logger el = new ErrorLogger(Logger.ERROR);
        Logger dl = new DebugLogger(Logger.DEBUG);
        Logger il = new InfoLogger(Logger.INFO);


        el.setLogger(dl);
        dl.setLogger(il);

        return el;
    }
}
