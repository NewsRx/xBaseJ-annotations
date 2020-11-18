package org.xBaseJ.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.SOURCE)
public @interface DBFField {
	String name();
	int size() default 0;
	int dec() default 0;
	boolean optional() default false;
	boolean rtrim() default true;
	boolean ltrim() default false;
	boolean truncate() default false;
}
