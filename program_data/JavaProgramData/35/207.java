package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[10][10];
		int i;
		int j;
		int k;
		int t;
		int r;
		int p;
		int or;
		int az = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			k = 0;
			for (j = 0;j < n;j++)
			{

				if (a[i][j] > k)
				{
					k = a[i][j];
				}
			}
			for (j = 0;j < n;j++)
			{
				if (k == a[i][j])
				{
					t = i;
					r = j;
				}
			}
			for (p = 0;p < m;p++)
			{
				if (p == t)
				{
					continue;
				}
				else
				{
					if (a[p][r] > k)
					{
					or = 1;
					}
				 else
				 {
					 or = 0;
					 break;
				 }
				}
			}
			if (or == 1)
			{
				System.out.printf("%d+%d\n",t,r);
			}
			else
			{
				az++;
			}
		}
		if (az == m)
		{
			System.out.print("No\n");
		}
	}

}

