package <missing>;

public class GlobalMembers
{
	public static int max(int a)
	{
		if (a % 7 == 0)
		{
			return 1;
		}
		if ((a - 7) % 10 == 0)
		{
			return 1;
		}
		if ((a / 10 == 7))
		{
			return 1;
		}
		return 0;
	}
	public static void Main()
	{
		int n;
		int i;
		int k;
		int j;
		int[] a = new int[1001];
		double sum;
		double num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		num = 1.0;
		sum = 1;
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
					return;
				}
			}
		}
		System.out.print("no");
	}

}

