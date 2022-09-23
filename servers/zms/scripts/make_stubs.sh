#!/bin/bash

# If the zms_core dependency has been updated, then this script should be run
# manually to pick up the latest rdl to generate the appropriate server stubs.

# Note this script is dependent on the rdl utility.
# go get github.com/ardielle/ardielle-tools/...
# however, we're not going to run this utility during our automated builds since
# builds must be done based on files already checked-in into git

if [ ! -z "${SCREWDRIVER}" ] || [ ! -z "${TRAVIS_PULL_REQUEST}" ] || [ ! -z "${TRAVIS_TAG}" ]; then
    echo >&2 "------------------------------------------------------------------------";
    echo >&2 "SOURCE NOTICE";
    echo >&2 "------------------------------------------------------------------------";
    echo >&2 "Automated Build. Skipping source generation...";
    exit 0;
fi

if [ -x "$(command -v go)" ]; then
    go install github.com/ardielle/ardielle-tools/...
fi

command -v rdl >/dev/null 2>&1 || {
    echo >&2 "------------------------------------------------------------------------";
    echo >&2 "SOURCE WARNING";
    echo >&2 "------------------------------------------------------------------------";
    echo >&2 "Please install rdl utility: go install github.com/ardielle/ardielle-tools/...";
    echo >&2 "Skipping source generation...";
    exit 0;
}

RDL_ZMS_FILE=src/main/rdl/ZMS.rdl

echo "Generate the server stubs"
rdl -s generate -b="/v1" -o="src/main/java" athenz-server $RDL_ZMS_FILE

# Copyright The Athenz Authors
# Licensed under the terms of the Apache version 2.0 license. See LICENSE file for terms.
