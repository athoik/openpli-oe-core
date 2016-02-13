DESCRIPTION = "USB DVB driver for pctv452e chipsets"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-dvb-usb-pctv452e \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
