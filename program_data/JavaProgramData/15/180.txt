package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int[][] dian = new int[10][10];
		int i;
		int j;
		int s;
		int n;
		int a;
		int b;
		int c;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					dian[j][i] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (dian[i][j] == 0 && dian[i + 1][j] == 0 && dian[i][j + 1] == 0)
				{
					a = i;
					b = j;
					break;
				}
				else
				{
					continue;
				}
			}
		}

		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (dian[i][j] == 0 && dian[i - 1][j] == 0 && dian[i][j - 1] == 0)
				{
					c = i;
					d = j;
					break;
				}
				else
				{
					continue;
				}
			}
		}
		s = (c - a - 1) * (d - b - 1);
		System.out.printf("%d",s);
	}
}

