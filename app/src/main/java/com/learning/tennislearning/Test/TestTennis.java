package com.learning.tennislearning.Test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.learning.tennislearning.DatabaseHendler.Database;
import com.learning.tennislearning.R;
import com.learning.tennislearning.TestControl.TestParser;

/**
 * Created by vjivandro on 9/26/17.
 */

public class TestTennis extends AppCompatActivity {
    private Database db;
    private TextView txtnama, txtno, txttanggal, txtwaktu, txtsoal;
    private ImageView img;
    private RadioGroup rg;
    private RadioButton rdA, rdB, rdC;
    private List<TestParser> listTestParser;
    private CounterClass mCountDownTimer;
    private int detik = 300000;  // 1 menit = 60000 s
    private Button btnPrev, btnNext, btnSelesai;
    int jawabanYgDiPilih[] = null;
    int jawabanYgBenar[] = null;
    boolean cekPertanyaan = false;
    int urutanPertanyaan = 0;
    String noSalah = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_tennis);

        db = new Database(this);
        txtnama = (TextView) findViewById(R.id.textViewNama);
        txtno = (TextView) findViewById(R.id.textViewHalaman);
        txttanggal = (TextView) findViewById(R.id.textViewTanggal);
        txtwaktu = (TextView) findViewById(R.id.textViewWaktu);
        txtsoal = (TextView) findViewById(R.id.textViewSoal2);
        img = (ImageView) findViewById(R.id.img1);
        rg = (RadioGroup) findViewById(R.id.radioGroup1);
        rdA = (RadioButton) findViewById(R.id.radio0);
        rdB = (RadioButton) findViewById(R.id.radio1);
        rdC = (RadioButton) findViewById(R.id.radio2);
        btnPrev = (Button) findViewById(R.id.buttonPrev);
        btnNext = (Button) findViewById(R.id.buttonNext);
        btnSelesai = (Button) findViewById(R.id.buttonSelesai);
        final Calendar c = Calendar.getInstance();
        int day = c.get(Calendar.DAY_OF_MONTH);
        int month = c.get(Calendar.MONTH);
        int year = c.get(Calendar.YEAR);
        txttanggal.setText(Integer.toString(day)+"-"+Integer.toString(month+1)+"-"+Integer.toString(year));

        listTestParser = new ArrayList<>();
        listTestParser = db.getSoalTenis();

        btnSelesai.setOnClickListener(klikSelesai);
        btnPrev.setOnClickListener(klikSebelum);
        btnNext.setOnClickListener(klikBerikut);
        //new GetSoal().execute();
        jawabanYgDiPilih = new int[listTestParser.size()];
        java.util.Arrays.fill(jawabanYgDiPilih, -2);
        jawabanYgBenar = new int[listTestParser.size()];
        java.util.Arrays.fill(jawabanYgBenar, -1);
        showInputUser();
    }

    private void showInputUser() {
        LayoutInflater mInflater = LayoutInflater.from(this);
        View v = mInflater.inflate(R.layout.nama, null);

        final AlertDialog dialog = new AlertDialog.Builder(this).create();

        dialog.setView(v);
        dialog.setTitle("Ketikkan Nama Anda");
        dialog.setIcon(R.drawable.waktu);
        dialog.setCancelable(false);

        final Button btnOk = (Button) v.findViewById(R.id.buttonOK);
        final EditText inputUser = (EditText) v.findViewById(R.id.editTextNama);

        btnOk.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                if(inputUser.getText().toString().equals("")){
                    Toast.makeText(getBaseContext(), "Isi dulu", Toast.LENGTH_LONG).show();
                }else{
                    txtnama.setText(inputUser.getText().toString());
                    mulaiKuis();
                    dialog.dismiss();
                }

            }
        });

        dialog.show();
    }

    protected void mulaiKuis() {
        setUpWaktu();
        setUpSoal();

    }

    private void setUpWaktu() {
        mCountDownTimer = new CounterClass(detik, 1000);
        mCountDownTimer.start();
    }

    private void setUpSoal() {
        Collections.shuffle(listTestParser);
        this.tunjukanPertanyaan(0, cekPertanyaan);
    }

    private void tunjukanPertanyaan(int urutan_soal_soal, boolean review) {
        btnSelesai.setEnabled(false);
        try {
            rg.clearCheck();
            TestParser testParser = new TestParser();
            testParser = listTestParser.get(urutan_soal_soal);
            String pertanyaan = testParser.getSoalTenis();
            if (jawabanYgBenar[urutan_soal_soal] == -1) {
                jawabanYgBenar[urutan_soal_soal] = testParser.getJwban();
            }

            int gambar = testParser.getGambar();
            txtsoal.setText(pertanyaan.toCharArray(), 0, pertanyaan.length());
            img.setImageResource(gambar);
            rg.check(-1);
            String jwb_a = testParser.getCo_a();
            rdA.setText(jwb_a.toCharArray(), 0,
                    jwb_a.length());
            String jwb_b = testParser.getCo_b();
            rdB.setText(jwb_b.toCharArray(), 0,
                    jwb_b.length());
            String jwb_c = testParser.getCo_c();
            rdC.setText(jwb_c.toCharArray(), 0,
                    jwb_c.length());

            Log.d("", jawabanYgDiPilih[urutan_soal_soal] + "");
            if (jawabanYgDiPilih[urutan_soal_soal] == 0)
                rg.check(R.id.radio0);
            if (jawabanYgDiPilih[urutan_soal_soal] == 1)
                rg.check(R.id.radio1);
            if (jawabanYgDiPilih[urutan_soal_soal] == 2)
                rg.check(R.id.radio2);

            pasangLabelDanNomorUrut();

            if (urutan_soal_soal == (listTestParser.size() - 1)){
                btnNext.setEnabled(false);
                btnSelesai.setEnabled(true);
            }

            if (urutan_soal_soal == 0)
                btnPrev.setEnabled(false);

            if (urutan_soal_soal > 0)
                btnPrev.setEnabled(true);

            if (urutan_soal_soal < (listTestParser.size() - 1))
                btnNext.setEnabled(true);

        } catch (Exception e) {
            Log.e(this.getClass().toString(), e.getMessage(), e.getCause());
        }
    }

    public class CounterClass extends CountDownTimer {
        public CounterClass(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onFinish() {
            aturJawaban_nya();
            // hitung berapa yg benar
            int jumlahJawabanYgBenar = 0;
            for (int i = 0; i < jawabanYgBenar.length; i++) {
                if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
                    jumlahJawabanYgBenar++;
                if(jawabanYgBenar[i] != jawabanYgDiPilih[i])
                    noSalah = noSalah+" " + Integer.toString(i+1);
            }
            if(noSalah == ""){
                noSalah = "Benar semua";
            }
            else{
                noSalah = "No yang salah"+noSalah;
            }
            AlertDialog tampilKotakAlert;
            tampilKotakAlert = new AlertDialog.Builder(TestTennis.this).create();
            tampilKotakAlert.setTitle("Nilai");
            tampilKotakAlert.setMessage("Benar " +jumlahJawabanYgBenar + " dari "
                    + (listTestParser.size() +" soal. "+noSalah));

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "Lagi",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            urutanPertanyaan = 0;
                            noSalah="";
                            java.util.Arrays.fill(jawabanYgDiPilih, -2);
                            TestTennis.this.tunjukanPertanyaan(0,
                                    cekPertanyaan);
                        }
                    });

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Keluar",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            finish();
                        }
                    });

            tampilKotakAlert.show();
        }

        @SuppressLint("NewApi")
        @TargetApi(Build.VERSION_CODES.GINGERBREAD)
        @Override
        public void onTick(long millisUntilFinished) {
            long millis = millisUntilFinished;
            String hms = String.format(
                    "%02d:%02d:%02d",
                    TimeUnit.MILLISECONDS.toHours(millis),
                    TimeUnit.MILLISECONDS.toMinutes(millis)
                            - TimeUnit.HOURS.toMinutes(TimeUnit.MILLISECONDS
                            .toHours(millis)),
                    TimeUnit.MILLISECONDS.toSeconds(millis)
                            - TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS
                            .toMinutes(millis)));
            txtwaktu.setText(hms);
        }
    }

    private OnClickListener klikSelesai = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            // hitung berapa yg benar
            int jumlahJawabanYgBenar = 0;
            for (int i = 0; i < jawabanYgBenar.length; i++) {
                if ((jawabanYgBenar[i] != -1) && (jawabanYgBenar[i] == jawabanYgDiPilih[i]))
                    jumlahJawabanYgBenar++;
                if(jawabanYgBenar[i] != jawabanYgDiPilih[i])
                    noSalah = noSalah+" " + Integer.toString(i+1);
            }
            if(noSalah == ""){
                noSalah = "Benar semua";
            }
            else{
                noSalah = "No yang salah"+noSalah;
            }
            AlertDialog tampilKotakAlert;
            tampilKotakAlert = new AlertDialog.Builder(TestTennis.this).create();
            tampilKotakAlert.setTitle("Hasil");
            int hasil = jumlahJawabanYgBenar * (100/ jawabanYgDiPilih.length); // menampilkan Hasil
            tampilKotakAlert.setMessage("Benar :" +jumlahJawabanYgBenar +"\n"+ "Dari Soal :"
                    + (listTestParser.size()+ "\n" + "Nilai Anda : "+hasil));

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEUTRAL, "Lagi",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            urutanPertanyaan = 0;
                            noSalah="";
                            java.util.Arrays.fill(jawabanYgDiPilih, -2);
                            TestTennis.this.tunjukanPertanyaan(0,
                                    cekPertanyaan);
                        }
                    });

            tampilKotakAlert.setButton(AlertDialog.BUTTON_NEGATIVE, "Keluar",
                    new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            cekPertanyaan = false;
                            finish();
                        }
                    });

            tampilKotakAlert.show();

        }
    };

    private void aturJawaban_nya() {
        if (rdA.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 0;
        if (rdB.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 1;
        if (rdC.isChecked())
            jawabanYgDiPilih[urutanPertanyaan] = 2;

        Log.d("", Arrays.toString(jawabanYgDiPilih));
        Log.d("", Arrays.toString(jawabanYgBenar));

    }

    private OnClickListener klikBerikut = new OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan++;
            if (urutanPertanyaan >= listTestParser.size())
                urutanPertanyaan = listTestParser.size() - 1;

            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };

    private View.OnClickListener klikSebelum = new View.OnClickListener() {
        public void onClick(View v) {
            aturJawaban_nya();
            urutanPertanyaan--;
            if (urutanPertanyaan < 0)
                urutanPertanyaan = 0;

            tunjukanPertanyaan(urutanPertanyaan, cekPertanyaan);
        }
    };

    private void pasangLabelDanNomorUrut() {
        txtno.setText("Soal ke " + (urutanPertanyaan + 1) + " dari "
                + listTestParser.size());
    }
}
