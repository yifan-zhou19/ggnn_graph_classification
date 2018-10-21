package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s1 = new String(new char[300]);
		String s2 = new String(new char[300]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1 = s1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2 = s2;
		int k = 0;

		s1 = new Scanner(System.in).nextLine();
		for (; * p1 != '\0';p1++)
		{
			if (*p1 >= '0' && *p1 <= '9')
			{
				k++;
				*p2 = p1;
				p2++;
			}
			else if (k)
			{
				k = 0;
				*p2 = '\0';
				p2 = s2;
				System.out.print(s2);
				System.out.print("\n");
			}
		}
		if (k != 0)
		{
			*p2 = '\0';
			System.out.print(s2);
			System.out.print("\n");
		}

		return 0;
	}
}
