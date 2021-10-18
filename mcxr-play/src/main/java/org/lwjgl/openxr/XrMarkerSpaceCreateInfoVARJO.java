/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openxr;

import org.jetbrains.annotations.Nullable;
import org.lwjgl.BufferUtils;
import org.lwjgl.system.*;

import java.nio.ByteBuffer;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrMarkerSpaceCreateInfoVARJO {
 *     XrStructureType type;
 *     void const * next;
 *     uint64_t markerId;
 *     {@link XrPosef XrPosef} poseInMarkerSpace;
 * }</code></pre>
 */
public class XrMarkerSpaceCreateInfoVARJO extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        MARKERID,
        POSEINMARKERSPACE;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(8),
            __member(XrPosef.SIZEOF, XrPosef.ALIGNOF)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        MARKERID = layout.offsetof(2);
        POSEINMARKERSPACE = layout.offsetof(3);
    }

    /**
     * Creates a {@code XrMarkerSpaceCreateInfoVARJO} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrMarkerSpaceCreateInfoVARJO(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void const *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code markerId} field. */
    @NativeType("uint64_t")
    public long markerId() { return nmarkerId(address()); }
    /** @return a {@link XrPosef} view of the {@code poseInMarkerSpace} field. */
    public XrPosef poseInMarkerSpace() { return nposeInMarkerSpace(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrMarkerSpaceCreateInfoVARJO type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link VARJOMarkerTracking#XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO TYPE_MARKER_SPACE_CREATE_INFO_VARJO} value to the {@code type} field. */
    public XrMarkerSpaceCreateInfoVARJO type$Default() { return type(VARJOMarkerTracking.XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO); }
    /** Sets the specified value to the {@code next} field. */
    public XrMarkerSpaceCreateInfoVARJO next(@NativeType("void const *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code markerId} field. */
    public XrMarkerSpaceCreateInfoVARJO markerId(@NativeType("uint64_t") long value) { nmarkerId(address(), value); return this; }
    /** Copies the specified {@link XrPosef} to the {@code poseInMarkerSpace} field. */
    public XrMarkerSpaceCreateInfoVARJO poseInMarkerSpace(XrPosef value) { nposeInMarkerSpace(address(), value); return this; }
    /** Passes the {@code poseInMarkerSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
    public XrMarkerSpaceCreateInfoVARJO poseInMarkerSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInMarkerSpace()); return this; }

    /** Initializes this struct with the specified values. */
    public XrMarkerSpaceCreateInfoVARJO set(
        int type,
        long next,
        long markerId,
        XrPosef poseInMarkerSpace
    ) {
        type(type);
        next(next);
        markerId(markerId);
        poseInMarkerSpace(poseInMarkerSpace);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrMarkerSpaceCreateInfoVARJO set(XrMarkerSpaceCreateInfoVARJO src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrMarkerSpaceCreateInfoVARJO malloc() {
        return wrap(XrMarkerSpaceCreateInfoVARJO.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrMarkerSpaceCreateInfoVARJO calloc() {
        return wrap(XrMarkerSpaceCreateInfoVARJO.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated with {@link BufferUtils}. */
    public static XrMarkerSpaceCreateInfoVARJO create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrMarkerSpaceCreateInfoVARJO.class, memAddress(container), container);
    }

    /** Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance for the specified memory address. */
    public static XrMarkerSpaceCreateInfoVARJO create(long address) {
        return wrap(XrMarkerSpaceCreateInfoVARJO.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrMarkerSpaceCreateInfoVARJO createSafe(long address) {
        return address == NULL ? null : wrap(XrMarkerSpaceCreateInfoVARJO.class, address);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity) {
        return wrap(Buffer.class, nmemAllocChecked(__checkMalloc(capacity, SIZEOF)), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity) {
        return wrap(Buffer.class, nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static Buffer create(int capacity) {
        ByteBuffer container = __create(capacity, SIZEOF);
        return wrap(Buffer.class, memAddress(container), capacity, container);
    }

    /**
     * Create a {@link Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static Buffer create(long address, int capacity) {
        return wrap(Buffer.class, address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrMarkerSpaceCreateInfoVARJO.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerSpaceCreateInfoVARJO malloc(MemoryStack stack) {
        return wrap(XrMarkerSpaceCreateInfoVARJO.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrMarkerSpaceCreateInfoVARJO} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrMarkerSpaceCreateInfoVARJO calloc(MemoryStack stack) {
        return wrap(XrMarkerSpaceCreateInfoVARJO.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer malloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack    the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static Buffer calloc(int capacity, MemoryStack stack) {
        return wrap(Buffer.class, stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #type}. */
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrMarkerSpaceCreateInfoVARJO.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrMarkerSpaceCreateInfoVARJO.NEXT); }
    /** Unsafe version of {@link #markerId}. */
    public static long nmarkerId(long struct) { return UNSAFE.getLong(null, struct + XrMarkerSpaceCreateInfoVARJO.MARKERID); }
    /** Unsafe version of {@link #poseInMarkerSpace}. */
    public static XrPosef nposeInMarkerSpace(long struct) { return XrPosef.create(struct + XrMarkerSpaceCreateInfoVARJO.POSEINMARKERSPACE); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrMarkerSpaceCreateInfoVARJO.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrMarkerSpaceCreateInfoVARJO.NEXT, value); }
    /** Unsafe version of {@link #markerId(long) markerId}. */
    public static void nmarkerId(long struct, long value) { UNSAFE.putLong(null, struct + XrMarkerSpaceCreateInfoVARJO.MARKERID, value); }
    /** Unsafe version of {@link #poseInMarkerSpace(XrPosef) poseInMarkerSpace}. */
    public static void nposeInMarkerSpace(long struct, XrPosef value) { memCopy(value.address(), struct + XrMarkerSpaceCreateInfoVARJO.POSEINMARKERSPACE, XrPosef.SIZEOF); }

    // -----------------------------------

    /** An array of {@link XrMarkerSpaceCreateInfoVARJO} structs. */
    public static class Buffer extends StructBuffer<XrMarkerSpaceCreateInfoVARJO, Buffer> implements NativeResource {

        private static final XrMarkerSpaceCreateInfoVARJO ELEMENT_FACTORY = XrMarkerSpaceCreateInfoVARJO.create(-1L);

        /**
         * Creates a new {@code XrMarkerSpaceCreateInfoVARJO.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrMarkerSpaceCreateInfoVARJO#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected XrMarkerSpaceCreateInfoVARJO getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrMarkerSpaceCreateInfoVARJO.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void const *")
        public long next() { return XrMarkerSpaceCreateInfoVARJO.nnext(address()); }
        /** @return the value of the {@code markerId} field. */
        @NativeType("uint64_t")
        public long markerId() { return XrMarkerSpaceCreateInfoVARJO.nmarkerId(address()); }
        /** @return a {@link XrPosef} view of the {@code poseInMarkerSpace} field. */
        public XrPosef poseInMarkerSpace() { return XrMarkerSpaceCreateInfoVARJO.nposeInMarkerSpace(address()); }

        /** Sets the specified value to the {@code type} field. */
        public Buffer type(@NativeType("XrStructureType") int value) { XrMarkerSpaceCreateInfoVARJO.ntype(address(), value); return this; }
        /** Sets the {@link VARJOMarkerTracking#XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO TYPE_MARKER_SPACE_CREATE_INFO_VARJO} value to the {@code type} field. */
        public Buffer type$Default() { return type(VARJOMarkerTracking.XR_TYPE_MARKER_SPACE_CREATE_INFO_VARJO); }
        /** Sets the specified value to the {@code next} field. */
        public Buffer next(@NativeType("void const *") long value) { XrMarkerSpaceCreateInfoVARJO.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code markerId} field. */
        public Buffer markerId(@NativeType("uint64_t") long value) { XrMarkerSpaceCreateInfoVARJO.nmarkerId(address(), value); return this; }
        /** Copies the specified {@link XrPosef} to the {@code poseInMarkerSpace} field. */
        public Buffer poseInMarkerSpace(XrPosef value) { XrMarkerSpaceCreateInfoVARJO.nposeInMarkerSpace(address(), value); return this; }
        /** Passes the {@code poseInMarkerSpace} field to the specified {@link java.util.function.Consumer Consumer}. */
        public Buffer poseInMarkerSpace(java.util.function.Consumer<XrPosef> consumer) { consumer.accept(poseInMarkerSpace()); return this; }

    }

}