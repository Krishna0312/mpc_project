# Mobile and Pervasive Computing - Course Project
# Course Instructor: Dr. Suchetnama'am Chakraborty
# Made by: Krishna Thoriya (B19EE084), Jai Arora (B19EE094)

>## What is CropChecker?
The app to detect any type of diseases of the selected plant leaf image. We first need to upload a clear image of any leaf (from the 13 mentioned category). After uploading, on clicking on 'check', we will get the predicted plant disease along with plant name.

>## How did we develop it?
1. Data accessed from PlantDoc which is having around 13 types of plants with diseases(including healthy ones) and labels are given.
2. Built ResNet-50 based CNN model to forecast healthy/diseased plants where model achieved accuracy upto 97-98%.
3. To integrate the trained model, we converted it into TFlite.
4. Built an android application with simple yet easy-to-operate application.
5. Created the UI using javascript and deployed the model on the app: Crop Checker

>## Run the Crop Checker in your android studio!!! 
1. Clone the repo in your local system using following command
`https://github.com/Mobile-and-Pervasive-Computing-Projects/course-projects-Saptashrungi`
2. Ensure the android studio is ready to be used in your system. 
3. Open the studio and open a new file. 
4. Select the folder/zip file you cloned and extracted from the git link
5. Wait for it to get loaded and then select any emulator (Mostly Nexus 6 with Pie enabled) (Under Tools/ Device Manager)
6. Wait for it to load the android screen
7. Hit 'Run app' and wait for a couple of minutes and Hurrahhhhh!!!!



