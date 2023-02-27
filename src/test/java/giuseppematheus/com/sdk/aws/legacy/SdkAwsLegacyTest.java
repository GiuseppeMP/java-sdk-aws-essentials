package giuseppematheus.com.sdk.aws.legacy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SdkAwsLegacyTest {

    SdkAwsLegacy aws = new SdkAwsLegacy();

    @Test
    public void test_should_return_aws_credentials_provider() throws Exception {
        assertThat(aws.getAwsCredentialsProvider()).isNotNull();
    }   

    @Test
	public void test_should_return_aws_credentials() {
        assertThat(aws.getAwsCredentials()).isNotNull();
    }
}
