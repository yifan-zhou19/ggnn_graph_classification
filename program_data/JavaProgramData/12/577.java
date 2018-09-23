package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int c;
		int m;
		int[] a = new int[17];
		while (true)
		{

			for (i = 1;i <= 16;i++)
			{
				a[i] = 0;
				m = 0;
			}
			for (i = 1;i <= 16;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == -1)
				{
					return 0;
				}
				if (a[i] == 0)
				{
					c = i;
					break;
				}
			}
			for (i = 1;i < c;i++)
			{

				for (j = i;j < c;j++)
				{
					if (a[i] == 2 * a[j] || a[j] == 2 * a[i])
					{
						m++;
					}
				}
			}
				System.out.printf("%d\n",m);
		}


	return 0;
	}

}

