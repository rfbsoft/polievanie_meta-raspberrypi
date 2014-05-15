# original repository
#SRCREV = "b09a27249d61475e4423607f7632a5aa6e7b3a53"
#SRC_URI = "git://github.com/raspberrypi/linux.git;protocol=git;branch=rpi-3.12.y \
#           file://sl030raspberrypii2ckernel.patch \
#          "

# local repository
SRCREV = "polievanie"
SRC_URI = "git:///srv/workspace/raspberrypi/workspace/kernel_3.12.18;branch=polievanie;protocol=file"

require linux-raspberrypi.inc
