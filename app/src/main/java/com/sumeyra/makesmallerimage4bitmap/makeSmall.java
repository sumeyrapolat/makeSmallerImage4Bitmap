package com.sumeyra.makesmallerimage4bitmap;

import android.graphics.Bitmap;

public class makeSmall {
    public Bitmap makeSmallerImage(Bitmap image, int maximumSize){
        //görsel küçülten method
        // burada mantıklı bir algortima kurmam lazım çünkü görsel hem dikey hem de yatay modda olabilir.
        int width = image.getWidth();
        int height= image.getHeight();
        float bitmapRatio = (float) width/(float)height;
        if (bitmapRatio > 1){
            //yatay görsel // landscape image
            width =maximumSize;
            height= (int)(width/bitmapRatio);

        }else{
            //dikey görsel //portrait image
            height=maximumSize;
            width = (int)(height*bitmapRatio);
        }
        return Bitmap.createScaledBitmap(image,width,height,true);


    }
}

