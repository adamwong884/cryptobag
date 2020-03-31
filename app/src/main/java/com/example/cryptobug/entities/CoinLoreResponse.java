
package com.example.cryptobug.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.example.cryptobug.entities.Info;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CoinLoreResponse implements Serializable {

//This is used to represent the data structure of the app
    //Need to insert the hard clean string of the coins from postwoman.io
    @SerializedName("data")
    @Expose
    //Coin list database
    private List<Coin> data = new ArrayList<Coin>();
    @SerializedName("info")
    @Expose
    private Info info;

    public CoinLoreResponse(List<Coin> data, Info info){
        super();
        this.data=data;
        this.info = info;
    }
    public List<Coin> getData() {
        return data;
    }

    public void setData(List<Coin> data) {
        this.data = data;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public static String json = "{\n" +
            "  \"data\": [\n" +
            "    {\n" +
            "      \"id\": \"90\",\n" +
            "      \"symbol\": \"BTC\",\n" +
            "      \"name\": \"Bitcoin\",\n" +
            "      \"nameid\": \"bitcoin\",\n" +
            "      \"rank\": 1,\n" +
            "      \"price_usd\": \"6408.56\",\n" +
            "      \"percent_change_24h\": \"6.62\",\n" +
            "      \"percent_change_1h\": \"-0.85\",\n" +
            "      \"percent_change_7d\": \"1.41\",\n" +
            "      \"price_btc\": \"1.00\",\n" +
            "      \"market_cap_usd\": \"117155919644.83\",\n" +
            "      \"volume24\": 28556523814.322037,\n" +
            "      \"volume24a\": 22130797276.757576,\n" +
            "      \"csupply\": \"18281159.00\",\n" +
            "      \"tsupply\": \"18281159\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"80\",\n" +
            "      \"symbol\": \"ETH\",\n" +
            "      \"name\": \"Ethereum\",\n" +
            "      \"nameid\": \"ethereum\",\n" +
            "      \"rank\": 2,\n" +
            "      \"price_usd\": \"131.37\",\n" +
            "      \"percent_change_24h\": \"3.19\",\n" +
            "      \"percent_change_1h\": \"-1.01\",\n" +
            "      \"percent_change_7d\": \"-0.40\",\n" +
            "      \"price_btc\": \"0.020455\",\n" +
            "      \"market_cap_usd\": \"14476516516.08\",\n" +
            "      \"volume24\": 9738498596.479986,\n" +
            "      \"volume24a\": 8208546651.007197,\n" +
            "      \"csupply\": \"110196485.00\",\n" +
            "      \"tsupply\": \"110196485\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"58\",\n" +
            "      \"symbol\": \"XRP\",\n" +
            "      \"name\": \"XRP\",\n" +
            "      \"nameid\": \"ripple\",\n" +
            "      \"rank\": 3,\n" +
            "      \"price_usd\": \"0.171184\",\n" +
            "      \"percent_change_24h\": \"2.37\",\n" +
            "      \"percent_change_1h\": \"-0.75\",\n" +
            "      \"percent_change_7d\": \"8.87\",\n" +
            "      \"price_btc\": \"0.000027\",\n" +
            "      \"market_cap_usd\": \"7345420663.91\",\n" +
            "      \"volume24\": 1585251755.170289,\n" +
            "      \"volume24a\": 1520234029.598583,\n" +
            "      \"csupply\": \"42909539227.00\",\n" +
            "      \"tsupply\": \"99991841593\",\n" +
            "      \"msupply\": \"100000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"518\",\n" +
            "      \"symbol\": \"USDT\",\n" +
            "      \"name\": \"Tether\",\n" +
            "      \"nameid\": \"tether\",\n" +
            "      \"rank\": 4,\n" +
            "      \"price_usd\": \"1.00\",\n" +
            "      \"percent_change_24h\": \"-0.59\",\n" +
            "      \"percent_change_1h\": \"0.02\",\n" +
            "      \"percent_change_7d\": \"-0.21\",\n" +
            "      \"price_btc\": \"0.000156\",\n" +
            "      \"market_cap_usd\": \"4058069907.53\",\n" +
            "      \"volume24\": 34573631350.60928,\n" +
            "      \"volume24a\": 26763194050.266853,\n" +
            "      \"csupply\": \"4049107372.00\",\n" +
            "      \"tsupply\": \"4049107372\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2321\",\n" +
            "      \"symbol\": \"BCH\",\n" +
            "      \"name\": \"Bitcoin Cash\",\n" +
            "      \"nameid\": \"bitcoin-cash\",\n" +
            "      \"rank\": 5,\n" +
            "      \"price_usd\": \"217.81\",\n" +
            "      \"percent_change_24h\": \"3.48\",\n" +
            "      \"percent_change_1h\": \"-1.03\",\n" +
            "      \"percent_change_7d\": \"-0.52\",\n" +
            "      \"price_btc\": \"0.033914\",\n" +
            "      \"market_cap_usd\": \"3995483258.48\",\n" +
            "      \"volume24\": 2174892908.439592,\n" +
            "      \"volume24a\": 1918430548.5716565,\n" +
            "      \"csupply\": \"18343840.00\",\n" +
            "      \"tsupply\": \"18343840\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33234\",\n" +
            "      \"symbol\": \"BCHSV\",\n" +
            "      \"name\": \"Bitcoin SV\",\n" +
            "      \"nameid\": \"bitcoin-cash-sv\",\n" +
            "      \"rank\": 6,\n" +
            "      \"price_usd\": \"164.07\",\n" +
            "      \"percent_change_24h\": \"7.58\",\n" +
            "      \"percent_change_1h\": \"-1.80\",\n" +
            "      \"percent_change_7d\": \"-3.48\",\n" +
            "      \"price_btc\": \"0.025547\",\n" +
            "      \"market_cap_usd\": \"3009253417.02\",\n" +
            "      \"volume24\": 1825756406.210415,\n" +
            "      \"volume24a\": 1226949466.6243434,\n" +
            "      \"csupply\": \"18341277.00\",\n" +
            "      \"tsupply\": \"21000000\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"1\",\n" +
            "      \"symbol\": \"LTC\",\n" +
            "      \"name\": \"Litecoin\",\n" +
            "      \"nameid\": \"litecoin\",\n" +
            "      \"rank\": 7,\n" +
            "      \"price_usd\": \"38.72\",\n" +
            "      \"percent_change_24h\": \"2.84\",\n" +
            "      \"percent_change_1h\": \"-0.40\",\n" +
            "      \"percent_change_7d\": \"0.24\",\n" +
            "      \"price_btc\": \"0.006029\",\n" +
            "      \"market_cap_usd\": \"2502257017.11\",\n" +
            "      \"volume24\": 2876442045.4507246,\n" +
            "      \"volume24a\": 2087268648.9569452,\n" +
            "      \"csupply\": \"64619858.00\",\n" +
            "      \"tsupply\": \"64619858\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2679\",\n" +
            "      \"symbol\": \"EOS\",\n" +
            "      \"name\": \"EOS\",\n" +
            "      \"nameid\": \"eos\",\n" +
            "      \"rank\": 8,\n" +
            "      \"price_usd\": \"2.21\",\n" +
            "      \"percent_change_24h\": \"3.16\",\n" +
            "      \"percent_change_1h\": \"-0.71\",\n" +
            "      \"percent_change_7d\": \"-2.66\",\n" +
            "      \"price_btc\": \"0.000344\",\n" +
            "      \"market_cap_usd\": \"2052979251.34\",\n" +
            "      \"volume24\": 2260999031.7142034,\n" +
            "      \"volume24a\": 1634840956.6758404,\n" +
            "      \"csupply\": \"929000281.00\",\n" +
            "      \"tsupply\": \"1006245120\",\n" +
            "      \"msupply\": \"1006245120\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2710\",\n" +
            "      \"symbol\": \"BNB\",\n" +
            "      \"name\": \"Binance Coin\",\n" +
            "      \"nameid\": \"binance-coin\",\n" +
            "      \"rank\": 9,\n" +
            "      \"price_usd\": \"12.19\",\n" +
            "      \"percent_change_24h\": \"4.88\",\n" +
            "      \"percent_change_1h\": \"-0.60\",\n" +
            "      \"percent_change_7d\": \"1.12\",\n" +
            "      \"price_btc\": \"0.001898\",\n" +
            "      \"market_cap_usd\": \"1895975826.31\",\n" +
            "      \"volume24\": 245119097.4278584,\n" +
            "      \"volume24a\": 177304379.68967387,\n" +
            "      \"csupply\": \"155536713.00\",\n" +
            "      \"tsupply\": \"192443301\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3682\",\n" +
            "      \"symbol\": \"XTZ\",\n" +
            "      \"name\": \"Tezos\",\n" +
            "      \"nameid\": \"tezos\",\n" +
            "      \"rank\": 10,\n" +
            "      \"price_usd\": \"1.58\",\n" +
            "      \"percent_change_24h\": \"3.30\",\n" +
            "      \"percent_change_1h\": \"-1.08\",\n" +
            "      \"percent_change_7d\": \"-3.58\",\n" +
            "      \"price_btc\": \"0.000245\",\n" +
            "      \"market_cap_usd\": \"1040603232.61\",\n" +
            "      \"volume24\": 75657941.4104432,\n" +
            "      \"volume24a\": 60179418.15923757,\n" +
            "      \"csupply\": \"660373612.00\",\n" +
            "      \"tsupply\": \"763306930\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33833\",\n" +
            "      \"symbol\": \"LEO\",\n" +
            "      \"name\": \"UNUS SED LEO\",\n" +
            "      \"nameid\": \"unus-sed-leo\",\n" +
            "      \"rank\": 11,\n" +
            "      \"price_usd\": \"1.04\",\n" +
            "      \"percent_change_24h\": \"1.60\",\n" +
            "      \"percent_change_1h\": \"-0.46\",\n" +
            "      \"percent_change_7d\": \"0.83\",\n" +
            "      \"price_btc\": \"0.000161\",\n" +
            "      \"market_cap_usd\": \"1034704026.56\",\n" +
            "      \"volume24\": 2312429.586598734,\n" +
            "      \"volume24a\": 1370164.9197657115,\n" +
            "      \"csupply\": \"999498893.00\",\n" +
            "      \"tsupply\": \"999498893\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"89\",\n" +
            "      \"symbol\": \"XLM\",\n" +
            "      \"name\": \"Stellar\",\n" +
            "      \"nameid\": \"stellar\",\n" +
            "      \"rank\": 12,\n" +
            "      \"price_usd\": \"0.040185\",\n" +
            "      \"percent_change_24h\": \"3.62\",\n" +
            "      \"percent_change_1h\": \"-0.41\",\n" +
            "      \"percent_change_7d\": \"2.48\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"815086233.25\",\n" +
            "      \"volume24\": 265593891.45352867,\n" +
            "      \"volume24a\": 235979433.67587277,\n" +
            "      \"csupply\": \"20283516588.00\",\n" +
            "      \"tsupply\": \"104303927518\",\n" +
            "      \"msupply\": \"104303927518\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"28\",\n" +
            "      \"symbol\": \"XMR\",\n" +
            "      \"name\": \"Monero\",\n" +
            "      \"nameid\": \"monero\",\n" +
            "      \"rank\": 13,\n" +
            "      \"price_usd\": \"46.44\",\n" +
            "      \"percent_change_24h\": \"3.71\",\n" +
            "      \"percent_change_1h\": \"-0.09\",\n" +
            "      \"percent_change_7d\": \"9.96\",\n" +
            "      \"price_btc\": \"0.007231\",\n" +
            "      \"market_cap_usd\": \"797540286.96\",\n" +
            "      \"volume24\": 116624678.06203409,\n" +
            "      \"volume24a\": 104917893.13802208,\n" +
            "      \"csupply\": \"17174299.00\",\n" +
            "      \"tsupply\": \"17174299\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"257\",\n" +
            "      \"symbol\": \"ADA\",\n" +
            "      \"name\": \"Cardano\",\n" +
            "      \"nameid\": \"cardano\",\n" +
            "      \"rank\": 14,\n" +
            "      \"price_usd\": \"0.029616\",\n" +
            "      \"percent_change_24h\": \"3.39\",\n" +
            "      \"percent_change_1h\": \"-1.07\",\n" +
            "      \"percent_change_7d\": \"2.36\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"767851340.74\",\n" +
            "      \"volume24\": 71633246.84089339,\n" +
            "      \"volume24a\": 62613717.8090829,\n" +
            "      \"csupply\": \"25927070538.00\",\n" +
            "      \"tsupply\": \"31112483745\",\n" +
            "      \"msupply\": \"45000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2713\",\n" +
            "      \"symbol\": \"TRX\",\n" +
            "      \"name\": \"TRON\",\n" +
            "      \"nameid\": \"tron\",\n" +
            "      \"rank\": 15,\n" +
            "      \"price_usd\": \"0.011412\",\n" +
            "      \"percent_change_24h\": \"4.11\",\n" +
            "      \"percent_change_1h\": \"-0.76\",\n" +
            "      \"percent_change_7d\": \"1.56\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"760985512.12\",\n" +
            "      \"volume24\": 781154582.2773223,\n" +
            "      \"volume24a\": 701083447.780623,\n" +
            "      \"csupply\": \"66682072191.00\",\n" +
            "      \"tsupply\": \"99000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2751\",\n" +
            "      \"symbol\": \"LINK\",\n" +
            "      \"name\": \"ChainLink\",\n" +
            "      \"nameid\": \"chainlink\",\n" +
            "      \"rank\": 16,\n" +
            "      \"price_usd\": \"2.13\",\n" +
            "      \"percent_change_24h\": \"3.57\",\n" +
            "      \"percent_change_1h\": \"-0.36\",\n" +
            "      \"percent_change_7d\": \"-1.88\",\n" +
            "      \"price_btc\": \"0.000332\",\n" +
            "      \"market_cap_usd\": \"745542457.53\",\n" +
            "      \"volume24\": 183471929.46828902,\n" +
            "      \"volume24a\": 149914102.68588802,\n" +
            "      \"csupply\": \"350000000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000 \"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"8\",\n" +
            "      \"symbol\": \"DASH\",\n" +
            "      \"name\": \"Dash\",\n" +
            "      \"nameid\": \"dash\",\n" +
            "      \"rank\": 17,\n" +
            "      \"price_usd\": \"65.10\",\n" +
            "      \"percent_change_24h\": \"4.32\",\n" +
            "      \"percent_change_1h\": \"-1.02\",\n" +
            "      \"percent_change_7d\": \"-5.26\",\n" +
            "      \"price_btc\": \"0.010136\",\n" +
            "      \"market_cap_usd\": \"611475379.11\",\n" +
            "      \"volume24\": 518679410.6713551,\n" +
            "      \"volume24a\": 457468650.2708539,\n" +
            "      \"csupply\": \"9393253.00\",\n" +
            "      \"tsupply\": \"9393253\",\n" +
            "      \"msupply\": \"18900000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"118\",\n" +
            "      \"symbol\": \"ETC\",\n" +
            "      \"name\": \"Ethereum Classic\",\n" +
            "      \"nameid\": \"ethereum-classic\",\n" +
            "      \"rank\": 18,\n" +
            "      \"price_usd\": \"4.93\",\n" +
            "      \"percent_change_24h\": \"1.47\",\n" +
            "      \"percent_change_1h\": \"-0.45\",\n" +
            "      \"percent_change_7d\": \"-0.19\",\n" +
            "      \"price_btc\": \"0.000768\",\n" +
            "      \"market_cap_usd\": \"556937540.10\",\n" +
            "      \"volume24\": 1485539685.1520617,\n" +
            "      \"volume24a\": 1463258504.8372257,\n" +
            "      \"csupply\": \"112980348.00\",\n" +
            "      \"tsupply\": \"112980348\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33538\",\n" +
            "      \"symbol\": \"MIN\",\n" +
            "      \"name\": \"MINDOL\",\n" +
            "      \"nameid\": \"mindol\",\n" +
            "      \"rank\": 19,\n" +
            "      \"price_usd\": \"3.13\",\n" +
            "      \"percent_change_24h\": \"1.94\",\n" +
            "      \"percent_change_1h\": \"6.62\",\n" +
            "      \"percent_change_7d\": \"5.36\",\n" +
            "      \"price_btc\": \"0.000487\",\n" +
            "      \"market_cap_usd\": \"485864854.76\",\n" +
            "      \"volume24\": 817342.3407165325,\n" +
            "      \"volume24a\": 816989.8276193374,\n" +
            "      \"csupply\": \"155379617.00\",\n" +
            "      \"tsupply\": \"240000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33608\",\n" +
            "      \"symbol\": \"HEDG\",\n" +
            "      \"name\": \"HedgeTrade\",\n" +
            "      \"nameid\": \"hedgetrade\",\n" +
            "      \"rank\": 20,\n" +
            "      \"price_usd\": \"1.62\",\n" +
            "      \"percent_change_24h\": \"2.83\",\n" +
            "      \"percent_change_1h\": \"-1.20\",\n" +
            "      \"percent_change_7d\": \"1.34\",\n" +
            "      \"price_btc\": \"0.000253\",\n" +
            "      \"market_cap_usd\": \"468232551.62\",\n" +
            "      \"volume24\": 463496.5456048754,\n" +
            "      \"volume24a\": 291544.6162060634,\n" +
            "      \"csupply\": \"288393355.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"133\",\n" +
            "      \"symbol\": \"NEO\",\n" +
            "      \"name\": \"Neo\",\n" +
            "      \"nameid\": \"neo\",\n" +
            "      \"rank\": 21,\n" +
            "      \"price_usd\": \"6.58\",\n" +
            "      \"percent_change_24h\": \"3.71\",\n" +
            "      \"percent_change_1h\": \"-0.88\",\n" +
            "      \"percent_change_7d\": \"2.05\",\n" +
            "      \"price_btc\": \"0.001024\",\n" +
            "      \"market_cap_usd\": \"463801904.66\",\n" +
            "      \"volume24\": 395269912.5310729,\n" +
            "      \"volume24a\": 340672716.1379281,\n" +
            "      \"csupply\": \"70538831.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33285\",\n" +
            "      \"symbol\": \"USDC\",\n" +
            "      \"name\": \"USD Coin\",\n" +
            "      \"nameid\": \"usd-coin\",\n" +
            "      \"rank\": 22,\n" +
            "      \"price_usd\": \"0.998815\",\n" +
            "      \"percent_change_24h\": \"-0.13\",\n" +
            "      \"percent_change_1h\": \"0.01\",\n" +
            "      \"percent_change_7d\": \"0.06\",\n" +
            "      \"price_btc\": \"0.000156\",\n" +
            "      \"market_cap_usd\": \"434516839.18\",\n" +
            "      \"volume24\": 230004538.26796147,\n" +
            "      \"volume24a\": 207072168.9291743,\n" +
            "      \"csupply\": \"435032301.00\",\n" +
            "      \"tsupply\": \"435032301\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33819\",\n" +
            "      \"symbol\": \"CRO\",\n" +
            "      \"name\": \"Crypto.com Chain\",\n" +
            "      \"nameid\": \"crypto-com-chain\",\n" +
            "      \"rank\": 23,\n" +
            "      \"price_usd\": \"0.044030\",\n" +
            "      \"percent_change_24h\": \"4.97\",\n" +
            "      \"percent_change_1h\": \"0.99\",\n" +
            "      \"percent_change_7d\": \"11.35\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"408634692.45\",\n" +
            "      \"volume24\": 4991255.914694134,\n" +
            "      \"volume24a\": 5020556.002140824,\n" +
            "      \"csupply\": \"9280821918.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"447\",\n" +
            "      \"symbol\": \"IOTA\",\n" +
            "      \"name\": \"IOTA\",\n" +
            "      \"nameid\": \"iota\",\n" +
            "      \"rank\": 24,\n" +
            "      \"price_usd\": \"0.141343\",\n" +
            "      \"percent_change_24h\": \"4.69\",\n" +
            "      \"percent_change_1h\": \"-0.42\",\n" +
            "      \"percent_change_7d\": \"2.20\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"392868148.84\",\n" +
            "      \"volume24\": 11201346.038094467,\n" +
            "      \"volume24a\": 9883244.029861635,\n" +
            "      \"csupply\": \"2779530283.00\",\n" +
            "      \"tsupply\": \"2779530283\",\n" +
            "      \"msupply\": \"2779530283\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33830\",\n" +
            "      \"symbol\": \"ATOM\",\n" +
            "      \"name\": \"Cosmos\",\n" +
            "      \"nameid\": \"cosmos\",\n" +
            "      \"rank\": 25,\n" +
            "      \"price_usd\": \"1.94\",\n" +
            "      \"percent_change_24h\": \"1.75\",\n" +
            "      \"percent_change_1h\": \"-1.34\",\n" +
            "      \"percent_change_7d\": \"-7.11\",\n" +
            "      \"price_btc\": \"0.000303\",\n" +
            "      \"market_cap_usd\": \"370543906.92\",\n" +
            "      \"volume24\": 100578922.38338304,\n" +
            "      \"volume24a\": 90076289.32094635,\n" +
            "      \"csupply\": \"190688439.00\",\n" +
            "      \"tsupply\": \"237928231\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"70\",\n" +
            "      \"symbol\": \"NEM\",\n" +
            "      \"name\": \"NEM\",\n" +
            "      \"nameid\": \"nem\",\n" +
            "      \"rank\": 26,\n" +
            "      \"price_usd\": \"0.037179\",\n" +
            "      \"percent_change_24h\": \"0.55\",\n" +
            "      \"percent_change_1h\": \"-0.58\",\n" +
            "      \"percent_change_7d\": \"-3.80\",\n" +
            "      \"price_btc\": \"0.000006\",\n" +
            "      \"market_cap_usd\": \"334612775.48\",\n" +
            "      \"volume24\": 29699429.32668582,\n" +
            "      \"volume24a\": 8647410.749493131,\n" +
            "      \"csupply\": \"8999999999.00\",\n" +
            "      \"tsupply\": \"8999999999\",\n" +
            "      \"msupply\": \"8999999999\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"12377\",\n" +
            "      \"symbol\": \"MKR\",\n" +
            "      \"name\": \"Maker\",\n" +
            "      \"nameid\": \"maker\",\n" +
            "      \"rank\": 27,\n" +
            "      \"price_usd\": \"290.83\",\n" +
            "      \"percent_change_24h\": \"0.73\",\n" +
            "      \"percent_change_1h\": \"-2.50\",\n" +
            "      \"percent_change_7d\": \"12.01\",\n" +
            "      \"price_btc\": \"0.045284\",\n" +
            "      \"market_cap_usd\": \"290834997.00\",\n" +
            "      \"volume24\": 3745944.1010007625,\n" +
            "      \"volume24a\": 4073703.6970258593,\n" +
            "      \"csupply\": \"1000000.00\",\n" +
            "      \"tsupply\": \"1000000\",\n" +
            "      \"msupply\": \"1000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"134\",\n" +
            "      \"symbol\": \"ZEC\",\n" +
            "      \"name\": \"Zcash\",\n" +
            "      \"nameid\": \"zcash\",\n" +
            "      \"rank\": 28,\n" +
            "      \"price_usd\": \"30.50\",\n" +
            "      \"percent_change_24h\": \"5.15\",\n" +
            "      \"percent_change_1h\": \"-0.54\",\n" +
            "      \"percent_change_7d\": \"-4.22\",\n" +
            "      \"price_btc\": \"0.004749\",\n" +
            "      \"market_cap_usd\": \"289636526.06\",\n" +
            "      \"volume24\": 358327049.609056,\n" +
            "      \"volume24a\": 231126054.62751415,\n" +
            "      \"csupply\": \"9496456.00\",\n" +
            "      \"tsupply\": \"9496456\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33061\",\n" +
            "      \"symbol\": \"INB\",\n" +
            "      \"name\": \"Insight Chain\",\n" +
            "      \"nameid\": \"insight-chain\",\n" +
            "      \"rank\": 29,\n" +
            "      \"price_usd\": \"0.760700\",\n" +
            "      \"percent_change_24h\": \"5.81\",\n" +
            "      \"percent_change_1h\": \"0.25\",\n" +
            "      \"percent_change_7d\": \"-0.92\",\n" +
            "      \"price_btc\": \"0.000118\",\n" +
            "      \"market_cap_usd\": \"266170975.52\",\n" +
            "      \"volume24\": 17216208.456347965,\n" +
            "      \"volume24a\": 12324779.192896325,\n" +
            "      \"csupply\": \"349902689.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2\",\n" +
            "      \"symbol\": \"DOGE\",\n" +
            "      \"name\": \"Dogecoin\",\n" +
            "      \"nameid\": \"dogecoin\",\n" +
            "      \"rank\": 30,\n" +
            "      \"price_usd\": \"0.001817\",\n" +
            "      \"percent_change_24h\": \"4.73\",\n" +
            "      \"percent_change_1h\": \"-0.52\",\n" +
            "      \"percent_change_7d\": \"1.31\",\n" +
            "      \"price_btc\": \"2.83E-7\",\n" +
            "      \"market_cap_usd\": \"224822606.46\",\n" +
            "      \"volume24\": 125092510.39373222,\n" +
            "      \"volume24a\": 124220184.62114094,\n" +
            "      \"csupply\": \"123727126384.00\",\n" +
            "      \"tsupply\": \"123727126384\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32479\",\n" +
            "      \"symbol\": \"TUSD\",\n" +
            "      \"name\": \"TrueUSD\",\n" +
            "      \"nameid\": \"trueusd\",\n" +
            "      \"rank\": 31,\n" +
            "      \"price_usd\": \"0.997336\",\n" +
            "      \"percent_change_24h\": \"0.09\",\n" +
            "      \"percent_change_1h\": \"-0.12\",\n" +
            "      \"percent_change_7d\": \"-0.04\",\n" +
            "      \"price_btc\": \"0.000155\",\n" +
            "      \"market_cap_usd\": \"194962484.99\",\n" +
            "      \"volume24\": 417177537.29301006,\n" +
            "      \"volume24a\": 314802399.0296392,\n" +
            "      \"csupply\": \"195483256.00\",\n" +
            "      \"tsupply\": \"195483256\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32331\",\n" +
            "      \"symbol\": \"ONT\",\n" +
            "      \"name\": \"Ontology\",\n" +
            "      \"nameid\": \"ontology\",\n" +
            "      \"rank\": 32,\n" +
            "      \"price_usd\": \"0.364502\",\n" +
            "      \"percent_change_24h\": \"1.89\",\n" +
            "      \"percent_change_1h\": \"-1.10\",\n" +
            "      \"percent_change_7d\": \"-1.01\",\n" +
            "      \"price_btc\": \"0.000057\",\n" +
            "      \"market_cap_usd\": \"194455469.16\",\n" +
            "      \"volume24\": 42229869.04340067,\n" +
            "      \"volume24a\": 40439476.22353468,\n" +
            "      \"csupply\": \"533483170.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33820\",\n" +
            "      \"symbol\": \"PAX\",\n" +
            "      \"name\": \"Paxos Standard Token\",\n" +
            "      \"nameid\": \"paxos-standard-token\",\n" +
            "      \"rank\": 33,\n" +
            "      \"price_usd\": \"0.998016\",\n" +
            "      \"percent_change_24h\": \"0.15\",\n" +
            "      \"percent_change_1h\": \"-0.04\",\n" +
            "      \"percent_change_7d\": \"0.04\",\n" +
            "      \"price_btc\": \"0.000155\",\n" +
            "      \"market_cap_usd\": \"193981400.44\",\n" +
            "      \"volume24\": 440225111.8666462,\n" +
            "      \"volume24a\": 620065531.0293145,\n" +
            "      \"csupply\": \"194366961.00\",\n" +
            "      \"tsupply\": \"194366961\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"184\",\n" +
            "      \"symbol\": \"BAT\",\n" +
            "      \"name\": \"Basic Attention Token\",\n" +
            "      \"nameid\": \"basic-attention-token\",\n" +
            "      \"rank\": 34,\n" +
            "      \"price_usd\": \"0.140103\",\n" +
            "      \"percent_change_24h\": \"4.52\",\n" +
            "      \"percent_change_1h\": \"0.18\",\n" +
            "      \"percent_change_7d\": \"6.65\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"179223748.81\",\n" +
            "      \"volume24\": 59910111.538804695,\n" +
            "      \"volume24a\": 50383684.03829164,\n" +
            "      \"csupply\": \"1279225522.00\",\n" +
            "      \"tsupply\": \"1500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32351\",\n" +
            "      \"symbol\": \"HT\",\n" +
            "      \"name\": \"Huobi Token\",\n" +
            "      \"nameid\": \"huobi-token\",\n" +
            "      \"rank\": 35,\n" +
            "      \"price_usd\": \"3.27\",\n" +
            "      \"percent_change_24h\": \"4.82\",\n" +
            "      \"percent_change_1h\": \"-0.51\",\n" +
            "      \"percent_change_7d\": \"-1.37\",\n" +
            "      \"price_btc\": \"0.000509\",\n" +
            "      \"market_cap_usd\": \"163369462.20\",\n" +
            "      \"volume24\": 119098435.78536493,\n" +
            "      \"volume24a\": 112696465.14853232,\n" +
            "      \"csupply\": \"50000200.00\",\n" +
            "      \"tsupply\": \"500000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2741\",\n" +
            "      \"symbol\": \"VET\",\n" +
            "      \"name\": \"VeChain\",\n" +
            "      \"nameid\": \"vechain\",\n" +
            "      \"rank\": 36,\n" +
            "      \"price_usd\": \"0.002935\",\n" +
            "      \"percent_change_24h\": \"2.97\",\n" +
            "      \"percent_change_1h\": \"-0.72\",\n" +
            "      \"percent_change_7d\": \"3.80\",\n" +
            "      \"price_btc\": \"4.57E-7\",\n" +
            "      \"market_cap_usd\": \"162734255.58\",\n" +
            "      \"volume24\": 81179701.8089867,\n" +
            "      \"volume24a\": 67159086.1987086,\n" +
            "      \"csupply\": \"55454734800.00\",\n" +
            "      \"tsupply\": \"86712634466\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"99\",\n" +
            "      \"symbol\": \"DCR\",\n" +
            "      \"name\": \"Decred\",\n" +
            "      \"nameid\": \"decred\",\n" +
            "      \"rank\": 37,\n" +
            "      \"price_usd\": \"11.20\",\n" +
            "      \"percent_change_24h\": \"7.15\",\n" +
            "      \"percent_change_1h\": \"-0.81\",\n" +
            "      \"percent_change_7d\": \"-1.62\",\n" +
            "      \"price_btc\": \"0.001744\",\n" +
            "      \"market_cap_usd\": \"126071910.77\",\n" +
            "      \"volume24\": 66971165.455298685,\n" +
            "      \"volume24a\": 67875009.95331462,\n" +
            "      \"csupply\": \"11255663.00\",\n" +
            "      \"tsupply\": \"11255663\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"285\",\n" +
            "      \"symbol\": \"BTG\",\n" +
            "      \"name\": \"Bitcoin Gold\",\n" +
            "      \"nameid\": \"bitcoingold\",\n" +
            "      \"rank\": 38,\n" +
            "      \"price_usd\": \"7.23\",\n" +
            "      \"percent_change_24h\": \"5.60\",\n" +
            "      \"percent_change_1h\": \"-0.97\",\n" +
            "      \"percent_change_7d\": \"-3.64\",\n" +
            "      \"price_btc\": \"0.001125\",\n" +
            "      \"market_cap_usd\": \"124634524.68\",\n" +
            "      \"volume24\": 17583197.5818001,\n" +
            "      \"volume24a\": 16007023.675800052,\n" +
            "      \"csupply\": \"17248611.00\",\n" +
            "      \"tsupply\": \"17348611\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"108\",\n" +
            "      \"symbol\": \"LSK\",\n" +
            "      \"name\": \"Lisk\",\n" +
            "      \"nameid\": \"lisk\",\n" +
            "      \"rank\": 39,\n" +
            "      \"price_usd\": \"0.966707\",\n" +
            "      \"percent_change_24h\": \"3.04\",\n" +
            "      \"percent_change_1h\": \"-0.85\",\n" +
            "      \"percent_change_7d\": \"-5.46\",\n" +
            "      \"price_btc\": \"0.000151\",\n" +
            "      \"market_cap_usd\": \"115630956.52\",\n" +
            "      \"volume24\": 2621686.1940715555,\n" +
            "      \"volume24a\": 2521673.452399675,\n" +
            "      \"csupply\": \"119613215.00\",\n" +
            "      \"tsupply\": \"125643660\",\n" +
            "      \"msupply\": \"159918400\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"237\",\n" +
            "      \"symbol\": \"QTUM\",\n" +
            "      \"name\": \"Qtum\",\n" +
            "      \"nameid\": \"qtum\",\n" +
            "      \"rank\": 40,\n" +
            "      \"price_usd\": \"1.20\",\n" +
            "      \"percent_change_24h\": \"1.81\",\n" +
            "      \"percent_change_1h\": \"-0.72\",\n" +
            "      \"percent_change_7d\": \"-2.21\",\n" +
            "      \"price_btc\": \"0.000186\",\n" +
            "      \"market_cap_usd\": \"114693304.33\",\n" +
            "      \"volume24\": 332052462.88426656,\n" +
            "      \"volume24a\": 297679803.75143427,\n" +
            "      \"csupply\": \"95969372.00\",\n" +
            "      \"tsupply\": \"100909224\",\n" +
            "      \"msupply\": \"100909224\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"129\",\n" +
            "      \"symbol\": \"REP\",\n" +
            "      \"name\": \"Augur\",\n" +
            "      \"nameid\": \"augur\",\n" +
            "      \"rank\": 41,\n" +
            "      \"price_usd\": \"10.37\",\n" +
            "      \"percent_change_24h\": \"6.84\",\n" +
            "      \"percent_change_1h\": \"1.67\",\n" +
            "      \"percent_change_7d\": \"22.89\",\n" +
            "      \"price_btc\": \"0.001615\",\n" +
            "      \"market_cap_usd\": \"114064510.20\",\n" +
            "      \"volume24\": 10509081.229485866,\n" +
            "      \"volume24a\": 10033863.261588315,\n" +
            "      \"csupply\": \"11000000.00\",\n" +
            "      \"tsupply\": \"11000000\",\n" +
            "      \"msupply\": \"11000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"3708\",\n" +
            "      \"symbol\": \"ICX\",\n" +
            "      \"name\": \"ICON\",\n" +
            "      \"nameid\": \"icon\",\n" +
            "      \"rank\": 42,\n" +
            "      \"price_usd\": \"0.205120\",\n" +
            "      \"percent_change_24h\": \"9.97\",\n" +
            "      \"percent_change_1h\": \"-2.03\",\n" +
            "      \"percent_change_7d\": \"4.56\",\n" +
            "      \"price_btc\": \"0.000032\",\n" +
            "      \"market_cap_usd\": \"100601722.89\",\n" +
            "      \"volume24\": 23488890.354363628,\n" +
            "      \"volume24a\": 12831966.591975935,\n" +
            "      \"csupply\": \"490453303.00\",\n" +
            "      \"tsupply\": \"800460000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33821\",\n" +
            "      \"symbol\": \"ABBC\",\n" +
            "      \"name\": \"ABBC Coin\",\n" +
            "      \"nameid\": \"abbc-coin\",\n" +
            "      \"rank\": 43,\n" +
            "      \"price_usd\": \"0.091135\",\n" +
            "      \"percent_change_24h\": \"3.24\",\n" +
            "      \"percent_change_1h\": \"-0.25\",\n" +
            "      \"percent_change_7d\": \"-4.39\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"91497708.24\",\n" +
            "      \"volume24\": 20232716.47680282,\n" +
            "      \"volume24a\": 15231210.29417259,\n" +
            "      \"csupply\": \"1003981087.00\",\n" +
            "      \"tsupply\": \"1003981087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2729\",\n" +
            "      \"symbol\": \"ZRX\",\n" +
            "      \"name\": \"0x\",\n" +
            "      \"nameid\": \"0x\",\n" +
            "      \"rank\": 44,\n" +
            "      \"price_usd\": \"0.151184\",\n" +
            "      \"percent_change_24h\": \"2.28\",\n" +
            "      \"percent_change_1h\": \"-0.21\",\n" +
            "      \"percent_change_7d\": \"0.58\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"90782457.86\",\n" +
            "      \"volume24\": 11794574.506594876,\n" +
            "      \"volume24a\": 10780217.774799932,\n" +
            "      \"csupply\": \"600475853.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32073\",\n" +
            "      \"symbol\": \"BCD\",\n" +
            "      \"name\": \"Bitcoin Diamond\",\n" +
            "      \"nameid\": \"bitcoin-diamond\",\n" +
            "      \"rank\": 45,\n" +
            "      \"price_usd\": \"0.485410\",\n" +
            "      \"percent_change_24h\": \"8.59\",\n" +
            "      \"percent_change_1h\": \"-1.64\",\n" +
            "      \"percent_change_7d\": \"-1.60\",\n" +
            "      \"price_btc\": \"0.000076\",\n" +
            "      \"market_cap_usd\": \"90525477.52\",\n" +
            "      \"volume24\": 6052269.6965570925,\n" +
            "      \"volume24a\": 5269834.402110865,\n" +
            "      \"csupply\": \"186492898.00\",\n" +
            "      \"tsupply\": \"186492898\",\n" +
            "      \"msupply\": \"210000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2750\",\n" +
            "      \"symbol\": \"KCS\",\n" +
            "      \"name\": \"KuCoin Shares\",\n" +
            "      \"nameid\": \"kucoin-shares\",\n" +
            "      \"rank\": 46,\n" +
            "      \"price_usd\": \"0.957933\",\n" +
            "      \"percent_change_24h\": \"5.71\",\n" +
            "      \"percent_change_1h\": \"0.03\",\n" +
            "      \"percent_change_7d\": \"-16.19\",\n" +
            "      \"price_btc\": \"0.000149\",\n" +
            "      \"market_cap_usd\": \"85012379.48\",\n" +
            "      \"volume24\": 6876733.86388554,\n" +
            "      \"volume24a\": 4177835.4308795603,\n" +
            "      \"csupply\": \"88745681.00\",\n" +
            "      \"tsupply\": \"180730576\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33531\",\n" +
            "      \"symbol\": \"OKB\",\n" +
            "      \"name\": \"OKB\",\n" +
            "      \"nameid\": \"okb\",\n" +
            "      \"rank\": 47,\n" +
            "      \"price_usd\": \"4.24\",\n" +
            "      \"percent_change_24h\": \"5.25\",\n" +
            "      \"percent_change_1h\": \"-0.99\",\n" +
            "      \"percent_change_7d\": \"0.26\",\n" +
            "      \"price_btc\": \"0.000660\",\n" +
            "      \"market_cap_usd\": \"84800909.58\",\n" +
            "      \"volume24\": 230902609.8876907,\n" +
            "      \"volume24a\": 215023580.35751224,\n" +
            "      \"csupply\": \"20000000.00\",\n" +
            "      \"tsupply\": \"300000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"113\",\n" +
            "      \"symbol\": \"WAVES\",\n" +
            "      \"name\": \"Waves\",\n" +
            "      \"nameid\": \"waves\",\n" +
            "      \"rank\": 48,\n" +
            "      \"price_usd\": \"0.822578\",\n" +
            "      \"percent_change_24h\": \"5.56\",\n" +
            "      \"percent_change_1h\": \"-1.16\",\n" +
            "      \"percent_change_7d\": \"-10.35\",\n" +
            "      \"price_btc\": \"0.000128\",\n" +
            "      \"market_cap_usd\": \"82257793.01\",\n" +
            "      \"volume24\": 41003259.6198101,\n" +
            "      \"volume24a\": 35621176.24234934,\n" +
            "      \"csupply\": \"100000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32417\",\n" +
            "      \"symbol\": \"DAI\",\n" +
            "      \"name\": \"Dai\",\n" +
            "      \"nameid\": \"dai\",\n" +
            "      \"rank\": 49,\n" +
            "      \"price_usd\": \"1.02\",\n" +
            "      \"percent_change_24h\": \"-0.63\",\n" +
            "      \"percent_change_1h\": \"-0.07\",\n" +
            "      \"percent_change_7d\": \"-1.17\",\n" +
            "      \"price_btc\": \"0.000159\",\n" +
            "      \"market_cap_usd\": \"79861302.15\",\n" +
            "      \"volume24\": 10752538.954837045,\n" +
            "      \"volume24a\": 9194313.793580303,\n" +
            "      \"csupply\": \"78262606.00\",\n" +
            "      \"tsupply\": \"78262606\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"22\",\n" +
            "      \"symbol\": \"MONA\",\n" +
            "      \"name\": \"MonaCoin\",\n" +
            "      \"nameid\": \"monacoin\",\n" +
            "      \"rank\": 50,\n" +
            "      \"price_usd\": \"1.19\",\n" +
            "      \"percent_change_24h\": \"5.07\",\n" +
            "      \"percent_change_1h\": \"-0.85\",\n" +
            "      \"percent_change_7d\": \"-3.00\",\n" +
            "      \"price_btc\": \"0.000185\",\n" +
            "      \"market_cap_usd\": \"78276431.37\",\n" +
            "      \"volume24\": 4322795.919446471,\n" +
            "      \"volume24a\": 3329729.090578721,\n" +
            "      \"csupply\": \"65729675.00\",\n" +
            "      \"tsupply\": \"65729675\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"211\",\n" +
            "      \"symbol\": \"MCO\",\n" +
            "      \"name\": \"Crypto.com\",\n" +
            "      \"nameid\": \"monaco\",\n" +
            "      \"rank\": 51,\n" +
            "      \"price_usd\": \"4.79\",\n" +
            "      \"percent_change_24h\": \"8.88\",\n" +
            "      \"percent_change_1h\": \"-0.53\",\n" +
            "      \"percent_change_7d\": \"5.98\",\n" +
            "      \"price_btc\": \"0.000745\",\n" +
            "      \"market_cap_usd\": \"75618234.31\",\n" +
            "      \"volume24\": 23158565.763913456,\n" +
            "      \"volume24a\": 29485626.050016634,\n" +
            "      \"csupply\": \"15793831.00\",\n" +
            "      \"tsupply\": \"31587682\",\n" +
            "      \"msupply\": \"31587682.3632061\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33723\",\n" +
            "      \"symbol\": \"SNX\",\n" +
            "      \"name\": \"Synthetix Network Token\",\n" +
            "      \"nameid\": \"synthetix-network-token\",\n" +
            "      \"rank\": 52,\n" +
            "      \"price_usd\": \"0.600029\",\n" +
            "      \"percent_change_24h\": \"6.12\",\n" +
            "      \"percent_change_1h\": \"-0.61\",\n" +
            "      \"percent_change_7d\": \"27.81\",\n" +
            "      \"price_btc\": \"0.000093\",\n" +
            "      \"market_cap_usd\": \"75578994.18\",\n" +
            "      \"volume24\": 1150038.2862743125,\n" +
            "      \"volume24a\": 692189.3973422643,\n" +
            "      \"csupply\": \"125958830.00\",\n" +
            "      \"tsupply\": \"125958830\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2515\",\n" +
            "      \"symbol\": \"KNC\",\n" +
            "      \"name\": \"Kyber Network\",\n" +
            "      \"nameid\": \"kyber-network\",\n" +
            "      \"rank\": 53,\n" +
            "      \"price_usd\": \"0.436798\",\n" +
            "      \"percent_change_24h\": \"1.96\",\n" +
            "      \"percent_change_1h\": \"-0.83\",\n" +
            "      \"percent_change_7d\": \"-3.27\",\n" +
            "      \"price_btc\": \"0.000068\",\n" +
            "      \"market_cap_usd\": \"73322919.28\",\n" +
            "      \"volume24\": 38878370.49410277,\n" +
            "      \"volume24a\": 40415721.626921624,\n" +
            "      \"csupply\": \"167864614.00\",\n" +
            "      \"tsupply\": \"215625349\",\n" +
            "      \"msupply\": \"226000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"232\",\n" +
            "      \"symbol\": \"OMG\",\n" +
            "      \"name\": \"OmiseGO\",\n" +
            "      \"nameid\": \"omisego\",\n" +
            "      \"rank\": 54,\n" +
            "      \"price_usd\": \"0.509795\",\n" +
            "      \"percent_change_24h\": \"5.76\",\n" +
            "      \"percent_change_1h\": \"-0.91\",\n" +
            "      \"percent_change_7d\": \"-0.49\",\n" +
            "      \"price_btc\": \"0.000079\",\n" +
            "      \"market_cap_usd\": \"71496430.51\",\n" +
            "      \"volume24\": 107886729.36477262,\n" +
            "      \"volume24a\": 125221378.7725023,\n" +
            "      \"csupply\": \"140245398.00\",\n" +
            "      \"tsupply\": \"140245398\",\n" +
            "      \"msupply\": \"140245398\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2581\",\n" +
            "      \"symbol\": \"ENJ\",\n" +
            "      \"name\": \"Enjin Coin\",\n" +
            "      \"nameid\": \"enjin-coin\",\n" +
            "      \"rank\": 55,\n" +
            "      \"price_usd\": \"0.091814\",\n" +
            "      \"percent_change_24h\": \"7.54\",\n" +
            "      \"percent_change_1h\": \"-2.22\",\n" +
            "      \"percent_change_7d\": \"26.45\",\n" +
            "      \"price_btc\": \"0.000014\",\n" +
            "      \"market_cap_usd\": \"71273641.20\",\n" +
            "      \"volume24\": 7884135.650387254,\n" +
            "      \"volume24a\": 5457485.208262069,\n" +
            "      \"csupply\": \"776278713.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"207\",\n" +
            "      \"symbol\": \"SNT\",\n" +
            "      \"name\": \"Status Network Token\",\n" +
            "      \"nameid\": \"status\",\n" +
            "      \"rank\": 56,\n" +
            "      \"price_usd\": \"0.018180\",\n" +
            "      \"percent_change_24h\": \"-1.60\",\n" +
            "      \"percent_change_1h\": \"0.66\",\n" +
            "      \"percent_change_7d\": \"17.68\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"63094990.59\",\n" +
            "      \"volume24\": 40516715.37188801,\n" +
            "      \"volume24a\": 54700817.358224,\n" +
            "      \"csupply\": \"3470483788.00\",\n" +
            "      \"tsupply\": \"6804870174\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32386\",\n" +
            "      \"symbol\": \"RVN\",\n" +
            "      \"name\": \"Ravencoin\",\n" +
            "      \"nameid\": \"ravencoin\",\n" +
            "      \"rank\": 57,\n" +
            "      \"price_usd\": \"0.014719\",\n" +
            "      \"percent_change_24h\": \"4.65\",\n" +
            "      \"percent_change_1h\": \"-0.78\",\n" +
            "      \"percent_change_7d\": \"2.46\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"62945767.80\",\n" +
            "      \"volume24\": 8547529.636755556,\n" +
            "      \"volume24a\": 6600962.085854387,\n" +
            "      \"csupply\": \"4276480000.00\",\n" +
            "      \"tsupply\": \"4276480000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2835\",\n" +
            "      \"symbol\": \"NANO\",\n" +
            "      \"name\": \"Nano\",\n" +
            "      \"nameid\": \"nano\",\n" +
            "      \"rank\": 58,\n" +
            "      \"price_usd\": \"0.461940\",\n" +
            "      \"percent_change_24h\": \"3.24\",\n" +
            "      \"percent_change_1h\": \"-0.29\",\n" +
            "      \"percent_change_7d\": \"5.46\",\n" +
            "      \"price_btc\": \"0.000072\",\n" +
            "      \"market_cap_usd\": \"61552776.46\",\n" +
            "      \"volume24\": 2396225.247840834,\n" +
            "      \"volume24a\": 1919484.2218427868,\n" +
            "      \"csupply\": \"133248297.00\",\n" +
            "      \"tsupply\": \"133248297\",\n" +
            "      \"msupply\": \"133248297\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32604\",\n" +
            "      \"symbol\": \"NEXO\",\n" +
            "      \"name\": \"Nexo\",\n" +
            "      \"nameid\": \"nexo\",\n" +
            "      \"rank\": 59,\n" +
            "      \"price_usd\": \"0.106611\",\n" +
            "      \"percent_change_24h\": \"4.24\",\n" +
            "      \"percent_change_1h\": \"-0.35\",\n" +
            "      \"percent_change_7d\": \"3.21\",\n" +
            "      \"price_btc\": \"0.000017\",\n" +
            "      \"market_cap_usd\": \"59702149.46\",\n" +
            "      \"volume24\": 9740114.316565404,\n" +
            "      \"volume24a\": 9807814.385447755,\n" +
            "      \"csupply\": \"560000011.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33071\",\n" +
            "      \"symbol\": \"DX\",\n" +
            "      \"name\": \"DxChain Token\",\n" +
            "      \"nameid\": \"dxchain-token\",\n" +
            "      \"rank\": 60,\n" +
            "      \"price_usd\": \"0.001273\",\n" +
            "      \"percent_change_24h\": \"8.65\",\n" +
            "      \"percent_change_1h\": \"-1.19\",\n" +
            "      \"percent_change_7d\": \"-2.13\",\n" +
            "      \"price_btc\": \"1.98E-7\",\n" +
            "      \"market_cap_usd\": \"58886863.83\",\n" +
            "      \"volume24\": 1434963.4802462508,\n" +
            "      \"volume24a\": 1268107.619151962,\n" +
            "      \"csupply\": \"46250000000.00\",\n" +
            "      \"tsupply\": \"100000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"43\",\n" +
            "      \"symbol\": \"DGB\",\n" +
            "      \"name\": \"Digibyte\",\n" +
            "      \"nameid\": \"digibyte\",\n" +
            "      \"rank\": 61,\n" +
            "      \"price_usd\": \"0.004460\",\n" +
            "      \"percent_change_24h\": \"5.93\",\n" +
            "      \"percent_change_1h\": \"0.14\",\n" +
            "      \"percent_change_7d\": \"30.60\",\n" +
            "      \"price_btc\": \"6.94E-7\",\n" +
            "      \"market_cap_usd\": \"57753805.51\",\n" +
            "      \"volume24\": 898714.5958579296,\n" +
            "      \"volume24a\": 776916.1129813084,\n" +
            "      \"csupply\": \"12950710845.00\",\n" +
            "      \"tsupply\": \"12950710845\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2482\",\n" +
            "      \"symbol\": \"BTM\",\n" +
            "      \"name\": \"Bytom\",\n" +
            "      \"nameid\": \"bytom\",\n" +
            "      \"rank\": 62,\n" +
            "      \"price_usd\": \"0.056714\",\n" +
            "      \"percent_change_24h\": \"-1.76\",\n" +
            "      \"percent_change_1h\": \"-1.01\",\n" +
            "      \"percent_change_7d\": \"3.53\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"56855863.10\",\n" +
            "      \"volume24\": 151176374.89532763,\n" +
            "      \"volume24a\": 113168313.64663392,\n" +
            "      \"csupply\": \"1002499275.00\",\n" +
            "      \"tsupply\": \"1407000000\",\n" +
            "      \"msupply\": \"1407000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"183\",\n" +
            "      \"symbol\": \"SC\",\n" +
            "      \"name\": \"Siacoin\",\n" +
            "      \"nameid\": \"siacoin\",\n" +
            "      \"rank\": 63,\n" +
            "      \"price_usd\": \"0.001252\",\n" +
            "      \"percent_change_24h\": \"2.95\",\n" +
            "      \"percent_change_1h\": \"-0.43\",\n" +
            "      \"percent_change_7d\": \"-3.76\",\n" +
            "      \"price_btc\": \"1.95E-7\",\n" +
            "      \"market_cap_usd\": \"52336734.85\",\n" +
            "      \"volume24\": 2371984.917160082,\n" +
            "      \"volume24a\": 2565851.201833461,\n" +
            "      \"csupply\": \"41817047634.00\",\n" +
            "      \"tsupply\": \"41817047634\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32360\",\n" +
            "      \"symbol\": \"THETA\",\n" +
            "      \"name\": \"Theta Token\",\n" +
            "      \"nameid\": \"theta-token\",\n" +
            "      \"rank\": 64,\n" +
            "      \"price_usd\": \"0.072649\",\n" +
            "      \"percent_change_24h\": \"8.05\",\n" +
            "      \"percent_change_1h\": \"-0.33\",\n" +
            "      \"percent_change_7d\": \"6.06\",\n" +
            "      \"price_btc\": \"0.000011\",\n" +
            "      \"market_cap_usd\": \"51326769.92\",\n" +
            "      \"volume24\": 2026797.1202718052,\n" +
            "      \"volume24a\": 1632737.21754708,\n" +
            "      \"csupply\": \"706502689.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"111\",\n" +
            "      \"symbol\": \"DGD\",\n" +
            "      \"name\": \"DigixDAO\",\n" +
            "      \"nameid\": \"digixdao\",\n" +
            "      \"rank\": 65,\n" +
            "      \"price_usd\": \"25.38\",\n" +
            "      \"percent_change_24h\": \"4.56\",\n" +
            "      \"percent_change_1h\": \"-1.18\",\n" +
            "      \"percent_change_7d\": \"1.87\",\n" +
            "      \"price_btc\": \"0.003952\",\n" +
            "      \"market_cap_usd\": \"50763576.21\",\n" +
            "      \"volume24\": 945743.7369750028,\n" +
            "      \"volume24a\": 876786.1175964195,\n" +
            "      \"csupply\": \"2000000.00\",\n" +
            "      \"tsupply\": \"2000000\",\n" +
            "      \"msupply\": \"2000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"106\",\n" +
            "      \"symbol\": \"STEEM\",\n" +
            "      \"name\": \"STEEM\",\n" +
            "      \"nameid\": \"steem\",\n" +
            "      \"rank\": 66,\n" +
            "      \"price_usd\": \"0.141041\",\n" +
            "      \"percent_change_24h\": \"-0.01\",\n" +
            "      \"percent_change_1h\": \"-0.79\",\n" +
            "      \"percent_change_7d\": \"-15.49\",\n" +
            "      \"price_btc\": \"0.000022\",\n" +
            "      \"market_cap_usd\": \"48286155.42\",\n" +
            "      \"volume24\": 1529767.3048232445,\n" +
            "      \"volume24a\": 1500642.1862433655,\n" +
            "      \"csupply\": \"342356149.00\",\n" +
            "      \"tsupply\": \"342356149\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33391\",\n" +
            "      \"symbol\": \"BTT\",\n" +
            "      \"name\": \"BitTorrent\",\n" +
            "      \"nameid\": \"bittorrent\",\n" +
            "      \"rank\": 67,\n" +
            "      \"price_usd\": \"0.000218\",\n" +
            "      \"percent_change_24h\": \"2.96\",\n" +
            "      \"percent_change_1h\": \"-1.20\",\n" +
            "      \"percent_change_7d\": \"-0.19\",\n" +
            "      \"price_btc\": \"3.39E-8\",\n" +
            "      \"market_cap_usd\": \"46161317.02\",\n" +
            "      \"volume24\": 4360262.4666661415,\n" +
            "      \"volume24a\": 3711676.5825309884,\n" +
            "      \"csupply\": \"212116500000.00\",\n" +
            "      \"tsupply\": \"990000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33085\",\n" +
            "      \"symbol\": \"QNT\",\n" +
            "      \"name\": \"Quant\",\n" +
            "      \"nameid\": \"quant\",\n" +
            "      \"rank\": 68,\n" +
            "      \"price_usd\": \"3.80\",\n" +
            "      \"percent_change_24h\": \"12.88\",\n" +
            "      \"percent_change_1h\": \"-1.06\",\n" +
            "      \"percent_change_7d\": \"64.35\",\n" +
            "      \"price_btc\": \"0.000591\",\n" +
            "      \"market_cap_usd\": \"45833922.54\",\n" +
            "      \"volume24\": 3145787.6050223266,\n" +
            "      \"volume24a\": 2860330.8350210283,\n" +
            "      \"csupply\": \"12072738.00\",\n" +
            "      \"tsupply\": \"45467000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32686\",\n" +
            "      \"symbol\": \"HOT\",\n" +
            "      \"name\": \"Holo\",\n" +
            "      \"nameid\": \"holo\",\n" +
            "      \"rank\": 69,\n" +
            "      \"price_usd\": \"0.000334\",\n" +
            "      \"percent_change_24h\": \"4.93\",\n" +
            "      \"percent_change_1h\": \"0.37\",\n" +
            "      \"percent_change_7d\": \"4.30\",\n" +
            "      \"price_btc\": \"5.19E-8\",\n" +
            "      \"market_cap_usd\": \"44433357.12\",\n" +
            "      \"volume24\": 3105392.301371286,\n" +
            "      \"volume24a\": 3027380.5013352153,\n" +
            "      \"csupply\": \"133214575156.00\",\n" +
            "      \"tsupply\": \"177619433541\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"54\",\n" +
            "      \"symbol\": \"BTS\",\n" +
            "      \"name\": \"BitShares\",\n" +
            "      \"nameid\": \"bitshares\",\n" +
            "      \"rank\": 70,\n" +
            "      \"price_usd\": \"0.016091\",\n" +
            "      \"percent_change_24h\": \"3.90\",\n" +
            "      \"percent_change_1h\": \"-0.09\",\n" +
            "      \"percent_change_7d\": \"-4.45\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"44104312.75\",\n" +
            "      \"volume24\": 2997527.5121817086,\n" +
            "      \"volume24a\": 5394981.537314112,\n" +
            "      \"csupply\": \"2740910000.00\",\n" +
            "      \"tsupply\": \"2740910000\",\n" +
            "      \"msupply\": \"3600570502\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33228\",\n" +
            "      \"symbol\": \"HC\",\n" +
            "      \"name\": \"HyperCash\",\n" +
            "      \"nameid\": \"hypercash\",\n" +
            "      \"rank\": 71,\n" +
            "      \"price_usd\": \"0.967646\",\n" +
            "      \"percent_change_24h\": \"4.89\",\n" +
            "      \"percent_change_1h\": \"-1.50\",\n" +
            "      \"percent_change_7d\": \"-2.73\",\n" +
            "      \"price_btc\": \"0.000151\",\n" +
            "      \"market_cap_usd\": \"42121440.20\",\n" +
            "      \"volume24\": 727338.0905484211,\n" +
            "      \"volume24a\": 482937.95084838127,\n" +
            "      \"csupply\": \"43529781.00\",\n" +
            "      \"tsupply\": \"43529781\",\n" +
            "      \"msupply\": \"84000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"186\",\n" +
            "      \"symbol\": \"ZEN\",\n" +
            "      \"name\": \"Horizen\",\n" +
            "      \"nameid\": \"zencash\",\n" +
            "      \"rank\": 72,\n" +
            "      \"price_usd\": \"5.69\",\n" +
            "      \"percent_change_24h\": \"2.74\",\n" +
            "      \"percent_change_1h\": \"-0.68\",\n" +
            "      \"percent_change_7d\": \"6.57\",\n" +
            "      \"price_btc\": \"0.000887\",\n" +
            "      \"market_cap_usd\": \"40919683.05\",\n" +
            "      \"volume24\": 1572311.600088165,\n" +
            "      \"volume24a\": 1792540.743301489,\n" +
            "      \"csupply\": \"7185725.00\",\n" +
            "      \"tsupply\": \"7185725\",\n" +
            "      \"msupply\": \"21000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"139\",\n" +
            "      \"symbol\": \"KMD\",\n" +
            "      \"name\": \"Komodo\",\n" +
            "      \"nameid\": \"komodo\",\n" +
            "      \"rank\": 73,\n" +
            "      \"price_usd\": \"0.353040\",\n" +
            "      \"percent_change_24h\": \"3.24\",\n" +
            "      \"percent_change_1h\": \"-1.52\",\n" +
            "      \"percent_change_7d\": \"-3.11\",\n" +
            "      \"price_btc\": \"0.000055\",\n" +
            "      \"market_cap_usd\": \"40826422.41\",\n" +
            "      \"volume24\": 1479125.8872391342,\n" +
            "      \"volume24a\": 1816487.983291255,\n" +
            "      \"csupply\": \"115642437.00\",\n" +
            "      \"tsupply\": \"115642437\",\n" +
            "      \"msupply\": \"200000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"34406\",\n" +
            "      \"symbol\": \"ALGO\",\n" +
            "      \"name\": \"Algorand\",\n" +
            "      \"nameid\": \"algorand\",\n" +
            "      \"rank\": 74,\n" +
            "      \"price_usd\": \"0.153672\",\n" +
            "      \"percent_change_24h\": \"4.04\",\n" +
            "      \"percent_change_1h\": \"-0.80\",\n" +
            "      \"percent_change_7d\": \"-2.69\",\n" +
            "      \"price_btc\": \"0.000024\",\n" +
            "      \"market_cap_usd\": \"39840469.22\",\n" +
            "      \"volume24\": 37365405.96796491,\n" +
            "      \"volume24a\": 33247359.165538426,\n" +
            "      \"csupply\": \"259256762.00\",\n" +
            "      \"tsupply\": \"2588969743\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"102\",\n" +
            "      \"symbol\": \"XVG\",\n" +
            "      \"name\": \"Verge\",\n" +
            "      \"nameid\": \"verge\",\n" +
            "      \"rank\": 75,\n" +
            "      \"price_usd\": \"0.002467\",\n" +
            "      \"percent_change_24h\": \"1.55\",\n" +
            "      \"percent_change_1h\": \"-0.94\",\n" +
            "      \"percent_change_7d\": \"0.15\",\n" +
            "      \"price_btc\": \"3.84E-7\",\n" +
            "      \"market_cap_usd\": \"39230210.21\",\n" +
            "      \"volume24\": 1143658.6406416532,\n" +
            "      \"volume24a\": 1360296.3205285762,\n" +
            "      \"csupply\": \"15900663549.00\",\n" +
            "      \"tsupply\": \"15900663549\",\n" +
            "      \"msupply\": \"16555000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33535\",\n" +
            "      \"symbol\": \"VSYS\",\n" +
            "      \"name\": \"V Systems\",\n" +
            "      \"nameid\": \"v-systems\",\n" +
            "      \"rank\": 76,\n" +
            "      \"price_usd\": \"0.021912\",\n" +
            "      \"percent_change_24h\": \"4.94\",\n" +
            "      \"percent_change_1h\": \"-0.49\",\n" +
            "      \"percent_change_7d\": \"-10.13\",\n" +
            "      \"price_btc\": \"0.000003\",\n" +
            "      \"market_cap_usd\": \"39197459.77\",\n" +
            "      \"volume24\": 4251326.219610189,\n" +
            "      \"volume24a\": 3725909.264570336,\n" +
            "      \"csupply\": \"1788818695.00\",\n" +
            "      \"tsupply\": \"5217805440\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33529\",\n" +
            "      \"symbol\": \"ZB\",\n" +
            "      \"name\": \"ZB\",\n" +
            "      \"nameid\": \"zb\",\n" +
            "      \"rank\": 77,\n" +
            "      \"price_usd\": \"0.223412\",\n" +
            "      \"percent_change_24h\": \"0.75\",\n" +
            "      \"percent_change_1h\": \"-0.40\",\n" +
            "      \"percent_change_7d\": \"-2.79\",\n" +
            "      \"price_btc\": \"0.000035\",\n" +
            "      \"market_cap_usd\": \"36460631.31\",\n" +
            "      \"volume24\": 33489448.506511033,\n" +
            "      \"volume24a\": 33515764.50310257,\n" +
            "      \"csupply\": \"163198810.00\",\n" +
            "      \"tsupply\": \"2100000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32229\",\n" +
            "      \"symbol\": \"IOST\",\n" +
            "      \"name\": \"IOStoken\",\n" +
            "      \"nameid\": \"iostoken\",\n" +
            "      \"rank\": 78,\n" +
            "      \"price_usd\": \"0.002968\",\n" +
            "      \"percent_change_24h\": \"3.75\",\n" +
            "      \"percent_change_1h\": \"-0.77\",\n" +
            "      \"percent_change_7d\": \"-7.16\",\n" +
            "      \"price_btc\": \"4.62E-7\",\n" +
            "      \"market_cap_usd\": \"35653469.29\",\n" +
            "      \"volume24\": 22249282.603715714,\n" +
            "      \"volume24a\": 20092011.07176046,\n" +
            "      \"csupply\": \"12013965609.00\",\n" +
            "      \"tsupply\": \"21000000000\",\n" +
            "      \"msupply\": \"21000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32764\",\n" +
            "      \"symbol\": \"SEELE\",\n" +
            "      \"name\": \"Seele\",\n" +
            "      \"nameid\": \"seele\",\n" +
            "      \"rank\": 79,\n" +
            "      \"price_usd\": \"0.048380\",\n" +
            "      \"percent_change_24h\": \"2.74\",\n" +
            "      \"percent_change_1h\": \"-0.38\",\n" +
            "      \"percent_change_7d\": \"-1.37\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"33516743.03\",\n" +
            "      \"volume24\": 11356691.412696093,\n" +
            "      \"volume24a\": 13476517.914714254,\n" +
            "      \"csupply\": \"692776387.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"131\",\n" +
            "      \"symbol\": \"ARDR\",\n" +
            "      \"name\": \"Ardor\",\n" +
            "      \"nameid\": \"ardor\",\n" +
            "      \"rank\": 80,\n" +
            "      \"price_usd\": \"0.032994\",\n" +
            "      \"percent_change_24h\": \"8.78\",\n" +
            "      \"percent_change_1h\": \"-0.31\",\n" +
            "      \"percent_change_7d\": \"-1.30\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32961213.33\",\n" +
            "      \"volume24\": 578809.4028021985,\n" +
            "      \"volume24a\": 547669.9331999029,\n" +
            "      \"csupply\": \"998999495.00\",\n" +
            "      \"tsupply\": \"998999495\",\n" +
            "      \"msupply\": \"998999495\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"156\",\n" +
            "      \"symbol\": \"GNT\",\n" +
            "      \"name\": \"Golem\",\n" +
            "      \"nameid\": \"golem-network-tokens\",\n" +
            "      \"rank\": 81,\n" +
            "      \"price_usd\": \"0.033537\",\n" +
            "      \"percent_change_24h\": \"5.33\",\n" +
            "      \"percent_change_1h\": \"-0.91\",\n" +
            "      \"percent_change_7d\": \"-2.03\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"32345154.67\",\n" +
            "      \"volume24\": 2359103.3048927933,\n" +
            "      \"volume24a\": 1750784.2940435642,\n" +
            "      \"csupply\": \"964450000.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32334\",\n" +
            "      \"symbol\": \"ZIL\",\n" +
            "      \"name\": \"Zilliqa\",\n" +
            "      \"nameid\": \"zilliqa\",\n" +
            "      \"rank\": 82,\n" +
            "      \"price_usd\": \"0.003721\",\n" +
            "      \"percent_change_24h\": \"3.30\",\n" +
            "      \"percent_change_1h\": \"-2.69\",\n" +
            "      \"percent_change_7d\": \"-2.27\",\n" +
            "      \"price_btc\": \"5.79E-7\",\n" +
            "      \"market_cap_usd\": \"32323383.98\",\n" +
            "      \"volume24\": 6629248.163145778,\n" +
            "      \"volume24a\": 5844474.5008699475,\n" +
            "      \"csupply\": \"8687360058.00\",\n" +
            "      \"tsupply\": \"12600000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2765\",\n" +
            "      \"symbol\": \"DATA\",\n" +
            "      \"name\": \"Streamr DATAcoin\",\n" +
            "      \"nameid\": \"streamr-datacoin\",\n" +
            "      \"rank\": 83,\n" +
            "      \"price_usd\": \"0.046530\",\n" +
            "      \"percent_change_24h\": \"18.12\",\n" +
            "      \"percent_change_1h\": \"-0.18\",\n" +
            "      \"percent_change_7d\": \"78.63\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"31508079.28\",\n" +
            "      \"volume24\": 6207990.992918925,\n" +
            "      \"volume24a\": 2001769.1836407532,\n" +
            "      \"csupply\": \"677154514.00\",\n" +
            "      \"tsupply\": \"987154514\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32226\",\n" +
            "      \"symbol\": \"ELF\",\n" +
            "      \"name\": \"aelf\",\n" +
            "      \"nameid\": \"aelf\",\n" +
            "      \"rank\": 84,\n" +
            "      \"price_usd\": \"0.060664\",\n" +
            "      \"percent_change_24h\": \"12.70\",\n" +
            "      \"percent_change_1h\": \"-1.63\",\n" +
            "      \"percent_change_7d\": \"8.17\",\n" +
            "      \"price_btc\": \"0.000009\",\n" +
            "      \"market_cap_usd\": \"30318757.52\",\n" +
            "      \"volume24\": 41128317.03237195,\n" +
            "      \"volume24a\": 23607598.91712722,\n" +
            "      \"csupply\": \"499780000.00\",\n" +
            "      \"tsupply\": \"499780000\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33548\",\n" +
            "      \"symbol\": \"NEX\",\n" +
            "      \"name\": \"Nash Exchange\",\n" +
            "      \"nameid\": \"nash-exchange\",\n" +
            "      \"rank\": 85,\n" +
            "      \"price_usd\": \"0.775806\",\n" +
            "      \"percent_change_24h\": \"20.10\",\n" +
            "      \"percent_change_1h\": \"-0.50\",\n" +
            "      \"percent_change_7d\": \"14.26\",\n" +
            "      \"price_btc\": \"0.000121\",\n" +
            "      \"market_cap_usd\": \"28081584.93\",\n" +
            "      \"volume24\": 3427242.034123598,\n" +
            "      \"volume24a\": 4180239.732273674,\n" +
            "      \"csupply\": \"36196678.00\",\n" +
            "      \"tsupply\": \"56296100\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32238\",\n" +
            "      \"symbol\": \"WAX\",\n" +
            "      \"name\": \"WAX\",\n" +
            "      \"nameid\": \"wax\",\n" +
            "      \"rank\": 86,\n" +
            "      \"price_usd\": \"0.029352\",\n" +
            "      \"percent_change_24h\": \"2.67\",\n" +
            "      \"percent_change_1h\": \"-1.18\",\n" +
            "      \"percent_change_7d\": \"-6.71\",\n" +
            "      \"price_btc\": \"0.000005\",\n" +
            "      \"market_cap_usd\": \"27673412.39\",\n" +
            "      \"volume24\": 99299.97673070314,\n" +
            "      \"volume24a\": 98377.67509525742,\n" +
            "      \"csupply\": \"942821662.00\",\n" +
            "      \"tsupply\": \"1850000000\",\n" +
            "      \"msupply\": \"1850000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2732\",\n" +
            "      \"symbol\": \"GXS\",\n" +
            "      \"name\": \"GXChain\",\n" +
            "      \"nameid\": \"gxchain\",\n" +
            "      \"rank\": 87,\n" +
            "      \"price_usd\": \"0.420736\",\n" +
            "      \"percent_change_24h\": \"4.80\",\n" +
            "      \"percent_change_1h\": \"0.07\",\n" +
            "      \"percent_change_7d\": \"34.83\",\n" +
            "      \"price_btc\": \"0.000066\",\n" +
            "      \"market_cap_usd\": \"27347831.36\",\n" +
            "      \"volume24\": 307146.3708138494,\n" +
            "      \"volume24a\": 480128.9824099191,\n" +
            "      \"csupply\": \"65000000.00\",\n" +
            "      \"tsupply\": \"100000000\",\n" +
            "      \"msupply\": \"100000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2731\",\n" +
            "      \"symbol\": \"AE\",\n" +
            "      \"name\": \"Aeternity\",\n" +
            "      \"nameid\": \"aeternity\",\n" +
            "      \"rank\": 88,\n" +
            "      \"price_usd\": \"0.097165\",\n" +
            "      \"percent_change_24h\": \"6.09\",\n" +
            "      \"percent_change_1h\": \"-0.22\",\n" +
            "      \"percent_change_7d\": \"0.17\",\n" +
            "      \"price_btc\": \"0.000015\",\n" +
            "      \"market_cap_usd\": \"27238484.68\",\n" +
            "      \"volume24\": 8828683.991940085,\n" +
            "      \"volume24a\": 6448554.378913852,\n" +
            "      \"csupply\": \"280333087.00\",\n" +
            "      \"tsupply\": \"280333087\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"258\",\n" +
            "      \"symbol\": \"MANA\",\n" +
            "      \"name\": \"Decentraland\",\n" +
            "      \"nameid\": \"decentraland\",\n" +
            "      \"rank\": 89,\n" +
            "      \"price_usd\": \"0.025104\",\n" +
            "      \"percent_change_24h\": \"9.10\",\n" +
            "      \"percent_change_1h\": \"-0.71\",\n" +
            "      \"percent_change_7d\": \"2.49\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"26363141.55\",\n" +
            "      \"volume24\": 21069476.352714308,\n" +
            "      \"volume24a\": 16751179.900954992,\n" +
            "      \"csupply\": \"1050141509.00\",\n" +
            "      \"tsupply\": \"2644403343\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32342\",\n" +
            "      \"symbol\": \"NPXS\",\n" +
            "      \"name\": \"Pundi X\",\n" +
            "      \"nameid\": \"pundi-x\",\n" +
            "      \"rank\": 90,\n" +
            "      \"price_usd\": \"0.000111\",\n" +
            "      \"percent_change_24h\": \"4.02\",\n" +
            "      \"percent_change_1h\": \"-0.73\",\n" +
            "      \"percent_change_7d\": \"1.90\",\n" +
            "      \"price_btc\": \"1.72E-8\",\n" +
            "      \"market_cap_usd\": \"26024424.52\",\n" +
            "      \"volume24\": 714671.9926815088,\n" +
            "      \"volume24a\": 701902.8030228383,\n" +
            "      \"csupply\": \"235171468515.00\",\n" +
            "      \"tsupply\": \"280255193861\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32338\",\n" +
            "      \"symbol\": \"WICC\",\n" +
            "      \"name\": \"WaykiChain\",\n" +
            "      \"nameid\": \"waykichain\",\n" +
            "      \"rank\": 91,\n" +
            "      \"price_usd\": \"0.136941\",\n" +
            "      \"percent_change_24h\": \"4.20\",\n" +
            "      \"percent_change_1h\": \"-0.68\",\n" +
            "      \"percent_change_7d\": \"-6.80\",\n" +
            "      \"price_btc\": \"0.000021\",\n" +
            "      \"market_cap_usd\": \"25881761.75\",\n" +
            "      \"volume24\": 687058.2902158004,\n" +
            "      \"volume24a\": 792604.8355912279,\n" +
            "      \"csupply\": \"189000000.00\",\n" +
            "      \"tsupply\": \"210000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"32390\",\n" +
            "      \"symbol\": \"REN\",\n" +
            "      \"name\": \"Republic Protocol\",\n" +
            "      \"nameid\": \"republic-protocol\",\n" +
            "      \"rank\": 92,\n" +
            "      \"price_usd\": \"0.043674\",\n" +
            "      \"percent_change_24h\": \"10.25\",\n" +
            "      \"percent_change_1h\": \"-1.15\",\n" +
            "      \"percent_change_7d\": \"10.79\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"25691605.41\",\n" +
            "      \"volume24\": 768356.991007473,\n" +
            "      \"volume24a\": 593136.1511548879,\n" +
            "      \"csupply\": \"588261205.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": null\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"36419\",\n" +
            "      \"symbol\": \"CVCC\",\n" +
            "      \"name\": \"CryptoVerificationCoin\",\n" +
            "      \"nameid\": \"cryptoverificationcoin\",\n" +
            "      \"rank\": 93,\n" +
            "      \"price_usd\": \"21.85\",\n" +
            "      \"percent_change_24h\": \"14.77\",\n" +
            "      \"percent_change_1h\": \"-0.75\",\n" +
            "      \"percent_change_7d\": \"0.78\",\n" +
            "      \"price_btc\": \"0.003402\",\n" +
            "      \"market_cap_usd\": \"25188298.16\",\n" +
            "      \"volume24\": 52197.95652577478,\n" +
            "      \"volume24a\": 0,\n" +
            "      \"csupply\": \"1152727.00\",\n" +
            "      \"tsupply\": \"1152727\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"120\",\n" +
            "      \"symbol\": \"STRAT\",\n" +
            "      \"name\": \"Stratis\",\n" +
            "      \"nameid\": \"stratis\",\n" +
            "      \"rank\": 94,\n" +
            "      \"price_usd\": \"0.239222\",\n" +
            "      \"percent_change_24h\": \"6.22\",\n" +
            "      \"percent_change_1h\": \"-0.34\",\n" +
            "      \"percent_change_7d\": \"1.11\",\n" +
            "      \"price_btc\": \"0.000037\",\n" +
            "      \"market_cap_usd\": \"23857400.56\",\n" +
            "      \"volume24\": 312133.2208519148,\n" +
            "      \"volume24a\": 391438.5854141412,\n" +
            "      \"csupply\": \"99729045.00\",\n" +
            "      \"tsupply\": \"99729045\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"166\",\n" +
            "      \"symbol\": \"RLC\",\n" +
            "      \"name\": \"iExec RLC\",\n" +
            "      \"nameid\": \"rlc\",\n" +
            "      \"rank\": 95,\n" +
            "      \"price_usd\": \"0.295675\",\n" +
            "      \"percent_change_24h\": \"9.34\",\n" +
            "      \"percent_change_1h\": \"-0.89\",\n" +
            "      \"percent_change_7d\": \"8.70\",\n" +
            "      \"price_btc\": \"0.000046\",\n" +
            "      \"market_cap_usd\": \"23674967.08\",\n" +
            "      \"volume24\": 411166.31992881745,\n" +
            "      \"volume24a\": 239354.93348275937,\n" +
            "      \"csupply\": \"80070793.00\",\n" +
            "      \"tsupply\": \"86999785\",\n" +
            "      \"msupply\": \" 87000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"264\",\n" +
            "      \"symbol\": \"RCN\",\n" +
            "      \"name\": \"Ripio Credit Network\",\n" +
            "      \"nameid\": \"ripiocreditnetwork\",\n" +
            "      \"rank\": 96,\n" +
            "      \"price_usd\": \"0.047987\",\n" +
            "      \"percent_change_24h\": \"-1.19\",\n" +
            "      \"percent_change_1h\": \"-1.61\",\n" +
            "      \"percent_change_7d\": \"18.32\",\n" +
            "      \"price_btc\": \"0.000007\",\n" +
            "      \"market_cap_usd\": \"23673486.99\",\n" +
            "      \"volume24\": 360458.82495238807,\n" +
            "      \"volume24a\": 322512.05291567324,\n" +
            "      \"csupply\": \"493330791.00\",\n" +
            "      \"tsupply\": \"999942647\",\n" +
            "      \"msupply\": \"1000000000\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"2781\",\n" +
            "      \"symbol\": \"LRC\",\n" +
            "      \"name\": \"Loopring\",\n" +
            "      \"nameid\": \"loopring\",\n" +
            "      \"rank\": 97,\n" +
            "      \"price_usd\": \"0.026271\",\n" +
            "      \"percent_change_24h\": \"3.73\",\n" +
            "      \"percent_change_1h\": \"-0.79\",\n" +
            "      \"percent_change_7d\": \"-4.12\",\n" +
            "      \"price_btc\": \"0.000004\",\n" +
            "      \"market_cap_usd\": \"23599064.26\",\n" +
            "      \"volume24\": 2184089.52441728,\n" +
            "      \"volume24a\": 2159014.759711727,\n" +
            "      \"csupply\": \"898304697.00\",\n" +
            "      \"tsupply\": \"1374956262\",\n" +
            "      \"msupply\": \"1395076055\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"95\",\n" +
            "      \"symbol\": \"MAID\",\n" +
            "      \"name\": \"MaidSafeCoin\",\n" +
            "      \"nameid\": \"maidsafecoin\",\n" +
            "      \"rank\": 98,\n" +
            "      \"price_usd\": \"0.051756\",\n" +
            "      \"percent_change_24h\": \"-4.17\",\n" +
            "      \"percent_change_1h\": \"-0.57\",\n" +
            "      \"percent_change_7d\": \"-6.05\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23422318.17\",\n" +
            "      \"volume24\": 153668.07700823765,\n" +
            "      \"volume24a\": 147197.90357566366,\n" +
            "      \"csupply\": \"452552412.00\",\n" +
            "      \"tsupply\": \"452552412\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33536\",\n" +
            "      \"symbol\": \"MATIC\",\n" +
            "      \"name\": \"Matic Network\",\n" +
            "      \"nameid\": \"matic-network\",\n" +
            "      \"rank\": 99,\n" +
            "      \"price_usd\": \"0.010745\",\n" +
            "      \"percent_change_24h\": \"3.37\",\n" +
            "      \"percent_change_1h\": \"-0.58\",\n" +
            "      \"percent_change_7d\": \"-3.01\",\n" +
            "      \"price_btc\": \"0.000002\",\n" +
            "      \"market_cap_usd\": \"23372342.54\",\n" +
            "      \"volume24\": 8541521.400211625,\n" +
            "      \"volume24a\": 7378899.582448241,\n" +
            "      \"csupply\": \"2175190262.00\",\n" +
            "      \"tsupply\": \"10000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    },\n" +
            "    {\n" +
            "      \"id\": \"33764\",\n" +
            "      \"symbol\": \"RIF\",\n" +
            "      \"name\": \"RIF Token\",\n" +
            "      \"nameid\": \"rif-token\",\n" +
            "      \"rank\": 100,\n" +
            "      \"price_usd\": \"0.048778\",\n" +
            "      \"percent_change_24h\": \"7.07\",\n" +
            "      \"percent_change_1h\": \"-0.02\",\n" +
            "      \"percent_change_7d\": \"5.12\",\n" +
            "      \"price_btc\": \"0.000008\",\n" +
            "      \"market_cap_usd\": \"23315150.66\",\n" +
            "      \"volume24\": 9943071.99480166,\n" +
            "      \"volume24a\": 8075446.828267629,\n" +
            "      \"csupply\": \"477980957.00\",\n" +
            "      \"tsupply\": \"1000000000\",\n" +
            "      \"msupply\": \"\"\n" +
            "    }\n" +
            "  ],\n" +
            "  \"info\": {\n" +
            "    \"coins_num\": 3982,\n" +
            "    \"time\": 1585630301\n" +
            "  }\n" +
            "}";
}
