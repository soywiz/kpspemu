package com.soywiz.kpspemu.cpu.dynarec

import com.soywiz.dynarek.*
import com.soywiz.dynarek.js.*
import com.soywiz.kpspemu.*
import com.soywiz.kpspemu.cpu.*
import com.soywiz.kpspemu.mem.*
import mytest.*
import kotlin.test.*

class DynarekMethodBuilderTest : BaseTest() {
    @Test
    fun name() {
        val mb = DynarekMethodBuilder()
        mb.dispatch(0, 0) // shl r0, r0, r0
        mb.dispatch(4, 0x3C100890) // lui 0x890
        mb.dispatch(8, 0x26040004) // addiu   $a0, $s0, 4
        val func = mb.generateFunction()
        println(func.generateJsBody(strict = false))

        val state = CpuState("DynarekMethodBuilderTest", GlobalCpuState(Memory()))
        val ff = func.generateDynarek()
        ff(state)
        assertEquals(0x08900004, state.r4)

    }
}