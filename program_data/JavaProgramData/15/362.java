package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int n;
	int j;
	int sum;
	int[][] array = new int[30][30];
	int a;
	int b;
	int c;
	int d;
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
		array[i][j] = Integer.parseInt(tempVar2);
	}
	}
	}
	i = 0;
	j = 0;
	for (i = 0;i < n;i++)
	{
		for (j = 0;j < n;j++)
		{
			if (array[i][j] == 0 && array[i][j - 1] != 0 && array[i - 1][j] != 0)
			{
				a = i;
				b = j;
			}
			if (array[i][j] == 0 && array[i][j + 1] != 0 && array[i + 1][j] != 0)
			{
				c = i;
				d = j;
			}
		}
	}
	sum = (c - a - 1) * (d - b - 1);
	System.out.printf("%d",sum);

	}
}

