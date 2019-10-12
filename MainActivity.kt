package com.example.listvvewicon

import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.ListView)
        var list = mutableListOf<Model>()

        list.add(Model("Ir.Sukarno", R.drawable.sukarno))

        list.add(Model("Suharto", R.drawable.suharto))
        list.add(Model("BJ. Habibie", R.drawable.habbie))
        list.add(Model("Abdurrahman wahid", R.drawable.gusdur))
        list.add(Model("Megawati soekarno putri", R.drawable.megawati))
        list.add(Model("Susilo Bambang Yudhoyono", R.drawable.sby))
        list.add(Model("Joko widodo", R.drawable.jokowi))

        listview.adapter=Listadaptor(this,R.layout.row, items = list)

listview.setOnItemClickListener { parent, view, position, id ->
    if(position==0){
        Toast.makeText(this@MainActivity,"sukarno,  Presiden pertama Republik Indonesia" +
                " yang akrab dipanggil Bung Karno lahir pada 6 Juni 1901 di Surabaya, Jawa Timur.\n" +
                "\n" +
                "Ayahnya bernama Raden Soekemi Sosrodihardjo dan ibunya Ida Ayu Nyoman Rai. " +
                "Semasa hidupnya, ia memiliki sembilan istri dan dikaruniai sebelas anak.",
            Toast.LENGTH_SHORT ).show()
    }
    if(position==1){
        Toast.makeText(this@MainActivity,"suharto, Sebelum menjadi presiden, Soeharto " +
                "adalah pemimpin militer pada masa pendudukan Jepang dan Belanda, dengan pangkat terakhir" +
                " Mayor Jenderal. Setelah Gerakan 30 September 1965, Soeharto kemudian melakukan operasi" +
                " penertiban dan pengamanan atas perintah dari Presiden Soekarno, salah satu yang " +
                "dilakukannya adalah dengan menumpas Gerakan 30 September dan menyatakan bahwa PKI " +
                "sebagai organisasi terlarang. Berbagai kontroversi menyebut operasi ini menewaskan " +
                "sekitar 100.000 hingga 2 juta jiwa, namun jumlah ini patut dipertanyakan karena " +
                "korban dari Gerakan 30 September juga banyak",
            Toast.LENGTH_SHORT ).show()
    }
    if(position==2){
        Toast.makeText(this@MainActivity,"BJ. habibie,  B.J. Habibie merupakan anak" +
                " keempat dari delapan bersaudara, pasangan Alwi Abdul Jalil Habibie dan R.A. Tuti" +
                " Marini Puspowardojo. Ayahnya yang berprofesi sebagai ahli pertanian yang berasal" +
                " dari etnis Gorontalo[14][15], sedangkan ibunya dari etnis Jawa.",
            Toast.LENGTH_SHORT ).show()
    }
    if(position==3){
        Toast.makeText(this@MainActivity,"abdurrahman wahid, akrab dipanggil Gus Dur " +
                "(lair nang Jombang, Jawa Timur, 7 September 1940 – seda nang Jakarta, 30 Desember " +
                "2009 dong umure 69 taun[1]) adalah tokoh Muslim Indonesia lan pemimpin politik sing" +
                " dadi Presiden Indonesia sing keempat sekang tahun 1999 hingga 2001. Ia menggantikan" +
                " Presiden B. J. Habibie setelah dipilih oleh MPR hasil Pemilu 1999. Penyelenggaraan" +
                " pemerentahannya dibantu oleh Kabinet Persatuan Nasional.",
            Toast.LENGTH_SHORT ).show()
    }
    if(position==4){
        Toast.makeText(this@MainActivity,"Megawati,  lahir di Yogyakarta, 23 Januari " +
                "1947; umur 72 tahun) adalah Presiden Indonesia yang kelima yang menjabat sejak 23" +
                " Juli 2001 sampai 20 Oktober 2004. Ia merupakan presiden wanita Indonesia pertama" +
                " dan puteri dari presiden Indonesia pertama, Soekarno, yang kemudian mengikuti " +
                "jejak ayahnya menjadi Presiden Indonesia. Pada 20 September 2004, ia kalah suara " +
                "dari Susilo Bambang Yudhoyono dalam Pemilu Presiden 2004 putaran yang kedua.",
            Toast.LENGTH_SHORT ).show()
    }
    if(position==5){
        Toast.makeText(this@MainActivity,"Susilo bambang Yudhoyono,  lahir di Tremas," +
                " Arjosari, Pacitan, Jawa Timur, Indonesia, 9 September 1949; umur 70 tahun) adalah" +
                " Presiden Indonesia ke-6 yang menjabat sejak 20 Oktober 2004 hingga 20 Oktober 2014." +
                "Ia adalah Presiden pertama di Indonesia yang dipilih melalui jalur pemilu.",
            Toast.LENGTH_SHORT ).show()
    }
    if(position==6){
        Toast.makeText(this@MainActivity,"joko widodo,lahir di Surakarta, Jawa Tengah," +
                " 21 Juni 1961; umur 58 tahun) adalah Presiden ke-7 Indonesia yang mulai menjabat" +
                " sejak 20 Oktober 2014. Ia terpilih bersama Wakil Presiden Muhammad Jusuf Kalla" +
                " dalam Pemilu Presiden 2014. Jokowi pernah menjabat Gubernur DKI Jakarta sejak " +
                "15 Oktober 2012 hingga 16 Oktober 2014 didampingi Basuki Tjahaja Purnama sebagai" +
                " wakil gubernur.",
            Toast.LENGTH_SHORT ).show()
    }

        }
   }
}





