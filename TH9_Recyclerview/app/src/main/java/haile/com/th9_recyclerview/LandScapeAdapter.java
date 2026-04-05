package haile.com.th9_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ItemLanHolder> {
    //Thêm <LandScapeAdapter.ItemLandHolder>
    Context context;
    ArrayList<LandScape> lsData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> lsData) {
        this.context = context;
        this.lsData = lsData;
    }

    @NonNull
    @Override
    public ItemLanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater cai_bom = LayoutInflater.from(context);
        View vItem = cai_bom.inflate(R.layout.item_land,parent, false);
        ItemLanHolder viewholderCreated = new ItemLanHolder(vItem);
        return viewholderCreated;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemLanHolder holder, int position) {
        //Lấy đối tượng hiển thị
        LandScape landScapeHienThi = lsData.get(position);
        //Trích thông tin
        String caption = landScapeHienThi.getLandCation();
        String tenFileAnh = landScapeHienThi.getLandImageFileName();
        //Đặt vào các trường thông tin của holder
        holder.tvCaption.setText(caption);
            //đặt ảnh
            String packageName = holder.itemView.getContext().getPackageName();
            int imageID = holder.itemView.getResources().getIdentifier(tenFileAnh, "mipmap", packageName);
        holder.ivLandScape.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return lsData.size();
    }

    class ItemLanHolder extends RecyclerView.ViewHolder{
        TextView tvCaption;
        ImageView ivLandScape;

        public ItemLanHolder(@NonNull View itemView) {
            super(itemView);
            tvCaption = itemView.findViewById(R.id.textViewCation);
            ivLandScape = itemView.findViewById(R.id.imageViewLand);
        }
    }
}
