package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int s = 0;
		int[] a;
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
		a = new int[n];
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 1 + i;j <= n - 1;j++)
			{
				if (a[i] + a[j] == k)
				{
					s = 1;
					break;
				}
			}
		}
		if (s == 1)
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

