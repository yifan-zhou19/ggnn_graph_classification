package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[101][2];
		int s = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar2);
			   }
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] >= 90 && a[i][0] <= 140 && a[i][1] >= 60 && a[i][1] <= 90)
			{
				s++;
			}
			else
			{
				if (b == 0)
				{
					b = s;
				}
				else
				{
					if (s > b)
					{
						b = s;
					}
				}
				s = 0;
			}
		}
		if (s > b)
		{
			b = s;
		}

			System.out.printf("%d",b);


		return 0;
	}
}

