package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int t = 0;
		int max = 0;
		int n;
		int[][] xy = new int[100][2];
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
					xy[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (j = 0;j < n;j++)
		{
			if (xy[j][0] >= 90 && xy[j][0] <= 140 && xy[j][1] >= 60 && xy[j][1] <= 90)
			{
				t = t + 1;
				for (i = j + 1;i < n;i++)
				{
					  if (xy[i][0] >= 90 && xy[i][0] <= 140 && xy[i][1] >= 60 && xy[i][1] <= 90)
					  {
						  t++;
					  }
					  else
					  {
						  break;
					  }
				}
				if (t > max)
				{
					max = t;
				}

			}
			t = 0;
		}
		System.out.printf("%d",max);
		return 0;
	}



}

