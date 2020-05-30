package com.example.popup_menu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
         popupMenu.setOnMenuItemClickListener(this);
         popupMenu.inflate(R.menu.popup_menu);
         popupMenu.show();
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.show_infomation:
                Intent intent = new Intent(MainActivity.this, Show_Infomation.class);
                startActivity(intent);
                break;
            case R.id.delete:
                Toast.makeText(this, "Đã xoá", Toast.LENGTH_SHORT).show();
        }
        return false;
    }
}
