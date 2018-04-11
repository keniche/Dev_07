package android.lifeistech.com.drum;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private SoundPool mSoundPool;
    private int[] mSoundID;

    private int[] mSoundResourse = {
            R.raw.cymbal1,
            R.raw.cymbal2,
            R.raw.cymbal3,
            R.raw.tom1,
            R.raw.tom2,
            R.raw.tom3,
            R.raw.hihat,
            R.raw.snare,
            R.raw.bass
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        super.onResume();

        mSoundPool = new SoundPool(mSoundResourse.length, AudioManager.STREAM_MUSIC, 0);

        mSoundID = new int[mSoundResourse.length];

        for (int i = 0; i < mSoundResourse.length; i++) {
            mSoundID[i] = mSoundPool.load(getApplicationContext(), mSoundResourse[i], 0);
        }
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();

        mSoundPool.release();
    }
    public void cymbal1(View v){
        mSoundPool.play(mSoundID[0], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void cymbal2(View v){
        mSoundPool.play(mSoundID[1], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void cymbal3(View v){
        mSoundPool.play(mSoundID[2], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void tom1(View v){
        mSoundPool.play(mSoundID[3], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void tom2(View v){
        mSoundPool.play(mSoundID[4], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void tom3(View v){
        mSoundPool.play(mSoundID[5], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void hihat(View v){
        mSoundPool.play(mSoundID[6], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void snare(View v){
        mSoundPool.play(mSoundID[7], 1.0F, 1.0F, 0, 0, 1.0F);
    }
    public void bass(View v){
        mSoundPool.play(mSoundID[8], 1.0F, 1.0F, 0, 0, 1.0F);
    }
}
