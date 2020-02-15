#!/bin/bash
echo "# Show App Files"
echo "## PropertyReader"
cat src/main/java/micronaut/env/demo/PropertyReader.java
echo "---"
echo "## application.yml"
cat src/main/resources/application.yml
echo "---"
echo "# Run app"
set -x
export MICRONAUT_ENVDEMO_GREETING=Hi
./gradlew run

