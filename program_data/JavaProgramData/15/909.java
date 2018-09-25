package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int[][] a = new int[100][100];
		int n;
		int s;
		int k = 0;
		int[] b = new int[1000];
		b[0] = 0;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}

				  if (a[i][j] == 0)
				  {
					  b[k] = b[k] + 1;
				  }
			}
			if (b[k] != 0)
			{
				   k += 1;
			}
		}

		s = (b[0] - 2) * (k - 2);
		System.out.printf("%d",s);
		return 0;
	}


}

