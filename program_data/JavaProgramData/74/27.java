package <missing>;

public class GlobalMembers
{
	public static int su(int n)
	{
		int i;
		int p = 0;
		for (i = 2;i < n;i++)
		{
			if (n % i == 0)
			{
			p = 1;
			break;
			}
		}
		return (p);
	}
	public static int huiwen(int n)
	{
		int s = 0;
		int m;
		m = n;
		while (n != 0)
		{
			s = s * 10 + n % 10;
			n = n / 10;
		}
		if (s == m)
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
		int m;
		int n;
		int i;
		int[] a = new int[100];
		int k = 0;
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
		for (i = m;i <= n;i++)
		{
			if ((su(i) == 0) && (huiwen(i) == 0))
			{
				a[k++] = i;
			}
		}
		if (k == 0)
		{
			System.out.print("no\n");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d\n",a[k - 1]);
		}
	}

}

