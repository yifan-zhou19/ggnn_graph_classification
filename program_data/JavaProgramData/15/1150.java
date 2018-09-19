package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int row;
		int col;
		int[][] s = new int[100][100];
		int i = 0;
		int k = 0;
		int j = 0;
		int h = 0;
		int e = 0;
		int d = 0;
		int f = 0;
		int g = 0;
		int area;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < n;col++)
			{
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  (s[row][col]) = Integer.parseInt(tempVar2);
			  }
			}
		}

		for (i = 0;i < n;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (s[i][k] == 0)
				{
					e = i;
					d = k;
					break;
				}
			}
			if (k < n)
			{
			if (s[i][k] == 0)
			{
				break;
			}
			}

		}

		for (j = n - 1;j >= 0;j--)
		{
			for (h = n - 1;h >= 0;h--)
			{
				if (s[j][h] == 0)
				{
					f = j;
					g = h;
					break;
				}
			}
		if (h >= 0)
		{
			if (s[j][h] == 0)
			{
				break;
			}
		}
		}

	//	printf("%d%d%d%d\n",f,g,e,d);
		area = (f - e-1) * (g - d - 1);
		System.out.printf("%d\n",area);
		return 0;
	}


}

