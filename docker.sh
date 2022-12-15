#!/usr/bin/env bash


CON_NAME="fez-xpan"
IMG_NAME="lunzhoufei/xpan:latest"
DOCKERCMD=$1
echo "usage: ./docker.sh [start/stop]"


case "$DOCKERCMD" in
    build)
        docker build \
            -t $IMG_NAME \
            -f ./Dockerfile .
        ;;
    run)
        docker run \
            --name=$CON_NAME \
            -p 8080:8080 \
            -d $IMG_NAME
        ;;
esac


