package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[16];
		int i;
		int n;
		int j;
		int m;
		int k;
		int flag;
		while (true)
		{
			m = 0;
			j = 0;
			flag = 0;
			for (i = 0;;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}

				if (a[i] == 0)
				{
					break;
				}
				else if (a[i] == -1)
				{
					flag = 1;
					break;
				}

			}
			if (flag == 1)
			{
				break;
			}
			for (j = 0;j < i - 1;j++)
			{
				for (k = j + 1;k < i;k++)
				{
					if ((a[k] == a[j] * 2 || a[j] == a[k] * 2) && (a[j] != 0 && a[k] != 0))
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

