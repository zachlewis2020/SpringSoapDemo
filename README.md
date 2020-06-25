# SpringSoapDemo
# Demo Basic Soap

# set PATH to Java 8.x
   . ./path

# Build
   mvn clean
   mvn package

# Run Server
   java -jar target/*.jar &

# WSDL from Web Browser
http://localhost:8080/ws/mydata.wsdl

# Run Client
   curl -fsSL --header "content-type: text/xml"  -d @requests.xml http://localhost:8080/ws/
