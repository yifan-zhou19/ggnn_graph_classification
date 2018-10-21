package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String string;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		string = (String)malloc(101);
		String = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = String;
		int len = String.length();
		int i;
		for (i = 0;i < len - 1;i++)
		{
			System.out.printf("%c",*p + *(p + 1));
			p++;
		}
		System.out.printf("%c",*p + string);
		return 0;
	}

}
