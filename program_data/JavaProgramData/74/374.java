package <missing>;

public class GlobalMembers
{
	public static int f(int m)
	{
		int temp;
		int k;
		int n = 0;
		int z;
		temp = m;
		while (temp > 0)
		{
			k = temp % 10;
		n = n * 10 + k;
		temp = temp / 10;
		}
		if (m == n)
		{
			z = 1;
		}
		else
		{
			z = 0;
		}
		return (z);
	}
	public static int g(int a)
	{
		int z = 0;
		int i;
		int k;
		k = a / 2;
		for (i = 2;i < k;i++)
		{
		if (a % i == 0)
		{
			break;
		}
		}
			if (i >= k)
			{
				z = 1;
			}
			return (z);
	}

	public static void Main()
	{
		int m;
		int n;
		int s;
		int l;
		int i;
		int t = 0;
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
		for (i = m;i <= n;i++)
		{
			s = f(i);
			l = g(i);
	if ((s == 1) && (l == 1) && (t == 0))
	{
		System.out.printf("%d",i);
		t++;
	}
	else if ((s == 1) && (l == 1))
	{
		System.out.printf(",%d",i);
		t++;
	}
		}
		if (t == 0)
		{
			System.out.print("no");
		}
	}
}

