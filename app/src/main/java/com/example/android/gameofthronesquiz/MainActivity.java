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

    RadioButton iceRButton;
    RadioButton needleRButton;
    RadioButton longclawRButton;
    RadioButton oathkRButton;
    CheckBox stormbornCBox;
    CheckBox unburntCBox;
    CheckBox queenCBox;
    CheckBox silverCBox;
    RadioButton paleButton;
    RadioButton grayscaleButton;
    RadioButton springButton;
    RadioButton plagueButton;
    RadioButton highgButton;
    RadioButton dragonstButton;
    RadioButton sunButton;
    RadioButton volButton;
    RadioButton serveButton;
    RadioButton todayButton;
    RadioButton dieButton;
    RadioButton winButton;
    CheckBox houndCBox;
    CheckBox mountCBox;
    CheckBox spiderCBox;
    CheckBox eunuchCBox;
    RadioButton aegonButton;
    RadioButton aerisButton;
    RadioButton aemonButton;
    RadioButton rhaegarButton;
    CheckBox dragonCBox;
    CheckBox obsidianCBox;
    CheckBox dragonstoneCBox;
    CheckBox valyrianCBox;
    EditText dwName;
    EditText guardNumber;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iceRButton=findViewById(R.id.ice);
        needleRButton=findViewById(R.id.needle);
        longclawRButton=findViewById(R.id.longclaw);
        oathkRButton=findViewById(R.id.oathkeeper);
        stormbornCBox=findViewById(R.id.stormborn);
        unburntCBox=findViewById(R.id.unburnt);
        queenCBox=findViewById(R.id.queen);
        silverCBox=findViewById(R.id.silver);
        paleButton=findViewById(R.id.mere_dis);
        grayscaleButton=findViewById(R.id.scale_dis);
        springButton=findViewById(R.id.sickness_dis);
        plagueButton=findViewById(R.id.plague_dis);
        highgButton=findViewById(R.id.highgarden);
        dragonstButton=findViewById(R.id.dragonst);
        sunButton=findViewById(R.id.sun);
        volButton=findViewById(R.id.volantis);
        serveButton=findViewById(R.id.must_serve);
        todayButton=findViewById(R.id.must_today);
        dieButton=findViewById(R.id.must_die);
        winButton=findViewById(R.id.must_win);
        houndCBox=findViewById(R.id.hound);
        mountCBox=findViewById(R.id.mountain);
        spiderCBox=findViewById(R.id.spider);
        eunuchCBox=findViewById(R.id.eunuch);
        aegonButton=findViewById(R.id.aegon);
        aerisButton=findViewById(R.id.aeris);
        aemonButton=findViewById(R.id.aemon);
        rhaegarButton=findViewById(R.id.rhaegar);
        dragonCBox=findViewById(R.id.dragonglass);
        obsidianCBox=findViewById(R.id.obsidian);
        dragonCBox=findViewById(R.id.dragonstone);
        valyrianCBox=findViewById(R.id.valyrian);
        dwName=findViewById(R.id.direwolf_name);
        guardNumber=findViewById(R.id.kings_guards);
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
        boolean isIceChecked=iceRButton.isChecked();
        boolean isNeedleChecked=needleRButton.isChecked();
        boolean isLongclawChecked=longclawRButton.isChecked();
        boolean isOathkChecked=oathkRButton.isChecked();
        return isIceChecked || isNeedleChecked || isLongclawChecked || isOathkChecked;
    }

    /**
     * This method checks if Q2 is answered
     */
    private boolean isDaenerysChecked() {
        boolean isStormbornChecked=stormbornCBox.isChecked();
        boolean isUnburntChecked=unburntCBox.isChecked();
        boolean isQueenChecked=queenCBox.isChecked();
        boolean isSilverChecked=silverCBox.isChecked();
        return isStormbornChecked || isUnburntChecked || isQueenChecked || isSilverChecked;
    }

    /**
     * This method checks if Q3 is answered
     */
    private boolean isJorahChecked() {
        boolean isPaleChecked=paleButton.isChecked();
        boolean isGrayscaleChecked=grayscaleButton.isChecked();
        boolean isSicknessChecked=springButton.isChecked();
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
        boolean isHighgChecked=highgButton.isChecked();
        boolean isDragonstChecked=dragonstButton.isChecked();
        boolean isSunChecked=sunButton.isChecked();
        boolean isVolChecked=volButton.isChecked();
        return isHighgChecked || isDragonstChecked || isSunChecked || isVolChecked;
    }

    /**
     * This method checks if Q7 is answered
     */
    private boolean isValarChecked() {
        boolean isDieChecked=serveButton.isChecked();
        boolean isTodayChecked=todayButton.isChecked();
        boolean isMdieChecked=dieButton.isChecked();
        boolean isWinChecked=winButton.isChecked();
        return isDieChecked || isTodayChecked || isMdieChecked || isWinChecked;
    }

    /**
     * This method checks if Q8 is answered
     */
    private boolean isVarysChecked() {
        boolean isHoundChecked=houndCBox.isChecked();
        boolean isMountChecked=mountCBox.isChecked();
        boolean isSpiderChecked=spiderCBox.isChecked();
        boolean isEunuchChecked=eunuchCBox.isChecked();
        return isHoundChecked || isMountChecked || isSpiderChecked || isEunuchChecked;
    }

    /**
     * This method checks if Q9 is answered
     */
    private boolean isKingChecked() {
        boolean isAegonChecked=aegonButton.isChecked();
        boolean isAerisChecked=aerisButton.isChecked();
        boolean isAemonChecked=aemonButton.isChecked();
        boolean isRhaegChecked=rhaegarButton.isChecked();
        return isAegonChecked || isAerisChecked || isAemonChecked || isRhaegChecked;
    }

    /**
     * This method checks if Q10 is answered
     */
    private boolean isWeaponChecked() {
        boolean isDragonglassChecked=dragonCBox.isChecked();
        boolean isObsidianChecked=obsidianCBox.isChecked();
        boolean isDragonstoneChecked=dragonstoneCBox.isChecked();
        boolean isValyrianChecked=valyrianCBox.isChecked();
        return isDragonglassChecked || isObsidianChecked || isDragonstoneChecked || isValyrianChecked;
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
     * @param isValyrianChecked/
     * @return total points
     */
    private int calculateScore(boolean isIceChecked, boolean isStormbornChecked,
                               boolean isUnburntChecked, boolean isSilverChecked, boolean isDirewolf, boolean isSunChecked,
                               boolean isGrayscaleChecked, boolean isDieChecked, boolean isSpiderChecked,
                               boolean isEunuchChecked, boolean isAerisChecked, boolean isKingsguard,
                               boolean isDragonglassChecked, boolean isObsidianChecked, boolean isValyrianChecked) {

        int points=0;

        if (isIceChecked) points++;
        if (isStormbornChecked) points++;
        if (isUnburntChecked) points++;
        if (isSilverChecked) points++;
        if (isDirewolf) points++;
        if (isSunChecked) points++;
        if (isGrayscaleChecked) points++;
        if (isDieChecked) points++;
        if (isSpiderChecked) points++;
        if (isEunuchChecked) points++;
        if (isAerisChecked) points++;
        if (isKingsguard) points++;
        if (isDragonglassChecked) points++;
        if (isObsidianChecked) points++;
        if (isValyrianChecked) points++;

        return points;
    }

    /**
     * This method is called when the "submit" button is clicked."
     */
    public void showScore(View v) {
        boolean isIceChecked=iceRButton.isChecked();
        boolean isStormbornChecked=stormbornCBox.isChecked();
        boolean isUnburntChecked=unburntCBox.isChecked();
        boolean isSilverChecked=silverCBox.isChecked();
        boolean isGrayscaleChecked=grayscaleButton.isChecked();
        String dWname=dwName.getText().toString();
        String guardNum=guardNumber.getText().toString();
        boolean isSunChecked=sunButton.isChecked();
        boolean isDieChecked=dieButton.isChecked();
        boolean isSpiderChecked=spiderCBox.isChecked();
        boolean isEunuchChecked=eunuchCBox.isChecked();
        boolean isAerisChecked=aerisButton.isChecked();
        boolean isDragonglassChecked=dragonCBox.isChecked();
        boolean isObsidianChecked=obsidianCBox.isChecked();
        boolean isValyrianChecked=valyrianCBox.isChecked();
        int points=calculateScore(isIceChecked, isStormbornChecked, isUnburntChecked, isSilverChecked, isGrayscaleChecked, isDirewolf(dWname), isSunChecked, isDieChecked, isSpiderChecked, isEunuchChecked, isAerisChecked, isKingsguard(guardNum), isDragonglassChecked, isObsidianChecked, isValyrianChecked);

        if (isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked()) && points == 15)
            Toast.makeText(this, getString(R.string.result4, points), Toast.LENGTH_SHORT).show();
        else if (isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked())&& points >= 11 && points < 15)
            Toast.makeText(this, getString(R.string.result3, points), Toast.LENGTH_LONG).show();
        else if (isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked())&& points >= 5 && points < 11)
            Toast.makeText(this, getString(R.string.result2, points), Toast.LENGTH_LONG).show();
        else if (isQuizChecked(isSwordChecked(), isDaenerysChecked(), isNymeria(dWname), isJorahChecked(), isKnightsNum(guardNum), isMartellChecked(), isValarChecked(), isVarysChecked(), isKingChecked(), isWeaponChecked()) && points < 5 && points >=0)
            Toast.makeText(this, getString(R.string.result1, points), Toast.LENGTH_LONG).show();
        else Toast.makeText(this, getString(R.string.omission), Toast.LENGTH_LONG).show();
    }
}


