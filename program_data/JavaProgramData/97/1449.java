package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[6];
		int[] t = new int[5];
		sz[0] = n / 100;
		t[0] = n - 100 * sz[0];
		sz[1] = t[0] / 50;
		t[1] = t[0] - 50 * sz[1];
		sz[2] = t[1] / 20;
		t[2] = t[1] - 20 * sz[2];
		sz[3] = t[2] / 10;
		t[3] = t[2] - 10 * sz[3];
		sz[4] = t[3] / 5;
		t[4] = t[3] - 5 * sz[4];
		sz[5] = t[4];
		for (int i = 0; i < 6; i++)
		{
			System.out.printf("%d\n", sz[i]);
		}
		return 0;
	}

}

