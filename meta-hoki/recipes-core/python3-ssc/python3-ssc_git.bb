SUMMARY = "Program/Library to read sensor values using Qualcomm's SSC bus"
HOMEPAGE = "https://github.com/1337Misom/python-ssc"

LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=1ebbd3e34237af26da5dc08a4e440464"

SRC_URI = "git://github.com/1337Misom/python-ssc.git;protocol=https;branch=main"

PV = "+git"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"

DEPENDS += "python3 python3-protobuf python3-pygobject"

RDEPENDS:${PN} += " \
    python3-asyncio \
    python3-protobuf \
    python3-pygobject \
"

inherit python_setuptools_build_meta
