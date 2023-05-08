package HW7.model;

public interface Calculatable<T extends Number> {
    T subtraction(T arg2);
    T sum (T arg2);
}
