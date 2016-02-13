DESCRIPTION = "USB DVB driver for Afatech 9015 chipset"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-dvb-usb-af9015 \
	firmware-dvb-usb-af9015 \
	firmware-dvb-fe-af9013 \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
