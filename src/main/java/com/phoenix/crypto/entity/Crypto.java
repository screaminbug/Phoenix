package com.phoenix.crypto.entity;


import javax.persistence.*;

@Entity
@Table (name = "CRYPTO_TABLE")
public class Crypto {
    @Column (name = "ID")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String id;

    @Column (name = "CRYPTO_NAME", nullable = true, length = 50)
    public String name;

    @Column (name = "CRYPTO_SYMBOL", nullable = true, length = 9)
    public String symbol;

    @Column (name = "CRYPTO_RANK", nullable = true, length = 200)
    public String rank;

    @Column (name = "CRYPTO_PRICE_USD", nullable = true, length = 15)
    public String price_usd;

    @Column (name = "CRYPTO_PRICE_BTC", nullable = true, length = 15)
    public String price_btc;

    @Column (name = "CRYPTO_TWENTYFOURHOUR_VOLUME_USD", nullable = true, length = 9)
    public String twentyFourHour_volume_usd;

    @Column (name = "CRYPTO_MARKET_CAP_USD", nullable = true, length = 15)
    public String market_cap_usd;

    @Column (name = "CRYPTO_AV_SUPPLY", nullable = true, length = 9)
    public String available_supply;

    @Column (name = "CRYPTO_TOT_SUPPLY", nullable = true, length = 9)
    public String total_supply;

    @Column (name = "CRYPTO_MAX_SUPPLY", nullable = true, length = 9)
    public String max_supply;

    @Column (name = "CRYPTO_PERCENT_CHANGE_HR", nullable = true, length = 5)
    public String percent_change_1h;

    @Column (name = "CRYPTO_PERCENT_CHANGE_DAY", nullable = true, length = 5)
    public String percent_change_24h;

    @Column (name = "CRYPTO_PERCENT_CHANGE_WK", nullable = true, length = 5)
    public String percent_change_7d;

    @Column (name = "CRYPTO_LAST_UPDATE", nullable = true, length = 5)
    public String last_updated;

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public String getrank() {
        return rank;
    }

    public String getprice_usd() {
        return price_usd;
    }

    public String getprice_btc() {
        return price_btc;
    }

    public String gettwentyFourHour_volume_usd() {
        return twentyFourHour_volume_usd;
    }

    public String getmarket_cap_usd() {
        return market_cap_usd;
    }

    public String getavailable_supply() {
        return available_supply;
    }

    public String gettotal_supply() {
        return total_supply;
    }

    public String getmax_supply() {
        return max_supply;
    }

    public String getpercent_change_1h() {
        return percent_change_1h;
    }

    public String getpercent_change_24h() {
        return percent_change_24h;
    }

    public String getpercent_change_7d() {
        return percent_change_7d;
    }

    public String getlast_updated() {
        return last_updated;
    }

}
