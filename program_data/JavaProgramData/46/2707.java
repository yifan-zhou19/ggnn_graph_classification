package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[][] a = new int[100][100];
		int i;
		int j;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= n;i++)
		{
		  for (j = 1;j <= m;j++)
		  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar3);
		  }
		  }
		}
		int k = n;
		int l = m;
		i = 1;
		j = 1;
		do
		{
			for (t = j;t <= l;t++)
			{
				System.out.printf("%d\n",a[i][t]);
			}
			i++;
			if (i > k)
			{
				break;
			}
			for (t = i;t <= k;t++)
			{
				System.out.printf("%d\n",a[t][l]);
			}
			l--;
			if (l < j)
			{
				break;
			}
			for (t = l;t >= j;t--)
			{
				System.out.printf("%d\n",a[k][t]);
			}
			k--;
			if (i > k)
			{
				break;
			}
			for (t = k;t >= i;t--)
			{
				System.out.printf("%d\n",a[t][j]);
			}
			j++;
			if (l < j)
			{
				break;
			}
		} while ((i <= k) && (j <= l));
		return 0;
	}

}

