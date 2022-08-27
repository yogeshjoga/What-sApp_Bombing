#!/bin/bash

echo "Hello this is YOGESH JOGA CHAT BOMBING TOOL FUN WITH YOUR FRIENDS"
echo "Enter your name"
read name
echo "you need to follow some rules we are working on it actually, give the correct delay time per sec it will send 100 so how may"
echo "humderads you need to pass the value of hunderads of number"
echo "If you want to clear screen "
read num
if [ $num -gt 0 ]
then
		echo "now, clear your screen...."
		clear
		java -jar yogeshbomb.jar
fi
java -jar yogeshbomb.jar
