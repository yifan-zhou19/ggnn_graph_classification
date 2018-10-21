package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a;
		int[] sz = new int[6];
		int[] money = {100, 50, 20, 10, 5, 1};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		a = n;
		for (int i = 0;i < 6;i++)
		{
			sz[i] = a / (money[i]);
			a = a % (money[i]);
		}
		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",sz[0],sz[1],sz[2],sz[3],sz[4],sz[5]);
		return 0;
	}
}

