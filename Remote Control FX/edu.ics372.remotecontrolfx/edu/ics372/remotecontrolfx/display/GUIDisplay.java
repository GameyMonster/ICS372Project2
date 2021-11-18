package edu.ics372.remotecontrolfx.display;

import edu.ics372.remotecontrolfx.buttons.GUIButton;
import edu.ics372.remotecontrolfx.select.Show;
import javafx.application.Application;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GUIDisplay extends Application implements VideoPlayerDisplay {

	private GUIButton playerOn;
	private GUIButton playerOff;
	private GUIButton pauseShow;
	private GUIButton playShow;
	private GUIButton rewindShow;
	private GUIButton fastForwardShow;
	private GUIButton stopShow;
	private Label statusText;
	private ListView<Show> showList;
	private Text timerValue = new Text("            ");

	@Override
	public void start(Stage primaryStage) throws Exception {
		// Need Info for the Interface
		// Might need the State Packages with it (PlayerContext)
	}

	@Override
	public void showTimeLeft(int time) {
		timerValue.setText(" " + time);

	}

	@Override
	public void showPlayerOn() {
		statusText.setText("Player: TURN ON");

	}

	@Override
	public void showPlayerOff() {
		statusText.setText("Player: TURN OFF");

	}

	@Override
	public void showSelectedShow(String showDetails) {
		statusText.setText("Player: Show selected [" + showDetails + "]");

	}

	@Override
	public void showPlaying() {
		statusText.setText("Player: PLAYING");

	}

	@Override
	public void showPaused() {
		statusText.setText("Player: PAUSED");

	}

	@Override
	public void showStopped() {
		statusText.setText("Player: STOP");

	}

	@Override
	public void showRewinding() {
		statusText.setText("Player: REWIND");

	}

	@Override
	public void showFastForwarding() {
		statusText.setText("Player: FAST FORWARD");

	}

	@Override
	public void showScreenSaverOn() {
		statusText.setText("Player: SCREEN SAVER ON");
	}

	@Override
	public void showScreenSaverOff() {
		statusText.setText("Player: SCREEN SAVER OFF");

	}

}
