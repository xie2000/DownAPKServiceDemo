package com.example.downapkdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

/**
 * @Desp:Service下载apk通过notification显示下载进度 下载完成自动安装
 * @author xiechengfa2000@163.com
 * @date 2015-9-6 下午10:53:31
 */
public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn1View).setOnClickListener(this);
		findViewById(R.id.btn2View).setOnClickListener(this);
		findViewById(R.id.btn3View).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		if (v.getId() == R.id.btn1View) {
			DownAPKService
					.startService(
							this,
							"K歌达人",
							"http://radio1.gomumu.com.cn/herook/android_apk/109158/KuroOK.apk",
							14049276);
		} else if (v.getId() == R.id.btn2View) {
			DownAPKService
					.startService(
							this,
							"应用市场",
							"http://apk.r1.market.hiapk.com/data/upload/marketClient/HiMarket6.0.85_1440575494191.apk",
							7764946);
		} else if (v.getId() == R.id.btn3View) {
			DownAPKService
					.startService(
							this,
							"艺龙旅行",
							"http://apk.r1.market.hiapk.com/data/upload/apkres/2015/8_27/14/com.dp.android.elong_021833.apk",
							27645535);
		}
	}
}
