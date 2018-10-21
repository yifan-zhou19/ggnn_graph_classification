package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n = 0;
		int[] a = new int[16];
		int shu;
		int sum = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				shu = Integer.parseInt(tempVar);
			}
			if (shu == -1)
			{
				return 0;
			}
			else if (shu == 0)
			{
				for (i = 1;i <= n;i++)
				{
					if (a[i] != 0 && a[i] % 2 == 0)
					{
						for (j = 1;j <= n;j++)
						{
							if (a[j] == a[i] / 2)
							{
								sum++;
							}
						}
					}
				}
				System.out.printf("%d\n",sum);
				sum = 0;
				n = 0;
			}
			else
			{
				n++;
				a[n] = shu;
			}
		}
		return 0;
	}
}

