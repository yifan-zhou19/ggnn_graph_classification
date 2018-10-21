package <missing>;

public class GlobalMembers
{
	public static void monkey(int n,int m)
	{
		int s;
		int i;
		int j;
		int[] a = new int[301];
		for (i = 1;i <= n;i++)
		{
			a[i] = 1;
		}
		j = 0;
		s = 0;
		i = 1;
		while (s < n - 1)
		{
			if (a[i] == 1)
			{
				j++;
				if (j == m)
				{
					a[i] = 0;
					s++;
					j = 0;
					if (s == n - 1)
					{
						break;
					}
				}
			}
			if (i == n)
			{
				i = 0;
			}
			i++;
		}
		for (i = 1;i <= n;i++)
		{
			if (a[i] == 1)
			{
				System.out.printf("%d\n",i);
				break;
			}
		}
	}
	public static void Main()
	{
		int i;
		int k;
		int[] m = new int[200];
		int[] n = new int[200];
		for (i = 0;i < 200;i++)
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
			if (m[i] == 0 && n[i] == 0)
			{
				k = i;
				break;
			}
		}
		for (i = 0;i < k;i++)
		{
			monkey(n[i], m[i]);
		}
	}
}

