package <missing>;

public class GlobalMembers
{
	public static void swap(tangible.RefObject<Integer> a, tangible.RefObject<Integer> b)
	{
		int e;
		e = a.argValue;
		a.argValue = b.argValue;
		b.argValue = e;
	}
	public static void Main(String[] args)
	{
		int[][] sz = new int[5][5];
		int i = 0;
		int j = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int n = 0;
		int m = 0;
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
		if (n >= 0 && n <= 4 && m >= 0 && m <= 4)
		{
			for (j = 0;j < 5;j++)
			{
				swap(sz[n][j], sz[m][j]);
			}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (j < 4)
				{
					System.out.printf("%d ",sz[i][j]);
				}
				else
				{
					System.out.printf("%d",sz[i][j]);
				}
			}
			if (i < 4)
			{
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("error");
		}
	}
}

