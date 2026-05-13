package imgui.callback;

import imgui.ImDrawCmd;
import imgui.ImDrawList;

/**
 * Callback to use with {@link imgui.ImDrawList#addDrawCallback(ImDrawCallback)}.
 */
public abstract class ImDrawCallback {
    /**
     * This function will be called by the native callback and wrapped.
     *
     * @param parentListPtr pointer to the parent draw list
     * @param drawCmdPtr pointer to the draw command
     * @param userData custom data provided when the callback was added
     */
    public final void accept(final long parentListPtr, final long drawCmdPtr, final long userData) {
        accept(new ImDrawList(parentListPtr), new ImDrawCmd(drawCmdPtr), userData);
    }

    /**
     * Called by the renderer backend when it reaches the draw callback command.
     *
     * @param parentList parent draw list
     * @param drawCmd draw command
     * @param userData custom data provided when the callback was added
     */
    public abstract void accept(ImDrawList parentList, ImDrawCmd drawCmd, long userData);
}
