package com.example.admin.ketnoiwifianddanhba;

import android.database.Cursor;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class Laydanhba extends AppCompatActivity {
ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laydanhba);
        listView= findViewById(R.id.listdb);

    }
    public void Lay(View v )
    {
        Cursor cursor = getContentResolver().query(ContactsContract.CommonDataKinds.Phone.CONTENT_URI,null,null,null,null);
        startManagingCursor(cursor);
        String[] A={ContactsContract.CommonDataKinds.Phone.DISPLAY_NAME, ContactsContract.CommonDataKinds.Phone.NUMBER, ContactsContract.CommonDataKinds.Phone._ID};

        int[] B={android.R.id.text1,android.R.id.text2};
        SimpleCursorAdapter simpleCursorAdapter = new SimpleCursorAdapter(this,android.R.layout.simple_list_item_2,cursor,A,B);
        listView.setAdapter(simpleCursorAdapter);
        listView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
    }
}
