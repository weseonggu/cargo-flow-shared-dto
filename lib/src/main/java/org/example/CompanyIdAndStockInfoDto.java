package org.example;

import java.util.UUID;

/**
 * Company id and inventory information in company service
 */
public class CompanyIdAndStockInfoDto {

    private UUID conpanyId;
    private int quantity;

    public CompanyIdAndStockInfoDto(){

    }
    public CompanyIdAndStockInfoDto(UUID conpanyId, int quantity) {
        this.conpanyId = conpanyId;
        this.quantity = quantity;
    }

    public UUID getConpanyId() {
        return conpanyId;
    }
    public void setConpanyId(UUID conpanyId) {
        this.conpanyId = conpanyId;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
