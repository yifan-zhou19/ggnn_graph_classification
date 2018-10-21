package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p = a;
		a = new Scanner(System.in).nextLine();
		for (p = a; * p != '\0';p++)
		{
			if (*p == ' ')
			{
				if (*(p + 1) == ' ')
				{
					continue;
				}
				else
				{
					System.out.printf("%c",*p);
				}
			}
			else
			{
				System.out.printf("%c",*p);
			}
		}
	}

}
