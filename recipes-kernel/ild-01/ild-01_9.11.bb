
SUMMARY = "Writing Device Drivers for Linux - Chapter 01"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

inherit module

SRC_URI = "git://github.com/logilin/ild;protocol=https;branch=master"
SRCREV = "${AUTOREV}

S = "${WORKDIR}/git/exemples/01-noyau-et-modules"

do_install() {
	oe_runmake modules_install DESTDIR=${D}
}
