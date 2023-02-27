package giuseppematheus.com.sdk.aws;

import software.amazon.awssdk.auth.credentials.AwsCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.WebIdentityTokenFileCredentialsProvider;

public class SdkAws {

    public AwsCredentialsProvider getAwsCredencialsProvider() {
        return WebIdentityTokenFileCredentialsProvider.create();
    }

    public AwsCredentials getCredentials() {
        return this.getAwsCredencialsProvider().resolveCredentials();
    }
    
}
