package eu.hansolo.galileo;

/**
 * User: hansolo
 * Date: 05.05.14
 * Time: 07:31
 */
public interface Pin {
    public static enum Direction {
        IN("in"),
        OUT("out");
        
        public String cmd;
        
        private Direction(final String CMD) {
            cmd = CMD;
        }
    }
    public static enum Value {
        LOW,
        HIGH
    }
    public static enum Drive {
        PULL_UP("pullup"),
        PULL_DOWN("pulldown"),
        STRONG("strong"),
        HIZ("hiz");
        
        public String cmd;
        
        private Drive(final String CMD) {
            cmd = CMD;
        }
    }
}
