package com.tencent.mm.plugin.appbrand.launching;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.av;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;

public final class k extends av {
    static final String[] gSr = new String[]{"appId", "versionType"};
    static final a gSs;

    public final a Ag() {
        return null;
    }

    static {
        int i = 0;
        AppMethodBeat.i(102101);
        a aVar = new a();
        aVar.xDb = new Field[3];
        aVar.columns = new String[4];
        StringBuilder stringBuilder = new StringBuilder();
        aVar.columns[0] = "appId";
        aVar.xDd.put("appId", "TEXT");
        stringBuilder.append(" appId TEXT");
        stringBuilder.append(", ");
        aVar.columns[1] = "versionType";
        aVar.xDd.put("versionType", "INTEGER");
        stringBuilder.append(" versionType INTEGER");
        stringBuilder.append(", ");
        aVar.columns[2] = "extJson";
        aVar.xDd.put("extJson", "TEXT");
        stringBuilder.append(" extJson TEXT");
        aVar.columns[3] = "rowid";
        aVar.sql = stringBuilder.toString();
        gSs = aVar;
        String str = " PRIMARY KEY (";
        String[] strArr = gSr;
        int length = strArr.length;
        while (i < length) {
            str = str + ", " + strArr[i];
            i++;
        }
        String str2 = str.replaceFirst(",", "") + " )";
        StringBuilder stringBuilder2 = new StringBuilder();
        a aVar2 = gSs;
        aVar2.sql = stringBuilder2.append(aVar2.sql).append(",").append(str2).toString();
        AppMethodBeat.o(102101);
    }
}
