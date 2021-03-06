package com.thejohnfreeman.lazy;

/**
 * A lazy constant (i.e. a value with no dependencies).
 */
public final class Constant<T>
    extends AbstractThunk<T>
{
    private Constant(final T value) {
        _value = value;
    }

    public static <T> Constant<T> of(final T value) {
        return new Constant<>(value);
    }

    @Override
    public boolean isForced() {
        return true;
    }

    @Override
    public Iterable<? extends Lazy<?>> getDependencies()
        throws IllegalStateException
    {
        throw new IllegalStateException("already forced");
    }

    @Override
    public T forceThis()
        throws IllegalStateException
    {
        throw new IllegalStateException("already forced");
    }
}
