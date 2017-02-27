package com.lnyp.imgdots.activity;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.lnyp.imgdots.R;
import com.lnyp.imgdots.adapter.ImgBrowsePagerAdapter;
import com.lnyp.imgdots.bean.ImgSimple;
import com.lnyp.imgdots.bean.PointSimple;

import java.util.ArrayList;
import java.util.List;

public class ImageBrowseActivity extends AppCompatActivity {

    private ViewPager viewPagerImgs;

    private List<ImgSimple> imgSimples;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_image_browse);


        viewPagerImgs = (ViewPager) this.findViewById(R.id.viewPagerImgs);
        viewPagerImgs.setOffscreenPageLimit(2);

        initData();

        PagerAdapter adapter = new ImgBrowsePagerAdapter(this, imgSimples);
        viewPagerImgs.setAdapter(adapter);

    }

    private void initData() {
        imgSimples = new ArrayList<>();

        ImgSimple imgSimple2 = new ImgSimple();
        imgSimple2.url = "http://lequapp.oss-cn-hangzhou.aliyuncs.com/huway/upload/2016/12/22/20161222142050459926.jpg";
        imgSimple2.url = "http://lequapp.oss-cn-hangzhou.aliyuncs.com/huway/upload/2016/12/22/20161222142050459926.jpg?x-oss-process=image/resize,m_fill,w_1080,h_1920/format,jpg";
        imgSimple2.scale = 1.5878f;//H W scale

        ArrayList<PointSimple> pointSimples2 = new ArrayList<>();

        PointSimple pointSimple7 = new PointSimple();
        pointSimple7.width_scale = 0.7852f;
        pointSimple7.height_scale = 0.4993f;

        PointSimple pointSimple8 = new PointSimple();
        pointSimple8.width_scale = 0.8939f;
        pointSimple8.height_scale = 0.9325f;

        PointSimple pointSimple9 = new PointSimple();
        pointSimple9.width_scale = 0.4306f;
        pointSimple9.height_scale = 0.3616f;

        PointSimple pointSimple1 = new PointSimple();
        pointSimple1.width_scale = 0.6268f;
        pointSimple1.height_scale = 0.2197f;

        PointSimple pointSimple2 = new PointSimple();
        pointSimple2.width_scale = 0.7431f;
        pointSimple2.height_scale = 0.3535f;


        PointSimple pointSimple0 = new PointSimple();
        pointSimple0.width_scale = 0f;
        pointSimple0.height_scale = 0f;


        PointSimple pointSimple01 = new PointSimple();
        pointSimple01.width_scale = 1f;
        pointSimple01.height_scale = 1f;


        pointSimples2.add(pointSimple7);
        pointSimples2.add(pointSimple1);
        pointSimples2.add(pointSimple8);
        pointSimples2.add(pointSimple01);
        pointSimples2.add(pointSimple0);
        pointSimples2.add(pointSimple9);
        pointSimples2.add(pointSimple2);

        imgSimple2.pointSimples = pointSimples2;

        imgSimples.add(imgSimple2);
    }

}
