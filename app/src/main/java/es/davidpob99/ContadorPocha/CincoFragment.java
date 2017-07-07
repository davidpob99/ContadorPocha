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
 * {@link CincoFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link CincoFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CincoFragment extends Fragment implements View.OnClickListener {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    Button Cbtn1, Cbtn2, Cbtn3, Cbtn4, Cbtn5, Cbtn6, Cbtn7, Cbtn8,
            Cbtn9, Cbtn10, Cbtn11, Cbtn12, Cbtn101, Cbtn102, Cbtn103, Cbtn104, Cbtn105, Cbtn106, Cbtn107, Cbtn108,
            Cbtn109, Cbtn1010, Cbtn1011, Cbtn1012, Cbtn201, Cbtn202, Cbtn203, Cbtn204, Cbtn205, Cbtn206, Cbtn207, Cbtn208,
            Cbtn209, Cbtn2010, Cbtn2011, Cbtn2012, Cbtn301, Cbtn302, Cbtn303, Cbtn304, Cbtn305, Cbtn306, Cbtn307, Cbtn308,
            Cbtn309, Cbtn3010, Cbtn3011, Cbtn3012, Cbtn401, Cbtn402, Cbtn403, Cbtn404, Cbtn405, Cbtn406, Cbtn407, Cbtn408,
            Cbtn409, Cbtn4010, Cbtn4011, Cbtn4012;
    TextView tx, tx1, tx2, tx3, tx4;
    EditText et, et1, et2, et3, et4;
    Button Creset;
    int j1 = 0;
    int j2 = 0;
    int j3 = 0;
    int j4 = 0;
    int j5 = 0;
    String jug1, jug2, jug3, jug4, jug5;

    private OnFragmentInteractionListener mListener;

    public CincoFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment CincoFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CincoFragment newInstance(String param1, String param2) {
        CincoFragment fragment = new CincoFragment();
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
        View rootView = inflater.inflate(R.layout.fragment_cinco, container, false);

        tx = (TextView) rootView.findViewById(R.id.CtextView1);
        tx1 = (TextView) rootView.findViewById(R.id.CtextView101);
        tx2 = (TextView) rootView.findViewById(R.id.CtextView201);
        tx3 = (TextView) rootView.findViewById(R.id.CtextView301);
        tx4 = (TextView) rootView.findViewById(R.id.CtextView401);

        et = (EditText) rootView.findViewById(R.id.CeditText);
        et1 = (EditText) rootView.findViewById(R.id.CeditText101);
        et2 = (EditText) rootView.findViewById(R.id.CeditText201);
        et3 = (EditText) rootView.findViewById(R.id.CeditText301);
        et4 = (EditText) rootView.findViewById(R.id.CeditText401);

        Cbtn1 = (Button) rootView.findViewById(R.id.Cbutton1);
        Cbtn1.setOnClickListener(this);
        Cbtn2 = (Button) rootView.findViewById(R.id.Cbutton2);
        Cbtn2.setOnClickListener(this);
        Cbtn3 = (Button) rootView.findViewById(R.id.Cbutton3);
        Cbtn3.setOnClickListener(this);
        Cbtn4 = (Button) rootView.findViewById(R.id.Cbutton4);
        Cbtn4.setOnClickListener(this);
        Cbtn5 = (Button) rootView.findViewById(R.id.Cbutton5);
        Cbtn5.setOnClickListener(this);
        Cbtn6 = (Button) rootView.findViewById(R.id.Cbutton6);
        Cbtn6.setOnClickListener(this);
        Cbtn7 = (Button) rootView.findViewById(R.id.Cbutton7);
        Cbtn7.setOnClickListener(this);
        Cbtn8 = (Button) rootView.findViewById(R.id.Cbutton8);
        Cbtn8.setOnClickListener(this);
        Cbtn9 = (Button) rootView.findViewById(R.id.Cbutton9);
        Cbtn9.setOnClickListener(this);
        Cbtn10 = (Button) rootView.findViewById(R.id.Cbutton10);
        Cbtn10.setOnClickListener(this);
        Cbtn11 = (Button) rootView.findViewById(R.id.Cbutton11);
        Cbtn11.setOnClickListener(this);
        Cbtn12 = (Button) rootView.findViewById(R.id.Cbutton12);
        Cbtn12.setOnClickListener(this);


        Cbtn101 = (Button) rootView.findViewById(R.id.Cbutton101);
        Cbtn101.setOnClickListener(this);
        Cbtn102 = (Button) rootView.findViewById(R.id.Cbutton102);
        Cbtn102.setOnClickListener(this);
        Cbtn103 = (Button) rootView.findViewById(R.id.Cbutton103);
        Cbtn103.setOnClickListener(this);
        Cbtn104 = (Button) rootView.findViewById(R.id.Cbutton104);
        Cbtn104.setOnClickListener(this);
        Cbtn105 = (Button) rootView.findViewById(R.id.Cbutton105);
        Cbtn105.setOnClickListener(this);
        Cbtn106 = (Button) rootView.findViewById(R.id.Cbutton106);
        Cbtn106.setOnClickListener(this);
        Cbtn107 = (Button) rootView.findViewById(R.id.Cbutton107);
        Cbtn107.setOnClickListener(this);
        Cbtn108 = (Button) rootView.findViewById(R.id.Cbutton108);
        Cbtn108.setOnClickListener(this);
        Cbtn109 = (Button) rootView.findViewById(R.id.Cbutton109);
        Cbtn109.setOnClickListener(this);
        Cbtn1010 = (Button) rootView.findViewById(R.id.Cbutton1010);
        Cbtn1010.setOnClickListener(this);
        Cbtn1011 = (Button) rootView.findViewById(R.id.Cbutton1011);
        Cbtn1011.setOnClickListener(this);
        Cbtn1012 = (Button) rootView.findViewById(R.id.Cbutton1012);
        Cbtn1012.setOnClickListener(this);

        Cbtn201 = (Button) rootView.findViewById(R.id.Cbutton201);
        Cbtn201.setOnClickListener(this);
        Cbtn202 = (Button) rootView.findViewById(R.id.Cbutton202);
        Cbtn202.setOnClickListener(this);
        Cbtn203 = (Button) rootView.findViewById(R.id.Cbutton203);
        Cbtn203.setOnClickListener(this);
        Cbtn204 = (Button) rootView.findViewById(R.id.Cbutton204);
        Cbtn204.setOnClickListener(this);
        Cbtn205 = (Button) rootView.findViewById(R.id.Cbutton205);
        Cbtn205.setOnClickListener(this);
        Cbtn206 = (Button) rootView.findViewById(R.id.Cbutton206);
        Cbtn206.setOnClickListener(this);
        Cbtn207 = (Button) rootView.findViewById(R.id.Cbutton207);
        Cbtn207.setOnClickListener(this);
        Cbtn208 = (Button) rootView.findViewById(R.id.Cbutton208);
        Cbtn208.setOnClickListener(this);
        Cbtn209 = (Button) rootView.findViewById(R.id.Cbutton209);
        Cbtn209.setOnClickListener(this);
        Cbtn2010 = (Button) rootView.findViewById(R.id.Cbutton2010);
        Cbtn2010.setOnClickListener(this);
        Cbtn2011 = (Button) rootView.findViewById(R.id.Cbutton2011);
        Cbtn2011.setOnClickListener(this);
        Cbtn2012 = (Button) rootView.findViewById(R.id.Cbutton2012);
        Cbtn2012.setOnClickListener(this);

        Cbtn301 = (Button) rootView.findViewById(R.id.Cbutton301);
        Cbtn301.setOnClickListener(this);
        Cbtn302 = (Button) rootView.findViewById(R.id.Cbutton302);
        Cbtn302.setOnClickListener(this);
        Cbtn303 = (Button) rootView.findViewById(R.id.Cbutton303);
        Cbtn303.setOnClickListener(this);
        Cbtn304 = (Button) rootView.findViewById(R.id.Cbutton304);
        Cbtn304.setOnClickListener(this);
        Cbtn305 = (Button) rootView.findViewById(R.id.Cbutton305);
        Cbtn305.setOnClickListener(this);
        Cbtn306 = (Button) rootView.findViewById(R.id.Cbutton306);
        Cbtn306.setOnClickListener(this);
        Cbtn307 = (Button) rootView.findViewById(R.id.Cbutton307);
        Cbtn307.setOnClickListener(this);
        Cbtn308 = (Button) rootView.findViewById(R.id.Cbutton308);
        Cbtn308.setOnClickListener(this);
        Cbtn309 = (Button) rootView.findViewById(R.id.Cbutton309);
        Cbtn309.setOnClickListener(this);
        Cbtn3010 = (Button) rootView.findViewById(R.id.Cbutton3010);
        Cbtn3010.setOnClickListener(this);
        Cbtn3011 = (Button) rootView.findViewById(R.id.Cbutton3011);
        Cbtn3011.setOnClickListener(this);
        Cbtn3012 = (Button) rootView.findViewById(R.id.Cbutton3012);
        Cbtn3012.setOnClickListener(this);

        Cbtn401 = (Button) rootView.findViewById(R.id.Cbutton401);
        Cbtn401.setOnClickListener(this);
        Cbtn402 = (Button) rootView.findViewById(R.id.Cbutton402);
        Cbtn402.setOnClickListener(this);
        Cbtn403 = (Button) rootView.findViewById(R.id.Cbutton403);
        Cbtn403.setOnClickListener(this);
        Cbtn404 = (Button) rootView.findViewById(R.id.Cbutton404);
        Cbtn404.setOnClickListener(this);
        Cbtn405 = (Button) rootView.findViewById(R.id.Cbutton405);
        Cbtn405.setOnClickListener(this);
        Cbtn406 = (Button) rootView.findViewById(R.id.Cbutton406);
        Cbtn406.setOnClickListener(this);
        Cbtn407 = (Button) rootView.findViewById(R.id.Cbutton407);
        Cbtn407.setOnClickListener(this);
        Cbtn408 = (Button) rootView.findViewById(R.id.Cbutton408);
        Cbtn408.setOnClickListener(this);
        Cbtn409 = (Button) rootView.findViewById(R.id.Cbutton409);
        Cbtn409.setOnClickListener(this);
        Cbtn4010 = (Button) rootView.findViewById(R.id.Cbutton4010);
        Cbtn4010.setOnClickListener(this);
        Cbtn4011 = (Button) rootView.findViewById(R.id.Cbutton4011);
        Cbtn4011.setOnClickListener(this);
        Cbtn4012 = (Button) rootView.findViewById(R.id.Cbutton4012);
        Cbtn4012.setOnClickListener(this);

        Creset = (Button) rootView.findViewById(R.id.Creset);
        Creset.setOnClickListener(this);

        SharedPreferences prefsCinco = this.getActivity().getSharedPreferences("prefs5", Context.MODE_PRIVATE);
        int jugador1 = prefsCinco.getInt("jugador1", 0);
        int jugador2 = prefsCinco.getInt("jugador2", 0);
        int jugador3 = prefsCinco.getInt("jugador3", 0);
        int jugador4 = prefsCinco.getInt("jugador4", 0);
        int jugador5 = prefsCinco.getInt("jugador5", 0);

        String nombre1 = prefsCinco.getString("nombre1", "");
        String nombre2 = prefsCinco.getString("nombre2", "");
        String nombre3 = prefsCinco.getString("nombre3", "");
        String nombre4 = prefsCinco.getString("nombre4", "");
        String nombre5 = prefsCinco.getString("nombre5", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0|jugador4!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;
            j4=jugador4;
            j5=jugador5;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);
            jug4=String.valueOf(j4);
            tx3.setText(jug4);
            jug5=String.valueOf(j5);
            tx4.setText(jug5);


            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
            et3.setText(nombre4);
            et4.setText(nombre5);

            Toast toast =
                    Toast.makeText(getActivity().getApplicationContext(),
                            "Se han restaurado los datos de la partida anterior", Toast.LENGTH_SHORT);
            toast.show();
        }else{
            j1=0;
            j2=0;
            j3=0;
            j4=0;
            j5=0;
        }

        return rootView;
        
    }

    @Override
    public void onResume(){
        super.onResume();
        SharedPreferences prefsCinco = this.getActivity().getSharedPreferences("prefs5", Context.MODE_PRIVATE);
        int jugador1 = prefsCinco.getInt("jugador1", 0);
        int jugador2 = prefsCinco.getInt("jugador2", 0);
        int jugador3 = prefsCinco.getInt("jugador3", 0);
        int jugador4 = prefsCinco.getInt("jugador4", 0);
        int jugador5 = prefsCinco.getInt("jugador5", 0);

        String nombre1 = prefsCinco.getString("nombre1", "");
        String nombre2 = prefsCinco.getString("nombre2", "");
        String nombre3 = prefsCinco.getString("nombre3", "");
        String nombre4 = prefsCinco.getString("nombre4", "");
        String nombre5 = prefsCinco.getString("nombre5", "");

        if(jugador1!=0|jugador2!=0|jugador3!=0|jugador4!=0){
            j1=jugador1;
            j2=jugador2;
            j3=jugador3;
            j4=jugador4;
            j5=jugador5;

            jug1=String.valueOf(j1);
            tx.setText(jug1);
            jug2=String.valueOf(j2);
            tx1.setText(jug2);
            jug3=String.valueOf(j3);
            tx2.setText(jug3);
            jug4=String.valueOf(j4);
            tx3.setText(jug4);
            jug5=String.valueOf(j5);
            tx4.setText(jug5);


            et.setText(nombre1);
            et1.setText(nombre2);
            et2.setText(nombre3);
            et3.setText(nombre4);
            et4.setText(nombre5);
        }
    }

    @Override
    public void onPause(){
        super.onPause();
        SharedPreferences prefsCinco = this.getActivity().getSharedPreferences("prefs5", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsCinco.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putInt("jugador4", j4);
        editor.putInt("jugador5", j5);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.putString("nombre4", et3.getText().toString());
        editor.putString("nombre5", et4.getText().toString());
        editor.commit();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        super.onDestroyView();
        SharedPreferences prefsCinco = this.getActivity().getSharedPreferences("prefs5", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = prefsCinco.edit();
        editor.putInt("jugador1", j1);
        editor.putInt("jugador2", j2);
        editor.putInt("jugador3", j3);
        editor.putInt("jugador4", j4);
        editor.putInt("jugador5", j5);
        editor.putString("nombre1", et.getText().toString());
        editor.putString("nombre2", et1.getText().toString());
        editor.putString("nombre3", et2.getText().toString());
        editor.putString("nombre4", et3.getText().toString());
        editor.putString("nombre5", et4.getText().toString());
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
            case R.id.Cbutton1:
                j1 = j1 + 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton2:
                j1 = j1 + 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton3:
                j1 = j1 + 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton4:
                j1 = j1 + 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton5:
                j1 = j1 + 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton6:
                j1 = j1 + 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton7:
                j1 = j1 - 3;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton8:
                j1 = j1 - 4;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton9:
                j1 = j1 - 5;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton10:
                j1 = j1 - 6;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton11:
                j1 = j1 - 7;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton12:
                j1 = j1 - 8;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                break;
            case R.id.Cbutton101:
                j2 = j2 + 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton102:
                j2 = j2 + 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton103:
                j2 = j2 + 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton104:
                j2 = j2 + 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton105:
                j2 = j2 + 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton106:
                j2 = j2 + 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton107:
                j2 = j2 - 3;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton108:
                j2 = j2 - 4;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton109:
                j2 = j2 - 5;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton1010:
                j2 = j2 - 6;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton1011:
                j2 = j2 - 7;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton1012:
                j2 = j2 - 8;
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                break;
            case R.id.Cbutton201:
                j3 = j3 + 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton202:
                j3 = j3 + 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton203:
                j3 = j3 + 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton204:
                j3 = j3 + 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton205:
                j3 = j3 + 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton206:
                j3 = j3 + 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton207:
                j3 = j3 - 3;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton208:
                j3 = j3 - 4;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton209:
                j3 = j3 - 5;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton2010:
                j3 = j3 - 6;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton2011:
                j3 = j3 - 7;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;
            case R.id.Cbutton2012:
                j3 = j3 - 8;
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                break;

            case R.id.Cbutton301:
                j4 = j4 + 3;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton302:
                j4 = j4 + 4;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton303:
                j4 = j4 + 5;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton304:
                j4 = j4 + 6;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton305:
                j4 = j4 + 7;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton306:
                j4 = j4 + 8;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton307:
                j4 = j4 - 3;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton308:
                j4 = j4 - 4;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton309:
                j4 = j4 - 5;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton3010:
                j4 = j4 - 6;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton3011:
                j4 = j4 - 7;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton3012:
                j4 = j4 - 8;
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                break;
            case R.id.Cbutton401:
                j5 = j5 + 3;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton402:
                j5 = j5 + 4;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton403:
                j5 = j5 + 5;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton404:
                j5 = j5 + 6;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton405:
                j5 = j5 + 7;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton406:
                j5 = j5 + 8;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton407:
                j5 = j5 - 3;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton408:
                j5 = j5 - 4;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton409:
                j5 = j5 - 5;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton4010:
                j5 = j5 - 6;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton4011:
                j5 = j5 - 7;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;
            case R.id.Cbutton4012:
                j5 = j5 - 8;
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
                break;             
            case R.id.Creset:
                j1 = 0;
                j2 = 0;
                j3 = 0;
                j4 = 0;
                j5 = 0;
                jug1=String.valueOf(j1);
                tx.setText(jug1);
                jug2=String.valueOf(j2);
                tx1.setText(jug2);
                jug3=String.valueOf(j3);
                tx2.setText(jug3);
                jug4=String.valueOf(j4);
                tx3.setText(jug4);
                jug5=String.valueOf(j5);
                tx4.setText(jug5);
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
