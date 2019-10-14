package id.ac.polinema.intent.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import id.ac.polinema.intent.Fragment.BlankFragment;
import id.ac.polinema.intent.Fragment.SquareFragment;
import id.ac.polinema.intent.Fragment.TriangleFragment;
import id.ac.polinema.intent.R;

public class OtherEquation extends AppCompatActivity {

    private Object fragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_equation);

        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .add(R.id.frameLayout, new BlankFragment())
                    .commit();
        }
    }

    public void handleSquareFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof SquareFragment || fragment instanceof TriangleFragment ||  fragment instanceof BlankFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.frameLayout, new SquareFragment())
                    .commit();
        }
    }

    public void handleTriangleFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof SquareFragment || fragment instanceof TriangleFragment ||  fragment instanceof BlankFragment) {
            getSupportFragmentManager().beginTransaction()
                    .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                    .replace(R.id.frameLayout, new TriangleFragment())
                    .commit();
        }
    }
}
