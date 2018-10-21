package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int r;
		int c;
		int n;
		int[][] s = new int[100][100];
		int[] sum = new int[100];
		int sumr;
		int sumc;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			sumr = 0;
			sumc = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				r = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < r;j++)
			{
				for (k = 0;k < c;k++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						s[j][k] = Integer.parseInt(tempVar4);
					}
				}
			}
				if (r != 1 && c != 1)
				{
				for (k = 0;k < c;k++)
				{
				sumr += s[0][k] + s[r - 1][k];
				}
				for (j = 0;j < r;j++)
				{
					sumc += s[j][0] + s[j][c - 1];
				}
				sum[i] = sumr + sumc - s[0][0] - s[0][c - 1] - s[r - 1][0] - s[r - 1][c - 1];
				}
			 if (r == 1 && c != 1)
			 {
					for (k = 0;k < c;k++)
					{
						sum[i] += s[0][k];
					}
			 }
					if (c == 1 && r != 1)
					{
						for (j = 0;j < r;j++)
						{
							sum[i] += s[j][0];
						}
					}
						if (c == 1 && r == 1)
						{
							sum[i] = s[0][0];
						}
		}
			  for (i = 0;i < n;i++)
			  {
			System.out.printf("%d\n",sum[i]);
			  }
				return 0;
	}






}

