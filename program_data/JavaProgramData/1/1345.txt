package <missing>;

public class GlobalMembers
{
	public static int tru(int c)
	{
		int j;
		int p = 0;
		if (c == 1 || c == 2)
		{
			return 1;
		}
		else
		{
			for (j = 2;j <= Math.pow((double)c,0.5);j++)
			{
				 if (c % j == 0)
				 {
					 p = 1;
					 break;
				 }
			}
		}
			  if (p == 1)
			  {
				  return 0;
			  }
			  else
			  {
				  return 1;
			  }
	}
	public static int count(int a,int b)
	{
		int i;
		int k = 1;
		if (tru(a) == 0)
		{
			for (i = b;i <= Math.pow((double)a,0.5);i++)
			{
				if (a % i == 0)
				{
					k = k + count(a / i, i);
				}
			}
		}
		return k;
	}
	public static int Main()
	{
		int n;
		int[] x = new int[999];
		int q;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (q = 0;q < n;q++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				x[q] = Integer.parseInt(tempVar2);
			}
		}
		for (q = 0;q < n;q++)
		{
			System.out.printf("%d\n",count(x[q], 2));
		}

		return 0;
	}




}

