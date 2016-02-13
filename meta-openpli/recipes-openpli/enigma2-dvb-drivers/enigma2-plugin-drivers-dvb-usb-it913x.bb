DESCRIPTION = "USB DVB driver for it913x chipsets"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-dvb-usb-it913x \
	firmware-dvb-usb-it913x \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
