package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int total = new int(int n,int k,int i);
		int i;
		int t = 0;
		int n;
		int k;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 1;;i++)
		{
			  if (total(n, k, i) == 0)
			  {
				  continue;
			  }
			  else
			  {
				  y = total(n, k, i);
				  t++;
				  if (t == 1)
				  {
					  break;
				  }
			  }

		}
		System.out.printf("%d\n",y);
	}

	public static int total(int n,int k,int i)
	{
		int j;
		int m = i;
	for (j = 1;j <= n;j++)
	{
		if ((n * m) % (n - 1) != 0)
		{
			m = 0;
			break;
		}
	else
	{
		m = n * m / (n - 1) + k;
	}
	}
	return (m);
	}
}

