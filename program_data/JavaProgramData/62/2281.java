package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[50]);
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		System.out.print(str);
		for (;System.in.read() != '\n';)
		{
			str = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.out.print(" ");
			System.out.print(str);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(str,'\0',(Character.SIZE / Byte.SIZE));
		}
		System.out.print("\n");
		return 0;
	}

}

