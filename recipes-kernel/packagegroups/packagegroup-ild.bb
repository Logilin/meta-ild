DESCRIPTION = "Packagegroup to compile all examples of our 'Linux Devices Drivers' training course."

inherit packagegroup

#LICENSE = "GPL-2.0-only"
#LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0-only;md5=801f80980d171dd6425610833a22dbe6"

RDEPENDS:${PN} = "ild-01 ild-02 ild-03 ild-04 ild-05 ild-06 ild-07"
