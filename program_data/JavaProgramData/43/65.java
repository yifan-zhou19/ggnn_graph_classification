package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int prime = int x;
		int n;
		int p = 3;
		int q;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 3;p <= (n / 2);p = p + 2)
		{
			 q = n - p;
			 if (prime(p) == 1 && prime(q) == 1)
			 {
			   System.out.printf("%d %d\n",p,q);
			 }
			 else
			 {
			   continue;
			 }
		}
	}
	public static int prime(int x)
	{
		int i;
		int k;
		k = (int)Math.sqrt(x);
		for (i = 2;i <= k;i++)
		{
			if (x % i == 0)
			{
			break;
			}
		}
		if (i == k + 1)
		{
		  return 1;
		}
		else
		{
		  return 0;
		}
	}

}

