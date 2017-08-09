package kr.co.hs.uiswitch.sample;
import android.app.Activity;
import android.os.Bundle;

import kr.co.hs.uiswitch.HsSwitch;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		HsSwitch switchButton = (HsSwitch) findViewById(R.id.switch_button);
//		switchButton.setChecked(true);
//		switchButton.isChecked();
//		switchButton.toggle();     //switch state
//		switchButton.toggle(false);//switch without animation
//		switchButton.setShadowEffect(true);//disable shadow effect
//		switchButton.setEnabled(false);//disable button
//		switchButton.setEnableEffect(false);//disable the switch animation
		switchButton.setOnCheckedChangeListener(new HsSwitch.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(HsSwitch view, boolean isChecked) {
				//TODO do your job
//				view.performHapticFeedback(HapticFeedbackConstants.VIRTUAL_KEY);
//				playSoundEffect(SoundEffectConstants.CLICK);
			}
		});
//		switchButton.setOnClickListener(new View.OnClickListener() {
//			@Override
//			public void onClick(View v) {
//
//			}
//		});



	}
}
