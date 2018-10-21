package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			int q = 60;
			if (m == 0)
			{
				System.out.printf("%d\n",q);
			}
			int j;
			int[] a = new int[30];
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = m - 1;j > -1;j--)
			{
				if ((j + 1) * 3 + a[j] <= 60)
				{
					int o;
					o = 60 - 3 * (j + 1);
					if ((j + 1) * 3 + a[j + 1] > 57 && (j + 1) * 3 + a[j + 1] < 60)
					{
						o = o - (60 - (j + 1) * 3 - a[j + 1]);
					}
					System.out.printf("%d\n",o);
					break;
				}
			}
		}
		return 0;
	}

}

