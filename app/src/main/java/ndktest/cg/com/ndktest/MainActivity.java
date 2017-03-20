package ndktest.cg.com.ndktest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static {
        System.loadLibrary("ndkdemo");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NdkUtils ndkUtils = new NdkUtils();
        TextView textView = new TextView(this);
        textView.setText(ndkUtils.getStrinFromC());
        setContentView(textView);
    }
}
