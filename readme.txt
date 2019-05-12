1. Instruction
This project is basically a standard Java 8 maven project. Make sure Java 8 SDK is installed first. In order to run it, first import this project in IDE. ( I am using Spring Tool Suite 3, Version: 3.9.8.RELEASE on Platform: Eclipse 4.11.0). For STS, then right click on the project -> Run As -> Maven Install to build it. After building succeeds, go to target folder under the project root directory in windows console and execute the following command:
java -jar fguo-fibonnaci-0.0.1-SNAPSHOT.jar Application

You can also use other IDE, e.g. NetBeans, or maven commands to build this project.

2. Sample output
Please input the number[1-2147483647] of fibonnaci numbers that you want to output.
100
The first 100 numbers within the Fibonnaci sequence are: 
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765 10946 17711 28657 46368 75025 121393 196418 317811 514229 832040 1346269 2178309 3524578 5702887 9227465 14930352 24157817 39088169 63245986 102334155 165580141 267914296 433494437 701408733 1134903170 1836311903 2971215073 4807526976 7778742049 12586269025 20365011074 32951280099 53316291173 86267571272 139583862445 225851433717 365435296162 591286729879 956722026041 1548008755920 2504730781961 4052739537881 6557470319842 10610209857723 17167680177565 27777890035288 44945570212853 72723460248141 117669030460994 190392490709135 308061521170129 498454011879264 806515533049393 1304969544928657 2111485077978050 3416454622906707 5527939700884757 8944394323791464 14472334024676221 23416728348467685 37889062373143906 61305790721611591 99194853094755497 160500643816367088 259695496911122585 420196140727489673 679891637638612258 1100087778366101931 1779979416004714189 2880067194370816120 4660046610375530309 7540113804746346429 12200160415121876738 19740274219868223167 31940434634990099905 51680708854858323072 83621143489848422977 135301852344706746049 218922995834555169026 

3. How to make the project more maintainable
(1)Make error handling better. This includes handling more conerner cases, outputing more detailed, accureate and straightforward error messages, using logger, e.g. log4j2
(2)Make more unit tests(I did) and integration tests to cover as more secnarios as possible
(3)Comment the code as much as necessary also keep code comment itself as much as possible. Basically the classes and public members and methods should have comments in JavaDoc form and generate Java doc(I did) when building the project and make the java doc easily accessible for developers
(4)Well document the usage of the applications
(5)Follow code convention and standards, e.g. good naming, DRY(Don't repeat yourself), etc
(6)Make code as concise as possible
(7)Make the code more testable, reusable and easily be modified, e.g. make classes less coupling, use interfaces to declare members, avoid big methods and classes, etc. For example, I made FibonnaciGenerator have the OutputWriter interface for its output job which decouples ouput and fibonnaci generation, and also make it easier to do other type of output in the future, e.g. outupt to file. A file output is more convenient for troubleshooing. I didn't make a FileOutputWriter for now since this code test only requires printing the result out.
(8)Remove any ineffective code instead of commenting it out. Let's Github keep the code history


