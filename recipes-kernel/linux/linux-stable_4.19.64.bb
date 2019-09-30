FILESEXTRAPATHS_prepend := "${THISDIR}/linux:"
require linux.inc

KBRANCH = "linux-4.19.y"
LINUX_KERNEL_TYPE = "stable"
LINUX_VERSION_EXTENSION = "-${LINUX_KERNEL_TYPE}"
SRC_URI += "git://git.kernel.org/pub/scm/linux/kernel/git/stable/linux.git;branch=${KBRANCH} \
	    file://0001-dart-6ul-Add-support-for-imx6ULL-Y2-based-dart-6ul-d.patch \
	"
SRCREV = "b3060a1a313ff7a545d658378f62fe9c250acdee"
