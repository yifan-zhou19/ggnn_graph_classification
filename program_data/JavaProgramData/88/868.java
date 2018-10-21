package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: char* string=(char*)malloc(30);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		char string = (String)malloc(30);
		String = new Scanner(System.in).nextLine();
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = String;
		int len = String.length();
		for (;p < string + len;p++)
		{
			int anynumber = 0;
			while (*p >= '0' && *p <= '9')
			{
			System.out.printf("%c",*p);
			p++;
			anynumber++;
			}
			if (anynumber != 0)
			{
				System.out.print("\n");
			}
		}
	}
}
