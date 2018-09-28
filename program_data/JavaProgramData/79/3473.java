package <missing>;

public class GlobalMembers
{
	public static int fun(int m,int n)
	{
		int i;
		int j = 0;
		int k;
		int e;
		int[] r = new int[300];
		k = m;
		while (k > 0)
		{
			for (i = 0;i < m;i++)
			{
			  if (r[i] < 0)
			  {
				  continue;
			  }
					  r[i] = 0;
			}
			for (i = 0;i < m;i++)
			{
				if (r[i] < 0)
				{
					continue;
				}
				j++;
				r[i] = r[i] + j;
				if (r[i] % n == 0)
				{
					r[i] = -1;
					k--;
					e = i;
				}
			}

		}
		return e+1;
	}
	public static int Main()
	{
	int m;
	int n;
	int k;
	while (true)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		m = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		n = Integer.parseInt(tempVar2);
	}
	if (m == 0 && n == 0)
	{
		break;
	}
	System.out.printf("%d\n",fun(m, n));
	}
	return 0;
	}

}

