DESCRIPTION = "USB DVB driver for EM28xx chipset"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-em28xx-dvb \
	firmware-dvb-fe-tda10071 \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
