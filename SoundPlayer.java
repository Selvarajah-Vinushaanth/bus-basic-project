import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class SoundPlayer {

    private Clip clip;

    public SoundPlayer(String soundFilePath) {
        try {
            // create an AudioInputStream from the sound file
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(soundFilePath));

            // get a Clip instance
            clip = AudioSystem.getClip();

            // open the AudioInputStream with the Clip
            clip.open(audioInputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void play() {
        if (clip != null) {
            // start playing the sound
            clip.start();
        }
    }

    public void stop() {
        if (clip != null) {
            // stop the sound
            clip.stop();
        }
    }

    public void close() {
        if (clip != null) {
            // close the resources
            clip.close();
        }
    }
}


