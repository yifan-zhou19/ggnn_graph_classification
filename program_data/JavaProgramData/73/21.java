package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] alei = new int[5][5];
		int i;
		int j;
		int k;
		int m;
		int n;
		int p;
		int sign;
		p = 0;
		sign = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					alei[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			n = alei[i][4];
			m = 4;
			for (j = 0;j < 4;j++)
			{
				 if (n < alei[i][j])
				 {
					 m = j;
					 n = alei[i][j];
				 }
			}
			for (k = 0;k < 5;k++)
			{
				if (n > alei[k][m])
				{
					sign = 1;
					break;
				}
			}
			if (sign == 1)
			{
				sign = 0;
				continue;
			}
			System.out.printf("%d %d %d\n",i + 1,m + 1,n);
			p += 1;
		}
		if (p == 0)
		{
			System.out.print("not found\n");
		}

	}

}

