package <missing>;

public class GlobalMembers
{
	public static int[][] s = new int[8][8];
	public static int Main()
	{
		int n;
		int N;
		int i;
		int j;
		int a;
		int b;
		int c;
		int min = 100;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < N;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					s[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < N;j++)
			{
				if (s[i][j] > max)
				{
					max = s[i][j];
					a = i;
					b = j;
				}
			}
			for (c = 0;c < n;c++)
			{
				if (s[c][b] < min)
				{
					min = s[c][b];
				}
			}
				if (min == max)
				{
					System.out.printf("%d+%d",a,b);
					return 0;
				}
		}
		System.out.print("No");
		return 0;
	}


}

