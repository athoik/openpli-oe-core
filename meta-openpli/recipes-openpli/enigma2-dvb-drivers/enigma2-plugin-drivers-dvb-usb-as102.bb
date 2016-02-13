DESCRIPTION = "USB DVB driver for AS102 chipset"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-dvb-as102 \
	firmware-as102-data1-st \
	firmware-as102-data2-st \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
