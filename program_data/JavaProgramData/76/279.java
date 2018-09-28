package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int[] a = new int[10009];
		int t;
		int k;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				k = Integer.parseInt(tempVar3);
			}
			for (j = t + 1;j <= k;j++)
			{
				a[j]++;
			}
		}
		for (i = 0;i < 10009;i++)
		{
			if (a[i] != 0)
			{
				t = i;
				break;
			}
		}
		for (i = 10008;i >= 0;i--)
		{
			if (a[i] != 0)
			{
				k = i;
				break;
			}
		}
		for (i = t;i <= k;i++)
		{
			if (a[i] == 0)
			{
				e++;
				break;
			}
		}
		if (e != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",t - 1,k);
		}
		return 0;
	}

}

