package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] num = new float[300];
		int n;
		int i;
		int j;
		float temp;
		float max1;
		float max2;
		float a;
		float sum = 0F;
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
			sum = sum + num[i];
		}
		a = sum / (float)n;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (num[i] > num[i + 1])
				{
					temp = num[i];
					num[i] = num[i + 1];
					num[i + 1] = temp;
				}
			}
		}

		max1 = num[0];
		for (i = 1;num[i] < a;i++)
		{
			if ((a - num[i]) > (a - max1))
			{
				max1 = num[i];
			}
		}
		max2 = num[n - 1];
		for (i = n - 1;num[i] > a;i++)
		{
			if ((num[i] - a) > (a - max2))
			{
				max2 = num[i];
			}
		}
		if ((a - max1) == (max2 - a))
		{
			System.out.printf("%.0f,%.0f",max1,max2);
		}
		else if ((a - max1) > (max2 - a))
		{
			System.out.printf("%.0f",max1);
		}
		else
		{
			System.out.printf("%.0f",max2);
		}

	}
}

