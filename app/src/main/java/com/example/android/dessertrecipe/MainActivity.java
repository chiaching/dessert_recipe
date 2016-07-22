package com.example.android.dessertrecipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int cheesecake=0;
    int pudding=0;
    int yoguert=0;
    int cookies=0;
    int pancake=0;

    public void pluscake(View v)
    {
        cheesecake=cheesecake+1;
        displaycheesecake(cheesecake);
        String recipe="step1. "+120*cheesecake+"g消化餅敲碎後拌入"+40*cheesecake+"g無鹽奶油壓入模底\n" +
                "\nstep2. "+500*cheesecake+"g cream cheese+"+5*cheesecake+"顆蛋+"+100*cheesecake+"g糖攪打至光滑狀\n" +
                "\nstep3. 過篩加入"+40*cheesecake+"g麵粉打均勻，倒入烤模\n" +
                "\nstep4. 隔水以200度烤50分鐘";
        displaycheesecaketext(recipe);
    }
    public void mulscake(View v)
    {
        cheesecake=cheesecake-1;
        displaycheesecake(cheesecake);
        String recipe="step1. "+120*cheesecake+"g消化餅敲碎後拌入"+40*cheesecake+"g無鹽奶油壓入模底\n" +
                "\nstep2. "+500*cheesecake+"g cream cheese+"+5*cheesecake+"顆蛋+"+100*cheesecake+"g糖攪打至光滑狀\n" +
                "\nstep3. 過篩加入"+40*cheesecake+"g麵粉打均勻，倒入烤模\n" +
                "\nstep4. 隔水以200度烤50分鐘";
        displaycheesecaketext(recipe);
    }
    public void displaycheesecake(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_cake);
        scoreView.setText(String.valueOf(score));
    }
    public void displaycheesecaketext(String score) {
        TextView scoreView = (TextView) findViewById(R.id.recipe);
        scoreView.setText(String.valueOf(score));
    }

    /////////////////////////////////////

    public void pluspudding(View v)
    {
        pudding=pudding+1;
        float po=pudding;
        displaypudding(pudding);
        String recipe="step1. 冷水"+pudding*50/12+"c.c+白砂糖"+pudding*100/12+"g煮至褐色倒入"+pudding*30/12+"c.c熱水攪拌後即為焦糖液\n" +
                "\nstep2. 全蛋"+po*3/12+"顆+蛋黃"+po*3/12+"顆+"+pudding*50/12+"g白砂糖打散，再慢慢倒入"+pudding*650/12+"c.c熱鮮奶即為布丁液\n" +
                "\nstep3. 容器先倒入焦糖液再隔細篩倒入布丁液\n" +
                "\nstep4. 在深烤盤放超過容器一半高的熱水，用150度烤60~90分鐘\n" +
                "\nstep5. 放涼後冰冰箱";
        displaypuddingtext(recipe);
    }
    public void mulspudding(View v)
    {
        pudding=pudding-1;
        float po=pudding;
        displaypudding(pudding);
        String recipe="step1. 冷水"+pudding*50/12+"c.c+白砂糖"+pudding*100/12+"g煮至褐色倒入"+pudding*30/12+"c.c熱水攪拌後即為焦糖液\n" +
                "\nstep2. 全蛋"+po*3/12+"顆+蛋黃"+po*3/12+"顆+"+pudding*50/12+"g白砂糖打散，再慢慢倒入"+pudding*650/12+"c.c熱鮮奶即為布丁液\n" +
                "\nstep3. 容器先倒入焦糖液再隔細篩倒入布丁液\n" +
                "\nstep4. 在深烤盤放超過容器一半高的熱水，用150度烤60~90分鐘\n" +
                "\nstep5. 放涼後冰冰箱";
        displaypuddingtext(recipe);
    }
    public void displaypudding(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_pudding);
        scoreView.setText(String.valueOf(score));
    }
    public void displaypuddingtext(String score) {
        TextView scoreView = (TextView) findViewById(R.id.recipe);
        scoreView.setText(String.valueOf(score));
    }
