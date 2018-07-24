SwingJS-Examples is the test project that Bob Hanson uses for all 
official testing of SwingJS, always with the latest version 
of SwingJS-site.zip and net.sf.j2s.core.jar

You can unzip dist/site.zip to test SwingJS on your machine locally.
Just unzip the file and open one of the many html files in the site/ directory.

Or you can check out the project and do your own tests. 

By extending test.Test_., all Test_Foo classes 
automatically enable assert(), which is used extensively. 

For developers who want to create their own tests:

The swingjs/ directory holds four files:

net.sf.j2s.core.jar
SwingjS-site.zip     
build-site.xml
timestamp 

net.sf.j2s.core.jar is the Java2Script transpiler as an Eclipse plugin.
The transpiler needs to be put in the Eclipse dropins directory. 
If you already have one there, you should run Eclipse with the -clean flag
so that it resets its plugin information from the new version. 
It is purposely left without versioning because we had problems with
Eclipse not updating if a file with a new name was put in, and it makes the 
update simpler. 

SwingJS-site.zip holds the core JavaScript for SwingJS; basically the 
Java JVM in JavaScript.

build-site.xml is a simple ANT task that just unzips SwingJS-site.zip 
into your site/ directory.

timestamp is a one-line file that gives the latest date of the transpiler or runtime.

