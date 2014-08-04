/*
 * Written by Gil Tene and Martin Thompson, and released to the public domain,
 * as explained at http://creativecommons.org/publicdomain/zero/1.0/
 */

package org.ObjectLayout;

public class ArrayConstructionArgs {

    private final CtorAndArgs arrayCtorAndArgs;
    private final Class elementClass;
    private final AbstractCtorAndArgsProvider ctorAndArgsProvider;
    private final long[] lengths;
    private long[] containingIndex;

    ArrayConstructionArgs(final CtorAndArgs arrayCtorAndArgs,
                          final Class elementClass,
                          final AbstractCtorAndArgsProvider ctorAndArgsProvider,
                          final long[] lengths,
                          final long[] containingIndex) {
        this.arrayCtorAndArgs = arrayCtorAndArgs;
        this.elementClass = elementClass;
        this.ctorAndArgsProvider = ctorAndArgsProvider;
        this.lengths = lengths;
        this.containingIndex = containingIndex;
    }

    ArrayConstructionArgs(ArrayConstructionArgs args) {
        this(args.arrayCtorAndArgs, args.elementClass, args.ctorAndArgsProvider, args.lengths, args.containingIndex);
    }

    public CtorAndArgs getArrayCtorAndArgs() {
        return arrayCtorAndArgs;
    }

    public Class getElementClass() {
        return elementClass;
    }

    public AbstractCtorAndArgsProvider getCtorAndArgsProvider() {
        return ctorAndArgsProvider;
    }

    public long[] getLengths() {
        return lengths;
    }

    public long[] getContainingIndex() {
        return containingIndex;
    }

    public void setContainingIndex(long[] containingIndex) {
        this.containingIndex = containingIndex;
    }
}
