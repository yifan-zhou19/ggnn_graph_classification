package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int b = 0;
	int c = 0;
	String a = new String(new char[100000]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * q;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		m = a.length();
		for (p = a;p < a.Substring(m);p++)
		{
			for (q = a;q < a.Substring(m);q++)
			{
				if ((*p) == (*q) && p != q)
				{
					b = 1;
					break;
				}
			}
			if (b == 0)
			{
				System.out.printf("%c\n",*p);
				c = 1;
				break;
			}
			b = 0;
		}
		if (c == 0)
		{
			System.out.print("no\n");
		}
		c = 0;

	}
	return 0;
	}





}

