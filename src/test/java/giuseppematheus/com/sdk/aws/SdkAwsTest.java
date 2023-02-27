package giuseppematheus.com.sdk.aws;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SdkAwsTest {

    SdkAws aws = new SdkAws();

    @Test
    public void test_should_return_aws_credentials_provider() throws Exception {
        assertThat(aws.getAwsCredencialsProvider()).isNotNull();
    }
    
    public void test_should_return_aws_credentials() throws Exception {
        assertThat(aws.getCredentials()).isNotNull();
    }
}
