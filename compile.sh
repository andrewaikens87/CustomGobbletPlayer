#!/bin/bash

echo ""
echo "Compiling Gobblet code...."
echo ""

javac -cp .:gobbletclient.jar -d bin/ src/Players/AACO/*.java
