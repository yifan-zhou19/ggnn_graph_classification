package <missing>;

public class GlobalMembers
{
	public static int h(int i)
	{
		int n;
		int k = 0;
		int j;
		j = i;
		while (i > 0)
		{
			n = i % 10;
			k = k * 10 + n;
			i = i / 10;
		}
		if (k == j)
		{
			return (1);
		}
		else
		{
		return (0);
		}
	}
	public static int s(int i)
	{
		int j;
		int k = 0;
		if (i == 1)
		{
			return (0);
		}
		else
		{
			for (j = 1;j < i;j++)
			{
				if (i % j == 0)
				{
				k++;
				}
			}
			if (k == 1)
			{
				return (1);
			}
			else
			{
				return (0);
			}
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j = 0;
		int x;
		int[] a = new int[100000];
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
			x = h(i);
			x = x + s(i);
			if (x == 2)
			{
				a[j] = i;
				j++;
			}
		}
		if (j == 0)
		{
		System.out.print("no");
		}
		else if (j == 1)
		{
			System.out.printf("%d",a[0]);
		}
		else
		{
		for (i = 0;i < j - 1;i++)
		{
		System.out.printf("%d,",a[i]);
		}
		System.out.printf("%d",a[j - 1]);
		}
	}




}

