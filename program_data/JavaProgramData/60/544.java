package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int i;
		int j;
		int k;
		int l;
		l = Math.sqrt(n);
		k = 0;
		for (i = 2;i <= l;i++)
		{
			if (n % i == 0)
			{
			k = 1;
			break;
			}
		}
		if (k != 0)
		{
			return (0);
		}
		else
		{
			return (1);
		}
	}
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n <= 4)
		{
			System.out.print("empty");
			System.exit(1);
		}
		for (i = 3;i <= n - 2;i++)
		{
			if (su(i) + su(i + 2) == 2)
			{
				System.out.printf("%ld %ld\n",i,i + 2);
			}
		}
	}
}

