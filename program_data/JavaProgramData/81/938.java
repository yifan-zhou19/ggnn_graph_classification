package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int huan = new int(int a[5][5],int x,int y);
	int[][] a = new int[5][5];
	int i;
	int j;
	int n;
	int m;

	for (i = 0;i < 5;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i][0] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		a[i][1] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		a[i][2] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead(" ");
	if (tempVar4 != null)
	{
		a[i][3] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		a[i][4] = Integer.parseInt(tempVar5);
	}
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		n = Integer.parseInt(tempVar6);
	}
	String tempVar7 = ConsoleInput.scanfRead(" ");
	if (tempVar7 != null)
	{
		m = Integer.parseInt(tempVar7);
	}
	j = huan(a, n, m);
	if (j == 0)
	{
	System.out.print("error");
	}
	else
	{
		for (i = 0;i < 5;i++)
		{
			System.out.printf("%d %d %d %d %d\n",a[i][0],a[i][1],a[i][2],a[i][3],a[i][4]);
		}
	}

	}
	public static int huan(int[][] a, int x, int y)
	{
		int t;
		int s;
		int j;

		if (x <= 4 && x >= 0 && y <= 4 && y >= 0)
		{
		j = 1;
		for (s = 0;s < 5;s++)
		{
			t = a[x][s];
			a[x][s] = a[y][s];
			a[y][s] = t;
		}
		}
		else
		{
			j = 0;
		}
		return (j);


	}
}

