package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0)
			{
				break;
			}
			int[] a = new int[300];
			for (i = 0;i < n;i++)
			{
				a[i] = 1;
			}
			int j = 0;
			int k;
			int l;
			for (l = 1;l < n;l++)
			{
				k = 0;
				while (k != m)
				{
					if (a[j] != 0)
					{
						k++;
					}
					j++;
					if (j >= n)
					{
						j = 0;
					}
				}
				if (j == 0)
				{
					a[n - 1] = 0;
				}
				else
				{
					a[j - 1] = 0;
				}
			}
			for (j = 0;j < n;j++)
			{
				if (a[j] == 1)
				{
					System.out.printf("%d\n",j + 1);
					break;
				}
			}
		}
	}


}

