package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s = new int[100][100];
		int h;
		int l;
		int k;
		int m;
		int n;
		int i;
		int j;
		int w;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}

		for (l = 1;l <= k;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			w = m;
			h = n;
		   i = 0;
		   while (i < m)
		   {
			   j = 0;
			   while (j < n)
			   {
				   String tempVar4 = ConsoleInput.scanfRead();
				   if (tempVar4 != null)
				   {
					   s[i][j] = Integer.parseInt(tempVar4);
				   }
				   j++;
			   }
			i++;
		   }
		   sum = 0;
		   if (h > 1 && w > 1)
		   {
			  i = 0;
			  while (i < w)
			  {
				sum += s[i][0] + s[i][h - 1];
				i++;
			  }
			  j = 0;
			  while (j < h)
			  {
				sum += s[0][j] + s[w - 1][j];
				j++;
			  }
			  sum = sum - s[0][0] - s[0][h - 1] - s[w - 1][0] - s[w - 1][h - 1];
		   }
			if (h == 1 && w == 1)
			{
				sum = s[0][0];
			}
			if (h == 1 && w > 1)
			{
				i = 0;
				while (i < w)
				{
				  sum += s[i][0];
				  i++;
				}
			}
			if (h > 1 && w == 1)
			{
				j = 0;
				while (j < h)
				{
				  sum += s[0][j];
				  j++;
				}
			}
			 if (h == 0 || w == 0)
			 {
				sum = 0;
			 }
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

