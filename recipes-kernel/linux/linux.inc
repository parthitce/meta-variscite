SECTION = "kernel"
DESCRIPTION = "Mainline Linux kernel"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

inherit kernel
inherit kernel-yocto 
require recipes-kernel/linux/linux-yocto.inc

FILESEXTRAPATHS_append := "${THISDIR}/${PN}-${PV}:"

S = "${WORKDIR}/git"
SRC_URI = "file://defconfig"

# Exclude this from generation of mirror tarballs
BB_GENERATE_MIRROR_TARBALLS = "0"
# Make sure to fetch from BitBucket by allowing network access and clearing premirrors
BB_FETCH_PREMIRRORONLY = "0"
PREMIRRORS = ""
