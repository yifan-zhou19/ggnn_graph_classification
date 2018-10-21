package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[][] b = new int[100][1000];
		int[][] c = new int[100][1000];
		int i;
		int j;
		int k;
		int t;
		int n;
		int l;
		int w;
		int w2;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] != 0)
			{
			for (j = 0;j < a[i];j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b[i][j] = Integer.parseInt(tempVar2);
				}
			}
			for (j = 0;j < a[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					c[i][j] = Integer.parseInt(tempVar3);
				}
			}
			}
				else
				{
					break;
				}

		}



		for (k = 0;k < i;k++)
		{
			for (j = 0;j < a[k] - 1;j++) //?????????????
			{
				for (n = 0;n < a[k] - 1 - j;n++)
				{
				   if (b[k][n] < b[k][n + 1])
				   {
										 t = b[k][n];
										 b[k][n] = b[k][n + 1];
										 b[k][n + 1] = t; //b????? c?????
				   }
				}
			}

			for (j = 0;j < a[k] - 1;j++) //?????????????
			{
				for (n = 0;n < a[k] - 1 - j;n++)
				{
				   if (c[k][n] < c[k][n + 1])
				   {
										 t = c[k][n];
										 c[k][n] = c[k][n + 1];
										 c[k][n + 1] = t; //b????? c?????
				   }
				}
			}
			w = 0;
			l = 0;
			w2 = 0;
			while (w + l + w2 < a[k])
			{
				  if (b[k][w] > c[k][w + l])
				  {
					  w++;
				  }
				  else if (b[k][w] < c[k][w + l])
				  {
					  l++;
				  }
				  else if (b[k][a[k] - 1 - l - w2] > c[k][a[k] - 1 - w2])
				  {
					  w2++;
				  }
				  else if (b[k][a[k] - 1 - l - w2] > c[k][a[k] - 1 - w2])
				  {
					  l++;
				  }
				  else if (b[k][a[k] - 1 - l - w2] == c[k][w + l])
				  {
					 break;
				  }
				  else
				  {
					  l++;
				  }
			}

						  System.out.printf("%d\n",(w + w2) * 200 - l * 200);
		}
	}
}

