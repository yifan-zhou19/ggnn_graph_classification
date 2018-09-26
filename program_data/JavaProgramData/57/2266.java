package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
	int n;
	int i;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	System.in.read();
	for (i = 0;i < n;i++)
	{



		a = new Scanner(System.in).nextLine();
		p = a + a.length() - 1;
		if (*p == 'r')
		{
			for (p = a;p < a + a.length() - 2;p++)
			{
				System.out.printf("%c",*p);
			}
		}
		else if (*p == 'y')
		{
			for (p = a;p < a + a.length() - 2;p++)
			{
				System.out.printf("%c",*p);
			}
		}
		else if (*p == 'g')
		{
			for (p = a;p < a + a.length() - 3;p++)
			{
				System.out.printf("%c",*p);
			}
		}
		System.out.print("\n");
	}
	return 0;
	}

}

