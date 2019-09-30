# meta-variscite image build

## Required packages on Ubuntu

This section provides required packages on an Ubuntu Linux distribution:

### Essentials

Packages needed to build an image for a headless system:

```shell
$ sudo apt-get install gawk wget git-core diffstat unzip texinfo gcc-multilib \
    build-essential chrpath socat cpio python python3 python3-pip python3-pexpect \
    xz-utils debianutils iputils-ping python-git repo bmap-tools
```

## Download meta-variscite project manifest

To easily manage different git repositories layers, meta-variscite project is using [Android repo tool](https://source.android.com/source/using-repo),

First initialize repo specifying the project manifest and the corresponding branch:

```shell
$ repo init -u https://github.com/linumiz/meta-variscite.git -m conf/samples/variscite.xml -b master 
```

then checkout the project source tree:

```shell
$ repo sync -j10
```

## Configuring the project

meta-variscite offers pre-configured machine templates, tested and ready to use.

- variscite

```shell
$ cd variscite/
$ TEMPLATECONF=meta-variscite/conf/samples/ source oe-init-build-env
```

## Build the project
### SD image
```shell
$ bitbake variscite-image-base-sd
```
### eMMC image
```shell
$ bitbake variscite-image-base-emmc
```

## Flashing the Image
### SD image
After successfull compilation you will find the image in below name, which can be
directly flashed into SD card
```shell
dd if=./variscite-image-base-sd.wic of=/dev/sdX bs=10M 
```

### eMMC image
Pre-requiste SD image flashed and sucessfull linux booting. Copy below two images to SD card
```shell
dd if=./variscite-image-base-emmc.wic of=/dev/mmcblkX bs=10M
```
