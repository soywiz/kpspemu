package com.soywiz.kpspemu.embedded

import com.soywiz.korio.crypto.*
import com.soywiz.kpspemu.*

object Samples : BaseTest() {
    val MINIFIRE_ELF by lazy {
        Base64.decode(
            "" +
                    "f0VMRgEBAQAAAAAAAAAAAAIACAABAAAACACQCDwAAAA0AAAAATCiEDQAIAABACgA\n" +
                    "AwACAAAAAAAAAAAAAQAAALAAAAAAAJAIAACQCNgBAADYAQAABwAAABAAAAABAAAA\n" +
                    "AQAAAAIAAAAAAJAIsAAAANgBAAAAAAAAAAAAAAQAAAAAAAAAAAAAAAMAAAAAAAAA\n" +
                    "AAAAAIgCAAAXAAAAAAAAAAAAAAABAAAAAAAAAAAAAAAAAAEBVU5QAJAIEDwEAAQm\n" +
                    "UAAFJhQABiQCAAc8AIAIPCFIAAAAAAAAAAAAAAAAAAAAAAAATBsIACEgQAAhKAAA\n" +
                    "ITAAAMwbCAAhIAAATBwIACD2vSchIKADzC8IAKAIETywCBI8AEQQPCEgAADgAQUk\n" +
                    "EAEGJIxOCAAhECACALYINAAAQKD//wgl/f8BBQEAQiQAtDQ2/wGTJiEgoAMMMAgA\n" +
                    "AQCUJisYkwL7/2AUAACCov4BFSQhIKADDDAIAFkAAyQCAGAUGwBDAA0ABwASEAAA\n" +
                    "EBgAAAEAYyRAGgMAIKBxACQQVQABAEIkIKCCAgAAlaJZAAgkALIpNgCySzb+ASol\n" +
                    "AAIkkQECJZEhIIUAAgIlkSEghQABACWRISCFAIIgBAABAIBc//+EJAEAZKEBACkl\n" +
                    "KxAqAfL/QBQBAGsl//8IJQL8ayXt/wAdAvwpJRAACDwmgAgCIRAAAiFAAAAhUEAC\n" +
                    "ISAAAgACSyUAAEKRAACCrAAIgqwAEIKsAQBKJSsYSwH5/2AUBACEJAEACCVaAAIt\n" +
                    "9P9AFAAQhCTQCaQnAQAFJAxUCADUCaiPAQAAVcw6CADMUQgAISAAAgACBSQDAAYk\n" +
                    "AQAHJMxPCAAhQCACIYhAAiQAJAohkAABAC5yb2RhdGEuc2NlTW9kdWxlSW5mbwA="
        )
    }
}