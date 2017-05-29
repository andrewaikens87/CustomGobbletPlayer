#!/bin/bash

echo ""
echo "Updating jar file..."
echo ""

cd bin
jar uf ../gobbletclient.jar Players/AACO/*.class
