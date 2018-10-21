package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int h;
		int l;
		int i;
		int j;
		int t1 = 0;
		int t = 0;
		int p;
		int k;
		int s;
		int[][] a = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			l = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0,t = 0;i < h;i++)
		{
			k = a[i][0];

			for (j = 1;j < l;j++)
			{
				if (k < a[i][j])
				{
					k = a[i][j];
					p = j;
				}
			}
				s = i;

				for (i = 0;i < h;i++)
				{
					if (a[i][p] < k)
					{
						t = 1;
					}
				}
				if (t == 1)
				{
					break;
				}
				if (t == 0)
				{
					System.out.printf("%d+%d\n",s,p);
					t1 = 1;
				}
		}
		if (t1 != 1)
		{
			System.out.print("No");
		}

	}

}

