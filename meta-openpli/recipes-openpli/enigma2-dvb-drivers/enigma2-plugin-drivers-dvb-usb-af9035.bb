DESCRIPTION = "USB DVB driver for af9035 devices"

require conf/license/openpli-gplv2.inc

inherit allarch

RRECOMMENDS_${PN} = " \
	kernel-module-dvb-usb-af9035 \
	kernel-module-af9033 \
	kernel-module-tua9001 \
	kernel-module-mxl5007t \
	kernel-module-tda18218 \
	firmware-dvb-usb-af9035-01 \
	firmware-dvb-usb-af9035-02 \
	firmware-dvb-usb-it913x \
	"

PV = "2"

ALLOW_EMPTY_${PN} = "1"
