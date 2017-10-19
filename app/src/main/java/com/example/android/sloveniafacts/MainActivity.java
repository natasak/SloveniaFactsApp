package com.example.android.sloveniafacts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int result = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void onRadioButtonContinent() {
        // Is the button "Asia" selected?
        RadioButton asiaRadioButton = (RadioButton) findViewById(R.id.asia_radio_button);
        boolean isAsia = asiaRadioButton.isChecked();

        // Is the button "Europe" selected?
        RadioButton europeRadioButton = (RadioButton) findViewById(R.id.europe_radio_button);
        boolean isEurope = europeRadioButton.isChecked();

        // Is the button "South America" selected?
        RadioButton samericaRadioButton = (RadioButton) findViewById(R.id.south_america_radio_button);
        boolean isSouthAmerica = samericaRadioButton.isChecked();

        if (isEurope) {
            result += 1;
        }
    }

    /**
     * INPUT CAPITAL:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void inputCapital() {
        // added input Capital
        EditText capitalText = (EditText) findViewById(R.id.capital_name_field);
        String capital = capitalText.getText().toString();

        if (capital.equals("Ljubljana")) {
            result += 1;
        }
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void onRadioButtonPopulation() {
        // Is the button "2 million" selected?
        RadioButton mil2RadioButton = (RadioButton) findViewById(R.id.mio2_radio_button);
        boolean is2mio = mil2RadioButton.isChecked();

        // Is the button "5 million" selected?
        RadioButton mil5RadioButton = (RadioButton) findViewById(R.id.mio5_radio_button);
        boolean is5mio = mil5RadioButton.isChecked();

        // Is the button "10 million" selected?
        RadioButton mil10RadioButton = (RadioButton) findViewById(R.id.mio10_radio_button);
        boolean is10mio = mil10RadioButton.isChecked();

        if (is2mio) {
            result += 1;
        }
    }

    /**
     * CHECKBOX:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void onCheckBoxLandscape() {
        // Is the button "sea" selected?
        CheckBox seaCheckbox = (CheckBox) findViewById(R.id.sea_checkbox);
        boolean isSea = seaCheckbox.isChecked();

        // Is the button "desert" selected?
        CheckBox desertCheckbox = (CheckBox) findViewById(R.id.desert_checkbox);
        boolean isDesert = desertCheckbox.isChecked();

        // Is the button "alps" selected?
        CheckBox alpsCheckbox = (CheckBox) findViewById(R.id.alps_checkbox);
        boolean isAlps = alpsCheckbox.isChecked();

        // Is the button "jungle" selected?
        CheckBox jungleCheckbox = (CheckBox) findViewById(R.id.jungle_checkbox);
        boolean isJungle = jungleCheckbox.isChecked();

        // Is the button "caves" selected?
        CheckBox cavesCheckbox = (CheckBox) findViewById(R.id.caves_checkbox);
        boolean isCaves = cavesCheckbox.isChecked();

        if (isSea && isAlps && isCaves && !isDesert && !isJungle) {
            result += 1;
        }
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void onRadioButtonForest() {
        // Is the button "10 %" selected?
        RadioButton forest10RadioButton = (RadioButton) findViewById(R.id.forest10_radio_button);
        boolean isForest10 = forest10RadioButton.isChecked();

        // Is the button "30 %" selected?
        RadioButton forest30RadioButton = (RadioButton) findViewById(R.id.forest30_radio_button);
        boolean isForest30 = forest30RadioButton.isChecked();

        // Is the button "60 %" selected?
        RadioButton forest60RadioButton = (RadioButton) findViewById(R.id.forest60_radio_button);
        boolean isForest60 = forest60RadioButton.isChecked();

        // Is the button "80 %" selected?
        RadioButton forest80RadioButton = (RadioButton) findViewById(R.id.forest80_radio_button);
        boolean isForest80 = forest80RadioButton.isChecked();

        if (isForest60) {
            result += 1;
        }
    }

    /**
     * RADIO BUTTON:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void onRadioButtonSeasons() {
        // Is the button "Summer all year" selected?
        RadioButton summerRadioButton = (RadioButton) findViewById(R.id.summer_radio_button);
        boolean isSummer = summerRadioButton.isChecked();

        // Is the button "All seasons, hot" selected?
        RadioButton seasonsHotRadioButton = (RadioButton) findViewById(R.id.seasons_hot_radio_button);
        boolean isSeasonsHot = seasonsHotRadioButton.isChecked();

        // Is the button "All seasons, normal" selected?
        RadioButton seasonsNormalRadioButton = (RadioButton) findViewById(R.id.seasons_normal_radio_button);
        boolean isSeasonsNormal = seasonsNormalRadioButton.isChecked();

        // Is the button "Winter all year" selected?
        RadioButton winterRadioButton = (RadioButton) findViewById(R.id.winter_radio_button);
        boolean isWinter = winterRadioButton.isChecked();

        if (isSeasonsNormal) {
            result += 1;
        }
    }

    /**
     * CHECKBOX:
     * This method is called when the results button is clicked. It checks the right result.
     */
    public void onCheckBoxFood() {
        // Is the button "potica" selected?
        CheckBox poticaCheckbox = (CheckBox) findViewById(R.id.potica_checkbox);
        boolean isPotica = poticaCheckbox.isChecked();

        // Is the button "pizza" selected?
        CheckBox pizzaCheckbox = (CheckBox) findViewById(R.id.pizza_checkbox);
        boolean isPizza = pizzaCheckbox.isChecked();

        // Is the button "cepelinai" selected?
        CheckBox cepelinaiCheckbox = (CheckBox) findViewById(R.id.cepelinai_checkbox);
        boolean isCepelinai = cepelinaiCheckbox.isChecked();

        // Is the button "zlinkrofi" selected?
        CheckBox zlinkrofiCheckbox = (CheckBox) findViewById(R.id.zlinkrofi_checkbox);
        boolean isZlinkrofi = zlinkrofiCheckbox.isChecked();

        // Is the button "carniolan sausage" selected?
        CheckBox sausageCheckbox = (CheckBox) findViewById(R.id.carniolan_sausage_checkbox);
        boolean isSausage = sausageCheckbox.isChecked();

        // Is the button "borscht" selected?
        CheckBox borschtCheckbox = (CheckBox) findViewById(R.id.borscht_checkbox);
        boolean isBorscht = borschtCheckbox.isChecked();

        if (isPotica && isZlinkrofi && isSausage && !isPizza && !isCepelinai && !isBorscht) {
            result += 1;
        }
    }

    /**
     * This method is called when the "results" button is clicked.
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

        //display toast of results via toast
        Toast.makeText(this, "SCORE: " + result, Toast.LENGTH_LONG).show();

        //after display set result to 0, so you can change your selections and get another score
        result = 0;
    }

    /**
     * This method is called when the "send email" button is clicked.
     */
    public void sendEmail(View view) {
        //make a summary of answers and send via email app
    }


}
