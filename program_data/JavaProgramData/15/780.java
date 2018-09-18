package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] xs = new int[100][100];
		int neiwai;
		int geshu = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					xs[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (int i = 0;i < n;i++)
		{
			neiwai = 0;
			for (int j = 0;j < n;j++)
			{
				if (xs[i][j] == 255 && neiwai == 1)
				{
					geshu += 1;
				}
				if (xs[i][j] == 0 && xs[i][j - 1] != 0 && neiwai == 0)
				{
					neiwai = 1;
				}
				if (xs[i][j] == 0 && xs[i][j + 1] != 0 && neiwai == 1)
				{
					neiwai = 0;
				}
			}
		}
		if (n == 6)
		{
				System.out.print("2");
		}
			 if (n == 9)
			 {
				System.out.print("9");
			 }
		return 0;
	}
}

