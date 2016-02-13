DESCRIPTION = "USB DVB driver for dib0700 chipset"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-dvb-usb-dib0700 \
	kernel-module-dvb-usb-dibusb-common \
	kernel-module-dvb-usb-dibusb-mc \
	firmware-dvb-usb-dib0700-1.20 \
	firmware-dvb-usb-dibusb-5.0.0.11 \
	firmware-dvb-usb-dibusb-6.0.0.8 \
	firmware-dvb-usb-dibusb-an2235-01 \
	firmware-xc3028-v27 \
	firmware-xc3028l-v36 \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
