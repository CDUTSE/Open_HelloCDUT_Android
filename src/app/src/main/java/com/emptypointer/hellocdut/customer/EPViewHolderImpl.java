package com.emptypointer.hellocdut.customer;

/**
 * Created by Sequarius on 2015/11/3.
 */
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.util.SparseArray;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Checkable;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.nostra13.universalimageloader.core.ImageLoader;


/**
 * ViewHolder操作子视图的实现类
 * Created by mrsimple on 29/9/15.
 */
public class EPViewHolderImpl {

    /**
     * 缓存子视图,key为view id, 值为View。
     */
    private SparseArray<View> mCahceViews = new SparseArray<View>();
    /**
     * Item View
     */
    View mItemView;

    /**
     * @param itemView
     */
    EPViewHolderImpl(View itemView) {
        mItemView = itemView;
    }

    public View getItemView() {
        return mItemView;
    }

    /**
     * @param viewId
     * @param <T>
     * @return
     */
    public <T extends View> T findViewById(int viewId) {
        View target = mCahceViews.get(viewId);
        if (target == null) {
            target = mItemView.findViewById(viewId);
            mCahceViews.put(viewId, target);
        }
        return (T) target;
    }


    public void setTextBackgroudColor(int viewID,int color){
        TextView textView=findViewById(viewID);
        textView.setTextColor(color);
    }

    public void setText(int viewId, int stringId) {
        TextView textView = findViewById(viewId);
        textView.setText(stringId);
    }

    public void setText(int viewId, String text) {
        TextView textView = findViewById(viewId);
        textView.setText(text);
    }

    public void setTextColor(int viewId, int color) {
        TextView textView = findViewById(viewId);
        textView.setTextColor(color);
    }

    public void setCardViewBaground(int ViewID,int color){
        CardView cardView=findViewById(ViewID);
        cardView.setCardBackgroundColor(color);
    }

    /**
     * @param viewId
     * @param color
     */
    public void setBackgroundColor(int viewId, int color) {
        View target = findViewById(viewId);
        target.setBackgroundColor(color);

    }


    /**
     * @param viewId
     * @param resId
     */
    public void setBackgroundResource(int viewId, int resId) {
        View target = findViewById(viewId);
        target.setBackgroundResource(resId);
    }


    /**
     * @param viewId
     * @param drawable
     */
    public void setBackgroundDrawable(int viewId, Drawable drawable) {
        View target = findViewById(viewId);
        target.setBackgroundDrawable(drawable);
    }

    /**
     * @param viewId
     * @param drawable
     */
    @TargetApi(16)
    public void setBackground(int viewId, Drawable drawable) {
        View target = findViewById(viewId);
        target.setBackground(drawable);
    }


    public void setImageBitmap(int viewId, Bitmap bitmap) {
        ImageView target = findViewById(viewId);
        target.setImageBitmap(bitmap);
    }


    public void setImageResource(int viewId, int resId) {
        ImageView target = findViewById(viewId);
        target.setImageResource(resId);
    }


    public void setImageDrawable(int viewId, Drawable drawable) {
        ImageView target = findViewById(viewId);
        target.setImageDrawable(drawable);
    }


    public void setImageDrawable(int viewId, Uri uri) {
        ImageView target = findViewById(viewId);
        target.setImageURI(uri);
    }


    @TargetApi(16)
    public void setImageAlpha(int viewId, int alpha) {
        ImageView target = findViewById(viewId);
        target.setImageAlpha(alpha);
    }

    public void setChecked(int viewId, boolean checked) {
        Checkable checkable = findViewById(viewId);
        checkable.setChecked(checked);
    }


    public void setProgress(int viewId, int progress) {
        ProgressBar view = findViewById(viewId);
        view.setProgress(progress);
    }

    public void setProgress(int viewId, int progress, int max) {
        ProgressBar view = findViewById(viewId);
        view.setMax(max);
        view.setProgress(progress);
    }

    public void setMax(int viewId, int max) {
        ProgressBar view = findViewById(viewId);
        view.setMax(max);
    }

    public void setRating(int viewId, float rating) {
        RatingBar view = findViewById(viewId);
        view.setRating(rating);
    }


    public void setRating(int viewId, float rating, int max) {
        RatingBar view = findViewById(viewId);
        view.setMax(max);
        view.setRating(rating);
    }

    public void setOnClickListener(int viewId, View.OnClickListener listener) {
        View view = findViewById(viewId);
        view.setOnClickListener(listener);

    }

    public void setOnTouchListener(int viewId, View.OnTouchListener listener) {
        View view = findViewById(viewId);
        view.setOnTouchListener(listener);
    }


    public void setOnLongClickListener(int viewId, View.OnLongClickListener listener) {
        View view = findViewById(viewId);
        view.setOnLongClickListener(listener);
    }

    public void setOnItemClickListener(int viewId, AdapterView.OnItemClickListener listener) {
        AdapterView view = findViewById(viewId);
        view.setOnItemClickListener(listener);
    }


    public void setOnItemLongClickListener(int viewId, AdapterView.OnItemLongClickListener listener) {
        AdapterView view = findViewById(viewId);
        view.setOnItemLongClickListener(listener);
    }


    public void setOnItemSelectedClickListener(int viewId, AdapterView.OnItemSelectedListener listener) {
        AdapterView view = findViewById(viewId);
        view.setOnItemSelectedListener(listener);
    }

    public void setOnclickListenner(int viewID, View.OnClickListener onClickListener) {
        View view=findViewById(viewID);
        view.setOnClickListener(onClickListener);
    }

    public void setViewEnable(int viewId, boolean enable) {
        View view=findViewById(viewId);
        view.setEnabled(enable);
    }

//    public void setImageURL(int viewId, String url) {
//        SimpleDraweeView draweeView=(SimpleDraweeView)findViewById(viewId);
//        draweeView.setImageURI(Uri.parse(url));
//    }

    public void setClickable(int viewId, boolean clickable) {
        View view=findViewById(viewId);
        view.setClickable(clickable);
    }

    public void setViewVisibility(int viewId, int visiable) {
        View view=findViewById(viewId);
        view.setVisibility(visiable);
    }

    public void setImageURL(int viewId, String url) {
        ImageView view=(ImageView)findViewById(viewId);
        ImageLoader.getInstance().displayImage(url, view,EPApplication.getInstance().getDisplayImageOptions());
    }

    public void setTextSize(int viewId, float size) {
        TextView view=(TextView)findViewById(viewId);
        view.setTextSize(size);
    }
}
