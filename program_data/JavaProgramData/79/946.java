package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1000];
		int[] n = new int[1000];
		int[] m = new int[1000];
		int i;
		int j;
		int k;
		int l;
		for (i = 0;i < 998;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0)
			{
				break;
			}
		}
		for (l = 0;l < 998;l++)
		{
			if (n[l] == 0)
			{
				break;
			}
			for (i = 1;i <= n[l];i++)
			{
				a[i] = 1;
			}
			j = 0;
			for (i = 1;i <= n[l] - 1;i++)
			{
				k = 0;
				while (k < m[l])
				{
					j++;
					if (j > n[l])
					{
						j = 0;
					}
					if (a[j] == 1)
					{
						k++;
					}
				}
				a[j] = 0;
			}
			for (i = 1;i <= n[l];i++)
			{
				if (a[i] == 1)
				{
					System.out.printf("%d\n",i);
					break;
				}
			}
		}
		return 0;
	}
}