////////////////////////////////////////////////

    public void plusyoguert(View v)
    {
        yoguert=yoguert+1;
        displayyoguert(yoguert);
        String recipe="step1. "+yoguert*250/9+"c.c優酪乳+"+yoguert*750/9+"c.c鮮奶倒入消毒過的容器，蓋上蓋子\n" +
                "\nstep2. 電鍋倒入"+yoguert*50+"c.c水，夾著一根筷子蓋上鍋蓋\n" +
                "\n" +
                "\nstep3. 約3分鐘後開關跳起，按下保溫鍵保溫約8小時\n";
        displayyoguerttext(recipe);
    }
    public void mulsyoguert(View v)
    {
        yoguert=yoguert-1;
        displayyoguert(yoguert);
        String recipe="step1. "+yoguert*250/9+"c.c優酪乳+"+yoguert*750/9+"c.c鮮奶倒入消毒過的容器，蓋上蓋子\n" +
                "\nstep2. 電鍋倒入"+yoguert*50+"c.c水，夾著一根筷子蓋上鍋蓋\n" +
                "\n" +
                "\nstep3. 約3分鐘後開關跳起，按下保溫鍵保溫約8小時\n";
        displayyoguerttext(recipe);
    }
    public void displayyoguert(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_yoguert);
        scoreView.setText(String.valueOf(score));
    }
    public void displayyoguerttext(String score) {
        TextView scoreView = (TextView) findViewById(R.id.recipe);
        scoreView.setText(String.valueOf(score));
    }

////////////////////////////////////////////////

    public void pluscookies(View v)
    {
        cookies=cookies+1;
        displaycookies(cookies);
        String recipe="step1. "+cookies*150+"g奶油+"+cookies*70+"g糖攪拌，+"+cookies*25+"g蛋打成麵糊\n" +
                "\nstep2. 過篩加入"+cookies*190+"g麵粉+"+cookies*20+"g無糖可可粉+"+cookies*2+"g小蘇打粉按壓拌勻\n" +
                "\nstep3. 加入"+cookies*15+"g杏仁粉+"+cookies*50+"g杏仁片拌勻\n" +
                "\nstep4. 上火170度下火150度烘烤20分鐘";
        displaycookiestext(recipe);
    }
    public void mulscookies(View v)
    {
        cookies=cookies-1;
        displaycookies(cookies);
        String recipe="step1. "+cookies*150+"g奶油+"+cookies*70+"g糖攪拌，+"+cookies*25+"g蛋打成麵糊\n" +
                "\nstep2. 過篩加入"+cookies*190+"g麵粉+"+cookies*20+"g無糖可可粉+"+cookies*2+"g小蘇打粉按壓拌勻\n" +
                "\nstep3. 加入"+cookies*15+"g杏仁粉+"+cookies*50+"g杏仁片拌勻\n" +
                "\nstep4. 上火170度下火150度烘烤20分鐘";
        displaycookiestext(recipe);
    }
    public void displaycookies(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_cookies);
        scoreView.setText(String.valueOf(score));
    }
    public void displaycookiestext(String score) {
        TextView scoreView = (TextView) findViewById(R.id.recipe);
        scoreView.setText(String.valueOf(score));
    }

////////////////////////////////////////////////

    public void pluspancake(View v)
    {
        pancake=pancake+1;
        float pan=pancake;
        displaypancake(pancake);
        String recipe="step1. "+pan*3/6+"顆蛋黃+"+pancake*40+"g糖打發，拌入"+pancake*270+"g低筋麵粉、"+pancake*180+"g鮮奶、"+pancake*40+"g無鹽奶油、"+pancake*10+"g泡打粉\n" +
                "\nstep2. "+pan*3/6+"顆蛋白+"+pancake*40+"g糖打發後、慢慢加入step1拌均勻\n" +
                "\nstep3. 平底鍋塗奶油煎熟後淋上楓糖\n";
        displaypancaketext(recipe);
    }
    public void mulspancake(View v)
    {
        pancake=pancake-1;
        displaycookies(pancake);
        float pan=pancake;
        String recipe="\nstep1. "+pan*3/6+"顆蛋黃+"+pancake*40+"g糖打發，拌入"+pancake*270+"g低筋麵粉、"+pancake*180+"g鮮奶、"+pancake*40+"g無鹽奶油、"+pancake*10+"g泡打粉\n" +
                "\nstep2. "+pan*3/6+"顆蛋白+"+pancake*40+"g糖打發後、慢慢加入step1拌均勻\n" +
                "\nstep3. 平底鍋塗奶油煎熟後淋上楓糖\n";
        displaypancaketext(recipe);
    }
    public void displaypancake(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_pancake);
        scoreView.setText(String.valueOf(score));
    }

    public void displaypancaketext(String score) {
        TextView scoreView = (TextView) findViewById(R.id.recipe);
        scoreView.setText(String.valueOf(score));
    }
////////////////////////////////////////////////


}
