package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[DefineConstants.H][DefineConstants.L];
		int h;
		int l;
		int n;
		int m;
		int a;
		int e;
		a = 0;
		for (int h = 0;h < DefineConstants.H;h++)
		{
			for (int l = 0;l < DefineConstants.L;l++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[h][l] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (n < DefineConstants.H && m < DefineConstants.H)
		{
			a = 1;
		}
		if (a == 1)
		{
		for (l = 0;l < DefineConstants.L;l++)
		{
		a = sz[n][l];
		sz[n][l] = sz[m][l];
		sz[m][l] = a;
		}
		for (h = 0;h < DefineConstants.H;h++)
		{
			for (l = 0;l < DefineConstants.L - 1;l++)
			{
				System.out.printf("%d ",sz[h][l]);
			}
			System.out.printf("%d\n",sz[h][DefineConstants.L - 1]);
		}
		}
		else
		{
		 System.out.print("error");
		}
		return 0;
	}

}

final class DefineConstants
{
	public static final int H = 5;
	public static final int L = 5;
}

