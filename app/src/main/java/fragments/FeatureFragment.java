package fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.kbz.hms.readerapp.R;
import com.kbz.hms.readerapp.adapters.FeatureAdapter;

public class FeatureFragment extends Fragment {


    public static FeatureFragment newInstance(){

        return new FeatureFragment();

    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_feature, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_feature);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.HORIZONTAL, false));

        FeatureAdapter featureAdapter = new FeatureAdapter();
        recyclerView.setAdapter(featureAdapter);

        return view;
    }
}
