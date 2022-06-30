function language() {

echo "Hello, Language Shell!"
# c compile and run
rm ./playground; gcc -o playground playground.c; ./playground

# php run
php playground.php

# js/ts compile and run
rm ./playground.js; tsc playground.ts; node playground.js
node playground.mjs

# java compile and run
javac playground.java; java playground

# python run
python3 playground.py

# rust compile and run
rm ./playground; rustc playground.rs; ./playground

# gradle run
gradle -q -b playground.gradle hello; rm -rf ./.gradle

# go run

mv playground.c playground.c.back;go run playground;mv playground.c.back playground.c 

}

function package() {
  # NPM: nodejs package init
  npm init -y
  # Cargo: rust package init
  cargo init;
  # go package init
  go mod init playground;
  # MVN: java package init https://maven.apache.org/guides/getting-started/
  mvn -B archetype:generate -DgroupId=me.dongqinglin -DartifactId=playground -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
  # PyBuilder: python package init: https://github.com/pybuilder/pybuilder https://packaging.python.org/en/latest/tutorials/packaging-projects/
  # pip3 install pybuilder
  pyb --start-project
  # https://conan.io/

}

language