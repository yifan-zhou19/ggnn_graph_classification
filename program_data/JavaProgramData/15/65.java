package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int j;
		int a;
		int b;
		int s;
		a = 4;
		int[][] p = new int[1000][1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p[i][j] = Integer.parseInt(tempVar2);
				}
				if (p[i][j] == 0)
				{
					a++;
				}
				else
				{
					a = a;
				}
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i][n - 1] = Integer.parseInt(tempVar3);
			}
		}
		b = a / 4;
		s = (b - 2) * (b - 2);
		System.out.printf("%d",s);
	}


}

