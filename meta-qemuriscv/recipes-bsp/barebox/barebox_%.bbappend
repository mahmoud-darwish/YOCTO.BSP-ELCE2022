BAREBOX_FIRMWARE_DIR = "${B}/firmware"

DEPENDS:append = "\
	firmware-imx-8m \
	trusted-firmware-a \
"

do_compile:prepend() {
	mkdir -p ${BAREBOX_FIRMWARE_DIR}

	cd ${DEPLOY_DIR_IMAGE}
	for fw in ${DDR_FIRMWARE_NAME}; do
		cp ${fw} ${BAREBOX_FIRMWARE_DIR}
	done

	cp bl31-imx8mm.bin ${BAREBOX_FIRMWARE_DIR}/imx8mm-bl31.bin
}

COMPATIBLE_MACHINE = "(wb15)"
