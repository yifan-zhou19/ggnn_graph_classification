package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		String str = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		p1 = a;
		p2 = str;
		int num = 0;
		while (*p1 != '\0')
		{
			if ((*p1) >= '0' && (*p1) <= '9')
			{
				*p2 = p1;
			p1++;
			p2++;
			num = 0;
			}
			if (((*p1) < '0' || (*p1)>'9') && num == 0)
			{
				*p2 = '\0';
												 p2 = str;
												 System.out.print(p2);
												 System.out.print("\n");
												 p1++;
												 num++;
			}
			if (((*p1) < '0' || (*p1)>'9') && num > 0)
			{
				p1++;
			}

		}

		  return 0;
	}
}
