package waasi.waasi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Chrustkiran on 26/09/2017.
 */

public class OHolder extends RecyclerView.ViewHolder {
    public TextView mName,mDesc,liketxt;
    public ImageButton mLike,mShare;
    public ImageView mImageView;
    View v;
    public OHolder(View itemView) {
        super(itemView);
        v = itemView;
        mName = (TextView)v.findViewById(R.id.mName);
        mDesc = (TextView)v.findViewById(R.id.mDesc);
        mImageView = (ImageView)v.findViewById(R.id.mImage);
        mLike = (ImageButton)v.findViewById(R.id.mLike);
        mShare = (ImageButton)v.findViewById(R.id.mShare);
        liketxt = (TextView)v.findViewById(R.id.liketxt);

    }

}
