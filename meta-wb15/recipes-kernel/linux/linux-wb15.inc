inherit kernel

SECTION = "kernel"

KERNEL_CONFIG_COMMAND = "oe_runmake_call -C ${S} O=${B} CC="${KERNEL_CC}" olddefconfig || oe_runmake -C ${S} O=${B} CC="${KERNEL_CC}" oldnoconfig"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

PR = "r0"

LINUX_VERSION = "${PV}"

SRC_URI = "https://www.kernel.org/pub/linux/kernel/v5.x/linux-${LINUX_VERSION}.tar.xz"
SRC_URI += "file://defconfig"

S = "${WORKDIR}/linux-${LINUX_VERSION}"
