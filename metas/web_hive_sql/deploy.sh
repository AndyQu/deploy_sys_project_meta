#@IgnoreInspection BashAddShebang
#必须在srqserver工程根目录下面执行
/bin/bash -c "./gradlew --info clean build" 
/bin/bash -c "(java -server -jar build/libs/hivesql-0.1.0.jar > /tmp/logs/web-hive-sql/jar.log 2>&1 &)"