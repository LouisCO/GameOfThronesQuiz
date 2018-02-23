package com.example.android.gameofthronesquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the reset button is clicked.
     */
    public void retakeQuiz(View view) {
        Intent MainActivity=getBaseContext().getPackageManager()
                .getLaunchIntentForPackage(getBaseContext().getPackageName());
        assert MainActivity != null;
        MainActivity.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(MainActivity);
    }

    /**
     * This method checks if all questions are answered
     *
     * @param isMartellChecked   /
     * @param isValarChecked     /
     * @param isVarysChecked     /
     * @param isWeaponChecked    /
     * @param isSwordChecked/
     * @param isDaenerysChecked/
     * @param isNymeria/
     * @param isJorahChecked     /
     * @param isKingChecked      /
     * @param isKnightsNum       /
     * @return quiz checked
     */
    private boolean isQuizChecked(boolean isSwordChecked, boolean isDaenerysChecked, boolean isNymeria, boolean isJorahChecked, boolean isKnightsNum, boolean isMartellChecked, boolean isValarChecked, boolean isVarysChecked, boolean isKingChecked, boolean isWeaponChecked) {
        return isSwordChecked && isDaenerysChecked && isNymeria && isJorahChecked && isKnightsNum && isMartellChecked && isValarChecked && isVarysChecked && isKingChecked && isWeaponChecked;
    }

    /**
     * This method checks if Q1 is answered
     */
    private boolean isSwordChecked() {

        RadioButton iceRButton=findViewById(R.id.rb_ice);
        boolean isIceChecked=iceRButton.isChecked();

        RadioButton needleRButton=findViewById(R.id.rb_needle);
        boolean isNeedleChecked=needleRButton.isChecked();

        RadioButton longclawRButton=findViewById(R.id.rb_longclaw);
        boolean isLongclawChecked=longclawRButton.isChecked();

        RadioButton oathkRButton=findViewById(R.id.rb_oathkeeper);
        boolean isOathkChecked=oathkRButton.isChecked();

        return isIceChecked || isNeedleChecked || isLongclawChecked || isOathkChecked;
    }

    /**
     * This method checks if Q2 is answered
     */
    private boolean isDaenerysChecked() {

        CheckBox stormbornCBox=findViewById(R.id.cb_stormborn);
        boolean isStormbornChecked=stormbornCBox.isChecked();

        CheckBox unburntCBox=findViewById(R.id.cb_unburnt);
        boolean isUnburntChecked=unburntCBox.isChecked();

        CheckBox queenCBox=findViewById(R.id.cb_queen);
        boolean isQueenChecked=queenCBox.isChecked();

        CheckBox silverCBox=findViewById(R.id.cb_silver);
        boolean isSilverChecked=silverCBox.isChecked();

        return isStormbornChecked || isUnburntChecked || isQueenChecked || isSilverChecked;
    }

    /**
     * This method checks if Q3 is answered
     */
    private boolean isJorahChecked() {
        RadioButton paleButton=findViewById(R.id.rb_mere_dis);
        boolean isPaleChecked=paleButton.isChecked();

        RadioButton grayscaleButton=findViewById(R.id.rb_scale_dis);
        boolean isGrayscaleChecked=grayscaleButton.isChecked();

        RadioButton springButton=findViewById(R.id.rb_sickness_dis);
        boolean isSicknessChecked=springButton.isChecked();

        RadioButton plagueButton=findViewById(R.id.rb_plague_dis);
        boolean isPlagueChecked=plagueButton.isChecked();

        return isPaleChecked || isGrayscaleChecked || isSicknessChecked || isPlagueChecked;
    }

    /**
     * This method checks if Q4 is answered
     *
     * @param dWname /
     */
    private boolean isNymeria(String dWname) {
        return !dWname.contentEquals("");
    }

    /**
     * This method checks if Q5 is answered
     *
     * @param guardNum /
     */
    private boolean isKnightsNum(String guardNum) {
        return !guardNum.contentEquals("");
    }

    /**
     * This method checks if Q6 is answered
     */
    private boolean isMartellChecked() {
        RadioButton highgButton=findViewById(R.id.rb_highgarden);
        boolean isHighgChecked=highgButton.isChecked();

        RadioButton dragonstButton=findViewById(R.id.rb_dragonst);
        boolean isDragonstChecked=dragonstButton.isChecked();

        RadioButton sunButton=findViewById(R.id.rb_sun);
        boolean isSunChecked=sunButton.isChecked();

        RadioButton volButton=findViewById(R.id.rb_volantis);
        boolean isVolChecked=volButton.isChecked();

        return isHighgChecked || isDragonstChecked || isSunChecked || isVolChecked;
    }

    /**
     * This method checks if Q7 is answered
     */
    private boolean isValarChecked() {
        RadioButton serveButton=findViewById(R.id.rb_must_serve);
        boolean isDieChecked=serveButton.isChecked();

        RadioButton todayButton=findViewById(R.id.rb_today);
        boolean isTodayChecked=todayButton.isChecked();

        RadioButton dieButton=findViewById(R.id.rb_die);
        boolean isMdieChecked=dieButton.isChecked();

        RadioButton winButton=findViewById(R.id.rb_win);
        boolean isWinChecked=winButton.isChecked();

        return isDieChecked || isTodayChecked || isMdieChecked || isWinChecked;
    }

    /**
     * This method checks if Q8 is answered
     */
    private boolean isVarysChecked() {
        CheckBox houndCBox=findViewById(R.id.cb_hound);
        boolean isHoundChecked=houndCBox.isChecked();

        CheckBox mountCBox=findViewById(R.id.cb_mountain);
        boolean isMountChecked=mountCBox.isChecked();

        CheckBox spiderCBox=findViewById(R.id.cb_spider);
        boolean isSpiderChecked=spiderCBox.isChecked();

        CheckBox eunuchCBox=findViewById(R.id.cb_eunuch);
        boolean isEunuchChecked=eunuchCBox.isChecked();

        return isHoundChecked || isMountChecked || isSpiderChecked || isEunuchChecked;
    }

    /**
     * This method checks if Q9 is answered
     */
    private boolean isKingChecked() {
        RadioButton aegonButton=findViewById(R.id.rb_aegon);
        boolean isAegonChecked=aegonButton.isChecked();

        RadioButton aerisButton=findViewById(R.id.rb_aeris);
        boolean isAerisChecked=aerisButton.isChecked();

        RadioButton aemonButton=findViewById(R.id.rb_aemon);
        boolean isAemonChecked=aemonButton.isChecked();

        RadioButton rhaegarButton=findViewById(R.id.rb_rhaegar);
        boolean isRhaegChecked=rhaegarButton.isChecked();

        return isAegonChecked || isAerisChecked || isAemonChecked || isRhaegChecked;
    }

    /**
     * This method checks if Q10 is answered
     */
    private boolean isWeaponChecked() {
        CheckBox dragonCBox=findViewById(R.id.cb_dragonglass);
        boolean isDragonglassChecked=dragonCBox.isChecked();

        CheckBox obsidianCBox=findViewById(R.id.cb_obsidian);
        boolean isObsidianChecked=obsidianCBox.isChecked();

        CheckBox dragonstoneCBox=findViewById(R.id.cb_dragonstone);
        boolean isDragonstoneChecked=dragonstoneCBox.isChecked();

        CheckBox valyrianCBox=findViewById(R.id.cb_valyrian);
        boolean isValyrianChecked=valyrianCBox.isChecked();

        return isDragonglassChecked || isObsidianChecked || isDragonstoneChecked || isValyrianChecked;
    }

    /**
     * This method is called when the "submit" button is clicked.
     */
    public void showScore(View view) {
        RadioButton iceRButton=findViewById(R.id.rb_ice);
        boolean isIceChecked=iceRButton.isChecked();

        CheckBox stormbornCBox=findViewById(R.id.cb_stormborn);
        boolean isStormbornChecked=stormbornCBox.isChecked();

        CheckBox unburntCBox=findViewById(R.id.cb_unburnt);
        boolean isUnburntChecked=unburntCBox.isChecked();

        CheckBox silverCBox=findViewById(R.id.cb_silver);
        boolean isSilverChecked=silverCBox.isChecked();

        CheckBox queenCBox=findViewById(R.id.cb_queen);
        boolean isQueenChecked=queenCBox.isChecked();

        RadioButton grayscaleButton=findViewById(R.id.rb_scale_dis);
        boolean isGrayscaleChecked=grayscaleButton.isChecked();

        EditText dwName=findViewById(R.id.direwolf_edtxt);
        String dWname=dwName.getText().toString();

        EditText guardNumber=findViewById(R.id.kings_guards_edtxt);
        String guardNum=guardNumber.getText().toString();

        RadioButton sunButton=findViewById(R.id.rb_sun);
        boolean isSunChecked=sunButton.isChecked();

        RadioButton dieButton=findViewById(R.id.rb_die);
        boolean isDieChecked=dieButton.isChecked();

        CheckBox houndCBox=findViewById(R.id.cb_hound);
        boolean isHoundChecked=houndCBox.isChecked();

        CheckBox mountCBox=findViewById(R.id.cb_mountain);
        boolean isMountChecked=mountCBox.isChecked();

        CheckBox spiderCBox=findViewById(R.id.cb_spider);
        boolean isSpiderChecked=spiderCBox.isChecked();

        CheckBox eunuchCBox=findViewById(R.id.cb_eunuch);
        boolean isEunuchChecked=eunuchCBox.isChecked();

        RadioButton aerisButton=findViewById(R.id.rb_aeris);
        boolean isAerisChecked=aerisButton.isChecked();

        CheckBox dragonCBox=findViewById(R.id.cb_dragonglass);
        boolean isDragonglassChecked=dragonCBox.isChecked();

        CheckBox obsidianCBox=findViewById(R.id.cb_obsidian);
        boolean isObsidianChecked=obsidianCBox.isChecked();

        CheckBox dragonstoneCBox=findViewById(R.id.cb_dragonstone);
        boolean isDragonstoneChecked=dragonstoneCBox.isChecked();

        CheckBox valyrianCBox=findViewById(R.id.cb_valyrian);
        boolean isValyrianChecked=valyrianCBox.isChecked();

        int points=calculateScore(isIceChecked, isStormbornChecked, isUnburntChecked, isSilverChecked, isQueenChecked, isGrayscaleChecked, isDirewolf(dWname), isSunChecked, isDieChecked, isHoundChecked, isMountChecked,isSpiderChecked, isEunuchChecked, isAerisChecked, isKingsguard(guardNum), isDragonglassChecked, isObsidianChecked, isValyrianChecked, isDragonstoneChecked);

        if (points < 4 && isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked()))
            Toast.makeText(this, getString(R.string.result1, points), Toast.LENGTH_LONG).show();
        else if (points >= 4 && points < 7 && isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked()))
            Toast.makeText(this, getString(R.string.result2, points), Toast.LENGTH_LONG).show();
        else if (points >= 7 && points < 10 && isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked()))
            Toast.makeText(this, getString(R.string.result3, points), Toast.LENGTH_LONG).show();
        else if (points == 10 && isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked()))
            Toast.makeText(this, getString(R.string.result4, points), Toast.LENGTH_SHORT).show();
        else Toast.makeText(this, getString(R.string.omission), Toast.LENGTH_LONG).show();
    }

    /**
     * This method checks answer to Q4
     *
     * @param dwName/
     * @return the exact name
     */
    private boolean isDirewolf(String dwName) {
        return (dwName.contains("Nymeria"));
    }

    /**
     * This method checks answer to Q5
     *
     * @param guardNum/
     * @return the number
     */
    private boolean isKingsguard(String guardNum) {
        return (guardNum.contentEquals("7"));
    }

    /**
     * This method calculates score
     *
     * @param isIceChecked/
     * @param isStormbornChecked/
     * @param isUnburntChecked/
     * @param isSilverChecked/
     * @param isDirewolf/
     * @param isSunChecked/
     * @param isGrayscaleChecked/
     * @param isDieChecked/
     * @param isSpiderChecked/
     * @param isEunuchChecked/
     * @param isAerisChecked/
     * @param isKingsguard/
     * @param isDragonglassChecked /
     * @param isObsidianChecked/
     * @param isValyrianChecked    /
     * @return total points
     */
    private int calculateScore(boolean isIceChecked, boolean isStormbornChecked,
                               boolean isUnburntChecked, boolean isSilverChecked, boolean isQueenChecked, boolean isDirewolf, boolean isSunChecked,
                               boolean isGrayscaleChecked, boolean isDieChecked, boolean isHoundChecked, boolean isMountChecked, boolean isSpiderChecked,
                               boolean isEunuchChecked, boolean isAerisChecked, boolean isKingsguard,
                               boolean isDragonglassChecked, boolean isObsidianChecked, boolean isValyrianChecked, boolean isDragonstoneChecked) {

        int points=0;

        if (isIceChecked) points++;
        if ((isStormbornChecked) && (isUnburntChecked) && (isSilverChecked) && !(isQueenChecked)) points++;
        if (isDirewolf) points++;
        if (isSunChecked) points++;
        if (isGrayscaleChecked) points++;
        if (isDieChecked) points++;
        if ((isSpiderChecked) && (isEunuchChecked) && !(isHoundChecked) && !(isMountChecked)) points++;
        if (isAerisChecked) points++;
        if (isKingsguard) points++;
        if ((isDragonglassChecked) && (isObsidianChecked) && (isValyrianChecked)&& !(isDragonstoneChecked)) points++;

        return points;
    }
}