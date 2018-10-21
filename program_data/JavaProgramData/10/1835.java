package <missing>;

public class GlobalMembers
{
	public static int[] Height = new int[26];
	public static int[] MaxLen = new int[26];

	public static void LIS(int k)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(MaxLen,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 1;i <= k; i++)
		{
			MaxLen[i] = 1;

			for (int j = 1;j < i;j++)
			{

				if (Height[i] <= Height[j])
				{

					int preMax = MaxLen[j] + 1;
					if (preMax > MaxLen[i])
					{
						MaxLen[i] = preMax;
					}
				}
			}
		}
	}

	public static int Main()
	{
		int N;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}

			for (i = 1;i <= N;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					Height[i] = Integer.parseInt(tempVar2);
				}
			}
			LIS(N);
			int Max = -1;

			for (i = 1;i <= N;i++)
			{
				if (Max < MaxLen[i])
				{
					Max = MaxLen[i];
				}
			}
			if (N != 0)
			{
				System.out.printf("%d\n",Max);
			}

		return 0;
	}
}

