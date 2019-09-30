SUMMARY = "Base image for variscite Distribution"
HOMEPAGE = "https://www.variscite.com"
LICENSE = "MIT"
inherit core-image

IMAGE_LINGUAS = "en-us"

IMAGE_INSTALL = "\
	packagegroup-core-boot \
	kernel-modules \
"
export IMAGE_BASENAME = "variscite-image-base"
