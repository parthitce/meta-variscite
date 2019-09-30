MACHINEOVERRIDES =. "mx6:mx6ull:"
include conf/machine/include/tune-cortexa7.inc

# u-boot
PREFERRED_PROVIDER_virtual/bootloader ?= "u-boot"
PREFERRED_PROVIDER_u-boot ?= "u-boot"

UBOOT_NAME ?= "u-boot-dtb"
UBOOT_ENTRYPOINT ?= "0x87800000"
UBOOT_SUFFIX ?= "img"
SPL_BINARY ?= "SPL"
UBOOT_BINARY ?= "${UBOOT_NAME}.${UBOOT_SUFFIX}"
UBOOT_CONFIG ?= "mmc"
UBOOT_CONFIG[mmc] = "variscite_dart6ul_defconfig"

# kernel
PREFERRED_PROVIDER_virtual/kernel ?= "linux-stable"
KERNEL_DEVICETREE ?= "imx6ull-var-dart-5g-emmc_wifi.dtb"

FITLOADADDR ?= "0x82000000"
KERNEL_CLASSES += "kernel-fitimage"
KERNEL_IMAGETYPE ?= "fitImage"

SERIAL_CONSOLES ?= "115200;ttymxc0"
IMAGE_BOOT_FILES ?= "fitImage-${MACHINE}.bin;fitImage"

EXTRA_IMAGEDEPENDS += "u-boot"
IMAGE_FSTYPES ?= "ext4"
