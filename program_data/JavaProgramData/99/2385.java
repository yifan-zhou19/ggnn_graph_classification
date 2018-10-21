package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int[] sum = new int[4];
		int temp;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				temp = Integer.parseInt(tempVar2);
			}
			if (temp <= 18)
			{
				sum[0]++;
			}
			else if (temp <= 35)
			{
				sum[1]++;
			}
			else if (temp <= 60)
			{
				sum[2]++;
			}
			else
			{
				sum[3]++;
			}
		}

		System.out.printf("1-18: %.2f%%\n",(float)(100 * ((float)sum[0] / (float)n)));
		System.out.printf("19-35: %.2f%%\n",(float)(100 * ((float)sum[1]) / (float)n));
		System.out.printf("36-60: %.2f%%\n",(float)(100 * ((float)sum[2] / (float)n)));
		System.out.printf("60??: %.2f%%\n",(float)(100 * ((float)sum[3] / (float)n)));
	}
}

