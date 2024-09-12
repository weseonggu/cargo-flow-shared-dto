package org.example;

import java.util.UUID;

/**
 * Hub id belonging to the supplier, address of the supplier
 */
public class HubInformationFromCompanyDTO {

    private UUID supplierHubId;
    private String supplierAddress;

    private UUID receiverHubId;
    private String receiverAddress;

    public HubInformationFromCompanyDTO(){

    }

    public HubInformationFromCompanyDTO(UUID supplierHubId, String supplierAddress, UUID receiverHubId, String receiverAddress) {
        this.supplierHubId = supplierHubId;
        this.supplierAddress = supplierAddress;
        this.receiverHubId = receiverHubId;
        this.receiverAddress = receiverAddress;
    }

    public UUID getSupplierHubId() {
        return supplierHubId;
    }

    public void setSupplierHubId(UUID supplierHubId) {
        this.supplierHubId = supplierHubId;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public UUID getReceiverHubId() {
        return receiverHubId;
    }

    public void setReceiverHubId(UUID receiverHubId) {
        this.receiverHubId = receiverHubId;
    }

    public String getReceiverAddress() {
        return receiverAddress;
    }

    public void setReceiverAddress(String receiverAddress) {
        this.receiverAddress = receiverAddress;
    }
}
