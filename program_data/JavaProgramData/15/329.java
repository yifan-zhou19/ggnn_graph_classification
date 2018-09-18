package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[1000][1000];
		int i;
		int j;
		int c;
		int b;
		int s;
		int n;
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
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0 && a[i][j + 1] == 0 && a[i + 1][j] == 0 && a[i - 1][j] == 255 && a[i][j - 1] == 255)
				{
					c = i;
					b = j;
				}
				if (a[i][j] == 0 && a[i][j - 1] == 0 && a[i - 1][j] == 0 && a[i + 1][j] == 255 && a[i][j + 1] == 255)
				{
					c = i - c - 1;
					b = j - b - 1;
				}
			}
		}
		s = c * b;
		System.out.printf("%d",s);
	}








}

