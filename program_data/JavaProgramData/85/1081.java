package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[100]);
	int i;
	int n;
	int m = 1;
	int length;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}

	for (i = 0;i < n + 1;i++)
	{
	a = new Scanner(System.in).nextLine();
		p = a;
		if (!((*p == '_') || (*p > 64 && *p < 91) || (*p>96 && *p < 123)))
		{
			m = 0;
		}
		length = a.length();
		for (p = a;p < a.Substring(length);p++)
		{
			if (!((*p == '_') || (*p > 64 && *p < 91) || (*p>96 && *p < 123) || (*p>47 && *p < 58)))
			{
						m = 0;
						break;
			}

		}
		if (i > 0)
		{
			if (m == 1)
			{
				System.out.print("yes\n");
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
		}
		m = 1;
	}
	return 0;
	}



}

