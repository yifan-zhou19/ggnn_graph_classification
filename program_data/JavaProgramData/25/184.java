package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i;
		int[] sz = new int[1000];
		double sum = 1;
		for (i = 1;i <= N;i++)
		{
			sz[i] = 2;
			sum = sum * sz[i];
		}
		System.out.printf("%.0lf",sum);
		return 0;
	}
}

