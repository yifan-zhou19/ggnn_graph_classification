package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int M;
	public static int[] data = new int[10010];

	public static int Main()
	{
		int i;
		int t;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		M = 0;
		for (i = 1;i <= N ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				t = Integer.parseInt(tempVar2);
			}
			if (t % 2 != 0)
			{
				data[M++] = t;
			}
		}
		for (i = M - 1 ; i >= 0; i--)
		{
			for (j = 0;j < i ; j++)
			{
				if (data[j] > data[j + 1])
				{
					data[j] = data[j + 1] + data[j];
					data[j + 1] = data[j] - data[j + 1];
					data[j] = data[j] - data[j + 1];
				}
			}
		}

		for (i = 0;i <= M - 2; i++)
		{
			System.out.printf("%d,",data[i]);
		}
		System.out.printf("%d\n",data[i]);

		return 0;
	}

}

