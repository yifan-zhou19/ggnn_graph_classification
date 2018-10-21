package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[1000];
		int i;
		int j;
		int t = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
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
			for (j = i;j < n;j++)
			{
				for (k = i + 1;k < n;k++)
				{
				if (m == a[j] + a[k])
				{
			t++;
				}
		break;
				}
			}
		}

	if (t != 0)
	{
	System.out.print("yes");
	}
	else
	{
	System.out.print("no");
	}

		return 0;
	}
}

