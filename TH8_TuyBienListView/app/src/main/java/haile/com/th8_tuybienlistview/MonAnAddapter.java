package haile.com.th8_tuybienlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MonAnAddapter extends BaseAdapter {
    private ArrayList<MonAn> dsMonAn;
    private LayoutInflater layoutInflater;
    private Context context;

    public MonAnAddapter(Context _context, ArrayList<MonAn> dsMonAn) {
        this.dsMonAn = dsMonAn;
        this.context = _context;
        this.layoutInflater =LayoutInflater.from(_context);
    }

    @Override
    public int getCount() {
        return dsMonAn.size();
    }

    @Override
    public Object getItem(int i) {
        return dsMonAn.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        //View item HienHanh
        View viewHienHanh = view;
        //Kiem tra
        if(viewHienHanh == null ){
            viewHienHanh = layoutInflater.inflate(R.layout.item_monan,viewGroup, false);

        }
        // Lấy dữ liệu
        MonAn monAnHienTai = dsMonAn.get(i);
        // Gán lên các điều khiển

        //Tìm điều khiển
        TextView textView_tenMon =viewHienHanh.findViewById(R.id.tvTenMonAn);
        TextView textView_DonGia =viewHienHanh.findViewById(R.id.tvDonGia);
        TextView textView_MoTa = viewHienHanh.findViewById(R.id.tvMoTa);
        ImageView imageView_Anh = viewHienHanh.findViewById(R.id.imgAnhMinhHoa);

        textView_tenMon.setText(monAnHienTai.getTenMonAn());
        textView_DonGia.setText(String.valueOf(monAnHienTai.getDonGia()));
        textView_MoTa.setText(monAnHienTai.getMoTa());
        imageView_Anh.setImageResource(monAnHienTai.getIdAnhMinhHoa());

        return viewHienHanh;
    }
}
