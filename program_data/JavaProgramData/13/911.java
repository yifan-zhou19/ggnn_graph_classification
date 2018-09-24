package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int i;
			int j;
			int n;
			int[] a = new int[20000];
			int[] b = new int[20000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[1] = Integer.parseInt(tempVar2);
		}
		System.out.printf("%d",a[1]);
		for (i = 2;i <= n;++i)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			for (j = 1;j <= i - 1;++j)
			{
				b[i - 1] = 0;
				b[j] = a[j] - a[i];
				if (b[j] == 0)
				{
					break;
				}
			}
			if (b[i - 1] != 0)
			{
				System.out.printf(" %d",a[i]);
			}
		}
		return 0;
	}

}

