package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[30];
	int i;
	int m;
	int j;
	int temp;
	int n;
	int k = 0;
	for (i = 0;i < 300;i++)
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
		else
		{
			for (j = 1;j < 30;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[j] = Integer.parseInt(tempVar2);
				}
				if (a[j] == 0)
				{
					break;
				}
			}
			for (m = 0;m < j;m++)
			{
				for (n = 0;n < j - 1;n++)
				{
					if (a[n] == 2 * a[n + 1])
					{
						k++;
					}
					temp = a[n];
					a[n] = a[n + 1];
					a[n + 1] = temp;
				}

			}
			System.out.printf("%d\n",k);
			k = 0;
			j = -1;
		}
	}
	return 0;
	}
}

