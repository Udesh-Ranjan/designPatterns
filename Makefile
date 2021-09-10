christmasTree: clean-christmasTree build-christmasTree launch-christmasTree

clean-christmasTree:
	rm -rf ./christmasTree/*.class
build-christmasTree:
	javac decoratorDP/christmasTree/mainClass/MainClass.java -d out 
launch-christmasTree:
	cd out && java decoratorDP.christmasTree.mainClass.MainClass && cd - 

