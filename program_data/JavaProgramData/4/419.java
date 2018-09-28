package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int[][] a = new int[100][100];
		int i;
		int j;
		int rs;
		int re;
		int cs;
		int ce;
		int s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			r = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < r;i++)
		{
			for (j = 0;j < c;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}

		for (rs = 0,cs = 0,re = 0,ce = 0;(re + ce) < (r + c);)
		{
			for (i = rs, j = cs;i <= re != 0 && j >= ce;i++, j--)
			{
				System.out.printf("%d\n",a[i][j]);

			}
			if (cs < (c - 1))
			{
				cs++;
			}
			else
			{
				rs++;
			}
			if (re < (r - 1))
			{
				re++;
			}
			else
			{
				ce++;
			}
		}
		return 0;
	}
}

