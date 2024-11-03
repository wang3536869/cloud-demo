package cn.itcast.user.config;

import io.minio.MinioClient;
import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MinioConfig
 * @Description 文件
 * @Date 2024/9/21 10:21
 */
@Data
@Configuration
public class MinioConfig {
    /** 访问地址 */
    @Value("${minio.url}")
    private String endpoint;

    /** 唯一标识账户 */
    @Value("${minio.accessKey}")
    private String accessKey;

    /** 账户密码 */
    @Value("${minio.secretKey}")
    private String secretKey;

    /** 默认储存桶 */
    @Value("${minio.bucketName}")
    private String bucketName;

    /**
     * 标记此方法为一个 Bean，Spring 会在上下文中管理这个 Bean
     */
    @Bean
    public MinioClient minioClient(){
      //  使用 MinioClient 的构建器模式创建一个 MinioClient 实例
        return MinioClient.builder()
                //设置 Minio 服务的端点地址
                .endpoint(endpoint)
                // 设置访问 Minio 服务所需的访问密钥和秘密密钥
                .credentials(accessKey, secretKey)
                // 构建并返回 MinioClient 实例
                .build();
    }
}