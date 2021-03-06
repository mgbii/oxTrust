/*
 * oxTrust is available under the MIT License (2008). See http://opensource.org/licenses/MIT for full text.
 *
 * Copyright (c) 2014, Gluu
 */
package org.gluu.oxtrust.model.scim2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Val Pecaoco
 */
public class ErrorResponse implements Serializable {

    private List<String> schemas;

    private String status;
    private ErrorScimType scimType;
    private String detail;

    public ErrorResponse() {
        schemas = new ArrayList<String>();
    }

    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getScimType() {
        if (scimType != null) {
            return scimType.getValue();
        } else {
            return "";
        }
    }

    protected ErrorScimType getScimTypeEnum() {
        return scimType;
    }

    public void setScimType(ErrorScimType scimType) {
        this.scimType = scimType;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
