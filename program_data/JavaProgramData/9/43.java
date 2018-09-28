package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int[] aged = new int[100];
		char[][] num = new char[100][11];
		char[][] anum = new char[100][11];
		char[][] q = new char[100][11];
		int n;
		int i;
		int k;
		int j = 0;
		int s;
		int p;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
				if (sz[i] >= 60)
				{
					aged[j] = sz[i];
					anum[j] = num[i];
					j++;
				}
		}
		for (s = 1;s < j;s++)
		{
		for (k = 0;k < j - s;k++)
		{
				if (aged[k] < aged[k + 1])
				{
					e = aged[k + 1];
					aged[k + 1] = aged[k];
					aged[k] = e;
					q[k] = anum[k + 1];
					anum[k + 1] = anum[k];
					anum[k] = q[k];
				}
		}
		}
		for (p = 0;p < j;p++)
		{
					System.out.printf("%s\n",anum[p]);
		}
				for (i = 0;i < n;i++)
				{
					if (sz[i] < 60)
					{
						System.out.printf("%s\n",num[i]);
					}
				}
				return 0;
	}
}

