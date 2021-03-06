package org.knowm.xchange.binance.dto.account;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public final class BinanceAccountInformation {
    
    public final BigDecimal makerCommission;
    public final BigDecimal takerCommission;
    public final BigDecimal buyerCommission;
    public final BigDecimal sellerCommission;
    public final boolean canTrade;
    public final boolean canWithdraw;
    public final boolean canDeposit;
    public List<BinanceBalance> balances;
    
    public BinanceAccountInformation(@JsonProperty("makerCommission") BigDecimal makerCommission
            , @JsonProperty("takerCommission") BigDecimal takerCommission
            , @JsonProperty("buyerCommission") BigDecimal buyerCommission
            , @JsonProperty("sellerCommission") BigDecimal sellerCommission
            , @JsonProperty("canTrade") boolean canTrade
            , @JsonProperty("canWithdraw") boolean canWithdraw
            , @JsonProperty("canDeposit") boolean canDeposit
            , @JsonProperty("balances") List<BinanceBalance> balances) {
        this.makerCommission = makerCommission;
        this.takerCommission = takerCommission;
        this.buyerCommission = buyerCommission;
        this.sellerCommission = sellerCommission;
        this.canTrade = canTrade;
        this.canWithdraw = canWithdraw;
        this.canDeposit = canDeposit;
        this.balances = balances;
    }
}
