package com.learning.tennislearning.DatabaseHendler;

import java.util.ArrayList;
import java.util.List;
 
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.learning.tennislearning.R;
import com.learning.tennislearning.TestControl.TestParser;

public class Database extends SQLiteOpenHelper {
    final static String DB_NAME = "db_kuis";
 
    public Database(Context context) {
        super(context, DB_NAME, null, 1);
        // TODO Auto-generated constructor stub
    }
 
    @Override
    public void onCreate(SQLiteDatabase db) {
        // Tabel TestParser Perwasitan
        String sql = "CREATE TABLE IF NOT EXISTS tbl_wasit(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, jwban INTEGER)";
        db.execSQL(sql);

        ContentValues values = new ContentValues();
        // soal 1
        values.put("soal", "Bilamana bola mengalami pecah  diakhir suatu point, haruskah point tersebut diulang ?");
        values.put("pil_a", "Diulang");
        values.put("pil_b","Tidak Diulang");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        //soal 2
        values.put("soal", "Bilamana bola menjadi lembek/kempes diakhir suatu point,haruskah point tersebut diulang ?");
        values.put("pil_a", "Diulang");
        values.put("pil_b","Tidak Diulang");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        // soal 3
        values.put("soal","Apakah diperbolehkan lebih dari satu set senar pada permukaan raket ?");
        values.put("pil_a","Tidak, pemasangan senar tidak boleh macam macam pola,kecuali hanya satu pola");
        values.put("pil_b","Boleh, yang diperbolehkan hanya satu pola dari anyaman senar (bukan pola-pola)");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        //soal 4
        values.put("soal","Boleh atau tidak alat peredam dipasang pada senar atau raket ?");
        values.put("pil_a","Tidak");
        values.put("pil_b","Boleh, tetapi harus terpasang diluar pada senar yang saling menyimpang");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        //soal 5
        values.put("soal","Pada saat permainan berlangsung (ball in play), senar pemain putus secara tidak sengaja,boleh apa tidak pemain tersebut melanjutkan permainannya sampai bola mati (sampai permainan perebutan ponit berakhir) ?");
        values.put("pil_a","Tidak");
        values.put("pil_b","Boleh");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        // soal 6
        values.put("soal","Apakah pemain diperbolehkan untuk menggunakan lebih dari satu raket saat dalam situasi permainan bermain (ball in play)  ?");
        values.put("pil_a","Tidak");
        values.put("pil_b","Boleh");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 7
        values.put("soal","Apakah penerima servis diperbolehkan berdiri dibelakang/luar garis lapangan ?");
        values.put("pil_a","Tidak");
        values.put("pil_b","Boleh,penerima servis diperbolehkan untuk berdiri di dalam ataupun diluar garis lapangan di sisi penerima servis.");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        // soal 8
        values.put("soal","Dalam bermain ganda (double),apakah hanya satu anggota dari pasangan bermain ganda dapat bermain sendiri melawan lawannya ?");
        values.put("pil_a","Tidak Boleh");
        values.put("pil_b","Boleh");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);


