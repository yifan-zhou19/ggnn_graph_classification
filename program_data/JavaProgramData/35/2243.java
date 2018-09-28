package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int[][] s = new int[8][8];
		int a;
		int b;
		int c = 0;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			t = s[i][0];
			a = i;
			b = 0;
			for (j = 0;j < m;j++)
			{
				if (s[i][j] > t)
				{
					t = s[i][j];
					b = j;
				}
			}
			for (i = 0;i < n;i++)
			{
				if (t > s[i][b])
				{
					c = 1;
				}
			}
			if (c == 0)
			{
				System.out.printf("%d+%d",a,b);
				c = 2;
			}
		}
		if (c != 2)
		{
			System.out.print("No");
		}


		return 0;
	}
}

