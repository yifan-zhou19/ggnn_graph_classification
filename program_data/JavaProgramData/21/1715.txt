package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] num = new int[300];
		int i;
		int k = 0;
		int n;
		int j;
		float aver;
		float[] sub = new float[300];
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
				num[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + num[i];
		}
		aver = sum / n;
		for (i = 0;i < n;i++)
		{
			sub[i] = Math.abs(num[i] - aver);
		}
		for (i = 0;i < n;i++)
		{
			if (sub[i] > sub[k])
			{
				k = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sub[i] == sub[k] && i != k)
			{
				if (num[i] > num[k])
				{
					j = num[i];
					num[i] = num[k];
					num[k] = j;
				}
				System.out.printf("%d,",num[i]);
				break;
			}
		}
		System.out.printf("%d\n",num[k]);
	}

}

