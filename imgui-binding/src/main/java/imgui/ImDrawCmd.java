package imgui;

import imgui.binding.ImGuiStruct;

/**
 * Draw command.
 */
public final class ImDrawCmd extends ImGuiStruct {
    public ImDrawCmd(final long ptr) {
        super(ptr);
    }

    /*JNI
        #include "_common.h"
        #define THIS ((ImDrawCmd*)STRUCT_PTR)
     */

    /**
     * Number of indices to render as triangles.
     */
    public native int getElemCount(); /*
        return THIS->ElemCount;
    */

    /**
     * Clipping rectangle.
     */
    public ImVec4 getClipRect() {
        final ImVec4 dst = new ImVec4();
        getClipRect(dst);
        return dst;
    }

    /**
     * Clipping rectangle.
     */
    public native void getClipRect(ImVec4 dst); /*
        Jni::ImVec4Cpy(env, &THIS->ClipRect, dst);
    */

    /**
     * User-provided texture ID.
     */
    public native long getTextureId(); /*
        return (uintptr_t)THIS->GetTexID();
    */

    /**
     * Start offset in vertex buffer.
     */
    public native int getVtxOffset(); /*
        return THIS->VtxOffset;
    */

    /**
     * Start offset in index buffer.
     */
    public native int getIdxOffset(); /*
        return THIS->IdxOffset;
    */

    /*JNI
        #undef THIS
     */
}
