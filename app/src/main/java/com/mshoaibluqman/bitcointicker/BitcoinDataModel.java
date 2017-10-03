package com.mshoaibluqman.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by muhammadirfan on 03/10/2017.
 */

public class BitcoinDataModel {

    private String currency;

    public static BitcoinDataModel fromJson(JSONObject object){

        BitcoinDataModel bitcoinDataModel = new BitcoinDataModel();

        try {
            bitcoinDataModel.currency = object.getString("ask");

            return bitcoinDataModel;
        }
        catch (JSONException e){

            e.printStackTrace();

            return null;

        }
    }

    public String getCurrency() {
        return currency;
    }
}