        // soal 9
        values.put("soal","Pada permainan tunggal, apakah pelaku servis diperbolehkan berdiri dibelakang garis belakang lapangan antara garis permainan tunggal dan garis permainan ganda ?");
        values.put("pil_a","Tidak");
        values.put("pil_b","Boleh");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 10
        values.put("soal","Apakah salah satu atau kedua kaki pelaku servis diperbolehkan lepas dari permukaan lapangan ?");
        values.put("pil_a","Tidak Boleh");
        values.put("pil_b","Boleh");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        // soal 11
        values.put("soal","Setelah melepaskan bola untuk melakukan servis, pelaku servis memutuskan untuk tidak memukul bolanya dan menangkap bolanya kembali. Apakah itu dinyatkan fault ?");
        values.put("pil_a","Tidak Fault");
        values.put("pil_b","Fault");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 12
        values.put("soal","Pada saat permainan tunggal,lapangan menggunakan tiang penyangga net tunggal, bola pelaku servis mengenai tiang tunggal tersebut dan kemudian masuk ke dalam service court. Apakah dinyatakan fault ?");
        values.put("pil_a","Tidak Fault");
        values.put("pil_b","Fault");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 13
        values.put("soal","Pada  saat permainan berlanjut ada bola dari tempat lain yang masuk ke lapangan. Ada pernyataan “let”, Pelaku servis telah melakukan fault pada servis sebelumnya. Apakah pelaku servis memiliki hak servis pertama atau kedua ?");
        values.put("pil_a","Servis pertama, poin harus diulang");
        values.put("pil_b","Servis Kedua");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 14
        values.put("soal","Setelah pelaku  servis melakukan servis pertama, raket terlepas dari pelaku servis dan mengenai net sebelum bola memantul lapangan. Apakah hal tersebut dianggap servis fault atau pemain kalah dalam ponit tersebut ?");
        values.put("pil_a","Pemain kalah dalam point tersebut karena raketnya menyentuh net saat bola sedang dalam permainan.");
        values.put("pil_b","Pelaku servis berhak melakukan servis kedua");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 15
        values.put("soal","Pada permainan ganda,pasangan dari penerima servis menyentuh net sebelum bola yang diservis menyentuh bagian luar service court. Apakah keputusan wasit ?");
        values.put("pil_a","Point untuk Pemberi servis");
        values.put("pil_b","Point untuk Penerima servis");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 16
        values.put("soal","Apakah pemain kalah dalam point, bilamana melewati garis bayangan net sebelum atau sesudah memukul bola ?");
        values.put("pil_a","Tidak kalah bagi pemain yang melewati garis bayangan lawan selama pemain tersebut tidak menyentuh bagian lapangan lawan.");
        values.put("pil_b","Kalah bagi pemain yang melewati garis bayangan lawan.");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 17
        values.put("soal","Apakah pemain boleh melompat net kebagian lapangan lawan saat bola masih dalam permainan ?");
        values.put("pil_a","Tidak boleh, pemain tersebut dianggap kalah dalam point tersebut.");
        values.put("pil_b","Boleh, asal tidak menyentuh lawan atau raket lawan.");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 18
        values.put("soal","Pemain melempar raketnya ke bola dalam permainan,raket dan bola jatuh di lapangan lawan dan lawan tidak dapat memukul kembali bolanya. Pemain mana yang memenangkan point tersebut ?");
        values.put("pil_a","Pemain yang melempar raket menang dalam point tersebut.");
        values.put("pil_b","Pemain yang melempar raket kalah dalam point tersebut.");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        // soal 19
        values.put("soal","Pemain berada diluar lapangan  memukul atau menangkap bola sebelum memantul dari lapangan dan menyatakan dirinya memenangkan point tersebut karena bolanya sudah pasti keluar ?");
        values.put("pil_a","Point untuk pemain yang menangkap bola diluar lapangan.");
        values.put("pil_b","Point untuk lawan.");
        values.put("jwban","b");
        db.insert("tbl_wasit", "soal", values);

