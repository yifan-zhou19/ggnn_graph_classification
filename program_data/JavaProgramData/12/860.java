package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[16];
		int i;
		int j;
		int k;
		int l;
		while (scanf("%d", a[0]) && a[0] != -1)
		{
			l = 0;
			if (a[0] != 0)
			{
				for (i = 1;a[i - 1] != 0;i++)
				{
					String tempVar = ConsoleInput.scanfRead();
					if (tempVar != null)
					{
						a[i] = Integer.parseInt(tempVar);
					}
				}
				for (j = 0;j <= i - 1;j++)
				{
					for (k = 0;k < j;k++)
					{
						if (a[k] == 2 * a[j] || a[j] == 2 * a[k])
						{
							l++;
						}
					}
				}
			System.out.printf("%d\n",l);
			}
			else
			{
				System.out.printf("%d\n",l);
			}
		}
		return 0;

	}

}

