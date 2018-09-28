package <missing>;

public class GlobalMembers
{
	public static int prime(int t)
	{
		int i;
		int k;
		int s;
		k = 0;
		for (i = 2;i < t;i++)
		{
		  if (t % i == 0)
		  {
			  k += 1;
		  }
		}
		if (k > 0)
		{
			s = 0;
		}
		else
		{
			s = 1;
		}
		return s;
	}
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 3;i < n - 1;i++)
		{
			if ((prime(i) == 1) && (prime(i + 2) == 1))
			{
			System.out.printf("%d %d\n",i,i + 2);
			}
			k += 1;
		}
		if (k == 0)
		{
			System.out.print("empty");
		}
		return 0;
	}


}

