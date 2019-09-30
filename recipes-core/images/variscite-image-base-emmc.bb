DESCRIPTION = "Variscite eMMC image"

inherit core-image
IMAGE_FSTYPES = "wic.xz"

DEPENDS += "variscite-image-base"

export IMAGE_BASENAME = "variscite-image-base-emmc"

do_image_wic[depends] += "variscite-image-base:do_image_complete"
WKS_FILES = "emmc.wks"
