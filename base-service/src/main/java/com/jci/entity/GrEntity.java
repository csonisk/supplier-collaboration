/**
 * (C) Copyright 2016 Johnson Controls, Inc
 * Use or Copying of all or any part of this program, except as
 * permitted by License Agreement, is prohibited.
 */
package com.jci.entity;

import com.microsoft.azure.storage.table.TableServiceEntity;




/**
 * The Class GrEntity.
 */
public class GrEntity extends TableServiceEntity { // NO_UCD (unused code)

	/**
  * Instantiates a new gr entity.
  *
  * @param partitionKey the partition key
  * @param rowKey the row key
  */
 public GrEntity(String partitionKey, String rowKey) {
		this.partitionKey = partitionKey;
		this.rowKey = rowKey;//receiptID
	}

	/**
	 * Instantiates a new gr entity.
	 */
	public GrEntity() {
	}

	/** The order number. */
	private String orderNumber;
    /** The status. */
    private int supplierDeliveryState;

	/** The supp type. */
	private String suppType;
	
	/** The region. */
	private String region;
	
	/** The plant. */
	private String plant;
	
	/** The json string. */
    private String jsonString;

	/** The user name. */
	private String userName;
	
	/** The global id. */
	private String globalId;	
	
	/** The comment. */
	private String comment;	
	
	
    /**
     * Gets the order number.
     *
     * @return the order number
     */
    public String getOrderNumber() {
		return orderNumber;
	}

	/**
	 * Sets the order number.
	 *
	 * @param orderNumber the new order number
	 */
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * Gets the global id.
	 *
	 * @return the global id
	 */
	public String getGlobalId() {
		return globalId;
	}

	/**
	 * Sets the global id.
	 *
	 * @param globalId the new global id
	 */
	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	/**
	 * Gets the comment.
	 *
	 * @return the comment
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * Sets the comment.
	 *
	 * @param comment the new comment
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}

	/**
     * Gets the supplier delivery state.
     *
     * @return the supplier delivery state
     */
    public int getSupplierDeliveryState() {
        return supplierDeliveryState;
    }

    /**
     * Sets the supplier delivery state.
     *
     * @param supplierDeliveryState the new supplier delivery state
     */
    public void setSupplierDeliveryState(int supplierDeliveryState) {
        this.supplierDeliveryState = supplierDeliveryState;
    }

    /**
     * Gets the supp type.
     *
     * @return the supp type
     */
    public String getSuppType() {
        return suppType;
    }

    /**
     * Sets the supp type.
     *
     * @param suppType the new supp type
     */
    public void setSuppType(String suppType) {
        this.suppType = suppType;
    }

    /**
     * Gets the region.
     *
     * @return the region
     */
    public String getRegion() {
        return region;
    }

    /**
     * Sets the region.
     *
     * @param region the new region
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * Gets the plant.
     *
     * @return the plant
     */
    public String getPlant() {
        return plant;
    }

    /**
     * Sets the plant.
     *
     * @param plant the new plant
     */
    public void setPlant(String plant) {
        this.plant = plant;
    }

    /**
     * Gets the json string.
     *
     * @return the json string
     */
    public String getJsonString() {
        return jsonString;
    }

    /**
     * Sets the json string.
     *
     * @param jsonString the new json string
     */
    public void setJsonString(String jsonString) {
        this.jsonString = jsonString;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((partitionKey == null) ? 0 : partitionKey.hashCode());
        result = prime * result + ((rowKey == null) ? 0 : rowKey.hashCode());
        return result;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#equals(java.lang.Object)
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        GrEntity other = (GrEntity) obj;
        if (partitionKey == null) {
            if (other.partitionKey != null)
                return false;
        } else if (!partitionKey.equals(other.partitionKey))
            return false;
        if (rowKey == null) {
            if (other.rowKey != null)
                return false;
        } else if (!rowKey.equals(other.rowKey))
            return false;
        return true;
    }

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "GrEntity [supplierDeliveryState=" + supplierDeliveryState + ", suppType=" + suppType + ", region="
				+ region + ", plant=" + plant + ", jsonString=" + jsonString + ", userName=" + userName + ", globalId="
				+ globalId + ", comment=" + comment + "]";
	}
    


}
