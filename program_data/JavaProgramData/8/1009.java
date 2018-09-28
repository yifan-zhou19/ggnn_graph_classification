public class HaHa
{
	public int x;
	public int y;
	public int[][] z = new int[2][1000];
	public int[] g = new int[2000];
}

package <missing>;

public class GlobalMembers
{
	public static HaHa scan()
	{
		HaHa hehe = new HaHa();
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			hehe.x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			hehe.y = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < hehe.x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				hehe.z[0][i] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < hehe.y;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				hehe.z[1][j] = Integer.parseInt(tempVar4);
			}
		}
		return (hehe);
	}
	public static HaHa line(HaHa yahoo)
	{
		int i;
		int temp;
		int j;
		HaHa yahoo1 = new HaHa();
		for (i = 0;i < yahoo.x;i++)
		{
			for (j = i;j < yahoo.x;j++)
			{
				if (yahoo.z[0][i] > yahoo.z[0][j])
				{
					temp = yahoo.z[0][i];
					yahoo.z[0][i] = yahoo.z[0][j];
					yahoo.z[0][j] = temp;
				}
			}
		}
		for (i = 0;i < yahoo.y;i++)
		{
			for (j = i;j < yahoo.y;j++)
			{
				if (yahoo.z[1][i] > yahoo.z[1][j])
				{
					temp = yahoo.z[1][i];
					yahoo.z[1][i] = yahoo.z[1][j];
					yahoo.z[1][j] = temp;
				}
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: yahoo1=yahoo;
		yahoo1.copyFrom(yahoo);
		return (yahoo1);
	}
	public static HaHa combine(HaHa xx)
	{
		int i;
		HaHa xx1 = new HaHa();
		for (i = 0;i < xx.x;i++)
		{
			xx.g[i] = xx.z[0][i];
		}
		for (i = 0;i < xx.y;i++)
		{
			xx.g[i + xx.x] = xx.z[1][i];
		}
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: xx1=xx;
		xx1.copyFrom(xx);
		return (xx1);
	}
	public static void print(HaHa xxx)
	{
		int i;
		for (i = 0;i < xxx.x + xxx.y - 1;i++)
		{
			System.out.printf("%d ",xxx.g[i]);
		}
		System.out.printf("%d",xxx.g[xxx.x + xxx.y - 1]);
	}
	public static void Main()
	{
		print(combine(line(scan())));
	}

}

