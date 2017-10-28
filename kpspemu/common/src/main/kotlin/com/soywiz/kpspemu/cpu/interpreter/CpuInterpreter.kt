package com.soywiz.kpspemu.cpu.interpreter

import com.soywiz.korio.lang.format
import com.soywiz.kpspemu.cpu.CpuState
import com.soywiz.kpspemu.cpu.InstructionDispatcher
import com.soywiz.kpspemu.cpu.dis.disasm
import com.soywiz.kpspemu.cpu.dispatch

class CpuInterpreter(val cpu: CpuState, var trace: Boolean = false) {
	val dispatcher = InstructionDispatcher(InstructionInterpreter)

	fun step() {
		cpu.IR = cpu.mem.lw(cpu._PC)
		if (trace) println("%08X: %s".format(cpu._PC, cpu.mem.disasm(cpu._PC)))
		dispatcher.dispatch(cpu)
	}
}