<h4>Project With XML Runners </h4>

- This project about preparing test suite with testNG and running with against different browser which is cross browser test

- if you want to run this project:
- a.
<br>
1. You can go to runners package and choose one xml runner
<img src="src/test/resources/Screen Shot 2022-08-21 at 5.39.59 PM.png">
2. Right click on it and run it
<img src="src/test/resources/Screen Shot 2022-08-21 at 5.41.16 PM.png">
<br>
- b. You can use maven command

````
mvn clean test -DsuiteXmlFile=src/test/java/com/cydeo/tests/runners/smoke_test_runner.xml
````