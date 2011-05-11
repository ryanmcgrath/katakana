package com.phonegap.Katanakana;

import android.app.Activity;
import android.os.Bundle;
import com.phonegap.*;

public class Katanakana extends DroidGap {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
		super.init();

		/*	By default, the Android Webkit instance shows scrollbars, but our
			App should scale enough that the existence of scrollbars should never
			NEED to be indicated. This'll kill them by default. Scrolling/panning
			around is still totally supported.
		*/
		super.appView.setVerticalScrollBarEnabled(false);
		super.appView.setHorizontalScrollBarEnabled(false);

        super.loadUrl("file:///android_asset/www/index.html");
    }
}    
