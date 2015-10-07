package com.popup.design;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.popup.design.layers.TransparentPanel;


public class AnimatePopup extends Activity {
	
	private Animation animShow, animHide;
	View mDecorView;
	
	@Override
	public void onCreate(Bundle icicle) {
    	
        super.onCreate(icicle);

        setContentView(R.layout.popup);
//        getWindow().getDecorView()
//        .setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
        
        
        //Initializew this in onCreate()
        mDecorView = getWindow().getDecorView();
     
        initPopup();
    }
    
    private void initPopup() {
    	
    	final TransparentPanel popup = (TransparentPanel) findViewById(R.id.popup_window);

    	//  Start out with the popup initially hidden.
    	popup.setVisibility(View.GONE);
    	
    	
    	animShow = AnimationUtils.loadAnimation( this, R.anim.popup_show);
    	animHide = AnimationUtils.loadAnimation( this, R.anim.popup_hide);
    	
    	final Button   showButton = (Button) findViewById(R.id.show_popup_button);
    	
    	final Button   hideButton = (Button) findViewById(R.id.hide_popup_button);
    	showButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.setVisibility(View.VISIBLE);
				popup.startAnimation( animShow );
				showButton.setEnabled(false);
				hideButton.setEnabled(true);
				
				hideSystemUI();
        }});
        
        hideButton.setOnClickListener(new View.OnClickListener() {
			public void onClick(View view) {
				popup.startAnimation( animHide );
				showButton.setEnabled(true);
				hideButton.setEnabled(false);
				popup.setVisibility(View.GONE);
				
				
				showSystemUI();
				
				
				
				
				
        }});


    	final TextView locationName = (TextView) findViewById(R.id.location_name);
        final TextView locationDescription = (TextView) findViewById(R.id.location_description);
        
        locationName.setText("Animated Popup");
        locationDescription.setText("Animated popup is created by http://www.androidbysravan.blogspot.com"
        							+ " Transparent layout is used on this example, and animation xml is also used"
        							+ " on this example. Have a Good day guys.ghgfhfghfghfhfghfghfghfghfghfghfghfghfghfghfghgfhgfhghfghfghgfhfghfgh" +
        							"gfhgfhfghfghfghfghgfhgfhgfffffffffffffffffffffffffffffffffffh" +
        							"fghfghfghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
        							"fghfffffffffffffffffffffffffffffffffffffffffffffff" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfg" +
        							"fggggggggggggggggggggggggggggggggggggggggggggggggggh" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfg" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgh" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgh" +
        							"ghgfffffffffffffffffffffffffffffffffffffffffffff" +
        							"ffgdgdgfddddddddddddddddddddddddddddddddddddfghfgh" +
        							"ytutyutyutyutyuuuuuuuuuuuuuuuuuuuuuuuuy" +
        							"tytryyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
        							"dfyhrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrtrt" +
        							"dfhhhhhhhhddddddddddfhdfhdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdfdf" +
        							"hfdhddddddddddddddddddddddddddddddddddddddddd" +
        							"fdhddddddddddddddddddddddddddddddddddd" +
        							"rfdhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
        							"dfhddddddddddddddddddddddddddddddddddd" +
        							"hgggggggggggggggggggggggggggggggggggggggggggg" +
        							"tuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuu" +
        							"gfjffffffffffffffffffffffffffffffffffffff" +
        							"hfghfffffffffffffffffffffffffffffffg" +
        							"fhfffffffffffffffffffffffffffffffffffffffffffffffffffffg" +
        							"fgggggggjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
        							"jffffffffffffffffffffffffffffffffffffffffffffffffffffffffffg" +
        							"dfhggggggggggggggggggggggggggggggggggggggggggggg" +
        							"fhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhg" +
        							"fghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh" +
        							"fgfgfgjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
        							"gjfjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj" +
        							"jjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjh" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfg" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfg" +
        							"gfjjjjjjjjjjjjjjjjjjjjjjjjjj" +
        							"fjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfjfj" +
        							"fgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgfgj" +
        							"gjgjfffffffffffffffffffffffffffffffffffffffffffg" +
        							"jgyuugiuuuuuuuuuuuuuuuuuuuuuuuuu");
        
     //   locationDescription.setText("recodr no found");
        
	}
    
    
//    private void showSystemBar() {
//        String commandStr = "am startservice -n com.android.systemui/.SystemUIService";
//        runAsRoot(commandStr);
//      }
//      
//      private void hideSystemBar() {
//        try {
//          //REQUIRES ROOT
//          Build.VERSION_CODES vc = new Build.VERSION_CODES();
//          Build.VERSION vr = new Build.VERSION();
//          String ProcID = "79"; //HONEYCOMB AND OLDER
//
//          //v.RELEASE  //4.0.3
//          if (vr.SDK_INT >= vc.ICE_CREAM_SANDWICH) {
//              ProcID = "42"; //ICS AND NEWER
//          }
//          
//          String commandStr = "service call activity " + 
//                              ProcID + " s16 com.android.systemui";
//          runAsRoot(commandStr);
//        } catch (Exception e) {
//          // something went wrong, deal with it here
//        }
//      }
//      
//      private void runAsRoot(String commandStr) {
//    	    try {
//    	      CommandCapture command = new CommandCapture(0, commandStr);   
//    	      RootTools.getShell(true).add(command).waitForFinish();
//    	    } catch (Exception e) {
//    	      // something went wrong, deal with it here
//    	    }
//    	  }
              
    


    //Then call this function
    private void hideSystemUI() {
         mDecorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                | View.SYSTEM_UI_FLAG_FULLSCREEN
                | View.SYSTEM_UI_FLAG_LOW_PROFILE
                | View.SYSTEM_UI_FLAG_IMMERSIVE);
    }
    
    
 // This snippet shows the system bars. It does this by removing all the flags
 // except for the ones that make the content appear under the system bars.
 private void showSystemUI() {  
     mDecorView.setSystemUiVisibility(
             View.SYSTEM_UI_FLAG_LAYOUT_STABLE  
             | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
             | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
 }
    
   
    
    
}