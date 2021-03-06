package com.tencent.p177mm.boot.svg.p708a.p709a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.p177mm.svg.C5163c;
import com.tencent.p177mm.svg.WeChatSVGRenderC2Java;
import com.tencent.smtt.sdk.WebView;

/* renamed from: com.tencent.mm.boot.svg.a.a.aye */
public final class aye extends C5163c {
    private final int height = 43;
    private final int width = 43;

    /* renamed from: a */
    public final int mo10620a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 43;
            case 1:
                return 43;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = C5163c.m7881h(looper);
                float[] g = C5163c.m7880g(looper);
                Paint k = C5163c.m7883k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = C5163c.m7883k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                k = C5163c.m7876a(k2, looper);
                k.setStrokeWidth(1.0f);
                k.setStrokeCap(Cap.SQUARE);
                canvas.save();
                Paint a = C5163c.m7876a(k, looper);
                a.setColor(-1);
                a.setStrokeWidth(1.6079128f);
                g = C5163c.m7878a(g, 1.0f, 0.0f, -85.0f, 0.0f, 1.0f, -1407.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 57.6f, 0.0f, 1.0f, 1391.04f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = C5163c.m7878a(g, 1.0f, 0.0f, 28.8f, 0.0f, 1.0f, 17.28f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                Paint a2 = C5163c.m7876a(a, looper);
                Path l = C5163c.m7884l(looper);
                l.moveTo(12.447884f, 14.936544f);
                l.lineTo(22.520554f, 11.663904f);
                l.lineTo(28.746326f, 20.232515f);
                l.lineTo(22.520554f, 28.800514f);
                l.lineTo(12.447884f, 25.527874f);
                l.close();
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(22.520737f, 11.66366f);
                l.lineTo(24.763384f, 6.4855943f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(24.763323f, 33.26858f);
                l.lineTo(22.520676f, 28.801004f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(12.447884f, 14.936544f);
                l.lineTo(8.340742f, 12.110478f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(8.722133f, 28.058565f);
                l.lineTo(12.448067f, 25.527569f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(28.746143f, 20.232454f);
                l.lineTo(34.449593f, 20.27583f);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(8.340925f, 4.828503f);
                l.lineTo(8.340925f, 12.110539f);
                l.lineTo(1.2397178f, 14.966539f);
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(31.954027f, 4.3482676f);
                l.lineTo(24.763016f, 6.4858384f);
                l.lineTo(19.908123f, 0.5685731f);
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(38.015957f, 26.79319f);
                l.lineTo(34.44947f, 20.276012f);
                l.lineTo(38.715446f, 13.920725f);
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(20.901583f, 39.290558f);
                l.lineTo(24.76314f, 33.268826f);
                l.lineTo(32.196682f, 35.093613f);
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                a2 = C5163c.m7876a(a, looper);
                l = C5163c.m7884l(looper);
                l.moveTo(1.7110342f, 25.974083f);
                l.lineTo(8.850118f, 28.278433f);
                l.lineTo(9.279587f, 36.279507f);
                WeChatSVGRenderC2Java.setFillType(l, 1);
                canvas.drawPath(l, a2);
                canvas.restore();
                canvas.save();
                Paint a3 = C5163c.m7876a(a, looper);
                Path l2 = C5163c.m7884l(looper);
                l2.moveTo(20.23221f, 40.27137f);
                l2.cubicTo(9.16498f, 40.27137f, 0.19316946f, 31.29895f, 0.19316946f, 20.232332f);
                l2.cubicTo(0.19316946f, 9.165103f, 9.16498f, 0.19329163f, 20.23221f, 0.19329163f);
                l2.cubicTo(31.299438f, 0.19329163f, 40.271862f, 9.165103f, 40.271862f, 20.232332f);
                l2.cubicTo(40.271862f, 31.29895f, 31.299438f, 40.27137f, 20.23221f, 40.27137f);
                l2.close();
                canvas.drawPath(l2, a3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                canvas.restore();
                C5163c.m7882j(looper);
                break;
        }
        return 0;
    }
}
