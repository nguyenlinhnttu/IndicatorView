package com.vi.indicatorlib;

/**
 * Created by nguyenvanlinh
 * Date: 1/5/18.
 * BSV Android Dev
 */

public class PagesLessException extends Exception {
    @Override
    public String getMessage() {
        return "Pages must equal or larger than 2";
    }


}
