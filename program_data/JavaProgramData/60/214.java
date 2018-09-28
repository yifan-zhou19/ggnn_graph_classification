package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
		int i = 2;
		int c;
		int l;
		while (i <= m / 2)
		{
		  c = m % i;
		  if (c != 0)
		  {
			  i++;
		  }
		  else
		  {
			  l = 0;
			  break;
		  }
		}
		if (m == 1)
		{
			l = 0;
		}
		if (c != 0 && m != 1)
		{
			l = 1;
		}
		return l;
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else
		{
		for (i = 3;i < n;i++)
		{
			if (f(i) == 1)
			{
				if (f(i + 2) == 1)
				{
					System.out.printf("%d %d\n",i,i + 2);
				}
			}
		}
		}
	}

}

