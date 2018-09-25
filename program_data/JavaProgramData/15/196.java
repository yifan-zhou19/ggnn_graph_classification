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
		int q = 0;
		int m = 0;
		int number;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] s = new int[100][100];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					s[i][j] = Integer.parseInt(tempVar2);
				}
			}
			if (j == (n - 1))
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
			for (j = 0;j < n;j++)
			{
				if (s[i][j] == 0)
				{
					q++;
				}
			}
	if (q != 0)
	{
			break;
	}
		}
		for (a = 0;a < n;a++)
		{
			for (b = 0;b < n;b++)
			{
				if (s[b][a] == 0)
				{
					m++;
				}
			}
			if (m != 0)
			{
					break;
			}
		}

		number = (q - 2) * (m - 2);
	  System.out.printf("%d",number);




	}

}

