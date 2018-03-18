package br.com.mtusjt.ciclodevida;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import br.com.mtusjt.ciclodevida.StatusTracker;
import br.com.mtusjt.ciclodevida.Utils;

/*
@author Matheus Ribeiro
@ra 816117912
*/
public class ActivityA extends Activity {

    private String mActivityName;
    private TextView mStatusView;
    private TextView mStatusAllView;
    private StatusTracker mStatusTracker = StatusTracker.getInstance();
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        mActivityName = getString(R.string.activity_a);
        mStatusView = (TextView)findViewById(R.id.status_view_a);
        mStatusAllView = (TextView)findViewById(R.id.status_view_all_a);
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_create));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    protected void onStart() {
        super.onStart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_start));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    protected void onRestart() {
        super.onRestart();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_restart));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    protected void onResume() {
        super.onResume();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_resume));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    protected void onPause() {
        super.onPause();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_pause));
        Utils.printStatus(mStatusView, mStatusAllView);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    protected void onStop() {
        super.onStop();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_stop));
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        mStatusTracker.setStatus(mActivityName, getString(R.string.on_destroy));
        mStatusTracker.clear();
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    public void startDialog(View v) {
        Intent intent = new Intent(ActivityA.this, DialogActivity.class);
        startActivity(intent);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    public void startActivityB(View v) {
        Intent intent = new Intent(ActivityA.this, br.com.mtusjt.ciclodevida.ActivityB.class);
        startActivity(intent);
    }
    /*
    @author Matheus Ribeiro
    @Ra 816117912
    */
    public void startActivityC(View v) {
        Intent intent = new Intent(ActivityA.this, ActivityC.class);
        startActivity(intent);
    }
    /*
    @author Matheus Ribeiro
    @ra 816117912
    */
    public void finishActivityA(View v) {
        ActivityA.this.finish();
    }

}
