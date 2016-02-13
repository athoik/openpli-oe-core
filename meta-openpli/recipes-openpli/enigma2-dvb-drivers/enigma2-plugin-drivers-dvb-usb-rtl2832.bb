DESCRIPTION = "USB DVB driver for Realtek RTL2832 chipset"

require conf/license/openpli-gplv2.inc

inherit allarch

RRECOMMENDS_${PN} = " \
    kernel-module-dvb-usb-rtl2832 \
    kernel-module-dvb-usb-rtl28xxu \
    kernel-module-rtl2832 \
    kernel-module-e4000 \
    kernel-module-r820t \
    kernel-module-mt2266 \
    kernel-module-fc0013 \
    firmware-dvb-usb-af9035-01 \
    firmware-dvb-usb-af9035-02 \
    firmware-dvb-usb-af9015 \
    "

PV = "2"

ALLOW_EMPTY_${PN} = "1"
