package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int hui = int x;
		int su = int x;
		int m;
		int n;
		int i;
		int j;
		int k;
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
			if (hui(i) == 1 && su(i) == 1)
			{
				System.out.printf("%d",i);
				break;
			}
		}
		if (i == n + 1)
		{
			System.out.print("no");
		}
		else
		{
			for (i = i + 1;i <= n;i++)
			{
			if (hui(i) == 1 && su(i) == 1)
			{
			System.out.printf(",%d",i);
			}
			}
		}
	}
	public static int hui(int x)
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int[] a = new int[100];
		int sum = 0;
		k = x;
		for (i = 0;;i++)
		{
			if (Math.pow(10,i) > x)
			{
			break;
			}
		}
		m = i;
		for (i = 1;i <= m;i++)
		{
			a[i] = x % 10;
			x = x / 10;
		}
		for (i = 1;i <= m;i++)
		{
			sum = sum * 10 + a[i];
		}
		if (sum == k)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
	public static int su(int x)
	{
		int i;
		int j;
		int k;
		for (i = 2;i < x;i++)
		{
			if (x % i == 0)
			{
				break;
			}
		}
		if (i == x)
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}




}

