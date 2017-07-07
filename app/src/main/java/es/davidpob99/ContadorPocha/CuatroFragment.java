package es.davidpob99.ContadorPocha;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link CuatroFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CuatroFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CuatroFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button Bbtn1, Bbtn2, Bbtn3, Bbtn4, Bbtn5, Bbtn6, Bbtn7, Bbtn8,
            Bbtn9, Bbtn10, Bbtn11, Bbtn12, Bbtn101, Bbtn102, Bbtn103, Bbtn104, Bbtn105, Bbtn106, Bbtn107, Bbtn108,
            Bbtn109, Bbtn1010, Bbtn1011, Bbtn1012, Bbtn201, Bbtn202, Bbtn203, Bbtn204, Bbtn205, Bbtn206, Bbtn207, Bbtn208,
            Bbtn209, Bbtn2010, Bbtn2011, Bbtn2012, Bbtn301, Bbtn302, Bbtn303, Bbtn304, Bbtn305, Bbtn306, Bbtn307, Bbtn308,
            Bbtn309, Bbtn3010, Bbtn3011, Bbtn3012;
    TextView tx, tx1, tx2, tx3;
    Button Breset;
    EditText et, et1, et2, et3;
    int j1 = 0;
    int j2 = 0;
    int j3 = 0;
    int j4 = 0;
    String jug1, jug2, jug3, jug4;

    private OnFragmentInteractionListener mListener;

    public CuatroFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CuatroFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CuatroFragment newInstance(String param1, String param2) {
        CuatroFragment fragment = new CuatroFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_cuatro, container, false);

        tx = (TextView) rootView.findViewById(R.id.BtextView1);
        tx1 = (TextView) rootView.findViewById(R.id.BtextView101);
        tx2 = (TextView) rootView.findViewById(R.id.BtextView201);
        tx3 = (TextView) rootView.findViewById(R.id.BtextView301);

        et = (EditText) rootView.findViewById(R.id.BeditText);
        et1 = (EditText) rootView.findViewById(R.id.BeditText101);
        et2 = (EditText) rootView.findViewById(R.id.BeditText201);
        et3 = (EditText) rootView.findViewById(R.id.BeditText301);

        Bbtn1 = (Button) rootView.findViewById(R.id.Bbutton1);
        Bbtn1.setOnClickListener(this);
        Bbtn2 = (Button) rootView.findViewById(R.id.Bbutton2);
        Bbtn2.setOnClickListener(this);
        Bbtn3 = (Button) rootView.findViewById(R.id.Bbutton3);
        Bbtn3.setOnClickListener(this);
        Bbtn4 = (Button) rootView.findViewById(R.id.Bbutton4);
        Bbtn4.setOnClickListener(this);
        Bbtn5 = (Button) rootView.findViewById(R.id.Bbutton5);
        Bbtn5.setOnClickListener(this);
        Bbtn6 = (Button) rootView.findViewById(R.id.Bbutton6);
        Bbtn6.setOnClickListener(this);
        Bbtn7 = (Button) rootView.findViewById(R.id.Bbutton7);
        Bbtn7.setOnClickListener(this);
        Bbtn8 = (Button) rootView.findViewById(R.id.Bbutton8);
        Bbtn8.setOnClickListener(this);
        Bbtn9 = (Button) rootView.findViewById(R.id.Bbutton9);
        Bbtn9.setOnClickListener(this);
        Bbtn10 = (Button) rootView.findViewById(R.id.Bbutton10);
        Bbtn10.setOnClickListener(this);
        Bbtn11 = (Button) rootView.findViewById(R.id.Bbutton11);
        Bbtn11.setOnClickListener(this);
        Bbtn12 = (Button) rootView.findViewById(R.id.Bbutton12);
        Bbtn12.setOnClickListener(this);


        Bbtn101 = (Button) rootView.findViewById(R.id.Bbutton101);
        Bbtn101.setOnClickListener(this);
        Bbtn102 = (Button) rootView.findViewById(R.id.Bbutton102);
        Bbtn102.setOnClickListener(this);
        Bbtn103 = (Button) rootView.findViewById(R.id.Bbutton103);
        Bbtn103.setOnClickListener(this);
        Bbtn104 = (Button) rootView.findViewById(R.id.Bbutton104);
        Bbtn104.setOnClickListener(this);
        Bbtn105 = (Button) rootView.findViewById(R.id.Bbutton105);
        Bbtn105.setOnClickListener(this);
        Bbtn106 = (Button) rootView.findViewById(R.id.Bbutton106);
        Bbtn106.setOnClickListener(this);
        Bbtn107 = (Button) rootView.findViewById(R.id.Bbutton107);
        Bbtn107.setOnClickListener(this);
        Bbtn108 = (Button) rootView.findViewById(R.id.Bbutton108);
        Bbtn108.setOnClickListener(this);
        Bbtn109 = (Button) rootView.findViewById(R.id.Bbutton109);
        Bbtn109.setOnClickListener(this);
        Bbtn1010 = (Button) rootView.findViewById(R.id.Bbutton1010);
        Bbtn1010.setOnClickListener(this);
        Bbtn1011 = (Button) rootView.findViewById(R.id.Bbutton1011);
        Bbtn1011.setOnClickListener(this);
        Bbtn1012 = (Button) rootView.findViewById(R.id.Bbutton1012);
        Bbtn1012.setOnClickListener(this);

        Bbtn201 = (Button) rootView.findViewById(R.id.Bbutton201);
        Bbtn201.setOnClickListener(this);
        Bbtn202 = (Button) rootView.findViewById(R.id.Bbutton202);
        Bbtn202.setOnClickListener(this);
        Bbtn203 = (Button) rootView.findViewById(R.id.Bbutton203);
        Bbtn203.setOnClickListener(this);
        Bbtn204 = (Button) rootView.findViewById(R.id.Bbutton204);
        Bbtn204.setOnClickListener(this);
        Bbtn205 = (Button) rootView.findViewById(R.id.Bbutton205);
        Bbtn205.setOnClickListener(this);
        Bbtn206 = (Button) rootView.findViewById(R.id.Bbutton206);
        Bbtn206.setOnClickListener(this);
        Bbtn207 = (Button) rootView.findViewById(R.id.Bbutton207);
        Bbtn207.setOnClickListener(this);
        Bbtn208 = (Button) rootView.findViewById(R.id.Bbutton208);
        Bbtn208.setOnClickListener(this);
        Bbtn209 = (Button) rootView.findViewById(R.id.Bbutton209);
        Bbtn209.setOnClickListener(this);
        Bbtn2010 = (Button) rootView.findViewById(R.id.Bbutton2010);
        Bbtn2010.setOnClickListener(this);
        Bbtn2011 = (Button) rootView.findViewById(R.id.Bbutton2011);
        Bbtn2011.setOnClickListener(this);
        Bbtn2012 = (Button) rootView.findViewById(R.id.Bbutton2012);
        Bbtn2012.setOnClickListener(this);

        Bbtn301 = (Button) rootView.findViewById(R.id.Bbutton301);
        Bbtn301.setOnClickListener(this);
        Bbtn302 = (Button) rootView.findViewById(R.id.Bbutton302);
        Bbtn302.setOnClickListener(this);
        Bbtn303 = (Button) rootView.findViewById(R.id.Bbutton303);
        Bbtn303.setOnClickListener(this);
        Bbtn304 = (Button) rootView.findViewById(R.id.Bbutton304);
        Bbtn304.setOnClickListener(this);
        Bbtn305 = (Button) rootView.findViewById(R.id.Bbutton305);
        Bbtn305.setOnClickListener(this);
        Bbtn306 = (Button) rootView.findViewById(R.id.Bbutton306);
        Bbtn306.setOnClickListener(this);
        Bbtn307 = (Button) rootView.findViewById(R.id.Bbutton307);
        Bbtn307.setOnClickListener(this);
        Bbtn308 = (Button) rootView.findViewById(R.id.Bbutton308);
        Bbtn308.setOnClickListener(this);
        Bbtn309 = (Button) rootView.findViewById(R.id.Bbutton309);
        Bbtn309.setOnClickListener(this);
        Bbtn3010 = (Button) rootView.findViewById(R.id.Bbutton3010);
        Bbtn3010.setOnClickListener(this);
        Bbtn3011 = (Button) rootView.findViewById(R.id.Bbutton3011);
        Bbtn3011.setOnClickListener(this);
        Bbtn3012 = (Button) rootView.findViewById(R.id.Bbutton3012);
        Bbtn3012.setOnClickListener(this);

        Breset = (Button) rootView.findViewById(R.id.Breset);
        Breset.setOnClickListener(this);

        SharedPreferences prefsCuatro = this.getActivity().getSharedPreferences("prefs4", Context.MODE_PRIVATE);
        int jugador1 = prefsCuatro.getInt("jugador1", 0);
        int jugador2 = prefsCuatro.getInt("jugador2", 0);
        int jugador3 = prefsCuatro.getInt("jugador3", 0);
        int jugador4 = prefsCuatro.getInt("jugador4", 0);

        String nombre1 = prefsCuatro.getString("nombre1", "");
        String nombre2 = prefsCuatro.getString("nombre2", "");
        String nombre3 = prefsCuatro.getString("nombre3", "");
        String nombre4 = prefsCuatro.getString("nombre4", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0|jugador4!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;
            j4=jugador4;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);
            jug4=String.valueOf(j4);
            tx3.setText(jug4);

            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
            et3.setText(nombre4);

            Toast toast =
                    Toast.makeText(getActivity().getApplicationContext(),
                            "Se han restaurado los datos de la partida anterior", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            j1=0;
            j2=0;
            j3=0;
            j4=0;
        }

        return rootView;
    }

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences prefsCuatro = this.getActivity().getSharedPreferences("prefs4", Context.MODE_PRIVATE);
        int jugador1 = prefsCuatro.getInt("jugador1", 0);
        int jugador2 = prefsCuatro.getInt("jugador2", 0);
        int jugador3 = prefsCuatro.getInt("jugador3", 0);
        int jugador4 = prefsCuatro.getInt("jugador4", 0);

        String nombre1 = prefsCuatro.getString("nombre1", "");
        String nombre2 = prefsCuatro.getString("nombre2", "");
        String nombre3 = prefsCuatro.getString("nombre3", "");
        String nombre4 = prefsCuatro.getString("nombre4", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0|jugador4!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;
            j4=jugador4;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);
            jug4=String.valueOf(j4);
            tx3.setText(jug4);

            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
            et3.setText(nombre4);
        }

    }

    @Override
    public void onPause(){
        super.onPause();
        SharedPreferences prefsCuatro = this.getActivity().getSharedPreferences("prefs4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsCuatro.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putInt("jugador4", j4);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.putString("nombre4", et3.getText().toString());
        editor.commit();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        super.onDestroyView();
        SharedPreferences prefsCuatro = this.getActivity().getSharedPreferences("prefs4", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsCuatro.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putInt("jugador4", j4);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.putString("nombre4", et3.getText().toString());
        editor.commit();
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Bbutton1:
                j1 = j1 + 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton2:
                j1 = j1 + 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton3:
                j1 = j1 + 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton4:
                j1 = j1 + 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton5:
                j1 = j1 + 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton6:
                j1 = j1 + 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton7:
                j1 = j1 - 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton8:
                j1 = j1 - 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton9:
                j1 = j1 - 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton10:
                j1 = j1 - 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton11:
                j1 = j1 - 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton12:
                j1 = j1 - 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Bbutton101:
                j2 = j2 + 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton102:
                j2 = j2 + 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton103:
                j2 = j2 + 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton104:
                j2 = j2 + 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton105:
                j2 = j2 + 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton106:
                j2 = j2 + 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton107:
                j2 = j2 - 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton108:
                j2 = j2 - 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton109:
                j2 = j2 - 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton1010:
                j2 = j2 - 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton1011:
                j2 = j2 - 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton1012:
                j2 = j2 - 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Bbutton201:
                j3 = j3 + 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton202:
                j3 = j3 + 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton203:
                j3 = j3 + 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton204:
                j3 = j3 + 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton205:
                j3 = j3 + 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton206:
                j3 = j3 + 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton207:
                j3 = j3 - 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton208:
                j3 = j3 - 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton209:
                j3 = j3 - 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton2010:
                j3 = j3 - 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton2011:
                j3 = j3 - 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Bbutton2012:
                j3 = j3 - 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;

            case R.id.Bbutton301:
                j4 = j4 + 3;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton302:
                j4 = j4 + 4;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton303:
                j4 = j4 + 5;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton304:
                j4 = j4 + 6;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton305:
                j4 = j4 + 7;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton306:
                j4 = j4 + 8;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton307:
                j4 = j4 - 3;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton308:
                j4 = j4 - 4;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton309:
                j4 = j4 - 5;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton3010:
                j4 = j4 - 6;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton3011:
                j4 = j4 - 7;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Bbutton3012:
                j4 = j4 - 8;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Breset:
                j1 = 0;
                j2 = 0;
                j3 = 0;
                j4 = 0;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
        }
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
