package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int c;
		int d;
		int s;
		int first = 0;
		int[][] num = new int[100][100];
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
					num[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (num[i][j] == 0 && first == 0)
				{
					a = i;
					b = j;
					first = 1;
				}
				if (num[i][j] == 0)
				{
					c = i;
					d = j;
				}
			}
		}
		s = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",s);
		return 0;
	}




}

