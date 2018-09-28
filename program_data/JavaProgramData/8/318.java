package <missing>;

public class GlobalMembers
{
	// ????????????????????????.cpp : ??????????????
	//



	public static int Main()
	{
		int k1;
		int k2;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k2 = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= k1 - 1;++i)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i <= k2 - 1;++i)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i <= k1 - 2;++i)
		{
			for (j = i + 1;j <= k1 - 1;++j)
			{
				if (a[i] > a[j])
				{
					c = a[j];
					a[j] = a[i];
					a[i] = c;
				}
			}
			System.out.printf("%d ",a[i]);
		}
		System.out.printf("%d",a[k1 - 1]);
		for (i = 0;i <= k2 - 2;++i)
		{
			for (j = i + 1;j <= k2 - 1;++j)
			{
				if (b[i] > b[j])
				{
					c = b[j];
					b[j] = b[i];
					b[i] = c;
				}
			}
			System.out.printf(" %d",b[i]);
		}
		System.out.printf(" %d",b[k2 - 1]);
		return 0;
	}

}

