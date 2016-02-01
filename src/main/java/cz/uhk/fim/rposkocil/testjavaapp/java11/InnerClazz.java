package cz.uhk.fim.rposkocil.testjavaapp.java11;

/**
 * InnerClazz Class
 * - java 1.1
 */
public class InnerClazz {

    private class Glass {

        private int volume;
        private int filled = 0;

        public Glass (int volume) {
            this.volume = volume;
        }

        public void in (int inVolume) {
            filled += inVolume;
            if(filled > volume) filled = volume;
        }

        public void out (int outVolume) {
            filled -= outVolume;
            if(volume < 0) filled = 0;
        }

        public int getVolume() {
            return volume;
        }

        public int getFilled() {
            return filled;
        }
    }

    private Glass glass;

    public void createGlass(int volume) {
        glass = new Glass(volume);
    }

    public void halfFilledGlass() {
        glass.in(glass.getVolume() / 2);
    }

    public int getGlassVolume() {
        return glass.getFilled();
    }
}
