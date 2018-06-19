package jsondroid.android.com.viewpagerfragmentdemo01;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by wenbaohe on 2018/6/19.
 * 缓存所有页面，切Fragment的不会重新创建
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private ArrayList<Fragment> fragments;
    private FragmentManager fm;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<Fragment> fragments) {
        super(fm);
        this.fm = fm;
        this.fragments = fragments;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = fragments.get(position);
        Bundle bundle = new Bundle();
        bundle.putString("id", "" + position);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        // 将实例化的fragment进行显示即可。
        Fragment fragment = (Fragment) super.instantiateItem(container, position);
        this.fm.beginTransaction().show(fragment).commit();
        return fragment;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        Fragment fragment = fragments.get(position);// 获取要销毁的fragment
        this.fm.beginTransaction().hide(fragment).commit();// 将其隐藏即可，并不需要真正销毁，这样fragment状态就得到了保存
    }
}
