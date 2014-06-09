# Base this image on rpi-hwup-image
include rpi-hwup-image.bb

IMAGE_FEATURES += "ssh-server-dropbear splash"

# Install aditional packages
IMAGE_INSTALL += " \
	icu \
	wpa-supplicant \
	iptables \
	perl \
	i2c-tools \
	evtest \
"
