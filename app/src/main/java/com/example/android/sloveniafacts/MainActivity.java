package com.example.android.sloveniafacts;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

/**
 * SOURCE of the header image:
 * http://www.diplomatic-corporate-services.si/uploads/diplomatic-corporate-services.si_dev/slovenia1.jpg
 * 19th october 2017
 */


public class MainActivity extends AppCompatActivity {

    int result = 0;
    private RatingBar simpleRatingBar;
    private RadioButton asiaRadioButton, europeRadioButton, samericaRadioButton, mil2RadioButton, mil5RadioButton,
            mil10RadioButton, forest10RadioButton, forest30RadioButton, forest60RadioButton, forest80RadioButton,
            summerRadioButton, seasonsHotRadioButton, seasonsNormalRadioButton, winterRadioButton;
    private EditText capitalText;
    private CheckBox seaCheckbox, desertCheckbox, alpsCheckbox, cavesCheckbox, jungleCheckbox, poticaCheckbox,
            pizzaCheckbox, cepelinaiCheckbox, zlinkrofiCheckbox, sausageCheckbox, borschtCheckbox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize all the view variables here:
        // initialize rating bar view
        simpleRatingBar = (RatingBar) findViewById(R.id.rating_bar);

        // initialize radio buttons for question 1
        asiaRadioButton = (RadioButton) findViewById(R.id.asia_radio_button);
        europeRadioButton = (RadioButton) findViewById(R.id.europe_radio_button);
        samericaRadioButton = (RadioButton) findViewById(R.id.south_america_radio_button);

        // initialize EditText view for input of the capital, question 2
        capitalText = (EditText) findViewById(R.id.capital_name_field);

        // initialize radio buttons for question 3
        mil2RadioButton = (RadioButton) findViewById(R.id.mio2_radio_button);
        mil5RadioButton = (RadioButton) findViewById(R.id.mio5_radio_button);
        mil10RadioButton = (RadioButton) findViewById(R.id.mio10_radio_button);

        // initialize checkbox buttons for question 4
        seaCheckbox = (CheckBox) findViewById(R.id.sea_checkbox);
        desertCheckbox = (CheckBox) findViewById(R.id.desert_checkbox);
        alpsCheckbox = (CheckBox) findViewById(R.id.alps_checkbox);
        cavesCheckbox = (CheckBox) findViewById(R.id.caves_checkbox);
        jungleCheckbox = (CheckBox) findViewById(R.id.jungle_checkbox);

        // initialize radio buttons for question 5
        forest10RadioButton = (RadioButton) findViewById(R.id.forest10_radio_button);
        forest30RadioButton = (RadioButton) findViewById(R.id.forest30_radio_button);
        forest60RadioButton = (RadioButton) findViewById(R.id.forest60_radio_button);
        forest80RadioButton = (RadioButton) findViewById(R.id.forest80_radio_button);

        // initialize radio buttons for question 6
        summerRadioButton = (RadioButton) findViewById(R.id.summer_radio_button);
        seasonsHotRadioButton = (RadioButton) findViewById(R.id.seasons_hot_radio_button);
        seasonsNormalRadioButton = (RadioButton) findViewById(R.id.seasons_normal_radio_button);
        winterRadioButton = (RadioButton) findViewById(R.id.winter_radio_button);

        // initialize checkbox buttons for question 7
        poticaCheckbox = (CheckBox) findViewById(R.id.potica_checkbox);
        pizzaCheckbox = (CheckBox) findViewById(R.id.pizza_checkbox);
        cepelinaiCheckbox = (CheckBox) findViewById(R.id.cepelinai_checkbox);
        zlinkrofiCheckbox = (CheckBox) findViewById(R.id.zlinkrofi_checkbox);
        sausageCheckbox = (CheckBox) findViewById(R.id.carniolan_sausage_checkbox);
        borschtCheckbox = (CheckBox) findViewById(R.id.borscht_checkbox);
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result for question 1.
     */
    public void onRadioButtonContinent() {
        // Which button is selected
        boolean isAsia = asiaRadioButton.isChecked();
        boolean isEurope = europeRadioButton.isChecked();
        boolean isSouthAmerica = samericaRadioButton.isChecked();

        //if the right button is selected (Europe), increase result for 1
        if (isEurope) {
            result += 1;
        }
    }

