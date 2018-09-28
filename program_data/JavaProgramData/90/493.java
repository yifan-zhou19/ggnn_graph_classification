package <missing>;

public class GlobalMembers
{
	public static int f(int m,int n)
	{
		if (m < 0 || n < 0)
		{
			return (0);
		}
		else if (m == 1 || n == 1 || m == 0 || m == 1)
		{
			return (1);
		}
		else
		{
			return (f(m - n, n) + f(m, n - 1));
		}
	}
	public static void Main()
	{
		int x;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		int[][] s = new int[100][2];
		for (i = 0;i < x;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < x;j++)
		{
		   System.out.printf("%d\n",f(s[j][0], s[j][1]));
		}
	}

}

