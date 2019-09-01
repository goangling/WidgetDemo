package com.zhanggouzi.widgetdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RatingBar;

import me.zhanghai.android.materialratingbar.MaterialRatingBar;

/**
 * 1. https://github.com/snowdream/awesome-android
 *      Widget.md:   https://github.com/zhanghai/MaterialRatingBar
 * 2. https://github.com/opendigg/awesome-github-android-ui
 *    SimpleRatingBar: https://github.com/FlyingPumba/SimpleRatingBar
 *
 * 3. https://github.com/hedge-hog/RatingBar
 * 4. https://github.com/xingliuhua/XLHRatingBar
 * 5. android 原生的RatingBar， 感觉功能足够了，xml、代码设置都可以。空星星是否显示
 * 6. https://blog.csdn.net/zxc514257857/article/details/68670712
 */
public class RatingBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating_bar);

        MaterialRatingBar materialRatingBar = findViewById(R.id.dynamic_material_rating_bar);
        materialRatingBar.setNumStars(5);
        materialRatingBar.setRating(3.5f);
        materialRatingBar.setMinimumHeight(38);
        materialRatingBar.setMinimumWidth(38);
        materialRatingBar.setStepSize(0.5f);


        float rating =2.3f;
        float stepSize = 0.5f;
        {
            RatingBar rawRatingBar = findViewById(R.id.raw_rating_bar);
            rawRatingBar.setIsIndicator(true);
            rawRatingBar.setRating(rating);
            rawRatingBar.setStepSize(stepSize);
        }
        {
            RatingBar rawRatingBarNoEmpty = findViewById(R.id.raw_rating_bar_noempty);
            rawRatingBarNoEmpty.setIsIndicator(true);
            rawRatingBarNoEmpty.setNumStars((int) Math.ceil(rating));  //注意顺序，这个必须先设置，否则显示不对
            rawRatingBarNoEmpty.setStepSize(stepSize);
            rawRatingBarNoEmpty.setRating(rating);

        }
    }


}
