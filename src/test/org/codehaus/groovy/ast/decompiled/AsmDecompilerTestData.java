package org.codehaus.groovy.ast.decompiled;

import org.codehaus.groovy.ast.ClassNode;

import java.io.IOException;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;

@SuppressWarnings("unused")
@Anno(
        stringAttr = "s",
        enumAttr = SomeEnum.BAR,
        intArrayAttr = {4, 2},
        clsAttr = String.class,
        classArrayAttr = {AsmDecompilerTestData.class},
        annoArrayAttr = {@InnerAnno, @InnerAnno(booleanAttr = false)}
)
public class AsmDecompilerTestData<T extends List<? super T>, V> extends SuperClass implements Intf<Map<T, String>> {
    public AsmDecompilerTestData(boolean b) {
    }

    @Anno
    public ClassNode objectMethod() {
        return null;
    }

    public void withParametersThrowing(@Anno int a, AsmDecompilerTestData[] b) throws IOException {
    }

    public int[][] primitiveArrayMethod() {
        return null;
    }

    public <A extends Number, B extends IOException> List<?> genericMethod(A a, int[] array) throws B {
        return null;
    }
    public <A, B extends IOException> List<?> nonGenericExceptions(A a, int[] array) throws IOException {
        return null;
    }
    public <A, B extends IOException> List<?> nonGenericParameters(boolean b) throws B {
        return null;
    }

    public List<?> nonParameterizedGenerics() {
        return null;
    }

    @Anno
    protected Object aField;

    public List<T> genericField;

    class Inner<X> {}
    static class Inner$WithDollar {}

    static <T extends List<? super T>> AsmDecompilerTestData<T, Integer>.Inner<String> returnInner() { return null; }

}

@SuppressWarnings("unused")
interface Intf<S> { }

enum SomeEnum { FOO, BAR }

class SuperClass { }

@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER})
@interface Anno {
    String stringAttr() default "";
    SomeEnum enumAttr() default SomeEnum.FOO;
    Class clsAttr() default Object.class;
    boolean booleanAttr() default true;
    int[] intArrayAttr() default {};
    Class[] classArrayAttr() default {};
    InnerAnno[] annoArrayAttr() default {};
}

@SuppressWarnings("unused")
@Retention(RetentionPolicy.RUNTIME)
@interface InnerAnno {
    boolean booleanAttr() default true;
}

@SuppressWarnings("unused")
abstract class NonTrivialErasure<V extends RuntimeException> {
    abstract V method(V param) throws V;
    V field;
}