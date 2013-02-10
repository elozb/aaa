package test.test;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int a = 234;
        int b = 0;
        long startTime;
        long gap=0;
        Log.e("time", ""+System.currentTimeMillis());
        for(long j=0;j<10;j++){
	        startTime = System.currentTimeMillis();
	        for(long i=0;i<10000000L;i++){
	        	if(a==0){
	        		b=1;
	        	}
	        }
	        gap = System.currentTimeMillis()-startTime;
	        Log.e("a==0", ""+gap);
        }
        
        for(long j=0;j<10;j++){
	        startTime = System.currentTimeMillis();
	        for(long i=0;i<10000000L;i++){
	        	if(0==a){
	        		b=1;
	        	}
	        }
	        gap = System.currentTimeMillis()-startTime;
	        Log.e("0==a", ""+gap);
        }
        

   
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
