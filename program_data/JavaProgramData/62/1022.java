package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String c = new String(new char[100]);
	c = ConsoleInput.readToWhiteSpace(true).charAt(0);
	System.out.print(c);
	String a = new String(new char[100]);
	while ((a = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	{
	System.out.print(' ');
	System.out.print(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	memset(a,0,(Character.SIZE / Byte.SIZE));
	}
	}
}

