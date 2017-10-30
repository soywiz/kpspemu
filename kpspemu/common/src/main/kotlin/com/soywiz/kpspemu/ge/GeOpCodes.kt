package com.soywiz.kpspemu.ge

internal typealias Op = GeOpCodes

@Suppress("unused")
object GeOpCodes {
	val NOP = 0x00
	val VADDR = 0x01
	val IADDR = 0x02
	val Unknown0x03 = 0x03
	val PRIM = 0x04
	val BEZIER = 0x05
	val SPLINE = 0x06
	val BOUNDINGBOX = 0x07
	val JUMP = 0x08
	val BJUMP = 0x09
	val CALL = 0x0A
	val RET = 0x0B
	val END = 0x0C
	val Unknown0x0D = 0x0D
	val SIGNAL = 0x0E
	val FINISH = 0x0F
	val BASE = 0x10
	val Unknown0x11 = 0x11
	val VERTEXTYPE = 0x12
	val OFFSETADDR = 0x13
	val ORIGIN = 0x14
	val REGION1 = 0x15
	val REGION2 = 0x16
	val LIGHTINGENABLE = 0x17
	val LIGHTENABLE0 = 0x18
	val LIGHTENABLE1 = 0x19
	val LIGHTENABLE2 = 0x1A
	val LIGHTENABLE3 = 0x1B
	val CLIPENABLE = 0x1C
	val CULLFACEENABLE = 0x1D
	val TEXTUREMAPENABLE = 0x1E
	val FOGENABLE = 0x1F
	val DITHERENABLE = 0x20
	val ALPHABLENDENABLE = 0x21
	val ALPHATESTENABLE = 0x22
	val ZTESTENABLE = 0x23
	val STENCILTESTENABLE = 0x24
	val ANTIALIASENABLE = 0x25
	val PATCHCULLENABLE = 0x26
	val COLORTESTENABLE = 0x27
	val LOGICOPENABLE = 0x28
	val Unknown0x29 = 0x29
	val BONEMATRIXNUMBER = 0x2A
	val BONEMATRIXDATA = 0x2B
	val MORPHWEIGHT0 = 0x2C
	val MORPHWEIGHT1 = 0x2D
	val MORPHWEIGHT2 = 0x2E
	val MORPHWEIGHT3 = 0x2F
	val MORPHWEIGHT4 = 0x30
	val MORPHWEIGHT5 = 0x31
	val MORPHWEIGHT6 = 0x32
	val MORPHWEIGHT7 = 0x33
	val Unknown0x34 = 0x34
	val Unknown0x35 = 0x35
	val PATCHDIVISION = 0x36
	val PATCHPRIMITIVE = 0x37
	val PATCHFACING = 0x38
	val Unknown0x39 = 0x39
	val WORLDMATRIXNUMBER = 0x3A
	val WORLDMATRIXDATA = 0x3B
	val VIEWMATRIXNUMBER = 0x3C
	val VIEWMATRIXDATA = 0x3D
	val PROJMATRIXNUMBER = 0x3E
	val PROJMATRIXDATA = 0x3F
	val TGENMATRIXNUMBER = 0x40
	val TGENMATRIXDATA = 0x41
	val VIEWPORTX1 = 0x42
	val VIEWPORTY1 = 0x43
	val VIEWPORTZ1 = 0x44
	val VIEWPORTX2 = 0x45
	val VIEWPORTY2 = 0x46
	val VIEWPORTZ2 = 0x47
	val TEXSCALEU = 0x48
	val TEXSCALEV = 0x49
	val TEXOFFSETU = 0x4A
	val TEXOFFSETV = 0x4B
	val OFFSETX = 0x4C
	val OFFSETY = 0x4D
	val Unknown0x4E = 0x4E
	val Unknown0x4F = 0x4F
	val SHADEMODE = 0x50
	val REVERSENORMAL = 0x51
	val Unknown0x52 = 0x52
	val MATERIALUPDATE = 0x53
	val MATERIALEMISSIVE = 0x54
	val MATERIALAMBIENT = 0x55
	val MATERIALDIFFUSE = 0x56
	val MATERIALSPECULAR = 0x57
	val MATERIALALPHA = 0x58
	val Unknown0x59 = 0x59
	val Unknown0x5A = 0x5A
	val MATERIALSPECULARCOEF = 0x5B
	val AMBIENTCOLOR = 0x5C
	val AMBIENTALPHA = 0x5D
	val LIGHTMODE = 0x5E
	val LIGHTTYPE0 = 0x5F
	val LIGHTTYPE1 = 0x60
	val LIGHTTYPE2 = 0x61
	val LIGHTTYPE3 = 0x62
	val LXP0 = 0x63
	val LYP0 = 0x64
	val LZP0 = 0x65
	val LXP1 = 0x66
	val LYP1 = 0x67
	val LZP1 = 0x68
	val LXP2 = 0x69
	val LYP2 = 0x6A
	val LZP2 = 0x6B
	val LXP3 = 0x6C
	val LYP3 = 0x6D
	val LZP3 = 0x6E
	val LXD0 = 0x6F
	val LYD0 = 0x70
	val LZD0 = 0x71
	val LXD1 = 0x72
	val LYD1 = 0x73
	val LZD1 = 0x74
	val LXD2 = 0x75
	val LYD2 = 0x76
	val LZD2 = 0x77
	val LXD3 = 0x78
	val LYD3 = 0x79
	val LZD3 = 0x7A
	val LCA0 = 0x7B
	val LLA0 = 0x7C
	val LQA0 = 0x7D
	val LCA1 = 0x7E
	val LLA1 = 0x7F
	val LQA1 = 0x80
	val LCA2 = 0x81
	val LLA2 = 0x82
	val LQA2 = 0x83
	val LCA3 = 0x84
	val LLA3 = 0x85
	val LQA3 = 0x86
	val SPOTEXP0 = 0x87
	val SPOTEXP1 = 0x88
	val SPOTEXP2 = 0x89
	val SPOTEXP3 = 0x8A
	val SPOTCUT0 = 0x8B
	val SPOTCUT1 = 0x8C
	val SPOTCUT2 = 0x8D
	val SPOTCUT3 = 0x8E
	val ALC0 = 0x8F
	val DLC0 = 0x90
	val SLC0 = 0x91
	val ALC1 = 0x92
	val DLC1 = 0x93
	val SLC1 = 0x94
	val ALC2 = 0x95
	val DLC2 = 0x96
	val SLC2 = 0x97
	val ALC3 = 0x98
	val DLC3 = 0x99
	val SLC3 = 0x9A
	val CULL = 0x9B
	val FRAMEBUFPTR = 0x9C
	val FRAMEBUFWIDTH = 0x9D
	val ZBUFPTR = 0x9E
	val ZBUFWIDTH = 0x9F
	val TEXADDR0 = 0xA0
	val TEXADDR1 = 0xA1
	val TEXADDR2 = 0xA2
	val TEXADDR3 = 0xA3
	val TEXADDR4 = 0xA4
	val TEXADDR5 = 0xA5
	val TEXADDR6 = 0xA6
	val TEXADDR7 = 0xA7
	val TEXBUFWIDTH0 = 0xA8
	val TEXBUFWIDTH1 = 0xA9
	val TEXBUFWIDTH2 = 0xAA
	val TEXBUFWIDTH3 = 0xAB
	val TEXBUFWIDTH4 = 0xAC
	val TEXBUFWIDTH5 = 0xAD
	val TEXBUFWIDTH6 = 0xAE
	val TEXBUFWIDTH7 = 0xAF
	val CLUTADDR = 0xB0
	val CLUTADDRUPPER = 0xB1
	val TRXSBP = 0xB2
	val TRXSBW = 0xB3
	val TRXDBP = 0xB4
	val TRXDBW = 0xB5
	val Unknown0xB6 = 0xB6
	val Unknown0xB7 = 0xB7
	val TSIZE0 = 0xB8
	val TSIZE1 = 0xB9
	val TSIZE2 = 0xBA
	val TSIZE3 = 0xBB
	val TSIZE4 = 0xBC
	val TSIZE5 = 0xBD
	val TSIZE6 = 0xBE
	val TSIZE7 = 0xBF
	val TMAP = 0xC0
	val TEXTURE_ENV_MAP_MATRIX = 0xC1
	val TMODE = 0xC2
	val TPSM = 0xC3
	val CLOAD = 0xC4
	val CMODE = 0xC5
	val TFLT = 0xC6
	val TWRAP = 0xC7
	val TBIAS = 0xC8
	val TFUNC = 0xC9
	val TEC = 0xCA
	val TFLUSH = 0xCB
	val TSYNC = 0xCC
	val FFAR = 0xCD
	val FDIST = 0xCE
	val FCOL = 0xCF
	val TSLOPE = 0xD0
	val Unknown0xD1 = 0xD1
	val PSM = 0xD2
	val CLEAR = 0xD3
	val SCISSOR1 = 0xD4
	val SCISSOR2 = 0xD5
	val MINZ = 0xD6
	val MAXZ = 0xD7
	val CTST = 0xD8
	val CREF = 0xD9
	val CMSK = 0xDA
	val ATST = 0xDB
	val STST = 0xDC
	val SOP = 0xDD
	val ZTST = 0xDE
	val ALPHA = 0xDF
	val SFIX = 0xE0
	val DFIX = 0xE1
	val DTH0 = 0xE2
	val DTH1 = 0xE3
	val DTH2 = 0xE4
	val DTH3 = 0xE5
	val LOP = 0xE6
	val ZMSK = 0xE7
	val PMSKC = 0xE8
	val PMSKA = 0xE9
	val TRXKICK = 0xEA
	val TRXSPOS = 0xEB
	val TRXDPOS = 0xEC
	val Unknown0xED = 0xED
	val TRXSIZE = 0xEE
	val Unknown0xEF = 0xEF
	val Unknown0xF0 = 0xF0
	val Unknown0xF1 = 0xF1
	val Unknown0xF2 = 0xF2
	val Unknown0xF3 = 0xF3
	val Unknown0xF4 = 0xF4
	val Unknown0xF5 = 0xF5
	val Unknown0xF6 = 0xF6
	val Unknown0xF7 = 0xF7
	val Unknown0xF8 = 0xF8
	val Unknown0xF9 = 0xF9
	val Unknown0xFA = 0xFA
	val Unknown0xFB = 0xFB
	val Unknown0xFC = 0xFC
	val Unknown0xFD = 0xFD
	val Unknown0xFE = 0xFE
	val DUMMY = 0xFF

	// Rest of the struct
	val MAT_TEXTURE = 256 + 16 * 1
	val MAT_PROJ = 256 + 16 * 2
	val MAT_VIEW = 256 + 16 * 3
	val MAT_WORLD = 256 + 16 * 4
	val MAT_BONES = 256 + 16 * 5
}
