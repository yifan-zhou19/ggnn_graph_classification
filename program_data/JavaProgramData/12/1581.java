package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int k;
		int m;
		int n;
		int j;
		do
		{
			j = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[0] = Integer.parseInt(tempVar);
			}
			if (a[0] != -1)
			{
				for (k = 1;k <= 15;k++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[k] = Integer.parseInt(tempVar2);
					}
					if (a[k] == 0)
					{
						break;
					}
				}
				for (m = 0;m < k - 1;m++)
				{
					for (n = m + 1;n < k;n++)
					{
						if ((a[m] - 2 * a[n] == 0) || (a[n] - 2 * a[m] == 0))
						{
						j++;
						}
					}
				}
				System.out.printf("%d\n",j);
			}
		} while (a[0] != -1);
		return 0;
	}
}

