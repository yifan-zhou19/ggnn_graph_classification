package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int prime = int n;
		int palin = int n;
		int m;
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (;m <= n;m = m + 1)
		{
			if (palin(m) == 1 && prime(m) == 1)
			{
				if (i == 0)
				{
					System.out.printf("%d",m);
				}
				else
				{
					System.out.printf(",%d",m);
				}
				i = i + 1;
			}
		}
		if (i == 0)
		{
			System.out.print("no");
		}
	}

	public static int prime(int n)
	{
		int k = 1;
		int i;
		for (i = 2;i <= Math.sqrt(n);i = i + 1)
		{
			if (n % i == 0)
			{
				k = 0;
				break;
			}
			else
			{
				continue;
			}
		}
		return (k);
	}

	public static int palin(int n)
	{
		int[] a = new int[5];
		int i;
		int c;
		int flag = 1;
		c = Math.log10(n);
		for (i = 0;i <= c;i = i + 1)
		{
			a[i] = n / Math.pow(10,c - i);
			n = n - a[i] * Math.pow(10,c - i);
		}
		for (i = 0;i <= c;i = i + 1)
		{
			if (a[i] == a[c - i])
			{
				continue;
			}
			else
			{
				flag = 0;
				break;
			}
		}
		return (flag);
	}

}

