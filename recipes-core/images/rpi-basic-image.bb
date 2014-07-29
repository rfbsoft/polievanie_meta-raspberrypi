# Base this image on rpi-hwup-image
include rpi-hwup-image.bb

IMAGE_FEATURES += "ssh-server-openssh splash"

IMAGE_OVERHEAD_FACTOR = "3.0"

# Install aditional packages
IMAGE_INSTALL += " \
	icu \
	wpa-supplicant \
	iptables \
	perl \
	i2c-tools \
	evtest \
	rpm \
	watchdog \
	glib-2.0 \
	glib-2.0-bash-completion \
	glib-2.0-codegen \
	glib-2.0-locale-sk \
	glib-2.0-ptest \
	glib-2.0-utils \
	gdbserver \
	e2fsprogs \
	dosfstools \
	openssh-sftp-server \
"
