package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.Status;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzm extends zzd {
    private final /* synthetic */ zzl zzey;

    zzm(zzl zzl) {
        this.zzey = zzl;
    }

    public final void zzg(Status status) {
        AppMethodBeat.m2504i(50448);
        this.zzey.setResult(status);
        AppMethodBeat.m2505o(50448);
    }
}
