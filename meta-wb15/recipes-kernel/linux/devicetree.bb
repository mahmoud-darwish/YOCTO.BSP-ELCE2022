# Copyright (C) 2021 Enrico Jorns <ejo@pengutronix.de>
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "WB15 device trees"
LICENSE = "GPL-2.0-or-later | MIT"
SECTION = "bsp"

inherit devicetree

FILESEXTRAPATHS:append := "${THISDIR}/linux-wb15:"

SRC_URI = " \
	file://imx8mm-innocomm-wb15.dtsi	\
	file://imx8mm-innocomm-wb15-evk.dts	\
"

COMPATIBLE_MACHINE = "(wb15)"
