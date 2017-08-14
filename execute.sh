rm -rf gen

mkdir gen

javac -d gen -cp "./lib/*" src/com/cmd/*.java 

echo "--------------------------------------------------"
echo "Current Directory listing"
echo "--------------------------------------------------"

ls
echo "--------------------------------------------------"
echo "Current Directory Path"
echo "--------------------------------------------------"

pwd

echo "--------------------------------------------------"
echo "Fired the core command"
echo "--------------------------------------------------"

java -cp ".:./lib/*:./gen/" org.testng.TestNG testng.xml
