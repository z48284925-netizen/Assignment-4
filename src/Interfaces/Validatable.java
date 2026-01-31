package interfaces;

public interface Validatable<T> {
    void validate(T entity) throws Exception;
}