package giuseppematheus.com.sdk.aws.legacy;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.WebIdentityTokenCredentialsProvider;

public class SdkAwsLegacy {

    public AWSCredentialsProvider getAwsCredentialsProvider() {
        return WebIdentityTokenCredentialsProvider.create();
    }

    public AWSCredentials getAwsCredentials() {
        return this.getAwsCredentialsProvider().getCredentials();
    }
}
