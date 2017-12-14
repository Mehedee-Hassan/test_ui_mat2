package des.mat.ui.liquiddark.com.matdest1;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int itemId = item.getItemId();

        if (itemId == R.id.item1_main_m){

            Toast.makeText(MainActivity.this,"item 1 clicked" , Toast.LENGTH_SHORT).show();

        }else if(itemId == R.id.item2_main_m){
            Toast.makeText(MainActivity.this,"item 2 clicked" , Toast.LENGTH_SHORT).show();

        }else if(itemId == R.id.item3_main_m){
            Toast.makeText(MainActivity.this,"item 3 clicked" , Toast.LENGTH_SHORT).show();

        }else if(itemId == R.id.search_id){
            Toast.makeText(MainActivity.this,"action search clicked" , Toast.LENGTH_SHORT).show();

        }else if(itemId == R.id.shoppingcart_id){
            Toast.makeText(MainActivity.this,"action shopping clicked" , Toast.LENGTH_SHORT).show();

        }


        return super.onOptionsItemSelected(item);
    }
}
