package <missing>;

public class GlobalMembers
{
	public static int huiwen(int x)
	{
		int i;
		int j;
		int[] a = new int[6];
		int k = 0;
		for (i = 10000;i > 0;i = i / 10)
		{
			if (x / i != 0)
			{
				break;
			}
		}

		for (j = 1;j <= i;j = j * 10)
		{
			a[k] = x - x / 10 * 10;
			x = x / 10;
			k = k + 1;
		}
		for (j = 0;j < k / 2 + 1;j++)
		{
			if (j == k / 2)
			{
				return 1;
			}
			if (a[j] != a[k - 1 - j])
			{
				return 0;
			}
		}
	}
	public static int sushu(int x)
	{
		int i;
		for (i = 2;i < x / 2 + 2;i++)
		{
			if (i == x / 2 + 1)
			{
				return 1;
			}
			if (x % i == 0)
			{
				return 0;
			}

		}
	}




	public static int Main()
	{
		int n;
		int m;
		int i;
		int k = 0;
		int[] a = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = n;i <= m;i++)
		{
			if ((huiwen(i) == 1) && (sushu(i) == 1))
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
		return 0;
	}

}

