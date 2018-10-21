package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[310];
		int max;
		int min;
		int n;
		int i;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				max = a[i];
				min = a[i];
				sum = a[i];
			}
			else
			{
				sum += a[i];
				max = (a[i] > max)? a[i]:max;
				min = (a[i] < min)? a[i]:min;
			}
		}
		sum = sum / n;
		if ((max - sum) > (sum - min))
		{
			System.out.printf("%d",max);
		}
		else if ((max - sum) < (sum - min))
		{
			System.out.printf("%d",min);
		}
		else
		{
			System.out.printf("%d,%d",min,max);
		}
	}

}

