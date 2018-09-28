package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[MAX];
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
			for (j = i + 1;j <= n - 1;j++)
			{
				if (a[i] + a[j] == k)
				{
					System.out.print("yes");
				break;
				}
			}
			if (a[i] + a[j] == k)
			{
				break;
			}
		}
		if (a[i] + a[j] != k)
		{
			System.out.print("no");
		}
		return 0;
	}

}

