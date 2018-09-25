package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20];
		int i;
		int j;
		int k;
		int m;
		for (i = 0;i < 20;i++)
		{
		a[i] = 1;
		}
		while (true)
		{
			i = 0;
			k = 0;
			while (a[i] != 0)
			{
				i++;
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[1] == -1)
				{
					return 0;
				}
			}
			m = i;
			for (i = 1;i < m;i++)
			{
				for (j = i + 1;j < m;j++)
				{
					if ((a[j] == 2 * a[i]) || (a[i] == 2 * a[j]))
					{
							 k++;
					}
				}
			}
			System.out.printf("%d\n",k);
		}
	}

}

