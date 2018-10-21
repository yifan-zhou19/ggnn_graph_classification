package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[5][5];
	public static int Huan(int a,int b)
	{
		int i;
		int j;
		if (a < 0 || a>4 || b < 0 || b>4)
		{
			System.out.print("error\n");
			return 0;
		}
		else
		{
			for (i = 0;i < a;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",s[i][j]);
				}
				System.out.printf("%d\n",s[i][4]);
			}
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",s[b][j]);
			}
			System.out.printf("%d\n",s[b][4]);
			for (i = a + 1;i < b;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",s[i][j]);
				}
				System.out.printf("%d\n",s[i][4]);
			}
			for (j = 0;j < 4;j++)
			{
				System.out.printf("%d ",s[a][j]);
			}
			System.out.printf("%d\n",s[a][4]);
			for (i = b + 1;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",s[i][j]);
				}
				System.out.printf("%d\n",s[i][4]);
			}
			return 1;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		int t;
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
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			if (m > n)
			{
				t = m;
				m = n;
				n = t;
			}
			Huan(m, n);
			return 0;
	}

}

