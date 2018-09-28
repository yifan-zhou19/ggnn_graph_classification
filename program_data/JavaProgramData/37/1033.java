package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int t;
	int m;
	int s;
	String sz = new String(new char[5000]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 1;i <= n;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz = tempVar2.charAt(0);
		}
		s = 0;
		for (k = 0;sz.charAt(k) != '\0';k++)
		{
			m = 0;
			for (t = 0;sz.charAt(t) != '\0';t++)
			{
				if (sz.charAt(k) == sz.charAt(t))
				{
					m++;
				}
			}
			if (m == 1)
			{
				System.out.printf("%c\n",sz.charAt(k));
				s++;
				break;
			}
		}
		if (s == 0)
		{
			System.out.print("no\n");
		}
	}
		return 0;
	}

}

