package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	//



	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;++i)
		{
			int[] a = new int[21];
			int j = 0;
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
					  if (m == 0)
					  {
				System.out.print("60\n");
				continue;
					  }
			for (j = 1;j <= m;++j)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			int[] t = new int[21];
			for (j = 1;j <= m;++j)
			{
				t[j] = a[j] + 3 * j;
				if (t[j] >= 63)
				{
					System.out.printf("%d\n",a[j - 1] + 60 - t[j - 1]);
					break;
				}
				else if (t[j] >= 60)
				{
					System.out.printf("%d\n",a[j]);
					break;
				}
			}
			if (j == m + 1)
			{
				System.out.printf("%d\n",a[m] + 60 - t[m]);
			}
		}
		return 0;
	}


}

