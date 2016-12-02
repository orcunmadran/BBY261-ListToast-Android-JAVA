package net.madran.bby261.listtoast;

//Kullanılan Kütüphaneler

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

// Değişkenler

    private ListView anaListeObje;

    private String[] listeElemanlari;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ekrana yerleştirilen anaListe'nin değişken ile ilişkilendirilmesi

        anaListeObje = (ListView) findViewById(R.id.anaListe);

        //Liste içinde görüntülenecek elemanların bir değişken içerisinde dizi olarak tanımlanması

        listeElemanlari = new String[] { "Kitap 1", "Kitap 2", "Kitap 3", "Kitap 4", "Kitap 5", "Kitap 6", "Kitap 7", "Kitap 8", "Kitap 9", "Kitap 10", "Kitap 11", "Kitap 12", "Kitap 13", "Kitap 14", "Kitap 15", "Kitap 16", "Kitap 17", "Kitap 18", "Kitap 19", "Kitap 20"};

        //Dizi içinde yer alan değerlerin listede görüntülenebilmesi için adaptör oluşturulması

        ArrayAdapter<String> basitAdaptor = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id
                .text1, listeElemanlari);

        //Adaptörün liste ile ilişkilendirilmesi

        anaListeObje.setAdapter(basitAdaptor);

        //Liste öğesine tıklandığı zaman mesajı gösterecek dinleyicinin oluşturulması

        anaListeObje.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, listeElemanlari[position], Toast.LENGTH_SHORT).show();
            }
        });

    }
}
