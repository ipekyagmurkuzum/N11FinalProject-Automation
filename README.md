# N11 QA BOOTCAMP FINAL PROJECT CASE1
## Description
This is a test automation project for getting every campaign's url under every category on N11 Campaigns page and writing them to a CSV file. 
## Run the Project

After cloning the project, simply write
```
mvn clean verify
```
to your terminal to run the test. Running this code block will generate the CSV file with the name "*campaign_urls_file.csv*" under this path:
```
N11TestCase1/src/test/resources/generatedFile
```
Also an html report will be generated on this path:
```
N11TestCase1/target/site/serenity/index.html
```

## Test Output

Generated **CSV** looks like this:

<img src="outputImages/csv.png"/>

Generated report looks like this if test is **passed**:

<img src="outputImages/passed.png"/>

Generated report looks like this if test is **failed**

<img src="outputImages/failed.png"/>
