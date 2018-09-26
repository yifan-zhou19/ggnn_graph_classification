package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int p = 1;
		int i;
		int j;
		int k = 0;
		int s;
		int t;
		int[] a = new int[300];
		do
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[p] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[p] = Integer.parseInt(tempVar2);
			}
			p++;
		}while (n[p - 1] != 0 && m[p - 1] != 0);
			for (i = 1;i < p - 1;i++)
			{
			j = 0;
			for (t = 1;t <= n[i];t++)
			{
				 a[t] = 1;
			}
					s = n[i];
			for (j++;j <= n[i];j++)
			{
				if (s == 1)
				{
					break;
				}
				k = a[j] + k;
				if (k == m[i])
				{
					s = s - 1;
					k = 0;
					a[j] = 0;
					if (j == n[i])
					{
						 j = 0;
					}
									if (s > 1)
									{
					   continue;
									}
					else
					{
					   break;
					}
				}
				if (j == n[i])
				{
				   j = 0;
				}
			}
			for (j = 1;a[j] == 0;)
			{
				j++;
			}
			System.out.printf("%d\n",j);
			}
	}
}

