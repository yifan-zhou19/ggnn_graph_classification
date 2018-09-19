package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			int i;
			int j;
			int n;
			int k;
			int m;
			int[] a = new int[100];

			while (true)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[0] = Integer.parseInt(tempVar);
				}
				if (a[0] == -1)
				{
					break;
				}
				for (i = 1;;i++)
				{
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						a[i] = Integer.parseInt(tempVar2);
					}
					if (a[i] == 0)
					{
						break;
					}
				}
				n = i;
				for (i = n - 1;i > 0;i--)
				{
					for (j = 0;j < i;j++)
					{
						if (a[j] > a[j + 1])
						{
							k = a[j];
							a[j] = a[j + 1];
							a[j + 1] = k;
						}
					}
				}
				m = 0;
				for (i = 0;i < n - 1;i++)
				{
					for (j = i + 1;j < n;j++)
					{
						if (a[j] == 2 * a[i])
						{
							m = m + 1;
							break;
						}
						if (a[j] > 2 * a[i])
						{
							break;
						}
					}
				}
				System.out.printf("%d\n",m);
			}
		return 0;
	}

}

