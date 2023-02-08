package ch.zhaw.gpi.CineSearch;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Provider {
    @Id
    private String providerName;
    private String URL;
    
    public String getProviderName() {
        return providerName;
    }
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }
    public String getURL() {
        return URL;
    }
    public void setURL(String uRL) {
        URL = uRL;
    }


}
