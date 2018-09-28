package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int[] num = new int[100];
	public static int i;
	public static int min = 10000;
	public static int max = -1;
	public static int total = 0;
	public static int Main()
	{
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
			if (num[i] < min)
			{
				min = num[i];
			}
			if (num[i] > max)
			{
				max = num[i];
			}
			total += num[i];
		}
		if (total - min * n == max * n - total)
		{
			System.out.printf("%d,%d\n",min,max);
		}
		else
		{
			if (total - min * n < max * n - total)
			{
				System.out.printf("%d\n",max);
			}
			else if (total - min * n > max * n - total)
			{
				System.out.printf("%d\n",min);
			}
		}
	}

}

