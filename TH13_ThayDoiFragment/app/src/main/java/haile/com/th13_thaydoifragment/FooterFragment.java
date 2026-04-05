package haile.com.th13_thaydoifragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class FooterFragment extends Fragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_footer, container, false);

        Button nutOne = v.findViewById(R.id.btnOne);
        Button nutTwo = v.findViewById(R.id.btnTWO);
        Button nutThree = v.findViewById(R.id.btnTHREE);

        FragmentManager fragmentManager = getParentFragmentManager();

        //Xử lý sự kiện
        nutOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code để chuyển Framgment
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new FragmentOne())
                        .commit();
            }
        });
        nutTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code để chuyển Framgment
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new FragmentTwo())
                        .commit();
            }
        });
        nutThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code để chuyển Framgment
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView_Content, new FragmentThree())
                        .commit();
            }
        });

        return v;

    }
}