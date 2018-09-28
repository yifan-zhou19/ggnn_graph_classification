package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int m = 0;
	public static int i = 0;
	public static int t = 0;
	public static int w = 0;
	public static int e = 0;
	public static int q = 0;
	public static int r = 0;
	public static int k = 0;
	public static int o = 0;
	public static int p = 0;
	public static int u = 0;
	public static int f = 0;
	public static int[][] a = new int[100][100];
	public static int[] b = new int[10000];
	public static int[] c = new int[10000];
	public static int[] d = new int[10000];
	public static double x = 0;
	public static double y = 0;
	public static double z = 0;
	public static int Main()
	{

	for (i = 0;i < 100;i++)
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
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			a[i][5] = Integer.parseInt(tempVar6);
		}
			if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
			{
				break;
			}
	}

	for (i = 0;i < 100;i++)
	{
		b[i] = (12 - a[i][0] + a[i][3]) * 3600 + (a[i][4] - a[i][1]) * 60 + a[i][5] - a[i][2];
			if (a[i][0] == 0 && a[i][1] == 0 && a[i][2] == 0 && a[i][3] == 0 && a[i][4] == 0 && a[i][5] == 0)
			{
				break;
			}
	 System.out.printf("%d\n",b[i]);
	}
	return 0;

	}


}

