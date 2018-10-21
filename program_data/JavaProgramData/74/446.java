package <missing>;

public class GlobalMembers
{
	public static int zhishu(int num)
	{
		int n = 0;
		int i;
		for (i = 1;i <= num;i++)
		{
			if (num % i == 0)
			{
				n++;
			}
		}
		if (n == 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int huiwenshu(int num)
	{
		int k = 0;
		int x = 0;
		int i;
		int[] sz = new int[100];
		for (i = num;i > 0;i /= 10)
		{
			sz[k] = i % 10;
			k++;
		}
		for (i = 0;i < k / 2;i++)
		{
			if (sz[i] == sz[k - 1 - i])
			{
				x++;
			}
		}
		if (x == k / 2)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int t = 1;
		int k = 1;
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
		for (i = m;i < n + 1;i++)
		{
			if (zhishu(i) == 1 && huiwenshu(i) == 1)
			{
				if (t != 0)
				{
					System.out.printf("%d",i);
					t = 0;
					k = 0;
				}
				else
				{
					System.out.printf(",%d",i);
				}
			}
		}
		if (k != 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

