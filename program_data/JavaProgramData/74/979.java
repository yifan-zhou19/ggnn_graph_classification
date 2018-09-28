package <missing>;

public class GlobalMembers
{
	public static int zhi(int i)
	{
		int k;
		if (i == 1)
		{
			return 0;
		}
		if (i == 2)
		{
			return 1;
		}
		for (k = 2;k < i;k++)
		{
			if (i % k == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int hw(int i)
	{
		int k = 0;
		while (i > 0)
		{
			k = k * 10 + i % 10;
			i = i / 10;
		}
		return k;
	}
	public static void Main()
	{
		int m;
		int n;
		int[] a = new int[100];
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
		int i;
		int j = 0;
		for (i = m;i <= n;i++)
		{
			if (zhi(i) == 1 && hw(i) == i)
			{
				a[j] = i;
				j++;
			}
		}
		if (j == 0)
		{
			System.out.print("no");
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

