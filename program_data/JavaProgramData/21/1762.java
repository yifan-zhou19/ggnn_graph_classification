package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int[] rec = new int[301];
	public static int min;
	public static int max;
	public static float sum;
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0F;
		min = 100000;
		max = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				rec[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + rec[i];
			if (rec[i] < min)
			{
				min = rec[i];
			}
			if (rec[i] > max)
			{
				max = rec[i];
			}
		}
		sum = sum / n;
		if (max - sum == sum - min)
		{
			System.out.printf("%d,%d\n",min,max);
		}
		else if (max - sum > sum - min)
		{
			System.out.printf("%d\n",max);
		}
		else
		{
			System.out.printf("%d\n",min);
		}
	}
}

