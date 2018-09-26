package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] SZ = new int[6];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		SZ[0] = n / 100;
		SZ[1] = n % 100 / 50;
		SZ[2] = (n % 100 - SZ[1] * 50) / 20;
		SZ[3] = (n % 100 - SZ[1] * 50 - SZ[2] * 20) / 10;
		SZ[4] = n % 10 / 5;
		SZ[5] = n % 10 - SZ[4] * 5;
		for (int i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",SZ[i]);
		}
		return 0;
	}
}

