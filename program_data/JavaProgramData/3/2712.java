package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int k;
		int i;
		int j;
		int m = 0;
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
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[1] = Integer.parseInt(tempVar3);
		}
		for (i = 2;i <= n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
			for (j = 1;j <= i - 1;j++)
			{
				b[j] = a[j] + a[i];
				if (b[j] == k)
				{
					m = m + 1;
				}
			}
		}
		if (m == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.print("yes");
		}
		return 0;
	}
}

