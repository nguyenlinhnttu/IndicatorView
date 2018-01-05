package com.vi.indicatorlib;

import android.support.v4.view.ViewPager;

/**
 * Created by nguyenvanlinh
 * Date: 1/5/18.
 * BSV Android Dev
 */

public interface IndicatorInterface {
    void setViewPager(ViewPager viewPager) throws PagesLessException;

    void setAnimateDuration(long duration);

    /**
     *
     * @param radius: radius in pixel
     */
    void setRadiusSelected(int radius);

    /**
     *
     * @param radius: radius in pixel
     */
    void setRadiusUnselected(int radius);

    /**
     *
     * @param distance: distance in pixel
     */
    void setDistanceDot(int distance);
}
