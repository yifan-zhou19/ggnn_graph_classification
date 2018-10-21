package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		int k = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		str = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
		str = new Scanner(System.in).nextLine();
		p = str;
		for (;p < str.Substring(30);p++)
		{
			if (*p >= '0' && *p <= '9')
			{
				System.out.printf("%c",*p);
				k = 1;
			}
			else if (k)
			{
				System.out.print("\n");
				k = 0;
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(str);
	}

}
