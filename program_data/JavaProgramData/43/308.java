package <missing>;

public class GlobalMembers
{
	public static int jss(int x)
	{
		int j;
		int a = 0;
		for (j = x - 1;j >= 3;j--)
		{
							if (x % j == 0)
							{
									   a = 1;
									   break;
							}
		}
		if (x % 2 == 1 && a == 0 && x != 1)
		{
						 return 1;
		}
		else
		{
			 return 0;
		}
	}
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = m - 2;i >= m / 2;i--)
		{
							  if (jss(i) != 0 && jss(m - i) != 0)
							  {
												   System.out.printf("%d %d\n",(m - i),i);
							  }
		}
		return 0;
	}

}

