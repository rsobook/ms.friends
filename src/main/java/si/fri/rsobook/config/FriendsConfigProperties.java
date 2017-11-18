package si.fri.rsobook.config;

import com.kumuluz.ee.configuration.cdi.ConfigBundle;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
@ConfigBundle("properties")
public class FriendsConfigProperties {

    private String userApiHost;

    private Boolean userApiHostDiscovery;

    public String getUserApiHost() {
        return userApiHost;
    }

    public void setUserApiHost(String userApiHost) {
        this.userApiHost = userApiHost;
    }

    public Boolean getUserApiHostDiscovery() {
        return userApiHostDiscovery;
    }

    public void setUserApiHostDiscovery(Boolean userApiHostDiscovery) {
        this.userApiHostDiscovery = userApiHostDiscovery;
    }
}
