DESCRIPTION = "Variscite base image for SD"
require variscite-image-base.bb

IMAGE_FSTYPES = "wic.xz"

do_image_wic[depends] += "variscite-image-base:do_image_complete"
WKS_FILES = "sd.wks"
export IMAGE_BASENAME = "variscite-image-base-sd"
