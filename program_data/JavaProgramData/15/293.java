package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int n1;
		int n2;
		int n3;
		int n4;
		int num;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] == 0)
				{
				   n1 = i;
				   n2 = j;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				  goto loop;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
			loop:
			for (i = 0;i <= n - 1;i++)
			{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[i][j] == 0)
				{
					n3 = i;
					n4 = j;
				}
			}
			}
				num = (n3 - n1 - 1) * (n4 - n2 - 1);
				System.out.printf("%d",num);
				return 0;
	}
}

