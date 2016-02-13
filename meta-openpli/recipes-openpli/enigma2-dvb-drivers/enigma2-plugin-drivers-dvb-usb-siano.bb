DESCRIPTION = "USB DVB driver for Siano chipset"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-smsusb \
	kernel-module-smsdvb \
	firmware-dvb-siano \
	firmware-dvb-nova-12mhz-b0 \
	firmware-isdbt-nova-12mhz-b0 \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
