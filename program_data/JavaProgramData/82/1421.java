package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[101];
		int n;
		int i;
		int t = 0;
		int q;
		int s = -1;
		int[][] xy = new int[100][2];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 xy[i][0] = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 xy[i][1] = Integer.parseInt(tempVar3);
			 }
		}
		for (i = 0;i < n;i++)
		{
			if (xy[i][0] >= 90 && xy[i][0] <= 140 && xy[i][1] >= 60 && xy[i][1] <= 90)
			{
				t++;
			}
			if (xy[i + 1][0] < 90 || xy[i + 1][0]>140 || xy[i + 1][1] < 60 || xy[i + 1][1]>90)
			{
				s++;
				sz[s] = t;
				t = 0;
			}
		}
		for (i = 0;i < s;i++)
		{
			if (sz[i] > sz[i + 1])
			{
				q = sz[i];
				sz[i] = sz[i + 1];
				sz[i + 1] = q;
			}
		}
		System.out.printf("%d",sz[s]);
		return 0;
	}







}

