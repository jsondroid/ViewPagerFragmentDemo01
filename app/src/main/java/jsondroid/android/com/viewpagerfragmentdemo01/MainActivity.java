package jsondroid.android.com.viewpagerfragmentdemo01;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewpager;
    private ViewPagerAdapter2 viewPagerAdapter;

    private ArrayList<Fragment> fragments;

    RadioGroup group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewpager = (ViewPager) findViewById(R.id.viewpager);
        group = (RadioGroup) findViewById(R.id.group);

        fragments = new ArrayList<>();
        fragments.add(new FragmentA());
        fragments.add(new FragmentB());
        fragments.add(new FragmentC());
        fragments.add(new FragmentD());
        fragments.add(new FragmentF());
        fragments.add(new FragmentF());
        fragments.add(new FragmentF());
        fragments.add(new FragmentF());
        fragments.add(new FragmentF());
        fragments.add(new FragmentF());

        viewPagerAdapter = new ViewPagerAdapter2(getSupportFragmentManager(), fragments);
        viewpager.setAdapter(viewPagerAdapter);


        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbtn_A:
                        viewpager.setCurrentItem(0);
                        break;
                    case R.id.rbtn_B:
                        viewpager.setCurrentItem(1);
                        break;
                    case R.id.rbtn_C:
                        viewpager.setCurrentItem(2);
                        break;
                    case R.id.rbtn_D:
                        viewpager.setCurrentItem(3);
                        break;
                    case R.id.rbtn_F:
                        viewpager.setCurrentItem(4);
                        break;
                }
            }
        });
    }
}
