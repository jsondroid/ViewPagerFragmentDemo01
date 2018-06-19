package jsondroid.android.com.viewpagerfragmentdemo01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by wenbaohe on 2018/6/19.
 *
 */

public class ViewPagerAdapter2 extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private FragmentManager fm;

    public ViewPagerAdapter2(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fm = fm;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);

    }
}
