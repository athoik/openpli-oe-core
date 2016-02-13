DESCRIPTION = "USB DVB driver for dtt200u chipsets"

require conf/license/openpli-gplv2.inc

inherit allarch

RDEPENDS_${PN} = " \
	kernel-module-dvb-usb-dtt200u \
	firmware-dvb-usb-dtt200u-01 \
	firmware-dvb-usb-wt220u-02 \
	firmware-dvb-usb-wt220u-fc03 \
	firmware-dvb-usb-wt220u-miglia-01 \
	firmware-dvb-usb-wt220u-zl0353-01 \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
