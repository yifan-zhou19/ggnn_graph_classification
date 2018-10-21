package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] shu = new int[NUM];
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(shu[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (int j = 0;j < n;j++)
		{
			for (int l = n - 1;l > j;l--)
			{
				sum = shu[j] + shu[l];
				if (sum == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (sum == k)
			{
				break;
			}
		}
		if (sum != k)
		{
			System.out.print("no");
		}
		return 0;
	}
}

