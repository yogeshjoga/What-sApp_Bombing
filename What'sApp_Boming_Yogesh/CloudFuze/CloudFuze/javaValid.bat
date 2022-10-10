@echo off
echo Checking java is install or not in your device.....
where java >nul 2>nul
if %errorlevel%==1 ( @echo Java not found in your device please install it. you can install JDK OR JRE minmun jdk version 8 Pluse is required...) else ( start java -jar CloudFuze.jar )