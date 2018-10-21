package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] num = new int[300];
		int i;
		int count = 0;
		int j;
		float sum = 0F;
		float ave;
		float[] cha = new float[300];
		float max = 0F;
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
				num[i] = Integer.parseInt(tempVar2);
			}
			sum += num[i];
		}
		ave = sum / n;
		for (i = 0;i < n;i++)
		{
			cha[i] = Math.abs(num[i] - ave);
			if (cha[i] > max)
			{
				max = cha[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (cha[i] == max)
			{
				count++;
			}
		}
		if (count == 1)
		{
			for (i = 0;i < n;i++)
			{
				if (cha[i] == max)
				{
					System.out.printf("%d",num[i]);
				}
			}
		}
		if (count == 2)
		{
			for (i = 0;i < n;i++)
			{
				if (cha[i] == max && num[i] < ave)
				{
					System.out.printf("%d,",num[i]);
				}
				if (cha[i] == max && num[i] > ave)
				{
					System.out.printf("%d",num[i]);
				}
			}
		}
		return 0;
	}
}

