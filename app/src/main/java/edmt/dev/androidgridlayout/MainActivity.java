package edmt.dev.androidgridlayout;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


//import android.content.Intent;
//import android.graphics.Color;
//import android.support.v7.widget.CardView;
//import android.view.View;
//import android.widget.GridLayout;
//import android.widget.GridView;
//import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{




    private CardView Engineering, Agriculture, General, Medical, National, Private;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Engineering = (CardView) findViewById(R.id.EngineeringCard);
        Agriculture = (CardView) findViewById(R.id.AgricultureCard);
        General = (CardView) findViewById(R.id.GeneralCard);
        Medical = (CardView) findViewById(R.id.MedicalCard);
        National = (CardView) findViewById(R.id.NationalCard);
        Private = (CardView) findViewById(R.id.PrivateCard);

         Engineering.setOnClickListener(this);
         Agriculture.setOnClickListener(this);
         General.setOnClickListener(this);
         Medical.setOnClickListener(this);
         National.setOnClickListener(this);
         Private.setOnClickListener(this);





    }


    @Override
    public void onClick(View v) {
        Intent i;

        switch (v.getId()) {
            case R.id.EngineeringCard:
                i = new Intent(this, ActivityEngineering.class);
                startActivity(i);
                break;

            case R.id.AgricultureCard:
                i = new Intent(this, ActivityAgriculture.class);
                startActivity(i);
                break;

            case R.id.GeneralCard:
                i = new Intent(this, ActivityGeneral.class);
                startActivity(i);
                break;

            case R.id.MedicalCard:
                i = new Intent(this, ActivityMedical.class);
                startActivity(i);
                break;

            case R.id.NationalCard:
                i = new Intent(this, ActivityNational.class);
                startActivity(i);
                break;

            case R.id.PrivateCard:
                i = new Intent(this, ActivityPrivate.class);
                startActivity(i);
                break;

            default:
                break;

        }

    }
}
