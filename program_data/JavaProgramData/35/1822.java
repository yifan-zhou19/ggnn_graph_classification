package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int h;
		int l;
		int c;
		int[][] m = new int[8][8];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			h = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			l = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < h;i++)
		{
			for (j = 0;j < l;j++)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					m[i][j] = Integer.parseInt(tempVar4);
				}
			}
		}
		int ma_h;
		int r;
		int e;
		r = 0;
		e = 0;
		for (j = 0;j < h;j++)
		{
			for (ma_h = 0,i = 0;i < l;i++)
			{
				if (m[j][i] > m[j][ma_h])
				{
					ma_h = i;
				}
			}
			for (i = 0;i < h;i++)
			{
				if (m[j][ma_h] > m[i][ma_h])
				{
					e++;
				}
			}
			if (e == 0)
			{
				System.out.printf("%d+%d",j,ma_h);
				r++;
			}
		}
		if (r == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

