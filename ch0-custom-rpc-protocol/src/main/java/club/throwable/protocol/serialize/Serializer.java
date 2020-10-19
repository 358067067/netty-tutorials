package club.throwable.protocol.serialize;

/**
 * @author throwable
 * @version v1.0
 * @description 序列化器
 * @since 2020/1/3 9:40
 */
public interface Serializer {

    byte[] encode(Object target);

    Object decode(byte[] bytes, Class<?> targetClass);
}
