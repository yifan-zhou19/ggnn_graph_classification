package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int[][] q = new int[1000][1000];
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					q[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (q[i][j] == 0)
				{
					a = i + 1;
					b = j + 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto tsu;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	tsu:
	for (i = n - 1;i >= 0;i--)
	{
			for (j = n - 1;j >= 0;j--)
			{
				if (q[i][j] == 0)
				{
					c = i - 1;
					d = j - 1;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto pku;
				}
			}
	}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	pku:
	System.out.printf("%d",(c - a + 1) * (d - b + 1));
	}
}