        // soal 20
        values.put("soal","Pemain memukul bola dan lalu mengenai tiang penyangga net permainan tunggal dan jatuh kedalam areal permainan yang benar. Apakah hal tersebut dianggap pengembalian yang masuk ?");
        values.put("pil_a","Ya. Pukulan dinyatakan sah (pukulan  masuk),kecuali hasil servis,dinyatakan fault.");
        values.put("pil_b","Tidak. Pukulan dinyatakan salah (fault).");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 21
        values.put("soal","Pemain menghentikan permainan karena menurutnya lawan sedang mengalami gangguan. Apakah hal tersebut dianggap gangguan/halangan ?");
        values.put("pil_a","Tidak dibenarkan, pemain tersebut kalah dalam point yang sedang dimainkan.");
        values.put("pil_b","Dibenarkan, permainnan tersebut tidak kehilangan point, permainan dimainkan ulang.");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 22
        values.put("soal","Bola yang sedang dalam permainan mengenai burung yang terbang di atas lapangan. Apakah hal tersebut dianggap gangguan/halangan ?");
        values.put("pil_a","Tidak, permainan tersebut dilanjutkan sampai boal mati");
        values.put("pil_b","Ya, permainan tersebut dimainkan ulang.");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);

        // soal 23
        values.put("soal","Saat bola dalam permainan ( ball in play) terdapat bola atau benda lain yang berada di sisi lapangan pemain sebelumnya dan mengganggu/menghalangi pemain tersebut. Apakah hal tersebut dianggap gangguan/halangan ?Saat bola dalam permainan ( ball in play) terdapat bola atau benda lain yang berada di sisi lapangan pemain sebelumnya dan mengganggu/menghalangi pemain tersebut. Apakah hal tersebut dianggap gangguan/halangan ?");
        values.put("pil_a","Tidak dianggapa gangguan.");
        values.put("pil_b","Dianggap itu gangguan");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 24
        values.put("soal","Pada permainan ganda, dimana pasangan penerima servis  boleh berdiri /berada ?");
        values.put("pil_a","Boleh berdiri/ berada  diposisi manapun pada sisi lapangan masing-masing, didalam maupun di luar area lapangan permainan.");
        values.put("pil_b","Tidak boleh berdiri/berada sembarang tempat harus berada di sisi pasangan di dalam area lapangan permainan.");
        values.put("jwban","1");
        db.insert("tbl_wasit", "soal", values);

        // soal 25
        values.put("soal","Apakah pemain dalam pertandingan perseorangan diperbolehkan mendapat pengarahan dari pelatih saat bertanding di saat game berakhir ?");
        values.put("pil_a","Boleh");
        values.put("pil_b","Tidak Boleh");
        values.put("jwban","2");
        db.insert("tbl_wasit", "soal", values);


        // Tabel TestParser Tenis
        String sql1 = "CREATE TABLE IF NOT EXISTS tbl_tenis(id INTEGER PRIMARY KEY AUTOINCREMENT, soal TEXT, pil_a TEXT, pil_b TEXT, pil_c TEXT, jwban INTEGER, img BLOB)";
        db.execSQL(sql1);

        ContentValues values1 = new ContentValues();
        // soal 1
        values1.put("soal", "Apakah nama induk organisasi olahraga tenis lapangan di Indonesia?");
        values1.put("pil_a", "PTMSI");
        values1.put("pil_b", "PELTI");
        values1.put("pil_c", "PSTI");
        values1.put("jwban", "2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 2
        values1.put("soal", "Apakah nama organisasi olahraga tenis di dunia?");
        values1.put("pil_a", "BWF");
        values1.put("pil_b","PELTI");
        values1.put("pil_c","ITF");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 3
        values1.put("soal", "Dibawah ini yang termasuk permanent fixture kecuali?");
        values1.put("pil_a", "Net");
        values1.put("pil_b","Kursi Wasit");
        values1.put("pil_c","Net post");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 4
        values1.put("soal", "Berapa pergantian bola pada setiap game pertandingan tenis lapangan?");
        values1.put("pil_a", "7/9, 9/11, 11/13");
        values1.put("pil_b","7/9, 9/12, 11/13");
        values1.put("pil_c","7/10, 10/13, 13/16");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 5
        values1.put("soal", "Jika dalam pertandingan tenis lapangan, pemain melakukan rally kemudian bola pecah apakah yang dilakukan oleh seorang wasit?");
        values1.put("pil_a", "Dibiarkan hingga salah satu pemain kehilangan poin");
        values1.put("pil_b", "Mengehentikan permainan mengganti bola");
        values1.put("pil_c", "Let, mengganti bola yang baru dan poin diulang");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 6
        values1.put("soal", "Jika dalam pertandingan tenis lapangan, pemain melakukan rally kemudian bola kempes apakah yang dilakukan oleh seorang wasit?");
        values1.put("pil_a", "Tetap dilanjutkan hingga salah satu pemain kehilangan poin setelah itu diganti dengan bola yang mirip");
        values1.put("pil_b","Tetap dilanjutkan hingga salah satu pemain kehilangan poin, perolehan poin di ulang dan bola diganti dengan yang baru.");
        values1.put("pil_c","Let, mengganti bola yang baru dan poin diulang");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 7
        values1.put("soal", "Dimanakah pemasangan peredam/vibrator pada raket yang di anjurkan oleh ITF?");
        values1.put("pil_a", "Di daerah sekitar anyaman senar");
        values1.put("pil_b","Di dalam ayaman senam");
        values1.put("pil_c","Di luar anyaman senar");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 8
        values1.put("soal", "Apa warna bola yang dianjurkan dalam pertandingan senior?");
        values1.put("pil_a", "Hijau");
        values1.put("pil_b","Orange");
        values1.put("pil_c","Kuning");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 9
        values1.put("soal", "Berapa berat dan tekanan bola yang berwarna kuning dan putih?");
        values1.put("pil_a", "56,7 – 58,5 gram");
        values1.put("pil_b","56,7 – 59 gram");
        values1.put("pil_c","57,7 – 58,5 gram");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 10
        values1.put("soal", "Bagaimana cara seorang wasit mengidentifikasi kalau bola yang digunakan kempes saat permainan?");
        values1.put("pil_a", "Bila ditekan mengeluarkan udara atau suara");
        values1.put("pil_b","Bila ditekan tidak mengeluarkan udara");
        values1.put("pil_c","Bila dipegang mengeluarkan udara");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);


        // soal 11
        values1.put("soal", "jika terjadi skor 40-40 apa isyarat yang diucapkan wasit?");
        values1.put("pil_a", "Sama");
        values1.put("pil_b","Duece");
        values1.put("pil_c","Advantage");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 12
        values1.put("soal", "Ketika sistem pertandingan the best of three tie break set, tie break dilakukan pada skor berapa?");
        values1.put("pil_a", "5-5");
        values1.put("pil_b","6-6");
        values1.put("pil_c","7-7");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 13
        values1.put("soal", "Ketika sistem pertandingan the best of three advantage set, jika terjadi 6-6 berapa seorang pemain dapat memenangkan set pertama?");
        values1.put("pil_a", "8-6");
        values1.put("pil_b","7-6");
        values1.put("pil_c","9-6");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 14
        values1.put("soal", "Berapa jumlah game pada sistem pertandingan proset?");
        values1.put("pil_a", "6");
        values1.put("pil_b","7");
        values1.put("pil_c","8");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 15
        values1.put("soal", "Jika seorang pemain memenangkan toss, apakah pemain boleh menyerahkan pilihannya kepada pemain lawan?");
        values1.put("pil_a", "Tidak boleh, harus memilih server atau receiver");
        values1.put("pil_b","Tidak boleh, harus menentukan pilihan");
        values1.put("pil_c","Boleh, menyerahkan kepada lawanya untuk memilih server atau receiver");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 16
        values1.put("soal", "Berapa kali servis yang boleh dilakukan setiap pemain dalam satu poin?");
        values1.put("pil_a", "4 kali");
        values1.put("pil_b", "2 kali");
        values1.put("pil_c", "3 kali");
        values1.put("jwban", "2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 17
        values1.put("soal", "Berapa jumlah skor pada saat pemain melakukan pindah tempat?");
        values1.put("pil_a", "2-2");
        values1.put("pil_b","3-1");
        values1.put("pil_c","2-1");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 18
        values1.put("soal", "Ketika pemain melakukan rally kemudian tiba-tiba ada bola dari lapangan lawan masuk, apa yang harus di isyratkan oleh wasit?");
        values1.put("pil_a", "Foult, poin di ulang");
        values1.put("pil_b","Let, Poin di ulang");
        values1.put("pil_c","Stop, poin di ulang");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 19
        values1.put("soal", "Berapa jumlah point pada super tiebreak?");
        values1.put("pil_a", "7");
        values1.put("pil_b","8");
        values1.put("pil_c","10");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis", "soal", values1);

        // soal 20
        values1.put("soal", "Dibawah ini bola yang dinyatakan masuk oleh wasit atau linesman kecuali?");
        values1.put("pil_a", "Gambar A");
        values1.put("pil_b","Gambar B");
        values1.put("pil_c","Gambar C");
        values1.put("jwban","3");
        values1.put("img",R.drawable.gambar20);
        db.insert("tbl_tenis", "soal", values1);

        // soal 21
        values1.put("soal","Perpindahan tempat pada tiebreaak dilakukan pada jumlah angka berapa?");
        values1.put("pil_a","7");
        values1.put("pil_b","6");
        values1.put("pil_c","Setiap jumlah kelipatan 6");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 22
        values1.put("soal","Jika bola di pukul mengenai permanent fixture dan bola masuk ke lapangan lawan tanpa bisa dikembalikan oleh lawan maka point untuk?");
        values1.put("pil_a","Poin untuk pemukul");
        values1.put("pil_b","Poin untuk lawan");
        values1.put("pil_c","Poin di ulang karena mengenai permanent fixture");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 23
        values1.put("soal","Apakah diperbolehkan dalam permainan singgle pemain melakukan servis di wilayah sideline?");
        values1.put("pil_a","Boleh, asalkan tidak terlalu jauh");
        values1.put("pil_b","Tidak boleh, foult");
        values1.put("pil_c","Boleh, asalkan di sebelah garis sideline");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 24
        values1.put("soal","Foot foult di isyaratkan oleh linesman ketika pemain melakukan?");
        values1.put("pil_a","Kaki menginjak garis baseline saat impact servis");
        values1.put("pil_b","Kaki memasuki garis side line");
        values1.put("pil_c","Raket mengenai net");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 25
        values1.put("soal","Ketika pemain melakukan servis, setelah bola dilemparkan ke atas pemain melakukan pukulan tetapi tidak mengenai bola. Apa isyarat wasit yang diucapkan?");
        values1.put("pil_a","Let, diulang servis pertama");
        values1.put("pil_b","Foult");
        values1.put("pil_c","Out");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 26
        values1.put("soal","Let di isyaratkan oleh seorang wasit ketika?");
        values1.put("pil_a","Ketika servis pertama keluar");
        values1.put("pil_b","Ketika ada gangguan dari pemain lawan");
        values1.put("pil_c","Ketika ada gangguan bola masuk dari lapangan lain");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 27
        values1.put("soal","Ketika pemain melakukan return servis, pemain memukul bola sebelum bola menyentuh ke lapangan sehingga lawan tidak bisa mengembalikan bola. Point akan diberikan kepada?");
        values1.put("pil_a","Pemain yang melakukan servis");
        values1.put("pil_b","Pemain yang melakukan return");
        values1.put("pil_c","Point diulang karena sebelum bola menyentuh ke tanah sudah dipukul");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 28
        values1.put("soal","Ketika pemain melakukan salah posisi penerimaan servis, servis pertama yang dilakukan foult, maka tugas seorang wasit adalah?");
        values1.put("pil_a","Membenarkan posisi, servis pertama diulang");
        values1.put("pil_b","Membenarkan posisi, point diulang");
        values1.put("pil_c","Membenarkan posisi, dilanjutkan dengan servis selanjutnya");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 29
        values1.put("soal","Bentuk gangguan (hidrance) yang dapat membuat pemain kehilangan poin, kecuali?");
        values1.put("pil_a","Pemain bilang out");
        values1.put("pil_b","Pemain menjatuhkan bola dan topi berkali-kali");
        values1.put("pil_c","Bola dari lapangan lain masuk");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 30
        values1.put("soal","Berapa waktu istirahat antar set yang diberikan wasit pada pertandingan tenis lapangan?");
        values1.put("pil_a","125 detik");
        values1.put("pil_b","120 detik");
        values1.put("pil_c","130 detik");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 31
        values1.put("soal","Ketika sedang melakukan rally pemain secara tidak sengaja topinya terjatuh, kemudian di poin kedua topinya jatuh kembali. Apakah keputusan yang di ambil oleh wasit?");
        values1.put("pil_a","Mengulang perolehan poin");
        values1.put("pil_b","Poin untuk pemain");
        values1.put("pil_c","Poin untuk lawan");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 32
        values1.put("soal","Berapa waktu yang diberikan seorang wasit pada saat pemanasan?");
        values1.put("pil_a","3 menit");
        values1.put("pil_b","5 menit");
        values1.put("pil_c","10 menit");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 33
        values1.put("soal","Dalam pertandingan beregu, pelatih hanya boleh melakukan intruksi ketika?");
        values1.put("pil_a","Ketika perpindahan tempat");
        values1.put("pil_b","Setiap game");
        values1.put("pil_c","Ketika skor sama kuat");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 34
        values1.put("soal","Apakah perbedaan yang paling mencolok pada permainan tenis orang normal dan wheelchair tenis?");
        values1.put("pil_a","Pemain boleh melakukan pukulan lebih dari dua kali");
        values1.put("pil_b","Pemain boleh memukul bola setelah dua pantulan");
        values1.put("pil_c","Pemain boleh melakukan servis di depan garis baseline");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);

        // soal 35
        values1.put("soal","Pada sistem pertandingan menggunakan no-ad apa keuntungan yang didapatkan receiver?");
        values1.put("pil_a","Receiver boleh bertukar tempat ketika menerima servis kanan atau kiri ");
        values1.put("pil_b","Receiver bisa beristirahat terlebih dahulu");
        values1.put("pil_c","Receiver boleh menentukan pilihan menerima servis kanan atau kiri");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 36
        values1.put("soal","Di bawah ini termasuk perlengkapan yang wajib dibawa oleh seorang wasit tenis ketika memimpin pertandingan, kecuali?");
        values1.put("pil_a","Pensil, skorshet, meteran");
        values1.put("pil_b","Stop watch, coin toss, jam tangan");
        values1.put("pil_c","Kartu, peluit, bolpoin");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 37
        values1.put("soal","Di bawah ini manakah yang termasuk jenis Medical Time Out (MTO)?");
        values1.put("pil_a","Pemain mengalami kram");
        values1.put("pil_b","Pemain mengeluarkan darah dari hidung");
        values1.put("pil_c","Pemain terkilir");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 38
        values1.put("soal","Medical Time Out (MTO) hanya boleh diberikan kepada pemain ketika?");
        values1.put("pil_a","Waktu pemain istirahat");
        values1.put("pil_b","Ketika skor 1-1");
        values1.put("pil_c","Ketika game berakhir");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 39
        values1.put("soal","Pemain yang mengalami kram apakah boleh melakukan MTO?");
        values1.put("pil_a","Pemain mengalami kram");
        values1.put("pil_b","Pemain mengeluarkan darah dari hidung");
        values1.put("pil_c","Pemain terkilir");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 40
        values1.put("soal","Berapa kali toilet break yang diperbolehkan oleh pemain putri dalam setiap pertandingan?");
        values1.put("pil_a","2 kali, pada saat istirahat");
        values1.put("pil_b","2 kali, pada saat set break");
        values1.put("pil_c","2 kali, pada saat perpindahan tempat");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 41
        values1.put("soal","Ketika pemain memukul bola setelah pantulan kedua, maka apa isyarat yang diucapkan seorang wasit?");
        values1.put("pil_a","Fault");
        values1.put("pil_b","Faulshot");
        values1.put("pil_c","Not up");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 42
        values1.put("soal","Bagaimana signal linesman ketika pemain melakukan pukulan masuk?");
        values1.put("pil_a","Gambar A");
        values1.put("pil_b","Gambar B");
        values1.put("pil_c","Gambar C");
        values1.put("jwban","1");
        values1.put("img", R.drawable.gambar42);
        db.insert("tbl_tenis","soal", values1);
        
        // soal 43
        values1.put("soal","Jika dalam suatu pertandingan terjadi hujan, maka siapa yang berhak menunda pertandingan?");
        values1.put("pil_a","Wasit");
        values1.put("pil_b","Referee");
        values1.put("pil_c","Linesman");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 44
        values1.put("soal","Jika terjadi penundaan pertandingan selama 2 jam dikarenakan cuaca yang tidak mendukung, apakah pertandingan dimulai dari skor 0-0 kembali?");
        values1.put("pil_a","Iya, karena merugikan masing-masing pemain");
        values1.put("pil_b","Tidak, langsung dilanjutkan game kedua");
        values1.put("pil_c","Tidak, dilanjutkan dengan poin tetap");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 45
        values1.put("soal","Ketika dalam permainan, bola yang dipukul pemain jatuh di dekat wasit dan wasit menggangap bola itu masuk tetapi linesman mengatakan bola itu out. Apa yang dilakukan oleh wasit?");
        values1.put("pil_a","Overule/koreksi, poin untuk pemukul");
        values1.put("pil_b","Let, poin diulang");
        values1.put("pil_c","Mengikuti keputusan linesman");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 46
        values1.put("soal","Jika dalam pertandingan pemain mengulur-ngulur waktu untuk mencari nafas, kemudian wasit sudah mengingatkan pemain beberapa kali. Apakah langkah yang dilakukan oleh wasit?");
        values1.put("pil_a","Dibiarkan saja hingga pemain siap memulai game kembali.");
        values1.put("pil_b","Time violation, jika dilakukan beberapa kali langsung point untuk lawan");
        values1.put("pil_c","Time vilation, diingatkan saja");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 47
        values1.put("soal","Ketika dalam permainan, pemain yang tidak terima dengan keputusan wasit terus saja mengungkapkan kata-kata yang kotor terhadap wasit walaupun sudah diingatkan oleh wasit. Bagaimana keputusan seorang wasit?");
        values1.put("pil_a","Code violations, pemain didiskualifikasi");
        values1.put("pil_b","Time violations, point untuk lawan");
        values1.put("pil_c","Code violations, point untuk lawan");
        values1.put("jwban","2");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 48
        values1.put("soal","Berapa ukuran sponsor maksimal yang boleh dipasang pada topi?");
        values1.put("pil_a","26 cm2");
        values1.put("pil_b","25 cm2");
        values1.put("pil_c","24 cm2");
        values1.put("jwban","3");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 49
        values1.put("soal","Pada pakaian pemain wanita yang menggenakan singlet, dimanakah pemasangan sponsor yang di anjurkan oleh ITF? ");
        values1.put("pil_a","Di bawah dada");
        values1.put("pil_b","Di tengah-tengah baju");
        values1.put("pil_c","Di pundak");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
        
        // soal 50
        values1.put("soal","Ketika melakukan rally dalam pertandingan tenis lapangan, tiba-tiba raket seorang pemain putus kemudian pemain langsung mengganti raketnya ketika bola masih dalam permainan. Apa yang harus dilakukan seorang wasit?");
        values1.put("pil_a","Menghentikan permainan dan pemain yang mengganti raket kehilangan poin");
        values1.put("pil_b","Menghentikan permainan dan poin diulang kembali");
        values1.put("pil_c","Dibiarkan saja hingga salah satu pemain kehilangan poin");
        values1.put("jwban","1");
        values1.put("img","");
        db.insert("tbl_tenis","soal", values1);
    }
     
    public List<TestParser> getSoalWasit(){
        List<TestParser> listTestParser = new ArrayList<TestParser>();
        String query = "select * from tbl_wasit";
         
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);
         
        if(cursor.moveToFirst()){
            do{
                TestParser s = new TestParser();
                s.setTestWasit(cursor.getString(1));
                s.setPil_a(cursor.getString(2));
                s.setPil_b(cursor.getString(3));
                s.setJwban(cursor.getInt(4));
                listTestParser.add(s);
            }while(cursor.moveToNext());
        }
         
        return listTestParser;
    }


    public List<TestParser> getSoalTenis(){
        List<TestParser> listTestParser = new ArrayList<TestParser>();
        String query = "select * from tbl_tenis";

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(query, null);

        if(cursor.moveToFirst()){
            do{
                TestParser t = new TestParser();
                t.setTestTenis(cursor.getString(1));
                t.setCo_a(cursor.getString(2));
                t.setCo_b(cursor.getString(3));
                t.setCo_c(cursor.getString(4));
                t.setJwban(cursor.getInt(5));
                t.setGambar(cursor.getInt(6));
                listTestParser.add(t);
            }while(cursor.moveToNext());
        }

        return listTestParser;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_wasit");
        onCreate(db);
        db.execSQL("DROP TABLE IF EXISTS tbl_tenis");
        onCreate(db); 
    }
 
}