package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[310]);
		char t;
		int n;
		int i;
		int d;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		n = a.length();
		for (t = 65;t <= 90;t++)
		{
			for (i = 0,d = 0;i <= n - 1;i++)
			{
				if (a.charAt(i) == t)
				{
					d++;
				}
			}
			if (d != 0)
			{
				System.out.printf("%c=%d\n",t,d);
			}
			else
			{
				k++;
			}
		}
		for (t = 97;t <= 122;t++)
		{
			for (i = 0,d = 0;i <= n - 1;i++)
			{
				if (a.charAt(i) == t)
				{
					d++;
				}
			}
			if (d != 0)
			{
				System.out.printf("%c=%d\n",t,d);
			}
			else
			{
				k++;
			}
		}
		if (k == 52)
		{
			System.out.print("No");
		}
		return 0;
	}


}

