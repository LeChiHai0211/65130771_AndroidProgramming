package haile.com.th9_recyclerview;

import android.os.Bundle;
import android.widget.Adapter;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    LandScapeAdapter landScapeAdapter;
    ArrayList<LandScape> recyclerViewDatas;
    RecyclerView recyclerViewLanScape;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3
        recyclerViewDatas = getDataForRecyclerView();
        //4
        recyclerViewLanScape = findViewById(R.id.recylerLand);
        //5
        RecyclerView.LayoutManager layoutLinear =  new LinearLayoutManager(this);
        recyclerViewLanScape.setLayoutManager(layoutLinear);
        //6
        landScapeAdapter = new LandScapeAdapter(this,recyclerViewDatas);
        //7
        recyclerViewLanScape.setAdapter(landScapeAdapter);

    }

    ArrayList<LandScape> getDataForRecyclerView(){
        ArrayList<LandScape> dsDulieu = new ArrayList<>();
        LandScape landScape_1 = new LandScape("dinhdoclap", "Đám giỗ 3 que");
        dsDulieu.add(landScape_1);
        dsDulieu.add(new LandScape("hoguum", "Hồ Gươm"));
        dsDulieu.add(new LandScape("kinhthanhhue", "Kinh Thành Huế"));
        return dsDulieu;
    }
}