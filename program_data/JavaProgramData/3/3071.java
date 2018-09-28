package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int k = 0;
		int i = 0;
		int j = 0;
		int[] a = new int[1002];
		int ans = 0;
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
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					ans = 1;
					break;
				}
			}
			if (ans == 1)
			{
				break;
			}
		}
		if (ans == 1)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;
	}
}

