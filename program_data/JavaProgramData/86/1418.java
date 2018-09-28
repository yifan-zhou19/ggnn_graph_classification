package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int j;
		int[] a = new int[100];
		for (i = 0;i < 100;i++)
		{
			a[i] = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				a[i] = 60;
			}
			else
			{
				 for (j = 0;j < m;j++)
				 {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					k = Integer.parseInt(tempVar3);
				}
				if ((k + (j + 1) * 3) <= 60)
				{
					a[i] = 60 - (j + 1) * 3;
				}
				else if ((k + (j + 1) * 3) > 60)
				{
					if (k < a[i])
					{
						a[i] = k;
					}
				}
				 }
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",a[i]);
		}

		return 0;
	}

}

