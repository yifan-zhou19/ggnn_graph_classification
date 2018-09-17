package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int[] a = new int[25 + 10];
		int[] n = new int[25 + 10];
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			n[i] = 1;
		}
		for (i = k - 2;i >= 0;i--)
		{
			int j;
			for (j = i + 1;j <= k - 1;j++)
			{
				if ((a[i] >= a[j]) && (n[i] <= n[j]))
				{
					n[i] = n[j] + 1;
				}
			}
		}
		s = n[0];
		for (i = 0;i < k;i++)
		{
			if (n[i] > s)
			{
				s = n[i];
			}
		}

		System.out.printf("%d",s);
		return 0;
	}
}

