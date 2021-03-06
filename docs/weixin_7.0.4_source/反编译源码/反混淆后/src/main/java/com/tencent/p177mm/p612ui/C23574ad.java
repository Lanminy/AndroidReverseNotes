package com.tencent.p177mm.p612ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Field;

/* renamed from: com.tencent.mm.ui.ad */
public final class C23574ad<T> {
    private String classname;
    private Field eum;
    private String fieldName;
    private boolean inited;
    private Object obj;

    public C23574ad(Object obj, String str) {
        AppMethodBeat.m2504i(112464);
        if (obj == null) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("obj cannot be null");
            AppMethodBeat.m2505o(112464);
            throw illegalArgumentException;
        }
        this.obj = obj;
        this.fieldName = str;
        this.classname = null;
        AppMethodBeat.m2505o(112464);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0066 A:{Splitter:B:5:0x001a, ExcHandler: all (th java.lang.Throwable)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:22:0x0067, code skipped:
            r1.getSuperclass();
            com.tencent.matrix.trace.core.AppMethodBeat.m2505o(112465);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void prepare() {
        AppMethodBeat.m2504i(112465);
        if (this.inited) {
            AppMethodBeat.m2505o(112465);
            return;
        }
        this.inited = true;
        Class cls = this.obj.getClass();
        while (cls != null) {
            try {
                Field declaredField = cls.getDeclaredField(this.fieldName);
                declaredField.setAccessible(true);
                this.eum = declaredField;
                cls.getSuperclass();
                AppMethodBeat.m2505o(112465);
                return;
            } catch (Exception e) {
                if (this.classname != null && !this.classname.equals("")) {
                    for (Field field : cls.getDeclaredFields()) {
                        if (field.getType().getName().equals(this.classname)) {
                            field.setAccessible(true);
                            this.eum = field;
                            break;
                        }
                    }
                }
                cls = cls.getSuperclass();
            } catch (Throwable th) {
            }
        }
        AppMethodBeat.m2505o(112465);
    }

    public final T get() {
        AppMethodBeat.m2504i(112466);
        prepare();
        if (this.eum == null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException();
            AppMethodBeat.m2505o(112466);
            throw noSuchFieldException;
        }
        try {
            Object obj = this.eum.get(this.obj);
            AppMethodBeat.m2505o(112466);
            return obj;
        } catch (ClassCastException e) {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("unable to cast object");
            AppMethodBeat.m2505o(112466);
            throw illegalArgumentException;
        }
    }

    public final void set(T t) {
        AppMethodBeat.m2504i(112467);
        prepare();
        if (this.eum == null) {
            NoSuchFieldException noSuchFieldException = new NoSuchFieldException();
            AppMethodBeat.m2505o(112467);
            throw noSuchFieldException;
        }
        this.eum.set(this.obj, t);
        AppMethodBeat.m2505o(112467);
    }
}
