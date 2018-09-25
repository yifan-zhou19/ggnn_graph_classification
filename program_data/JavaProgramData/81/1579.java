package <missing>;

public class GlobalMembers
{
	public static int juzhen(int[][] a, int m, int n)
	{
		int p;
		int j;

		if (m < 5 && n < 5 && m >= 0 && n >= 0)
		{
		for (j = 0;j < 5;j++)
		{
			p = a[m][j];
			a[m][j] = a[n][j];
			a[n][j] = p;
		}
		return (1);
		}
		else
		{
			return (0);
		}
	}
	public static void Main()
	{

		int[][] s = new int[5][5];
		int b;
		int c;
		int i;
		int j;
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
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		if (juzhen(s, b, c) != 0)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
			System.out.printf("%d ",s[i][j]);
				}
			System.out.printf("%d",s[i][4]);
			System.out.print("\n");
			}
		}

		else
		{
			System.out.print("error");
		}
	}

}

