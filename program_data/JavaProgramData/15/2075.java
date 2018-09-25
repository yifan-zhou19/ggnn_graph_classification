package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t1;
		int t2;
		int t3;
		int t4;
		int s;
		int[][] c = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					c[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (c[i][j] == 0)
				{
					t1 = i;
					t2 = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto ask;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	ask :
		for (i = n;i > 0;i--)
		{
			for (j = n;j > 0;j--)
			{
				if (c[i][j] == 0)
				{
					t3 = i;
					t4 = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto que;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	que:
		s = (t4 - t2 - 1) * (t3 - t1 - 1);
		System.out.printf("%d",s);
		return 0;
	}


}

