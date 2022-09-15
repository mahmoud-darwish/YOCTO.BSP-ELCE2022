inherit bootspec

IMAGE_FEATURES += "ssh-server-dropbear"

IMAGE_INSTALL:append = "\
    less \
    util-linux \
    rauc \
"

BOOTSPEC_EXTRALINE = "linux-appendroot true\n"
