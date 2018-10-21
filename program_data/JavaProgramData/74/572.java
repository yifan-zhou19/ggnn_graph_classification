package <missing>;

public class GlobalMembers
{
	public static int ss(int n)
	{
		int i;
		for (i = 2;i < n / 2 + 1;i++)
		{
			if (n % i == 0)
			{
				return 0;
			}
		}
		return 1;
	}
	public static int hw(int n)
	{
		int i;
		int c;
		int sum = 0;
		c = n * 10;
		for (i = 0;(c = c / 10) != 0;i++)
		{
			sum = sum * 10 + c % 10;
		}
		if (sum == n)
		{
			return 1;
		}
		else
		{
		return 0;
		}
	}
	public static void Main()
	{
		int n;
		int m;
		int i;
		int k = 0;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= m;i++)
		{
			if (ss(i) != 0 && hw(i) != 0)
			{
				a[k] = i;
				k++;
			}
		}
		if (k == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%d,",a[i]);
			}
			System.out.printf("%d",a[k - 1]);
		}
	}

}

