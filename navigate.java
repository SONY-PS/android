package com.example.navigate;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.navi_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.item1:
                Intent i=new
                        Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);
                return true;
            case R.id.item2:
                Intent i2=new
                        Intent(getApplicationContext(),MainActivity3.class);
                startActivity(i2);
                return true;
            case R.id.item3:
                Intent i3=new
                        Intent(getApplicationContext(),MainActivity4.class);
                startActivity(i3);
                return true;
            case R.id.item4:
                Toast.makeText(MainActivity.this, "Item4 Selected",
                        Toast.LENGTH_SHORT).show();
            case R.id.item5:
                Toast.makeText(MainActivity.this, "Item5 Selected",
                        Toast.LENGTH_SHORT).show();
            case R.id.item6:
                Toast.makeText(MainActivity.this, "Item6 Selected",
                        Toast.LENGTH_SHORT).show();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
