package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p;
		int i;
		int n;
		int tmp;
		int squar;
		tmp = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p = Integer.parseInt(tempVar2);
				}
				if (p == 0)
				{
					tmp = tmp + 1;
				}
		}
		tmp = tmp / 4;
		squar = (tmp - 1) * (tmp - 1);
		System.out.printf("%d\n",squar);
	}
}

