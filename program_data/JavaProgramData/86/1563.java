package <missing>;

public class GlobalMembers
{
	public static int[][] a = new int[1000][1000];
	public static int[][] b = new int[1000][1000];
	public static int[] c = new int[1000];
	public static int x = 0;
	public static int y = 0;
	public static int z = 0;
	public static int i = 0;
	public static int m = 0;
	public static int e = 0;
	public static int r = 0;
	public static int t = 0;
	public static int Main()
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		e = Integer.parseInt(tempVar);
	}

	for (i = 0;i < e;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			x = Integer.parseInt(tempVar2);
		}
		for (m = 0;m < x;m++)
		{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 a[i][m] = Integer.parseInt(tempVar3);
			 }
		}
	}
	for (i = 0;i < e;i++)
	{
		for (m = 1;m <= 60;m++)
		{
			b[i][m] = 1;
		}
		t = 0;
		for (m = 0;m < 60;m++)
		{
		if (a[i][m] == 0)
		{
			break;
		}
		a[i][m] += 3 * t;
		b[i][a[i][m] + 3] = 0;
		b[i][a[i][m] + 1] = 0;
		b[i][a[i][m] + 2] = 0;
		//printf("%d\n",a[i][m]);
		t++;
		}
	}
	t = 0;
	for (i = 0;i < e;i++)
	{
	t = 0;
	for (m = 1;m <= 60;m++)
	{
	if (b[i][m] == 1)
	{
		t++;
	c[i] = t;
	}

	}
	}
	for (i = 0;i < e;i++)
	{
	System.out.printf("%d\n",c[i]);
	}
	return 0;
	}
}

