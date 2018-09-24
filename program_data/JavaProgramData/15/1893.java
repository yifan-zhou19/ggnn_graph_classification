package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int fir1;
		int fir2;
		int la1;
		int la2;
		int s;
		int[][] a = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		fir1 = 0;
		for (i = 1;i < n + 1;i++)
		{
			for (j = 1;j < n + 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
				if (fir1 == 0 && a[i][j] == 0)
				{
					fir1 = i;
					fir2 = j;
				}
				if (a[i][j] == 0)
				{
					la1 = i;
					la2 = j;
				}
			}
		}
		s = (la1 - fir1 - 1) * (la2 - fir2 - 1);
		if (s <= 0)
		{
			System.out.print("0");
		}
		else
		{
			System.out.printf("%d",s);
		}
		return 0;
	}

}

