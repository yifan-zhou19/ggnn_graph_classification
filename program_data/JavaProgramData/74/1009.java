package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sushu = int s;
		int huiwen = int s;
		int m;
		int n;
		int i;
		int t;
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
			t = i;
			if (sushu(i) > 0 && huiwen(i) > 0)
			{
				System.out.printf("%d",i);
				break;
			}

		}
		if (t == n && huiwen(t) == 0)
		{
			System.out.print("no");
		}

		if (t < n)
		{
			for (i = t + 1;i <= n;i++)
			{
				if ((sushu(i) > 0) && (huiwen(i) > 0))
				{
					System.out.printf(",%d",i);
				}
			}
		}



	}
	public static int sushu(int s)
	{
		int j;
		double k;
		k = Math.sqrt(s);
		for (j = 2;j <= k;j++)
		{
			if (s % j == 0)
			{
				return (0);
				break;
			}
		}
		if (j > k)
		{
		return (1);
		}
	}
	public static int huiwen(int s)
	{
		int[] a = new int[10];
		int z = 0;
		int i;
		while (s / 10 > 0)
		{
			a[z] = s % 10;
			s = s / 10;
			z++;
		}
		a[z] = s;
		for (i = 0;i <= z / 2;i++)
		{
			if (a[i] != a[z - i])
			{
				return (0);
				break;
			}
		}
		if (i > z / 2)
		{
		return (1);
		}
	}



}

