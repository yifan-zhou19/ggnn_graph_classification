package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int b;
		int c;
		int d;
		int e;
	int[][] sum = new int[100][6];
	for (int i = 0;i < 100;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		(sum[i][0]) = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sum[i][1]) = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		(sum[i][2]) = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		(sum[i][3]) = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		(sum[i][4]) = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		(sum[i][5]) = Integer.parseInt(tempVar6);
	}
	sum[i][3] = sum[i][3] + 12;
	if (sum[i][5] < sum[i][2])
	{
		e = sum[i][5] + 60 - sum[i][2];
		sum[i][4]--;
	}
	else
	{
		e = sum[i][5] - sum[i][2];
	}
	if (sum[i][4] < sum[i][1])
	{
		d = sum[i][4] + 60 - sum[i][1];
		sum[i][3]--;
	}
	else
	{
		d = sum[i][4] - sum[i][1];
	}
	c = sum[i][3] - sum[i][0];
	b = c * 3600 + d * 60 + e;
	if (sum[i][0] == 0)
	{
		break;
	}
	System.out.printf("%d\n",b);

	}

	return 0;
	}
}

