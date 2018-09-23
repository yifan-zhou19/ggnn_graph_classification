package <missing>;

public class GlobalMembers
{
	public static int[] data = new int[K];
	public static int[][] ju = new int[K][K];
	public static int[] weight = new int[K];


	public static void Main(String[] args)
	{
		int n = 0;
		int i = 0;
		int j = 0;
		int max = 0;

		freopen("in.txt", "r", stdin);
		freopen("out.txt", "w", stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(ju, 0, (Integer.SIZE / Byte.SIZE));
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				data[i] = Integer.parseInt(tempVar2);
			}
			weight[i] = 1;
		}

		for (i = 0; i < n - 1; i++)
		{
			for (j = i + 1; j < n;j++)
			{
				if (data[i] >= data[j])
				{
					ju[i][j] = 1;
				}
			}
		}
		for (i = n - 2; i >= 0; i--)
		{
			for (j = i + 1; j < n; j++)
			{
				if (ju[i][j] != 0)
				{
					if (weight[i] < weight[j] + 1)
					{
						weight[i] = weight[j] + 1;
					}
				}
			}
		}
		max = 0;
		for (i = 0; i < n;i++)
		{
			if (max < weight[i])
			{
				max = weight[i];
			}
		}
		System.out.printf("%d\n", max);




	}
}

