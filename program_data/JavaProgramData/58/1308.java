package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int mark;
		final String a = "";
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < n;i++)
		{
			a = new Scanner(System.in).nextLine();
			m = a.length();
			for (p = a; * p != '\0';p++)
			{
				if ((*p == '_') || (*p >= '0' && *p <= '9') || (*p >= 'a' && *p <= 'z') || (*p >= 'A' && *p <= 'Z'))
				{
					mark = 1;
				}
				else
				{
					mark = 0;
				break;
				}
			}
			p = a;
			if (*p >= '0' && *p <= '9')
			{
				mark = 0;
			}
			System.out.printf("%d\n",mark);
		}
		return 0;
	}

}

