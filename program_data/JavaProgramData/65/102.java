package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a = 0;
		int c;
		int[][] b = new int[200][2];
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
					b[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
				c = b[i][0] - b[i][1];
				if (c == 0)
				{
					a = a;
				}
				if (c == 1 || c == -2)
				{
					a = a - 1;
				}
				if (c == -1 || c == 2)
				{
					a = a + 1;
				}
		}
		if (a == 0)
		{
			System.out.print("Tie");
		}
		if (a > 0)
		{
			System.out.print("A");
		}
		if (a < 0)
		{
			System.out.print("B");
		}
		return 0;
	}
}

