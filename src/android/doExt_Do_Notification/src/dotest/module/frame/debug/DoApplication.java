package dotest.module.frame.debug;

import android.app.Application;

public class DoApplication extends Application {
	
	@Override
	public void onCreate() {
		super.onCreate();
		doext.app.do_Notification_App.getInstance().onCreate(this);
	}	
}