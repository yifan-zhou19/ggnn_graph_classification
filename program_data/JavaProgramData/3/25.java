package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int i;
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[0] = Integer.parseInt(tempVar3);
		}
		for (i = 1;i < n;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i] = Integer.parseInt(tempVar4);
			}
		}
		int c = 0;
		int j;
		for (i = 0;i < (n - 1);i++)
		{
			for (j = (i + 1);j > i && j < n;j++)
			{
				if (a[i] + a[j] == k)
				{
					c++;
				}
			}
		}
		if (c != 0)
		{
			System.out.print("yes");
		}
		if (c == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

