package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int flag;
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			b[i] = 0;
			for (j = 1;j < n;j++)
			{
				if (a[i][j] > a[i][b[i]])
				{
					b[i] = j;
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			flag = 1;
			for (j = 0;j < m;j++)
			{
				if (a[j][b[i]] < a[i][b[i]])
				{
					flag = 0;
				}
			}
			if (flag == 1)
			{
				System.out.printf("%d+%d",i,b[i]);
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto Eof;
			}
		}
		System.out.print("No");
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	Eof:
	;
		return 0;
	}
}

