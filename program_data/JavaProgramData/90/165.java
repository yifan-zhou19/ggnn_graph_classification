package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (n == 1)
		{
			return 1;
		}
		else if (m == 0)
		{
			return 1;
		}
		else
		{
			if (m < n)
			{
				return f(m, m);
			}
			else
			{
				return f(m, n - 1) + f(m - n, n);
			}
		}
	}
	public static void Main()
	{
		int i;
		int m;
		int n;
		int k;
		int l;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 l = Integer.parseInt(tempVar);
			 }
			  for (i = 0;i < l;i++)
			  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			n = Integer.parseInt(tempVar3);
		}
		k = f(m, n);
		System.out.printf("%d\n",k);
			  }
	}


}

