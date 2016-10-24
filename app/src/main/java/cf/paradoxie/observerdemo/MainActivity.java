package cf.paradoxie.observerdemo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Watcher {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.tv);

        mTextView.setText("听说tom要搞一个炸弹，有人在监视他");
        new Handler(new Handler.Callback() {
            @Override
            public boolean handleMessage(Message msg) {
                doSomeThing();//搞事
                return false;
            }
        }).sendEmptyMessageDelayed(0, 3000);
    }
    private void doSomeThing() {
        Tom tom = new Tom();//tom来了
        tom.add(this);//引起注意了
        tom.steal("偷到了一台三桑note7");//行动了
    }
    @Override
    public void Discover(String s) {
        mTextView.setText("tom被发现" + s + ",诶不抓了不抓了~");
    }
}
