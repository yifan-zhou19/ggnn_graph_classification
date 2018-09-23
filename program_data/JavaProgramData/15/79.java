package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int num = 0;
	int sum = 0;
	int[][] a = new int[50][50];
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
			a[i][j] = Integer.parseInt(tempVar2);
		}
		if (a[i][j] == 0)
		{
			sum += 1;
		}
		num = (sum / 4 - 1) * (sum / 4 - 1);
		}
		}
	System.out.printf("%d\n",num);
	return 0;
	}

}

