package <missing>;

public class GlobalMembers
{
	public static int zhi(int i)
	{
		int j;
		int d;
		d = 1;
		for (j = 1;j <= i / 2; j++)
		{
		  if (i % j == 0)
		  {
			  d = j;
		  }
		}
		return (d);
	}
	public static int Main()
	{
		int m;
		int i;
		int j;
		int d = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 3; i <= m / 2;i = i + 2)
		{
		  j = m - i;
		  if (zhi(i) == 1 && zhi(j) == 1)
		  {
		  System.out.printf("%d %d\n",i,j);
		  }
		}
	}

}