    /**
     * INPUT CAPITAL:
     * This method is called when the results button is clicked. It checks the right result for question 2.
     */
    public void inputCapital() {
        // added input Capital
        String capital = capitalText.getText().toString();

        // if the input is "Ljubljana" then increase result for 1
        if (capital.equals(getString(R.string.a2_ljubljana))) {
            result += 1;
        }
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result for question 3.
     */
    public void onRadioButtonPopulation() {
        // Which button is selected?
        boolean is2mio = mil2RadioButton.isChecked();
        boolean is5mio = mil5RadioButton.isChecked();
        boolean is10mio = mil10RadioButton.isChecked();

        //if the right button is selected (2m), increase result for 1
        if (is2mio) {
            result += 1;
        }
    }

    /**
     * CHECKBOX:
     * This method is called when the results button is clicked. It checks the right result for question 4.
     */
    public void onCheckBoxLandscape() {
        // Which buttons are selected?
        boolean isSea = seaCheckbox.isChecked();
        boolean isDesert = desertCheckbox.isChecked();
        boolean isAlps = alpsCheckbox.isChecked();
        boolean isJungle = jungleCheckbox.isChecked();
        boolean isCaves = cavesCheckbox.isChecked();

        //if the right buttons are selected (sea, alps, caves), increase result for 1
        if (isSea && isAlps && isCaves && !isDesert && !isJungle) {
            result += 1;
        }
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result for question 5.
     */
    public void onRadioButtonForest() {
        // Which button is selected?
        boolean isForest10 = forest10RadioButton.isChecked();
        boolean isForest30 = forest30RadioButton.isChecked();
        boolean isForest60 = forest60RadioButton.isChecked();
        boolean isForest80 = forest80RadioButton.isChecked();

        //if the right button is selected (60 %), increase result for 1
        if (isForest60) {
            result += 1;
        }
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result for question 6.
     */
    public void onRadioButtonSeasons() {
        // Which button is selected?
        boolean isSummer = summerRadioButton.isChecked();
        boolean isSeasonsHot = seasonsHotRadioButton.isChecked();
        boolean isSeasonsNormal = seasonsNormalRadioButton.isChecked();
        boolean isWinter = winterRadioButton.isChecked();

        //if the right button is selected (seasons normal), increase result for 1
        if (isSeasonsNormal) {
            result += 1;
        }
    }

    /**
     * CHECKBOX:
     * This method is called when the results button is clicked. It checks the right result for question 7.
     */
    public void onCheckBoxFood() {
        // Which buttons are selected?
        boolean isPotica = poticaCheckbox.isChecked();
        boolean isPizza = pizzaCheckbox.isChecked();
        boolean isCepelinai = cepelinaiCheckbox.isChecked();
        boolean isZlinkrofi = zlinkrofiCheckbox.isChecked();
        boolean isSausage = sausageCheckbox.isChecked();
        boolean isBorscht = borschtCheckbox.isChecked();

        //if the right buttons are selected (potica, zlinkrofi, sausage), increase result for 1
        if (isPotica && isZlinkrofi && isSausage && !isPizza && !isCepelinai && !isBorscht) {
            result += 1;
        }
    }

    /**
     * This method is called when the "results" button is clicked. Displays a toast with results.
     */
    public void seeResults(View view) {
        //call all methods and update result
        onRadioButtonContinent();
        inputCapital();
        onRadioButtonPopulation();
        onCheckBoxLandscape();
        onRadioButtonForest();
        onRadioButtonSeasons();
        onCheckBoxFood();
        rate();

        //display toast of results via toast
        Toast.makeText(this, getString(R.string.score) + result + getString(R.string.of7), Toast.LENGTH_LONG).show();

        //after display set result to 0, so you can change your selections and get another score
        result = 0;
    }

    /**
     * This method is called when the "send email" button is clicked.
     */
    public void sendEmail(View view) {
        //make a summary of answers and send via email app
        String subject = getString(R.string.emailSubject);
        String answers = createAnswers();
        composeEmail(subject, answers);

    }

    /**
     * Method for displaying the answers. POPRAVI STRINGE!!!
     */
    public String createAnswers() {
        String answers = getString(R.string.answersHeader);
        answers += "\n" + "1. " + getString(R.string.a1_radio_b);
        answers += "\n" + "2. " + getString(R.string.a2_ljubljana);
        answers += "\n" + "3. " + getString(R.string.a3_radio_a_correct);
        answers += "\n" + "4. " + getString(R.string.a4_chk_a) + getString(R.string.a4_chk_c) + getString(R.string.a4_chk_e);
        answers += "\n" + "5. " + getString(R.string.a5_radio_c);
        answers += "\n" + "6. " + getString(R.string.a6_radio_c);
        // Potica, Žlinkrofi, Carniolan Sausage
        answers += "\n" + "7. " + getString(R.string.a7_chk_a) + getString(R.string.a7_chk_d) + getString(R.string.a7_chk_e);
        answers += "\n";
        if (rate() > 4) {
            answers += "\n" + getString(R.string.ratedText) + rate() + getString(R.string.ratedHigh);
        } else if (rate() < 3) {
            answers += "\n" + getString(R.string.ratedText) + rate() + getString(R.string.ratedLow);
        } else {
            answers += "\n" + getString(R.string.ratedText) + rate() + getString(R.string.ratedMiddle);
        }
        return answers;

    }

    /**
     * This method opens the email app and display subject and order summary.
     */
    public void composeEmail(String subject, String text) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);
        intent.putExtra(Intent.EXTRA_TEXT, text);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    /**
     * Method for selecting the number of stars - RatingBar.
     */
    public int rate() {
        // get values
        return (int)simpleRatingBar.getRating();
    }


}
