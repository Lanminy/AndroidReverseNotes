package com.tencent.p177mm.plugin.game.p731d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.protocal.protobuf.C7267hl;
import com.tencent.p177mm.protocal.protobuf.bsr;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.plugin.game.d.au */
public final class C28182au extends bsr {
    public String mZr;
    public int nbj;
    public int nbk;
    public int nbl;
    public String nbm;
    public String nbn;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(111590);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            if (this.mZr != null) {
                c6093a.mo13475e(2, this.mZr);
            }
            c6093a.mo13480iz(3, this.nbj);
            c6093a.mo13480iz(4, this.nbk);
            c6093a.mo13480iz(5, this.nbl);
            if (this.nbm != null) {
                c6093a.mo13475e(6, this.nbm);
            }
            if (this.nbn != null) {
                c6093a.mo13475e(7, this.nbn);
            }
            AppMethodBeat.m2505o(111590);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.mZr != null) {
                ix += C6091a.m9575f(2, this.mZr);
            }
            ix = ((ix + C6091a.m9572bs(3, this.nbj)) + C6091a.m9572bs(4, this.nbk)) + C6091a.m9572bs(5, this.nbl);
            if (this.nbm != null) {
                ix += C6091a.m9575f(6, this.nbm);
            }
            if (this.nbn != null) {
                ix += C6091a.m9575f(7, this.nbn);
            }
            AppMethodBeat.m2505o(111590);
            return ix;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(111590);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            C28182au c28182au = (C28182au) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        c28182au.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(111590);
                    return 0;
                case 2:
                    c28182au.mZr = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111590);
                    return 0;
                case 3:
                    c28182au.nbj = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(111590);
                    return 0;
                case 4:
                    c28182au.nbk = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(111590);
                    return 0;
                case 5:
                    c28182au.nbl = c6086a2.BTU.mo13458vd();
                    AppMethodBeat.m2505o(111590);
                    return 0;
                case 6:
                    c28182au.nbm = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111590);
                    return 0;
                case 7:
                    c28182au.nbn = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(111590);
                    return 0;
                default:
                    AppMethodBeat.m2505o(111590);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(111590);
            return -1;
        }
    }
}
