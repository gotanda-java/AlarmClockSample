package example.android.alarmclocksample;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


// 近接センサーActivity
public class SensorActivity extends Activity implements SensorEventListener {
	private SensorManager mSensorManager;


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // SensorManagerのインスタンスを取得する
        mSensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
    }



	@Override
	public void onAccuracyChanged(Sensor arg0, int arg1) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void onSensorChanged(SensorEvent event) {
		// TODO 自動生成されたメソッド・スタブ

	}}