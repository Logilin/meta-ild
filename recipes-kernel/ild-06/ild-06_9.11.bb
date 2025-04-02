
SUMMARY = "Writing Device Drivers for Linux - Chapter 06"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=e8c1458438ead3c34974bc0be3a03ed6"

inherit module

SRC_URI = "git://github.com/logilin/ild;protocol=https;branch=master;rev=9.11"

S = "${WORKDIR}/git/exemples/06-driver-reseau"

do_install() {
	oe_runmake modules_install DESTDIR=${D}
}
