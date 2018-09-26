package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[][] a = new int[100][6];
	int b;
	int g;
	for (b = 0;b < 100;b++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[b][0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a[b][1] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[b][2] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		a[b][3] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		a[b][4] = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		a[b][5] = Integer.parseInt(tempVar6);
	}
	if (a[b][0] == 0 && a[b][1] == 0 && a[b][2] == 0)
	{
		break;
	}
	g = 3600 - a[b][1] * 60 - a[b][2] + (12 - (a[b][0] + 1) + a[b][3]) * 3600 + a[b][4] * 60 + a[b][5];
	System.out.printf("%d\n",g);
	}
	return 0;
	}


}

