package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10010];
		int n;
		int i;
		int j;
		int le;
		int ri;
		int st;
		int en;
		int bo = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			le = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			ri = Integer.parseInt(tempVar3);
		}
		for (i = le;i < ri;i++)
		{
			a[i] = 1;
		}
		for (i = 1;i <= n - 1;i++)
		{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					st = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					en = Integer.parseInt(tempVar5);
				}
			if (st < le)
			{
				le = st;
			}
			if (en > ri)
			{
				ri = en;
			}
			for (j = st;j < en;j++)
			{
					 a[j] = 1;
			}
		}
		for (i = le;i < ri;i++)
		{
			if (a[i] == 0)
			{
				bo = 0;
				break;
			}
		}
		if (bo == 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",le,ri);
		}
		return 0;
	}
}

