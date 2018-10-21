package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] n = new int[100][100];
		int[][] s = new int[100][100];
		int a;
		int b;
		int i;
		int j;
		int max;
		int min;
		int e = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(",");
	if (tempVar2 != null)
	{
		b = Integer.parseInt(tempVar2);
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n[i][j] = Integer.parseInt(tempVar3);
			}
		}
	}
	for (i = 0;i < a;i++)
	{
		max = n[i][0];
		for (j = 1;j < b;j++)
		{
			if (n[i][j] > max)
			{
				max = n[i][j];
			}
		}
		for (j = 0;j < b;j++)
		{
			if (n[i][j] == max)
			{
				s[i][j]++;
			}
		}
	}
	for (j = 0;j < b;j++)
	{
		min = n[0][j];
		for (i = 1;i < a;i++)
		{
			if (n[i][j] < min)
			{
				min = n[i][j];
			}
		}
		for (i = 0;i < a;i++)
		{
			if (n[i][j] == min)
			{
				s[i][j]++;
			}
		}
	}
	for (i = 0;i < a;i++)
	{
		for (j = 0;j < b;j++)
		{
			if (s[i][j] == 2)
			{
			System.out.printf("%d+%d\n",i,j);
			e++;
			}
		}
	}
	if (e == 0)
	{
		System.out.print("No");
	}
	}

}

