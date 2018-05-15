package com.dominantit.domiscan.Scan;

import android.content.Context;
import android.support.design.widget.TextInputEditText;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.dominantit.domiscan.R;
import com.dominantit.domiscan.Shared.DataArchive;

import org.w3c.dom.Text;

public class ViewPagerAdapter extends PagerAdapter {

    private Context context;
    private LayoutInflater layoutInflater;
    private Integer [] images = {R.drawable.bg,R.drawable.bg2,R.drawable.bg3};

    public ViewPagerAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public Object instantiateItem(ViewGroup container, final int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(position == 1)
        {
            View view = layoutInflater.inflate(R.layout.textedit_layout, null);
            TextInputEditText extractedBox = view.findViewById(R.id.results);
            extractedBox.setText("Watch the space");
            ViewPager vp = (ViewPager) container;
            vp.addView(view, 0);
            return view;
        }
        else
        {
            View view = layoutInflater.inflate(R.layout.custom_layout, null);
            ImageView imageView = (ImageView) view.findViewById(R.id.imageView);
            imageView.setImageResource(images[position]);
            ViewPager vp = (ViewPager) container;
            vp.addView(view, 0);
            return view;
        }

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);
    }
}
