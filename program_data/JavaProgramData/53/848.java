package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] num = new float[300];
		int n;
		int i;
		int j;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (num[j] == num[i])
				{
					num[j] = 1.1F;
				}
				k++;
			}
		}
		if (k == n - 1)
		{
			System.out.printf("%.0f",num[0]);
		}
		else
		{
			System.out.printf("%.0f",num[0]);
			for (i = 1;i < n;i++)
			{
				if (Math.abs(num[i] - 1.1) > 0.09)
				{
				System.out.printf(",%.0f",num[i]);
				}
			}
		}
	}
}

