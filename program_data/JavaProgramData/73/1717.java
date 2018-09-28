package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int[][] a = new int[5][5];
		int[][] s = new int[5][3];
		int[][] l = new int[5][3];
		int c;
		int r;
		int w;
		for (t = 0;t < 5;t++)
		{
			for (i = 0;i < 5;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[t][i] = Integer.parseInt(tempVar);
				}
			}
		}
		for (c = 0;c < 5;c++)
		{
		  r = a[c][0];
		  for (t = 0;t < 5;t++)
		  {
			  if (a[c][t] >= r)
			  {
				  r = a[c][t];
				  l[c][0] = r;
				  l[c][1] = c;
				  l[c][2] = t;

			  }
		  }
		}
		for (c = 0;c < 5;c++)
		{
		  r = a[0][c];
		  for (t = 0;t < 5;t++)
		  {
			  if (a[t][c] <= r)
			  {
				  r = a[t][c];
				  s[c][0] = r;
				  s[c][1] = t;
				  s[c][2] = c;
			  }
		  }
		}
		w = 0;
		for (t = 0;t < 5;t++)
		{
			for (i = 0;i < 5;i++)
			{
				if (l[t][0] == s[i][0])
				{
					w++;
					System.out.printf("%d %d %d\n",s[i][1] + 1,s[i][2] + 1,s[i][0]);
				}
			}
		}
		if (w == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}

}

