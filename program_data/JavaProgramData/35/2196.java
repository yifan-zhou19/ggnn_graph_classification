package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m; //m,hangshu,n,lieshu
		int n;
		int i;
		int j;
		int t = 1;
		int s = 0;
		int l = 0;
		int[][] a = new int[10][10];
		int[] b = new int[10];
		int[] c = new int[10];
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
			for (j = 1;j <= m;j++)
			{
		for (i = 1;i <= n;i++)
		{

				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[j][i] = Integer.parseInt(tempVar3);
				}
		}
			}

			for (j = 1;j <= m;j++)
			{
				for (s = 1;s <= n;s++)
				{
			if (a[j][s] > b[j])
			{
			b[j] = a[j][s];
			c[j] = s;
			}
				}
			for (s = 1;s <= m;s++)
			{
				if (a[s][c[j]] < b[j])
				{
					t = 0;
				}
			}
				if (t == 1)
				{
					System.out.printf("%d+%d\n",j - 1,c[j] - 1);
					l++;
				}
				t = 1;

			}

		if (l == 0)
		{
			System.out.print("No\n");
		}
	}
}

