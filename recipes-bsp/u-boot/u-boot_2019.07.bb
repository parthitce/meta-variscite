FILESEXTRAPATHS_append := "${THISDIR}/${PN}:"
require recipes-bsp/u-boot/u-boot-common.inc
require recipes-bsp/u-boot/u-boot.inc

DEPENDS += "bc-native dtc-native"
SRC_URI += "file://0001-imx-variscite-Fix-regression-of-SPL-and-U-boot-booti.patch \
	    file://0001-spl-imx6-Let-spl_boot_device-return-USDHC1-or-USDHC2.patch \
	"
SRCREV = "e5aee22e4be75e75a854ab64503fc80598bc2004"
