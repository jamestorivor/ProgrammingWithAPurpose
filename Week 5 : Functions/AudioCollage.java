/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class AudioCollage {

    // Returns a new array that rescales a[] by a multiplicative factor of alpha.
    public static double[] amplify(double[] a, double alpha) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i] * alpha;
        }
        return b;
    }

    // Returns a new array that is the reverse of a[].
    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];
        }
        return b;
    }


    // Returns a new array that is the concatenation of a[] and b[].
    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        return c;
    }

    // Returns a new array that is the sum of a[] and b[],
    // padding the shorter arrays with trailing 0s if necessary.
    public static double[] mix(double[] a, double[] b) {
        double[] c;
        if (a.length < b.length) {
            c = new double[b.length];
            for (int i = 0; i < a.length; i++) {
                c[i] = a[i] + b[i];
            }
            for (int i = a.length; i < b.length; i++) {
                c[i] = 0 + b[i];
            }
        }
        else {
            c = new double[a.length];
            for (int i = 0; i < b.length; i++) {
                c[i] = b[i] + a[i];
            }
            for (int i = b.length; i < a.length; i++) {
                c[i] = 0 + a[i];
            }
        }
        return c;
    }

    // Returns a new array that changes the speed by the given factor.
    public static double[] changeSpeed(double[] a, double alpha) {
        double[] c = new double[(int) (a.length / alpha)];
        int counter = 0;
        int index = 0;
        while (counter < c.length) {
            if (counter == a.length) {
                index = 0;
            }
            c[counter] = a[index];
            counter++;
            index++;
        }
        return c;
    }

    // Creates an audio collage and plays it on standard audio.
    // See below for the requirements.
    public static void main(String[] args) {
        double[] audio1 = StdAudio.read("functions/beatbox.wav");
        double[] audio2 = StdAudio.read("functions/buzzer.wav");
        double[] audio3 = StdAudio.read("functions/chimes.wav");
        double[] audio4 = StdAudio.read("functions/cow.wav");
        double[] audio5 = StdAudio.read("functions/singer.wav");

        audio1 = reverse(audio1);
        audio2 = mix(audio1, audio2);
        audio3 = changeSpeed(audio3, 0.5);
        audio4 = amplify(audio4, 2);
        audio5 = merge(audio5, audio2);
        audio5 = merge(audio5, audio3);
        audio5 = merge(audio5, audio4);

        StdAudio.play(audio5);
    }
}
