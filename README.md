# CurruncyConversionClient
This is the client side of the Currency Convertor Web Service


Run this to generate the client stub folder in intellij terminal. change the jdk path to your machine appropriately. [wsimport.exe directory] -keep -d [directory that you want to generate the codes] -p [package name] [url for wsdl file]

"C:\Program Files\Java\zulu8.66.0.15-ca-jdk8.0.352-win_x64\bin\wsimport.exe" -keep -d . -p com.sltc.soa.client.stub http://localhost:8888/CurrencyConversionService?wsdl

copy the stub folder that contain all the classes and files of the web service to the com.sltc.soa.client package in the CurrencyConversionWebServiceClient folder.

Input the correct arguments and Run 'Main'. output will be shawn in the terminal.
