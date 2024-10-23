require recipes-bsp/barebox/barebox.inc

SRC_URI += " \
    file://defconfig \
    file://env \
"

require files/patches/series.inc

EXTRA_OEMAKE += "PKG_CONFIG_PATH=${STAGING_DIR_NATIVE}${nonarch_libdir}/pkgconfig"

SRC_URI[sha256sum] = "1b31c1bf52f73f8a5f4f82169765ecd5b1bccc8abe9221537a0716004983bdb3"

export KBUILD_BUILD_USER ?= "oe-user"
export KBUILD_BUILD_HOST ?= "oe-host"
