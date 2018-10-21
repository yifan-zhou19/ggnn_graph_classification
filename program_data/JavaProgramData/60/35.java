package <missing>;

public class GlobalMembers
{
	public static int prime(int n)
	{
		int i;
		int t;
		for (i = 2,t = 0;i <= Math.sqrt(n);i++)
		{
			if ((n % i) == 0)
			{
				t = 1;
			}
		}
		return (t);
	}
	public static void Main()
	{
		int prime = int n;
		int n;
		int i;
		int k = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 3;i <= (n - 2);i++)
		{
			if ((prime(i) == 0) && (prime(i + 2) == 0))
			{
				l = i + 2;
				System.out.printf("%d %d\n",i,l);
				k = 1;
			}
		}
		if (k == 0)
		{
			System.out.print("empty");
		}

	}
}

