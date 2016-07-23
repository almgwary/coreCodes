JAVA 1995 #write once,Run any where

	- every thing is an opject
	- plate form independent -> it run on java VM
	- secure -> authentication pased on public key encryption
	- Archetichural neutral -> java compiler generat arctucural opject file format whic make the compiled code executed in many processors with presesnc of java run time envirment
	- java portable
	- Robust eliminate  error situation by emphsizing mainly on combile time erorr checking aand run time checking
	- MultiThreaded 
	
	* Java program is a collection of objects that communicate via invokinng each other methods
	 -* Opject	: is an instance of class have state and behavior
	 -* Calss	: is atemplete or blue print that discribe the behavior and stat of objects
	 -* Method	: it is behavior and where data is manublated and actoins are executed 
	 -* InstanceVariabls : variabls
	 
	* Basic Syntax 
	 -* case sensetive
	 -* upper cass class names
	 -* methods names lower case 
	 -* 
	
	
	Java Modifiers:
		 -* Access Modifer : default, public, protected, private
				// Visible to the package, the default. No modifiers are needed.
				// Visible to the class only (private).
				// Visible to the world (public).
				// Visible to the package and all subclasses (protected).
		 -* Non Acess Modifer : final,abstract, strictfp
				// The static modifier for creating class methods and variables
				// The final modifier for finalizing the implementations of classes, methods, and variables.
				// The abstract modifier for creating abstract classes and methods.
				// The synchronized and volatile modifiers, which are used for threads.
		 -* JavaEnum : make variabl have only predifined values 
				{
					enum OrangeSize{SMALL ,Medium ,Large };
					OrangeSize size ;
				
				}
	- inhertance
	- interface : contract between opjectes how they interacted. An Interface define methods sub calsses should use and implemntaion of this methods up to sub calss  
	
	# Java Opjects and calsses
		- state is stored in fields and behavior in methods
		- local variabls  : defined inside methods,costructor or blocks
							=>Local variables are implemented at stack level internally.
							  There is no default value for local variables so local
							  variables should be declared and an initial value should be 
							  assigned before the first use.
							  
		- instance variable : variable withen class but outside any methods
		- calss variables : are only one variable for all opjects and can be accessed without opject calss variables declared within calss with Static key word
							When declaring class variables as public static final, 
							then variables names (constants) are all in upper case.
							If the static variables are not public and final the 
							naming syntax is the same as instance and local variables.
							   // salary  variable is a private static variable
								private static double salary;
							   // DEPARTMENT is a constant
								public static final String DEPARTMENT = "Development ";			
		- constructor 
		- singlton Constructor
		- creat an opject
				- decalration :  variable name and opject type
				- Instantiation : new  key word  is used to creat the opject
				- Initializtion : new followed by constructor
		- accessing calss methods and parameter by dot
	#source file declaration
		- only one puplic class per file
		- source file can have multible non puplic class
		- package statment should be first statment in the file
		- import statmetn should be after backege
		- Java backeges is categories calssess and interfaces to be much easear
		- import is way to give aproper location of class to compiler
	
	#Java Basic data types
		- variables are notheing but reserved memory location to store values
		- there are two data types
			*Primitive Data Types  : predifined for java
			{
				byte:
					- Byte data type is an 8-bit signed two's complement integer.
					- Minimum value is -128 (-2^7)
					- Maximum value is 127 (inclusive)(2^7 -1)
					- Default value is 0
					- Byte data type is used to save space in large arrays, mainly in place of integers, since a byte is four times smaller than an int.
					- Example: byte a = 100 , byte b = -50
			
				short:
					- Short data type is a 16-bit signed two's complement integer.
					- Minimum value is -32,768 (-2^15)
					- Maximum value is 32,767 (inclusive) (2^15 -1)
					- Short data type can also be used to save memory as byte data type. A short is 2 times smaller than an int
					- Default value is 0.
					- Example: short s = 10000, short r = -20000
			
				int:
					Int data type is a 32-bit signed two's complement integer.
					Minimum value is - 2,147,483,648.(-2^31)
					Maximum value is 2,147,483,647(inclusive).(2^31 -1)
					Int is generally used as the default data type for integral values unless there is a concern about memory.
					The default value is 0.
					Example: int a = 100000, int b = -200000
				long:
					Long data type is a 64-bit signed two's complement integer.
					Minimum value is -9,223,372,036,854,775,808.(-2^63)
					Maximum value is 9,223,372,036,854,775,807 (inclusive). (2^63 -1)
					This type is used when a wider range than int is needed.
					Default value is 0L.
					Example: long a = 100000L, long b = -200000L
				float:
					Float data type is a single-precision 32-bit IEEE 754 floating point.
					Float is mainly used to save memory in large arrays of floating point numbers.
					Default value is 0.0f.
					Float data type is never used for precise values such as currency.
					Example: float f1 = 234.5f
				double:
					double data type is a double-precision 64-bit IEEE 754 floating point.
					This data type is generally used as the default data type for decimal values, generally the default choice.
					Double data type should never be used for precise values such as currency.
					Default value is 0.0d.
					Example: double d1 = 123.4
				boolean:
					boolean data type represents one bit of information.
					There are only two possible values: true and false.
					This data type is used for simple flags that track true/false conditions.
					Default value is false.
					Example: boolean one = true
				char:
					char data type is a single 16-bit Unicode character.
					Minimum value is '\u0000' (or 0).
					Maximum value is '\uffff' (or 65,535 inclusive).
					Char data type is used to store any character.
					Example: char letterA ='A'
			}
			*Refrence/Opject Data Types
			{
				- Reference variables are created using defined constructors of the classes. They are used to access objects. These variables are declared to be of a specific type that cannot be changed. For example, Employee, Puppy etc.
				- Class objects, and various type of array variables come under reference data type.
				- Default value of any reference variable is null.
				- A reference variable can be used to refer to any object of the declared type or any compatible type.
				- Example: Animal animal = new Animal("giraffe");
				
			}
			
	#Numbers Class
	{
			Previous Page Next Page  
			Normally, when we work with Numbers, we use primitive data types such as byte, int, long, double, etc.
			Example:
				int i = 5000;
				float gpa = 13.65;
				byte mask = 0xaf;
			However, in development, we come across situations where we need to use objects instead of primitive data types. In-order to achieve this Java provides wrapper classes
			All the wrapper classes (Integer, Long, Byte, Double, Float, Short) are subclasses of the abstract class Number.
			Number Subclasses
			The object of the wrapper class contains or wraps its respective primitive data type. converting primitive data types into object is called boxing, and this is taken care by the compiler. therefore while using a wrapper class you just need to pass the value of the primitive data type to the constructor of the Wrapper class.
			And the Wrapper object will be converted back to a primitive data type, and this process is called un boxing. The Number class is part of the java.lang package.
			Here is an example of boxing and unboxing:

			public class Test{
			   public static void main(String args[]){
				  Integer x = 5; // boxes int to an Integer object
				  x =  x + 10;   // unboxes the Integer to a int
				  System.out.println(x); 
			   }
			}
			
			This would produce the following result:
			When x is assigned integer value, the compiler boxes the integer because x is integer object. Later, x is unboxed so that they can be added as integer.
			Number Methods:
			Here is the list of the instance methods that all the subclasses of the Number class implement:
			SN	Methods with Description
			
			- xxxValue() 		Converts the value of this Number object to the xxx data type and returned it.
			- compareTo()		Compares this Number object to the argument.
			- equals()		Determines whether this number object is equal to the argument.
			- valueOf()		Returns an Integer object holding the value of the specified primitive.
			- toString()		Returns a String object representing the value of specified int or Integer.
			- parseInt()		This method is used to get the primitive data type of a certain String.
			- abs()			Returns the absolute value of the argument.
			- ceil()			Returns the smallest integer that is greater than or equal to the argument. Returned as a double.
			- floor()			Returns the largest integer that is less than or equal to the argument. Returned as a double.
			- rint()			Returns the integer that is closest in value to the argument. Returned as a double.
			- round()			Returns the closest long or int, as indicated by the method's return type, to the argument.
			- min()			Returns the smaller of the two arguments.
			- max()			Returns the larger of the two arguments.
			- exp()			Returns the base of the natural logarithms, e, to the power of the argument.
			- log()			Returns the natural logarithm of the argument.
			- pow()			Returns the value of the first argument raised to the power of the second argument.
			- sqrt()			Returns the square root of the argument.
			- sin()			Returns the sine of the specified double value.
			- cos()			Returns the cosine of the specified double value.
			- tan()			Returns the tangent of the specified double value.
			- asin()			Returns the arcsine of the specified double value.
			- acos()			Returns the arccosine of the specified double value.
			- atan()			Returns the arctangent of the specified double value.
			- atan2() 		Converts rectangular coordinates (x, y) to polar coordinate (r, theta) and returns theta.	
			- toDegrees() 	Converts the argument to degrees
			- toRadians() 	Converts the argument to radians.
			- random() 		Returns a random number.	
	}  

	#Regular Expressions
	{
			Java provides the java.util.regex package for pattern matching with regular expressions. Java regular expressions are very similar to the Perl programming language and very easy to learn.

		A regular expression is a special sequence of characters that helps you match or find other strings or sets of strings, using a specialized syntax held in a pattern. They can be used to search, edit, or manipulate text and data.

		The java.util.regex package primarily consists of the following three classes:

		Pattern Class: A Pattern object is a compiled representation of a regular expression. The Pattern class provides no public constructors. To create a pattern, you must first invoke one of its public static compile() methods, which will then return a Pattern object. These methods accept a regular expression as the first argument.

		Matcher Class: A Matcher object is the engine that interprets the pattern and performs match operations against an input string. Like the Pattern class, Matcher defines no public constructors. You obtain a Matcher object by invoking the matcher() method on a Pattern object.

		PatternSyntaxException: A PatternSyntaxException object is an unchecked exception that indicates a syntax error in a regular expression pattern.

		Capturing Groups:
		Capturing groups are a way to treat multiple characters as a single unit. They are created by placing the characters to be grouped inside a set of parentheses. For example, the regular expression (dog) creates a single group containing the letters "d", "o", and "g".

		Capturing groups are numbered by counting their opening parentheses from left to right. In the expression ((A)(B(C))), for example, there are four such groups:

		((A)(B(C)))

		(A)

		(B(C))

		(C)

		To find out how many groups are present in the expression, call the groupCount method on a matcher object. The groupCount method returns an int showing the number of capturing groups present in the matcher's pattern.

		There is also a special group, group 0, which always represents the entire expression. This group is not included in the total reported by groupCount.

		Example:
		Following example illustrates how to find a digit string from the given alphanumeric string:

		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class RegexMatches
		{
			public static void main( String args[] ){

			  // String to be scanned to find the pattern.
			  String line = "This order was placed for QT3000! OK?";
			  String pattern = "(.*)(\\d+)(.*)";

			  // Create a Pattern object
			  Pattern r = Pattern.compile(pattern);

			  // Now create matcher object.
			  Matcher m = r.matcher(line);
			  if (m.find( )) {
				 System.out.println("Found value: " + m.group(0) );
				 System.out.println("Found value: " + m.group(1) );
				 System.out.println("Found value: " + m.group(2) );
			  } else {
				 System.out.println("NO MATCH");
			  }
		   }
		}
		This would produce the following result:

		Found value: This order was placed for QT3000! OK?
		Found value: This order was placed for QT300
		Found value: 0
		Regular Expression Syntax:
		Here is the table listing down all the regular expression metacharacter syntax available in Java:

		Subexpression	Matches
		^	Matches beginning of line.
		$	Matches end of line.
		.	Matches any single character except newline. Using m option allows it to match newline as well.
		[...]	Matches any single character in brackets.
		[^...]	Matches any single character not in brackets
		\A	Beginning of entire string
		\z	End of entire string
		\Z	End of entire string except allowable final line terminator.
		re*	Matches 0 or more occurrences of preceding expression.
		re+	Matches 1 or more of the previous thing
		re?	Matches 0 or 1 occurrence of preceding expression.
		re{ n}	Matches exactly n number of occurrences of preceding expression.
		re{ n,}	Matches n or more occurrences of preceding expression.
		re{ n, m}	Matches at least n and at most m occurrences of preceding expression.
		a| b	Matches either a or b.
		(re)	Groups regular expressions and remembers matched text.
		(?: re)	Groups regular expressions without remembering matched text.
		(?> re)	Matches independent pattern without backtracking.
		\w	Matches word characters.
		\W	Matches nonword characters.
		\s	Matches whitespace. Equivalent to [\t\n\r\f].
		\S	Matches nonwhitespace.
		\d	Matches digits. Equivalent to [0-9].
		\D	Matches nondigits.
		\A	Matches beginning of string.
		\Z	Matches end of string. If a newline exists, it matches just before newline.
		\z	Matches end of string.
		\G	Matches point where last match finished.
		\n	Back-reference to capture group number "n"
		\b	Matches word boundaries when outside brackets. Matches backspace (0x08) when inside brackets.
		\B	Matches nonword boundaries.
		\n, \t, etc.	Matches newlines, carriage returns, tabs, etc.
		\Q	Escape (quote) all characters up to \E
		\E	Ends quoting begun with \Q
		Methods of the Matcher Class:
		Here is a list of useful instance methods:

		Index Methods:
		Index methods provide useful index values that show precisely where the match was found in the input string:

		SN	Methods with Description
		1	public int start()
		Returns the start index of the previous match.

		2	public int start(int group)
		Returns the start index of the subsequence captured by the given group during the previous match operation.

		3	public int end()
		Returns the offset after the last character matched.

		4	public int end(int group)
		Returns the offset after the last character of the subsequence captured by the given group during the previous match operation.

		Study Methods:
		Study methods review the input string and return a Boolean indicating whether or not the pattern is found:

		SN	Methods with Description
		1	public boolean lookingAt()
		Attempts to match the input sequence, starting at the beginning of the region, against the pattern.

		2	public boolean find()
		Attempts to find the next subsequence of the input sequence that matches the pattern.

		3	public boolean find(int start)
		Resets this matcher and then attempts to find the next subsequence of the input sequence that matches the pattern, starting at the specified index.

		4	public boolean matches()
		Attempts to match the entire region against the pattern.

		Replacement Methods:
		Replacement methods are useful methods for replacing text in an input string:

		SN	Methods with Description
		1	public Matcher appendReplacement(StringBuffer sb, String replacement)
		Implements a non-terminal append-and-replace step.

		2	public StringBuffer appendTail(StringBuffer sb)
		Implements a terminal append-and-replace step.

		3	public String replaceAll(String replacement)
		Replaces every subsequence of the input sequence that matches the pattern with the given replacement string.

		4	public String replaceFirst(String replacement)
		Replaces the first subsequence of the input sequence that matches the pattern with the given replacement string.

		5	public static String quoteReplacement(String s)
		Returns a literal replacement String for the specified String. This method produces a String that will work as a literal replacement s in the appendReplacement method of the Matcher class.

		The start and end Methods:
		Following is the example that counts the number of times the word "cat" appears in the input string:

		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class RegexMatches
		{
			private static final String REGEX = "\\bcat\\b";
			private static final String INPUT =
											"cat cat cat cattie cat";

			public static void main( String args[] ){
			   Pattern p = Pattern.compile(REGEX);
			   Matcher m = p.matcher(INPUT); // get a matcher object
			   int count = 0;

			   while(m.find()) {
				 count++;
				 System.out.println("Match number "+count);
				 System.out.println("start(): "+m.start());
				 System.out.println("end(): "+m.end());
			  }
		   }
		}
		This would produce the following result:

		atch number 1
		start(): 0
		end(): 3
		atch number 2
		start(): 4
		end(): 7
		atch number 3
		start(): 8
		end(): 11
		atch number 4
		start(): 19
		end(): 22
		You can see that this example uses word boundaries to ensure that the letters "c" "a" "t" are not merely a substring in a longer word. It also gives some useful information about where in the input string the match has occurred.

		The start method returns the start index of the subsequence captured by the given group during the previous match operation, and end returns the index of the last character matched, plus one.

		The matches and lookingAt Methods:
		The matches and lookingAt methods both attempt to match an input sequence against a pattern. The difference, however, is that matches requires the entire input sequence to be matched, while lookingAt does not.

		Both methods always start at the beginning of the input string. Here is the example explaining the functionality:

		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class RegexMatches
		{
			private static final String REGEX = "foo";
			private static final String INPUT = "fooooooooooooooooo";
			private static Pattern pattern;
			private static Matcher matcher;

			public static void main( String args[] ){
			   pattern = Pattern.compile(REGEX);
			   matcher = pattern.matcher(INPUT);

			   System.out.println("Current REGEX is: "+REGEX);
			   System.out.println("Current INPUT is: "+INPUT);

			   System.out.println("lookingAt(): "+matcher.lookingAt());
			   System.out.println("matches(): "+matcher.matches());
		   }
		}
		This would produce the following result:

		Current REGEX is: foo
		Current INPUT is: fooooooooooooooooo
		lookingAt(): true
		matches(): false
		The replaceFirst and replaceAll Methods:
		The replaceFirst and replaceAll methods replace text that matches a given regular expression. As their names indicate, replaceFirst replaces the first occurrence, and replaceAll replaces all occurrences.

		Here is the example explaining the functionality:

		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class RegexMatches
		{
			private static String REGEX = "dog";
			private static String INPUT = "The dog says meow. " +
											"All dogs say meow.";
			private static String REPLACE = "cat";

			public static void main(String[] args) {
			   Pattern p = Pattern.compile(REGEX);
			   // get a matcher object
			   Matcher m = p.matcher(INPUT); 
			   INPUT = m.replaceAll(REPLACE);
			   System.out.println(INPUT);
		   }
		}
		This would produce the following result:

		The cat says meow. All cats say meow.
		The appendReplacement and appendTail Methods:
		The Matcher class also provides appendReplacement and appendTail methods for text replacement.

		Here is the example explaining the functionality:

		import java.util.regex.Matcher;
		import java.util.regex.Pattern;

		public class RegexMatches
		{
		   private static String REGEX = "a*b";
		   private static String INPUT = "aabfooaabfooabfoob";
		   private static String REPLACE = "-";
		   public static void main(String[] args) {
			  Pattern p = Pattern.compile(REGEX);
			  // get a matcher object
			  Matcher m = p.matcher(INPUT);
			  StringBuffer sb = new StringBuffer();
			  while(m.find()){
				 m.appendReplacement(sb,REPLACE);
			  }
			  m.appendTail(sb);
			  System.out.println(sb.toString());
		   }
		}
		This would produce the following result:

		-foo-foo-foo-
		PatternSyntaxException Class Methods:
		A PatternSyntaxException is an unchecked exception that indicates a syntax error in a regular expression pattern. The PatternSyntaxException class provides the following methods to help you determine what went wrong:

		SN	Methods with Description
		1	public String getDescription()
		Retrieves the description of the error.

		2	public int getIndex()
		Retrieves the error index.

		3	public String getPattern()
		Retrieves the erroneous regular expression pattern.

		4	public String getMessage()
		Returns a multi-line string containing the description of the syntax error and its index, the erroneous regular expression pattern, and a visual indication of the error index within the pattern.
			
	}
	
	#VariableArguments(var-args):
		public static void printMax( double... numbers) {
		   if (numbers.length == 0) {
			  System.out.println("No argument passed");
			  return;
		}
	#The finalize( ) Method:
		It is possible to define a method that will be called just 
		before an object's final destruction by the garbage collector. 
		This method is called finalize( ), and it can be used to 
		ensure that an object terminates cleanly.
		
	#Java - Files and I/O
		{
					Advertisements
		 Previous Page Next Page  
		The java.io package contains nearly every class you might ever need to perform input and output (I/O) in Java. All these streams represent an input source and an output destination. The stream in the java.io package supports many data such as primitives, Object, localized characters, etc.

		Stream
		A stream can be defined as a sequence of data. there are two kinds of Streams

		InPutStream: The InputStream is used to read data from a source.

		OutPutStream: the OutputStream is used for writing data to a destination.

		 

		Java I/O Streams
		 

		Java provides strong but flexible support for I/O related to Files and networks but this tutorial covers very basic functionality related to streams and I/O. We would see most commonly used example one by one:

		Byte Streams
		Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are , FileInputStream and FileOutputStream. Following is an example which makes use of these two classes to copy an input file into an output file:

		import java.io.*;

		public class CopyFile {
		   public static void main(String args[]) throws IOException
		   {
			  FileInputStream in = null;
			  FileOutputStream out = null;

			  try {
				 in = new FileInputStream("input.txt");
				 out = new FileOutputStream("output.txt");
				 
				 int c;
				 while ((c = in.read()) != -1) {
					out.write(c);
				 }
			  }finally {
				 if (in != null) {
					in.close();
				 }
				 if (out != null) {
					out.close();
				 }
			  }
		   }
		}
		Now let's have a file input.txt with the following content:

		This is test for copy file.
		As a next step, compile above program and execute it, which will result in creating output.txt file with the same content as we have in input.txt. So let's put above code in CopyFile.java file and do the following:

		$javac CopyFile.java
		$java CopyFile
		Character Streams
		Java Byte streams are used to perform input and output of 8-bit bytes, where as Java Character streams are used to perform input and output for 16-bit unicode. Though there are many classes related to character streams but the most frequently used classes are , FileReader and FileWriter.. Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream but here major difference is that FileReader reads two bytes at a time and FileWriter writes two bytes at a time.

		We can re-write above example which makes use of these two classes to copy an input file (having unicode characters) into an output file:

		import java.io.*;

		public class CopyFile {
		   public static void main(String args[]) throws IOException
		   {
			  FileReader in = null;
			  FileWriter out = null;

			  try {
				 in = new FileReader("input.txt");
				 out = new FileWriter("output.txt");
				 
				 int c;
				 while ((c = in.read()) != -1) {
					out.write(c);
				 }
			  }finally {
				 if (in != null) {
					in.close();
				 }
				 if (out != null) {
					out.close();
				 }
			  }
		   }
		}
		Now let's have a file input.txt with the following content:

		This is test for copy file.
		As a next step, compile above program and execute it, which will result in creating output.txt file with the same content as we have in input.txt. So let's put above code in CopyFile.java file and do the following:

		$javac CopyFile.java
		$java CopyFile
		Standard Streams
		All the programming languages provide support for standard I/O where user's program can take input from a keyboard and then produce output on the computer screen. If you are aware if C or C++ programming languages, then you must be aware of three standard devices STDIN, STDOUT and STDERR. Similar way Java provides following three standard streams

		Standard Input: This is used to feed the data to user's program and usually a keyboard is used as standard input stream and represented as System.in.

		Standard Output: This is used to output the data produced by the user's program and usually a computer screen is used to standard output stream and represented as System.out.

		Standard Error: This is used to output the error data produced by the user's program and usually a computer screen is used to standard error stream and represented as System.err.

		Following is a simple program which creates InputStreamReader to read standard input stream until the user types a "q":

		import java.io.*;

		public class ReadConsole {
		   public static void main(String args[]) throws IOException
		   {
			  InputStreamReader cin = null;

			  try {
				 cin = new InputStreamReader(System.in);
				 System.out.println("Enter characters, 'q' to quit.");
				 char c;
				 do {
					c = (char) cin.read();
					System.out.print(c);
				 } while(c != 'q');
			  }finally {
				 if (cin != null) {
					cin.close();
				 }
			  }
		   }
		}
		Let's keep above code in ReadConsole.java file and try to compile and execute it as below. This program continues reading and outputting same character until we press 'q':

		$javac ReadConsole.java
		$java ReadConsole
		Enter characters, 'q' to quit.
		1
		1
		e
		e
		q
		q
		Reading and Writing Files:
		As described earlier, A stream can be defined as a sequence of data. The InputStream is used to read data from a source and the OutputStream is used for writing data to a destination.

		Here is a hierarchy of classes to deal with Input and Output streams.

		Java I/O Streams
		The two important streams are FileInputStream and FileOutputStream, which would be discussed in this tutorial:

		FileInputStream:
		This stream is used for reading data from the files. Objects can be created using the keyword new and there are several types of constructors available.

		Following constructor takes a file name as a string to create an input stream object to read the file.:

		InputStream f = new FileInputStream("C:/java/hello");
		Following constructor takes a file object to create an input stream object to read the file. First we create a file object using File() method as follows:

		File f = new File("C:/java/hello");
		InputStream f = new FileInputStream(f);
		Once you have InputStream object in hand, then there is a list of helper methods which can be used to read to stream or to do other operations on the stream.

		SN	Methods with Description
		1	public void close() throws IOException{}
		This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.

		2	protected void finalize()throws IOException {}
		This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.

		3	public int read(int r)throws IOException{}
		This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's end of file.

		4	public int read(byte[] r) throws IOException{}
		This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If end of file -1 will be returned.

		5	public int available() throws IOException{}
		Gives the number of bytes that can be read from this file input stream. Returns an int.

		There are other important input streams available, for more detail you can refer to the following links:

		ByteArrayInputStream

		DataInputStream

		FileOutputStream:
		FileOutputStream is used to create a file and write data into it. The stream would create a file, if it doesn't already exist, before opening it for output.

		Here are two constructors which can be used to create a FileOutputStream object.

		Following constructor takes a file name as a string to create an input stream object to write the file:

		OutputStream f = new FileOutputStream("C:/java/hello") 
		Following constructor takes a file object to create an output stream object to write the file. First, we create a file object using File() method as follows:

		File f = new File("C:/java/hello");
		OutputStream f = new FileOutputStream(f);
		Once you have OutputStream object in hand, then there is a list of helper methods, which can be used to write to stream or to do other operations on the stream.

		SN	Methods with Description
		1	public void close() throws IOException{}
		This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException

		2	protected void finalize()throws IOException {}
		This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.

		3	public void write(int w)throws IOException{}
		This methods writes the specified byte to the output stream.

		4	public void write(byte[] w)
		Writes w.length bytes from the mentioned byte array to the OutputStream.

		There are other important output streams available, for more detail you can refer to the following links:

		ByteArrayOutputStream

		DataOutputStream

		Example:
		Following is the example to demonstrate InputStream and OutputStream:

		import java.io.*;

		public class fileStreamTest{

		   public static void main(String args[]){
		   
		   try{
			  byte bWrite [] = {11,21,3,40,5};
			  OutputStream os = new FileOutputStream("test.txt");
			  for(int x=0; x < bWrite.length ; x++){
				 os.write( bWrite[x] ); // writes the bytes
			  }
			  os.close();
			 
			  InputStream is = new FileInputStream("test.txt");
			  int size = is.available();

			  for(int i=0; i< size; i++){
				 System.out.print((char)is.read() + "  ");
			  }
			  is.close();
		   }catch(IOException e){
			  System.out.print("Exception");
		   }	
		   }
		}
		The above code would create file test.txt and would write given numbers in binary format. Same would be output on the stdout screen.

		File Navigation and I/O:
		There are several other classes that we would be going through to get to know the basics of File Navigation and I/O.

		File Class

		FileReader Class

		FileWriter Class

		Directories in Java:
		A directory is a File which can contains a list of other files and directories. You use File object to create directories, to list down files available in a directory. For complete detail check a list of all the methods which you can call on File object and what are related to directories.

		Creating Directories:
		There are two useful File utility methods, which can be used to create directories:

		The mkdir( ) method creates a directory, returning true on success and false on failure. Failure indicates that the path specified in the File object already exists, or that the directory cannot be created because the entire path does not exist yet.

		The mkdirs() method creates both a directory and all the parents of the directory.

		Following example creates "/tmp/user/java/bin" directory:

		import java.io.File;

		public class CreateDir {
		   public static void main(String args[]) {
			  String dirname = "/tmp/user/java/bin";
			  File d = new File(dirname);
			  // Create directory now.
			  d.mkdirs();
		  }
		}
		Compile and execute above code to create "/tmp/user/java/bin".

		Note: Java automatically takes care of path separators on UNIX and Windows as per conventions. If you use a forward slash (/) on a Windows version of Java, the path will still resolve correctly.

		Listing Directories:
		You can use list( ) method provided by File object to list down all the files and directories available in a directory as follows:

		import java.io.File;

		public class ReadDir {
		   public static void main(String[] args) {
			  
			  File file = null;
			  String[] paths;
					
			  try{      
				 // create new file object
				 file = new File("/tmp");
										 
				 // array of files and directory
				 paths = file.list();
					
				 // for each name in the path array
				 for(String path:paths)
				 {
					// prints filename and directory name
					System.out.println(path);
				 }
			  }catch(Exception e){
				 // if any error occurs
				 e.printStackTrace();
			  }
		   }
		}
		This would produce following result based on the directories and files available in your /tmp directory:

		test1.txt
		test2.txt
		ReadDir.java
		ReadDir.class
		}
		
		
	#Inner Classes (Non-static Nested Classes)
			Inner classes are a security mechanism in Java. We know a class cannot be associated with the access modifier private, but if we have the class as a member of other class, then the inner class can be made private. And this is also used to access the private members of a class.

			Inner classes are of three types depending on how and where you define them. They are:

			Inner Class 
			Method-local Inner Classlass
			Anonymous Inner Class
			
	#Inhertance 
	{
		Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another. With the use of inheritance the information is made manageable in a hierarchical order.

The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class).

extends Keyword
extends is the keyword used to inherit the properties of a class. Below given is the syntax of extends keyword.

class Super{
.....
.....
}

class Sub extends Super{
.....
.....

}
Sample Code
Below given is an example demonstrating Java inheritance. In this example you can observe two classes namely Calculation and My_Calculation.

Using extends keyword the My_Calculation inherits the methods addition() and Subtraction() of Calculation class.

Copy and paste the program given below in a file with name My_Calculation.java

class Calculation{ 
   int z;
   public void addition(int x, int y){
      z=x+y;
      System.out.println("The sum of the given numbers:"+z);
   }
   public void Substraction(int x,int y){
      z=x-y;
      System.out.println("The difference between the given numbers:"+z);
   }
   
}

public class My_Calculation extends Calculation{    
  
   public void multiplication(int x, int y){
      z=x*y;
      System.out.println("The product of the given numbers:"+z);
   }
   public static void main(String args[]){
      int a=20, b=10;
      My_Calculation demo = new My_Calculation();
      demo.addition(a, b);
      demo.Substraction(a, b);
      demo.multiplication(a, b);      
      
   }

}
Compile and execute the above code as shown below

javac My_Calculation.java
java My_Calculation
After executing the program it will produce the following result.

The sum of the given numbers:30
The difference between the given numbers:10
The product of the given numbers:200
 

In the given program when an object to My_Calculation class is created, a copy of the contents of the super class is made with in it. That is why, using the object of the subclass you can access the members of a super class.

Inheritance
The Superclass reference variable can hold the subclass object, but using that variable you can access only the members of the superclass, so to access the members of both classes it is recommended to always create reference variable to the subclass.

If you consider the above program you can instantiate the class as given below as well. But using the superclass reference variable ( cal in this case ) you cannot call the method multiplication(), which belongs to the subclass My_Calculation.

Calculation cal=new My_Calculation();
demo.addition(a, b);
demo.Subtraction(a, b);
Note: A subclass inherits all the members (fields, methods, and nested classes) from its superclass. Constructors are not members, so they are not inherited by subclasses, but the constructor of the superclass can be invoked from the subclass.

The super keyword
The super keyword is similar to this keyword following are the scenarios where the super keyword is used.

It is used to differentiate the members of superclass from the members of subclass, if they have same names.

It is used to invoke the superclass constructor from subclass.

Differentiating the members
If a class is inheriting the properties of another class. And if the members of the superclass have the names same as the sub class, to differentiate these variables we use super keyword as shown below.

super.variable
super.method();
Sample Code
This section provides you a program that demonstrates the usage of the super keyword.

In the given program you have two classes namely Sub_class and Super_class, both have a method named display() with different implementations, and a variable named num with different values. We are invoking display() method of both classes and printing the value of the variable num of both classes, here you can observe that we have used super key word to differentiate the members of super class from sub class.

Copy and paste the program in a file with name Sub_class.java.

class Super_class{

   int num=20;
   
   //display method of superclass
   public void display(){   
      System.out.println("This is the display method of superclass");
   }	

}

public class Sub_class extends Super_class {

   int num=10;
   
   //display method of sub class
   public void display(){
      System.out.println("This is the display method of subclass");
   }
   
   public void my_method(){
	  
      //Instantiating subclass
      Sub_class sub=new Sub_class();
	  
      //Invoking the display() method of sub class
      sub.display();
	  
      //Invoking the display() method of superclass
      super.display();
	  
      //printing the value of variable num of subclass
      System.out.println("value of the variable named num in sub class:"+ sub.num);
		  
      //printing the value of variable num of superclass
      System.out.println("value of the variable named num in super class:"+ super.num);     
   }
   
   public static void main(String args[]){
      Sub_class obj = new Sub_class();
      obj.my_method();
      
   }
}
Compile and execute the above code using the following syntax.

javac Super_Demo
java Super
On executing the program you will get the following result:

This is the display method of subclass
This is the display method of superclass
value of the variable named num in sub class:10
value of the variable named num in super class:20
Invoking Superclass constructor
If a class is inheriting the properties of another class, the subclass automatically acquires the default constructor of the super class. But if you want to call a parametrized constructor of the super class, you need to use the super keyword as shown below.

super(values);
Sample Code
The program given in this section demonstrates how to use the super keyword to invoke the parametrized constructor of the superclass. This program contains a super class and a sub class, where the super class contains a parametrized constructor which accepts a string value, and we used the super keyword to invoke the parametrized constructor of the super class.

Copy and paste the below given program in a file with name Subclass.java

class Superclass{
   
   int age;

   Superclass(int age){
      this.age=age; 		 
   }

   public void getAge(){
      System.out.println("The value of the variable named age in super class is: " +age);
   }

}

public class Subclass extends Superclass {
   
   Subclass(int age){
      super(age);
   }

   public static void main(String argd[]){
      Subclass s= new Subclass(24);
      s.getAge();
   }

}
Compile and execute the above code using the following syntax.

javac Subclass
java Subclass
On executing the program you will get the following result:

The value of the variable named age in super class is: 24
IS-A Relationship:
IS-A is a way of saying : This object is a type of that object. Let us see how the extends keyword is used to achieve inheritance.

public class Animal{
}

public class Mammal extends Animal{
}

public class Reptile extends Animal{
}

public class Dog extends Mammal{
}
Now, based on the above example, In Object Oriented terms, the following are true:

Animal is the superclass of Mammal class.

Animal is the superclass of Reptile class.

Mammal and Reptile are subclasses of Animal class.

Dog is the subclass of both Mammal and Animal classes.

Now, if we consider the IS-A relationship, we can say:

Mammal IS-A Animal

Reptile IS-A Animal

Dog IS-A Mammal

Hence : Dog IS-A Animal as well

With use of the extends keyword the subclasses will be able to inherit all the properties of the superclass except for the private properties of the superclass.

We can assure that Mammal is actually an Animal with the use of the instance operator.

Example
class Animal{
}

class Mammal extends Animal{
}

class Reptile extends Animal{
}

public class Dog extends Mammal{

   public static void main(String args[]){

      Animal a = new Animal();
      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
}
This would produce the following result:

true
true
true
Since we have a good understanding of the extends keyword let us look into how the implements keyword is used to get the IS-A relationship.

The implements keyword is used by classes by inherit from interfaces. Interfaces can never be extended by the classes.

Example
public interface Animal {
}

public class Mammal implements Animal{
}

public class Dog extends Mammal{
}
The instanceof Keyword
Let us use the instanceof operator to check determine whether Mammal is actually an Animal, and dog is actually an Animal

interface Animal{}

class Mammal implements Animal{}

public class Dog extends Mammal{
   public static void main(String args[]){

      Mammal m = new Mammal();
      Dog d = new Dog();

      System.out.println(m instanceof Animal);
      System.out.println(d instanceof Mammal);
      System.out.println(d instanceof Animal);
   }
} 
This would produce the following result:

true
true
true
HAS-A relationship
These relationships are mainly based on the usage. This determines whether a certain class HAS-A certain thing. This relationship helps to reduce duplication of code as well as bugs.

Lets us look into an example:

public class Vehicle{}
public class Speed{}
public class Van extends Vehicle{
	private Speed sp;
} 
This shows that class Van HAS-A Speed. By having a separate class for Speed, we do not have to put the entire code that belongs to speed inside the Van class., which makes it possible to reuse the Speed class in multiple applications.

In Object-Oriented feature, the users do not need to bother about which object is doing the real work. To achieve this, the Van class hides the implementation details from the users of the Van class. So basically what happens is the users would ask the Van class to do a certain action and the Van class will either do the work by itself or ask another class to perform the action.

Types of inheritance
There are various types of inheritance as demonstrated below.

Java Tutorial
A very important fact to remember is that Java does not support multiple inheritance. This means that a class cannot extend more than one class. Therefore following is illegal:

public class extends Animal, Mammal{} 
However, a class can implement one or more interfaces. This has made Java get rid of the impossibility of multiple inheritance.
	}
	
	
	
