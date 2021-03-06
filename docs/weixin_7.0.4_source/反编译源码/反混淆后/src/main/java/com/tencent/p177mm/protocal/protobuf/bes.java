package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.C6092b;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.bes */
public final class bes extends btd {
    public String fhH;
    public String vGi;
    public LinkedList<bew> wIK = new LinkedList();
    public String wIL;
    public boolean wIM;
    public boolean wIN;
    public boolean wIO;

    public bes() {
        AppMethodBeat.m2504i(10224);
        AppMethodBeat.m2505o(10224);
    }

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(10225);
        C6092b c6092b;
        int ix;
        byte[] bArr;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(10225);
                throw c6092b;
            }
            if (this.BaseResponse != null) {
                c6093a.mo13479iy(1, this.BaseResponse.computeSize());
                this.BaseResponse.writeFields(c6093a);
            }
            c6093a.mo13474e(3, 8, this.wIK);
            if (this.fhH != null) {
                c6093a.mo13475e(4, this.fhH);
            }
            if (this.wIL != null) {
                c6093a.mo13475e(5, this.wIL);
            }
            if (this.vGi != null) {
                c6093a.mo13475e(6, this.vGi);
            }
            c6093a.mo13471aO(8, this.wIM);
            c6093a.mo13471aO(9, this.wIN);
            c6093a.mo13471aO(10, this.wIO);
            AppMethodBeat.m2505o(10225);
            return 0;
        } else if (i == 1) {
            if (this.BaseResponse != null) {
                ix = C6087a.m9557ix(1, this.BaseResponse.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix += C6087a.m9552c(3, 8, this.wIK);
            if (this.fhH != null) {
                ix += C6091a.m9575f(4, this.fhH);
            }
            if (this.wIL != null) {
                ix += C6091a.m9575f(5, this.wIL);
            }
            if (this.vGi != null) {
                ix += C6091a.m9575f(6, this.vGi);
            }
            int fv = ((ix + (C6091a.m9576fv(8) + 1)) + (C6091a.m9576fv(9) + 1)) + (C6091a.m9576fv(10) + 1);
            AppMethodBeat.m2505o(10225);
            return fv;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wIK.clear();
            C6086a c6086a = new C6086a(bArr, unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            if (this.BaseResponse == null) {
                c6092b = new C6092b("Not all required fields were included: BaseResponse");
                AppMethodBeat.m2505o(10225);
                throw c6092b;
            }
            AppMethodBeat.m2505o(10225);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            bes bes = (bes) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            C6086a c6086a3;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        BaseResponse baseResponse = new BaseResponse();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = baseResponse.populateBuilderWithField(c6086a3, baseResponse, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bes.BaseResponse = baseResponse;
                    }
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 3:
                    Vh = c6086a2.mo13445Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        bew bew = new bew();
                        c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (z = true; z; z = bew.populateBuilderWithField(c6086a3, bew, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        bes.wIK.add(bew);
                    }
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 4:
                    bes.fhH = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 5:
                    bes.wIL = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 6:
                    bes.vGi = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 8:
                    bes.wIM = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 9:
                    bes.wIN = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(10225);
                    return 0;
                case 10:
                    bes.wIO = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(10225);
                    return 0;
                default:
                    AppMethodBeat.m2505o(10225);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(10225);
            return -1;
        }
    }
}
