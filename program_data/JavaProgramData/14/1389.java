package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[3];
		int[] sum = new int[3];
		int i;
		int j;
		int k;
		int t;
		int n;
		int m;
		num[0] = num[1] = num[2] = sum[0] = sum[1] = sum[2] = -10000000;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				i = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				j = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				k = Integer.parseInt(tempVar4);
			}
			j += k;
			if (sum[2] < j)
			{
				sum[2] = j;
				num[2] = i;
				if (sum[2] > sum[1])
				{
					t = sum[2];
					sum[2] = sum[1];
					sum[1] = t;
					t = num[2];
					num[2] = num[1];
					num[1] = t;
					if (sum[1] > sum[0])
					{
						t = sum[0];
						sum[0] = sum[1];
						sum[1] = t;
						t = num[0];
						num[0] = num[1];
						num[1] = t;
					}
				}
			}
		}
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",num[i],sum[i]);
		}
		return 0;
	}
}

