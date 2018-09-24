package <missing>;

public class GlobalMembers
{
	public static int[] height = new int[26];

	public static int cal(int N,int M)
	{ //N&#206;a&#191;a�&#188;��&#189;&#207;?&#196;�y?&#196;&#206;&#187;&#214;&#195;?&#172;M&#206;a�?&#207;&#194;?&#196;�y?&#196;&#184;&#246;�y?&#172;N+M=��?&#196;�y&#184;&#246;�y
		int i;
		int max;
		int sub;
		max = 0;
		if (M == 0)
		{
			return 1;
		}
		for (i = N + 1;i <= N + M;i++)
		{
			if (height[N] >= height[i])
			{
				sub = cal(i, N + M - i);
				if (sub >= max)
				{
					max = sub;
				}
			}
		}
		return max + 1;
	}

	public static int Main()
	{
		int k;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		height[0] = 10000000;
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			height[1] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= k - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				height[i + 1] = Integer.parseInt(tempVar3);
			}
		}

		System.out.printf("%d",cal(0, k + 1) - 2);

		return 0;
	}


}

