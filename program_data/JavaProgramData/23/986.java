package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
		String p2;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		a = new Scanner(System.in).nextLine();
		for (p1 = a; * p1 != '\0';p1++)
		{
			;
		}
		p2 = p1;
		do
		{
			p1--;
			while (*p1 != ' ' && p1 > a)
			{
				p1--;
			}
			if (p1 != a)
			{
				for (p = p1 + 1;p < p2;p++)
				{
					System.out.printf("%c",*p);
				}
				System.out.print(" ");
			}
			else
			{
				for (p = p1;p < p2;p++)
				{
					System.out.printf("%c",*p);
				}
			}
			p2 = p1;
		}while (p1 > a);
		return 0;
	}

}
