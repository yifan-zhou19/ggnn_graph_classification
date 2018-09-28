package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] sz = new int[6];
	int[] az = new int[6];
	int[] bz = new int[7];
	sz[1] = 100;
	sz[2] = 50;
	sz[3] = 20;
	sz[4] = 10;
	sz[5] = 5;
	sz[6] = 0.5;
	int a;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = Integer.parseInt(tempVar);
	}
	bz[1] = a;
	for (int i = 1;i < 7;i++)
	{
		az[i] = bz[i] / sz[i];
	bz[i + 1] = bz[i] - az[i] * sz[i];
	}
	az[6] = bz[7];
	for (int j = 1;j < 7;j++)
	{
	System.out.printf("%d\n",az[j]);
	}
	return 0;
	}


}

