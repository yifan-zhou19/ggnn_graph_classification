package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int i;
		int j;
		int[][] s = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					s[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if ((a < 5) && (b < 5))
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					if (i == a)
					{
						System.out.printf("%d ",s[b][j]);
					}
					if (i == b)
					{
						System.out.printf("%d ",s[a][j]);
					}
					if ((i != a) && (i != b))
					{
						System.out.printf("%d ",s[i][j]);
					}
				}
				if (i == a)
				{
					System.out.printf("%d\n",s[b][4]);
				}
				if (i == b)
				{
					System.out.printf("%d\n",s[a][4]);
				}
				if ((i != a) && (i != b))
				{
					System.out.printf("%d\n",s[i][4]);
				}
			}
		}
		else
		{
			System.out.print("error");
		}
		return 0;
	}
}

