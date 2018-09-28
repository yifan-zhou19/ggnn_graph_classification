package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int cn = new int(int x,int y);
		int i;
		int q;
		int p;
		int[] m = new int[2000];
		int[] n = new int[2000];
		for (i = 1;i <= 999;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
		q = q + 1;
		if (n[i] == 0 && m[i] == 0)
		{
		break;
		}
	   if (n[i] == 1)
	   {
		System.out.print("1\n");
	   }
		else
		{
		cn(n[i], m[i]);
		}
		}

	}



		public static int cn(int x,int y)
		{
			int i;
			int j;
			int p;
			int k;
			int m;
			int[][] d = new int[2000][1000];
			 k = 0;
			 m = 0;
			for (i = 1;i <= 1999;i++)
			{
				for (j = 1;j <= x;j++)
				{
				d[i][j] = 1;
				}
			}

			for (i = 1;i <= 1999;i++)
			{
				for (j = 1;j <= x;j++)
				{
					   if (d[i][j] == 1)
					   {
							k = k + 1;
					   }
						   if (k == y)
						   {
							  for (p = 1;p <= 1999;p++)
							  {
									d[p][j] = 0;
							  }
								k = 0;
								m = m + 1;

							   if (m == (x - 1))
							   {
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
								   goto end;
							   }
						   }
				}
			}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			end:
				for (i = 1;i <= x;i++)
				{
					if (d[1][i] == 1)
					{
					p = i;
				 System.out.printf("%d\n",i);
				break;
					}
				}

		}

}

