package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
TextView show;
Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
String b1,b2,b3,b4,b5,b6,b7,b8,b9;
int count=0;
int count1=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       init();
        Animation transat1 = AnimationUtils.loadAnimation(this,R.anim.translat1);
        show.startAnimation(transat1);

    }
    private void init(){
        show=findViewById(R.id.show);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
    }
    public void check(View v){
        Animation scale1 = AnimationUtils.loadAnimation(this,R.anim.scale1);
        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.win);
        TextView winTextView = dialog.findViewById(R.id.winTextView);
        Button winButton = dialog.findViewById(R.id.winButton);
        Button buttonCurrent = (Button) v;
        if(buttonCurrent.getText().toString().equals("")) {
            count1++;
            if (count % 2 == 0) {
                buttonCurrent.setText("O");
            } else {
                buttonCurrent.setText("X");
            }
            count++;
            if (count1 > 4) {
                b1 = btn1.getText().toString();
                b2 = btn2.getText().toString();
                b3 = btn3.getText().toString();
                b4 = btn4.getText().toString();
                b5 = btn5.getText().toString();
                b6 = btn6.getText().toString();
                b7 = btn7.getText().toString();
                b8 = btn8.getText().toString();
                b9 = btn9.getText().toString();
                if (b1.equals(b2) && b2.equals(b3) && !b1.equals("")) {
                    btn1.startAnimation(scale1);
                    btn2.startAnimation(scale1);
                    btn3.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b1+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b1, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b4.equals(b5) && b5.equals(b6) && !b4.equals("")) {
                    btn4.startAnimation(scale1);
                    btn5.startAnimation(scale1);
                    btn6.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b4+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b4, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b7.equals(b8) && b8.equals(b9) && !b7.equals("")) {
                    btn7.startAnimation(scale1);
                    btn8.startAnimation(scale1);
                    btn9.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b7+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b7, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b1.equals(b4) && b4.equals(b7) && !b1.equals("")) {
                    btn1.startAnimation(scale1);
                    btn4.startAnimation(scale1);
                    btn7.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b1+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b1, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b2.equals(b5) && b5.equals(b8) && !b2.equals("")) {
                    btn2.startAnimation(scale1);
                    btn5.startAnimation(scale1);
                    btn8.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b2+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b2, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b3.equals(b6) && b6.equals(b9) && !b3.equals("")) {
                    btn3.startAnimation(scale1);
                    btn6.startAnimation(scale1);
                    btn9.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b3+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b3, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b1.equals(b5) && b5.equals(b9) && !b1.equals("")) {
                    btn1.startAnimation(scale1);
                    btn5.startAnimation(scale1);
                    btn9.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b1+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b1, Toast.LENGTH_LONG).show();
                    restart();
                } else if (b3.equals(b5) && b5.equals(b7) && !b3.equals("")) {
                    btn3.startAnimation(scale1);
                    btn5.startAnimation(scale1);
                    btn7.startAnimation(scale1);
                    dialog.show();
                    winTextView.setText(b3+ "Win..!!!");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    Toast.makeText(this, "winner..!! " + b3, Toast.LENGTH_LONG).show();
                    restart();
                }else if (!b1.equals("")&&!b2.equals("")&&!b3.equals("")&&!b4.equals("")&&
                !b5.equals("")&&!b6.equals("")&&!b7.equals("")&&!b8.equals("")&&!b9.equals("")){
                    dialog.show();
                    winTextView.setText("Draw game");
                    winTextView.setAnimation(scale1);
                    winButton.setText("RESET");
                    winButton.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            dialog.dismiss();
                        }
                    });
                    restart();
                    Toast.makeText(this,"Draw...!!! keyur game",Toast.LENGTH_LONG).show();
                }
//                else if (count1==9){
//                    restart();
//                }
            }
        }
    }
    public void restart(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");
                count=0;
                count1=0;
            }
        },3000);
    }
    @Override
    public  void onResume() {
        super.onResume();
        Toast.makeText(this,"this is resume",Toast.LENGTH_SHORT).show();
    }
    public void onPause(){
        super.onPause();
        Toast.makeText(this,"this is pause",Toast.LENGTH_LONG).show();
    }
    public void onStop(){
        super.onStop();
        Toast.makeText(this,"this is stop",Toast.LENGTH_LONG).show();
    }
}