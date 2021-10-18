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
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;

import static org.lwjgl.system.Checks.check;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct XrHandTrackingMeshFB {
 *     XrStructureType type;
 *     void * next;
 *     uint32_t jointCapacityInput;
 *     uint32_t jointCountOutput;
 *     {@link XrPosef XrPosef} * jointBindPoses;
 *     float * jointRadii;
 *     XrHandJointEXT * jointParents;
 *     uint32_t vertexCapacityInput;
 *     uint32_t vertexCountOutput;
 *     {@link XrVector3f XrVector3f} * vertexPositions;
 *     {@link XrVector3f XrVector3f} * vertexNormals;
 *     {@link XrVector2f XrVector2f} * vertexUVs;
 *     {@link XrVector4sFB XrVector4sFB} * vertexBlendIndices;
 *     {@link XrVector4f XrVector4f} * vertexBlendWeights;
 *     uint32_t indexCapacityInput;
 *     uint32_t indexCountOutput;
 *     int16_t * indices;
 * }</code></pre>
 */
public class XrHandTrackingMeshFB extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        TYPE,
        NEXT,
        JOINTCAPACITYINPUT,
        JOINTCOUNTOUTPUT,
        JOINTBINDPOSES,
        JOINTRADII,
        JOINTPARENTS,
        VERTEXCAPACITYINPUT,
        VERTEXCOUNTOUTPUT,
        VERTEXPOSITIONS,
        VERTEXNORMALS,
        VERTEXUVS,
        VERTEXBLENDINDICES,
        VERTEXBLENDWEIGHTS,
        INDEXCAPACITYINPUT,
        INDEXCOUNTOUTPUT,
        INDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(POINTER_SIZE),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        TYPE = layout.offsetof(0);
        NEXT = layout.offsetof(1);
        JOINTCAPACITYINPUT = layout.offsetof(2);
        JOINTCOUNTOUTPUT = layout.offsetof(3);
        JOINTBINDPOSES = layout.offsetof(4);
        JOINTRADII = layout.offsetof(5);
        JOINTPARENTS = layout.offsetof(6);
        VERTEXCAPACITYINPUT = layout.offsetof(7);
        VERTEXCOUNTOUTPUT = layout.offsetof(8);
        VERTEXPOSITIONS = layout.offsetof(9);
        VERTEXNORMALS = layout.offsetof(10);
        VERTEXUVS = layout.offsetof(11);
        VERTEXBLENDINDICES = layout.offsetof(12);
        VERTEXBLENDWEIGHTS = layout.offsetof(13);
        INDEXCAPACITYINPUT = layout.offsetof(14);
        INDEXCOUNTOUTPUT = layout.offsetof(15);
        INDICES = layout.offsetof(16);
    }

    /**
     * Creates a {@code XrHandTrackingMeshFB} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public XrHandTrackingMeshFB(ByteBuffer container) {
        super(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** @return the value of the {@code type} field. */
    @NativeType("XrStructureType")
    public int type() { return ntype(address()); }
    /** @return the value of the {@code next} field. */
    @NativeType("void *")
    public long next() { return nnext(address()); }
    /** @return the value of the {@code jointCapacityInput} field. */
    @NativeType("uint32_t")
    public int jointCapacityInput() { return njointCapacityInput(address()); }
    /** @return the value of the {@code jointCountOutput} field. */
    @NativeType("uint32_t")
    public int jointCountOutput() { return njointCountOutput(address()); }
    /** @return a {@link XrPosef.Buffer} view of the struct array pointed to by the {@code jointBindPoses} field. */
    @NativeType("XrPosef *")
    public XrPosef.Buffer jointBindPoses() { return njointBindPoses(address()); }
    /** @return a {@link FloatBuffer} view of the data pointed to by the {@code jointRadii} field. */
    @NativeType("float *")
    public FloatBuffer jointRadii() { return njointRadii(address()); }
    /** @return a {@link IntBuffer} view of the data pointed to by the {@code jointParents} field. */
    @NativeType("XrHandJointEXT *")
    public IntBuffer jointParents() { return njointParents(address()); }
    /** @return the value of the {@code vertexCapacityInput} field. */
    @NativeType("uint32_t")
    public int vertexCapacityInput() { return nvertexCapacityInput(address()); }
    /** @return the value of the {@code vertexCountOutput} field. */
    @NativeType("uint32_t")
    public int vertexCountOutput() { return nvertexCountOutput(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexPositions} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer vertexPositions() { return nvertexPositions(address()); }
    /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexNormals} field. */
    @NativeType("XrVector3f *")
    public XrVector3f.Buffer vertexNormals() { return nvertexNormals(address()); }
    /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@code vertexUVs} field. */
    @NativeType("XrVector2f *")
    public XrVector2f.Buffer vertexUVs() { return nvertexUVs(address()); }
    /** @return a {@link XrVector4sFB.Buffer} view of the struct array pointed to by the {@code vertexBlendIndices} field. */
    @NativeType("XrVector4sFB *")
    public XrVector4sFB.Buffer vertexBlendIndices() { return nvertexBlendIndices(address()); }
    /** @return a {@link XrVector4f.Buffer} view of the struct array pointed to by the {@code vertexBlendWeights} field. */
    @NativeType("XrVector4f *")
    public XrVector4f.Buffer vertexBlendWeights() { return nvertexBlendWeights(address()); }
    /** @return the value of the {@code indexCapacityInput} field. */
    @NativeType("uint32_t")
    public int indexCapacityInput() { return nindexCapacityInput(address()); }
    /** @return the value of the {@code indexCountOutput} field. */
    @NativeType("uint32_t")
    public int indexCountOutput() { return nindexCountOutput(address()); }
    /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field. */
    @NativeType("int16_t *")
    public ShortBuffer indices() { return nindices(address()); }

    /** Sets the specified value to the {@code type} field. */
    public XrHandTrackingMeshFB type(@NativeType("XrStructureType") int value) { ntype(address(), value); return this; }
    /** Sets the {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_MESH_FB TYPE_HAND_TRACKING_MESH_FB} value to the {@code type} field. */
    public XrHandTrackingMeshFB type$Default() { return type(FBHandTrackingMesh.XR_TYPE_HAND_TRACKING_MESH_FB); }
    /** Sets the specified value to the {@code next} field. */
    public XrHandTrackingMeshFB next(@NativeType("void *") long value) { nnext(address(), value); return this; }
    /** Sets the specified value to the {@code jointCapacityInput} field. */
    public XrHandTrackingMeshFB jointCapacityInput(@NativeType("uint32_t") int value) { njointCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code jointCountOutput} field. */
    public XrHandTrackingMeshFB jointCountOutput(@NativeType("uint32_t") int value) { njointCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrPosef.Buffer} to the {@code jointBindPoses} field. */
    public XrHandTrackingMeshFB jointBindPoses(@NativeType("XrPosef *") XrPosef.Buffer value) { njointBindPoses(address(), value); return this; }
    /** Sets the address of the specified {@link FloatBuffer} to the {@code jointRadii} field. */
    public XrHandTrackingMeshFB jointRadii(@NativeType("float *") FloatBuffer value) { njointRadii(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code jointParents} field. */
    public XrHandTrackingMeshFB jointParents(@NativeType("XrHandJointEXT *") IntBuffer value) { njointParents(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCapacityInput} field. */
    public XrHandTrackingMeshFB vertexCapacityInput(@NativeType("uint32_t") int value) { nvertexCapacityInput(address(), value); return this; }
    /** Sets the specified value to the {@code vertexCountOutput} field. */
    public XrHandTrackingMeshFB vertexCountOutput(@NativeType("uint32_t") int value) { nvertexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexPositions} field. */
    public XrHandTrackingMeshFB vertexPositions(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nvertexPositions(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexNormals} field. */
    public XrHandTrackingMeshFB vertexNormals(@NativeType("XrVector3f *") XrVector3f.Buffer value) { nvertexNormals(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@code vertexUVs} field. */
    public XrHandTrackingMeshFB vertexUVs(@NativeType("XrVector2f *") XrVector2f.Buffer value) { nvertexUVs(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector4sFB.Buffer} to the {@code vertexBlendIndices} field. */
    public XrHandTrackingMeshFB vertexBlendIndices(@NativeType("XrVector4sFB *") XrVector4sFB.Buffer value) { nvertexBlendIndices(address(), value); return this; }
    /** Sets the address of the specified {@link XrVector4f.Buffer} to the {@code vertexBlendWeights} field. */
    public XrHandTrackingMeshFB vertexBlendWeights(@NativeType("XrVector4f *") XrVector4f.Buffer value) { nvertexBlendWeights(address(), value); return this; }
    /** Sets the specified value to the {@code indexCountOutput} field. */
    public XrHandTrackingMeshFB indexCountOutput(@NativeType("uint32_t") int value) { nindexCountOutput(address(), value); return this; }
    /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
    public XrHandTrackingMeshFB indices(@NativeType("int16_t *") ShortBuffer value) { nindices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public XrHandTrackingMeshFB set(
        int type,
        long next,
        int jointCapacityInput,
        int jointCountOutput,
        XrPosef.Buffer jointBindPoses,
        FloatBuffer jointRadii,
        IntBuffer jointParents,
        int vertexCapacityInput,
        int vertexCountOutput,
        XrVector3f.Buffer vertexPositions,
        XrVector3f.Buffer vertexNormals,
        XrVector2f.Buffer vertexUVs,
        XrVector4sFB.Buffer vertexBlendIndices,
        XrVector4f.Buffer vertexBlendWeights,
        int indexCountOutput,
        ShortBuffer indices
    ) {
        type(type);
        next(next);
        jointCapacityInput(jointCapacityInput);
        jointCountOutput(jointCountOutput);
        jointBindPoses(jointBindPoses);
        jointRadii(jointRadii);
        jointParents(jointParents);
        vertexCapacityInput(vertexCapacityInput);
        vertexCountOutput(vertexCountOutput);
        vertexPositions(vertexPositions);
        vertexNormals(vertexNormals);
        vertexUVs(vertexUVs);
        vertexBlendIndices(vertexBlendIndices);
        vertexBlendWeights(vertexBlendWeights);
        indexCountOutput(indexCountOutput);
        indices(indices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public XrHandTrackingMeshFB set(XrHandTrackingMeshFB src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@code XrHandTrackingMeshFB} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static XrHandTrackingMeshFB malloc() {
        return wrap(XrHandTrackingMeshFB.class, nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@code XrHandTrackingMeshFB} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static XrHandTrackingMeshFB calloc() {
        return wrap(XrHandTrackingMeshFB.class, nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@code XrHandTrackingMeshFB} instance allocated with {@link BufferUtils}. */
    public static XrHandTrackingMeshFB create() {
        ByteBuffer container = BufferUtils.createByteBuffer(SIZEOF);
        return wrap(XrHandTrackingMeshFB.class, memAddress(container), container);
    }

    /** Returns a new {@code XrHandTrackingMeshFB} instance for the specified memory address. */
    public static XrHandTrackingMeshFB create(long address) {
        return wrap(XrHandTrackingMeshFB.class, address);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static XrHandTrackingMeshFB createSafe(long address) {
        return address == NULL ? null : wrap(XrHandTrackingMeshFB.class, address);
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
    public static XrHandTrackingMeshFB.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : wrap(Buffer.class, address, capacity);
    }


    /**
     * Returns a new {@code XrHandTrackingMeshFB} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingMeshFB malloc(MemoryStack stack) {
        return wrap(XrHandTrackingMeshFB.class, stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@code XrHandTrackingMeshFB} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static XrHandTrackingMeshFB calloc(MemoryStack stack) {
        return wrap(XrHandTrackingMeshFB.class, stack.ncalloc(ALIGNOF, 1, SIZEOF));
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
    public static int ntype(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.TYPE); }
    /** Unsafe version of {@link #next}. */
    public static long nnext(long struct) { return memGetAddress(struct + XrHandTrackingMeshFB.NEXT); }
    /** Unsafe version of {@link #jointCapacityInput}. */
    public static int njointCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.JOINTCAPACITYINPUT); }
    /** Unsafe version of {@link #jointCountOutput}. */
    public static int njointCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.JOINTCOUNTOUTPUT); }
    /** Unsafe version of {@link #jointBindPoses}. */
    public static XrPosef.Buffer njointBindPoses(long struct) { return XrPosef.create(memGetAddress(struct + XrHandTrackingMeshFB.JOINTBINDPOSES), njointCapacityInput(struct)); }
    /** Unsafe version of {@link #jointRadii() jointRadii}. */
    public static FloatBuffer njointRadii(long struct) { return memFloatBuffer(memGetAddress(struct + XrHandTrackingMeshFB.JOINTRADII), njointCapacityInput(struct)); }
    /** Unsafe version of {@link #jointParents() jointParents}. */
    public static IntBuffer njointParents(long struct) { return memIntBuffer(memGetAddress(struct + XrHandTrackingMeshFB.JOINTPARENTS), njointCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexCapacityInput}. */
    public static int nvertexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.VERTEXCAPACITYINPUT); }
    /** Unsafe version of {@link #vertexCountOutput}. */
    public static int nvertexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.VERTEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #vertexPositions}. */
    public static XrVector3f.Buffer nvertexPositions(long struct) { return XrVector3f.create(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXPOSITIONS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexNormals}. */
    public static XrVector3f.Buffer nvertexNormals(long struct) { return XrVector3f.create(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXNORMALS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexUVs}. */
    public static XrVector2f.Buffer nvertexUVs(long struct) { return XrVector2f.create(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXUVS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexBlendIndices}. */
    public static XrVector4sFB.Buffer nvertexBlendIndices(long struct) { return XrVector4sFB.create(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDINDICES), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #vertexBlendWeights}. */
    public static XrVector4f.Buffer nvertexBlendWeights(long struct) { return XrVector4f.create(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDWEIGHTS), nvertexCapacityInput(struct)); }
    /** Unsafe version of {@link #indexCapacityInput}. */
    public static int nindexCapacityInput(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.INDEXCAPACITYINPUT); }
    /** Unsafe version of {@link #indexCountOutput}. */
    public static int nindexCountOutput(long struct) { return UNSAFE.getInt(null, struct + XrHandTrackingMeshFB.INDEXCOUNTOUTPUT); }
    /** Unsafe version of {@link #indices() indices}. */
    public static ShortBuffer nindices(long struct) { return memShortBuffer(memGetAddress(struct + XrHandTrackingMeshFB.INDICES), nindexCapacityInput(struct)); }

    /** Unsafe version of {@link #type(int) type}. */
    public static void ntype(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.TYPE, value); }
    /** Unsafe version of {@link #next(long) next}. */
    public static void nnext(long struct, long value) { memPutAddress(struct + XrHandTrackingMeshFB.NEXT, value); }
    /** Sets the specified value to the {@code jointCapacityInput} field of the specified {@code struct}. */
    public static void njointCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.JOINTCAPACITYINPUT, value); }
    /** Unsafe version of {@link #jointCountOutput(int) jointCountOutput}. */
    public static void njointCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.JOINTCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #jointBindPoses(XrPosef.Buffer) jointBindPoses}. */
    public static void njointBindPoses(long struct, XrPosef.Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.JOINTBINDPOSES, value.address()); }
    /** Unsafe version of {@link #jointRadii(FloatBuffer) jointRadii}. */
    public static void njointRadii(long struct, FloatBuffer value) { memPutAddress(struct + XrHandTrackingMeshFB.JOINTRADII, memAddress(value)); }
    /** Unsafe version of {@link #jointParents(IntBuffer) jointParents}. */
    public static void njointParents(long struct, IntBuffer value) { memPutAddress(struct + XrHandTrackingMeshFB.JOINTPARENTS, memAddress(value)); }
    /** Sets the specified value to the {@code vertexCapacityInput} field of the specified {@code struct}. */
    public static void nvertexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.VERTEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #vertexCountOutput(int) vertexCountOutput}. */
    public static void nvertexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.VERTEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #vertexPositions(XrVector3f.Buffer) vertexPositions}. */
    public static void nvertexPositions(long struct, XrVector3f.Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXPOSITIONS, value.address()); }
    /** Unsafe version of {@link #vertexNormals(XrVector3f.Buffer) vertexNormals}. */
    public static void nvertexNormals(long struct, XrVector3f.Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXNORMALS, value.address()); }
    /** Unsafe version of {@link #vertexUVs(XrVector2f.Buffer) vertexUVs}. */
    public static void nvertexUVs(long struct, XrVector2f.Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXUVS, value.address()); }
    /** Unsafe version of {@link #vertexBlendIndices(XrVector4sFB.Buffer) vertexBlendIndices}. */
    public static void nvertexBlendIndices(long struct, XrVector4sFB.Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDINDICES, value.address()); }
    /** Unsafe version of {@link #vertexBlendWeights(XrVector4f.Buffer) vertexBlendWeights}. */
    public static void nvertexBlendWeights(long struct, XrVector4f.Buffer value) { memPutAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDWEIGHTS, value.address()); }
    /** Sets the specified value to the {@code indexCapacityInput} field of the specified {@code struct}. */
    public static void nindexCapacityInput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.INDEXCAPACITYINPUT, value); }
    /** Unsafe version of {@link #indexCountOutput(int) indexCountOutput}. */
    public static void nindexCountOutput(long struct, int value) { UNSAFE.putInt(null, struct + XrHandTrackingMeshFB.INDEXCOUNTOUTPUT, value); }
    /** Unsafe version of {@link #indices(ShortBuffer) indices}. */
    public static void nindices(long struct, ShortBuffer value) { memPutAddress(struct + XrHandTrackingMeshFB.INDICES, memAddress(value)); nindexCapacityInput(struct, value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        check(memGetAddress(struct + XrHandTrackingMeshFB.JOINTBINDPOSES));
        check(memGetAddress(struct + XrHandTrackingMeshFB.JOINTRADII));
        check(memGetAddress(struct + XrHandTrackingMeshFB.JOINTPARENTS));
        check(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXPOSITIONS));
        check(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXNORMALS));
        check(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXUVS));
        check(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDINDICES));
        check(memGetAddress(struct + XrHandTrackingMeshFB.VERTEXBLENDWEIGHTS));
        check(memGetAddress(struct + XrHandTrackingMeshFB.INDICES));
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + Integer.toUnsignedLong(i) * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link XrHandTrackingMeshFB} structs. */
    public static class Buffer extends StructBuffer<XrHandTrackingMeshFB, Buffer> implements NativeResource {

        private static final XrHandTrackingMeshFB ELEMENT_FACTORY = XrHandTrackingMeshFB.create(-1L);

        /**
         * Creates a new {@code XrHandTrackingMeshFB.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link XrHandTrackingMeshFB#SIZEOF}, and its mark will be undefined.
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
        protected XrHandTrackingMeshFB getElementFactory() {
            return ELEMENT_FACTORY;
        }

        /** @return the value of the {@code type} field. */
        @NativeType("XrStructureType")
        public int type() { return XrHandTrackingMeshFB.ntype(address()); }
        /** @return the value of the {@code next} field. */
        @NativeType("void *")
        public long next() { return XrHandTrackingMeshFB.nnext(address()); }
        /** @return the value of the {@code jointCapacityInput} field. */
        @NativeType("uint32_t")
        public int jointCapacityInput() { return XrHandTrackingMeshFB.njointCapacityInput(address()); }
        /** @return the value of the {@code jointCountOutput} field. */
        @NativeType("uint32_t")
        public int jointCountOutput() { return XrHandTrackingMeshFB.njointCountOutput(address()); }
        /** @return a {@link XrPosef.Buffer} view of the struct array pointed to by the {@code jointBindPoses} field. */
        @NativeType("XrPosef *")
        public XrPosef.Buffer jointBindPoses() { return XrHandTrackingMeshFB.njointBindPoses(address()); }
        /** @return a {@link FloatBuffer} view of the data pointed to by the {@code jointRadii} field. */
        @NativeType("float *")
        public FloatBuffer jointRadii() { return XrHandTrackingMeshFB.njointRadii(address()); }
        /** @return a {@link IntBuffer} view of the data pointed to by the {@code jointParents} field. */
        @NativeType("XrHandJointEXT *")
        public IntBuffer jointParents() { return XrHandTrackingMeshFB.njointParents(address()); }
        /** @return the value of the {@code vertexCapacityInput} field. */
        @NativeType("uint32_t")
        public int vertexCapacityInput() { return XrHandTrackingMeshFB.nvertexCapacityInput(address()); }
        /** @return the value of the {@code vertexCountOutput} field. */
        @NativeType("uint32_t")
        public int vertexCountOutput() { return XrHandTrackingMeshFB.nvertexCountOutput(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexPositions} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer vertexPositions() { return XrHandTrackingMeshFB.nvertexPositions(address()); }
        /** @return a {@link XrVector3f.Buffer} view of the struct array pointed to by the {@code vertexNormals} field. */
        @NativeType("XrVector3f *")
        public XrVector3f.Buffer vertexNormals() { return XrHandTrackingMeshFB.nvertexNormals(address()); }
        /** @return a {@link XrVector2f.Buffer} view of the struct array pointed to by the {@code vertexUVs} field. */
        @NativeType("XrVector2f *")
        public XrVector2f.Buffer vertexUVs() { return XrHandTrackingMeshFB.nvertexUVs(address()); }
        /** @return a {@link XrVector4sFB.Buffer} view of the struct array pointed to by the {@code vertexBlendIndices} field. */
        @NativeType("XrVector4sFB *")
        public XrVector4sFB.Buffer vertexBlendIndices() { return XrHandTrackingMeshFB.nvertexBlendIndices(address()); }
        /** @return a {@link XrVector4f.Buffer} view of the struct array pointed to by the {@code vertexBlendWeights} field. */
        @NativeType("XrVector4f *")
        public XrVector4f.Buffer vertexBlendWeights() { return XrHandTrackingMeshFB.nvertexBlendWeights(address()); }
        /** @return the value of the {@code indexCapacityInput} field. */
        @NativeType("uint32_t")
        public int indexCapacityInput() { return XrHandTrackingMeshFB.nindexCapacityInput(address()); }
        /** @return the value of the {@code indexCountOutput} field. */
        @NativeType("uint32_t")
        public int indexCountOutput() { return XrHandTrackingMeshFB.nindexCountOutput(address()); }
        /** @return a {@link ShortBuffer} view of the data pointed to by the {@code indices} field. */
        @NativeType("int16_t *")
        public ShortBuffer indices() { return XrHandTrackingMeshFB.nindices(address()); }

        /** Sets the specified value to the {@code type} field. */
        public Buffer type(@NativeType("XrStructureType") int value) { XrHandTrackingMeshFB.ntype(address(), value); return this; }
        /** Sets the {@link FBHandTrackingMesh#XR_TYPE_HAND_TRACKING_MESH_FB TYPE_HAND_TRACKING_MESH_FB} value to the {@code type} field. */
        public Buffer type$Default() { return type(FBHandTrackingMesh.XR_TYPE_HAND_TRACKING_MESH_FB); }
        /** Sets the specified value to the {@code next} field. */
        public Buffer next(@NativeType("void *") long value) { XrHandTrackingMeshFB.nnext(address(), value); return this; }
        /** Sets the specified value to the {@code jointCapacityInput} field. */
        public Buffer jointCapacityInput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.njointCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code jointCountOutput} field. */
        public Buffer jointCountOutput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.njointCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrPosef.Buffer} to the {@code jointBindPoses} field. */
        public Buffer jointBindPoses(@NativeType("XrPosef *") XrPosef.Buffer value) { XrHandTrackingMeshFB.njointBindPoses(address(), value); return this; }
        /** Sets the address of the specified {@link FloatBuffer} to the {@code jointRadii} field. */
        public Buffer jointRadii(@NativeType("float *") FloatBuffer value) { XrHandTrackingMeshFB.njointRadii(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code jointParents} field. */
        public Buffer jointParents(@NativeType("XrHandJointEXT *") IntBuffer value) { XrHandTrackingMeshFB.njointParents(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCapacityInput} field. */
        public Buffer vertexCapacityInput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nvertexCapacityInput(address(), value); return this; }
        /** Sets the specified value to the {@code vertexCountOutput} field. */
        public Buffer vertexCountOutput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nvertexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexPositions} field. */
        public Buffer vertexPositions(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrHandTrackingMeshFB.nvertexPositions(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector3f.Buffer} to the {@code vertexNormals} field. */
        public Buffer vertexNormals(@NativeType("XrVector3f *") XrVector3f.Buffer value) { XrHandTrackingMeshFB.nvertexNormals(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector2f.Buffer} to the {@code vertexUVs} field. */
        public Buffer vertexUVs(@NativeType("XrVector2f *") XrVector2f.Buffer value) { XrHandTrackingMeshFB.nvertexUVs(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector4sFB.Buffer} to the {@code vertexBlendIndices} field. */
        public Buffer vertexBlendIndices(@NativeType("XrVector4sFB *") XrVector4sFB.Buffer value) { XrHandTrackingMeshFB.nvertexBlendIndices(address(), value); return this; }
        /** Sets the address of the specified {@link XrVector4f.Buffer} to the {@code vertexBlendWeights} field. */
        public Buffer vertexBlendWeights(@NativeType("XrVector4f *") XrVector4f.Buffer value) { XrHandTrackingMeshFB.nvertexBlendWeights(address(), value); return this; }
        /** Sets the specified value to the {@code indexCountOutput} field. */
        public Buffer indexCountOutput(@NativeType("uint32_t") int value) { XrHandTrackingMeshFB.nindexCountOutput(address(), value); return this; }
        /** Sets the address of the specified {@link ShortBuffer} to the {@code indices} field. */
        public Buffer indices(@NativeType("int16_t *") ShortBuffer value) { XrHandTrackingMeshFB.nindices(address(), value); return this; }

    }

}