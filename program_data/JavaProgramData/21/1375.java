package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float average;
		int[] b = new int[300];
		int[] a;
		a = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		average = (float)sum / n;

		int max = a[0];
		for (int j = 0;j < n;j++)
		{
			if (a[j] > max)
			{
				max = a[j];
			}
		}

		int min = a[0];
		for (int k = 0;k < n;k++)
		{
			if (a[k] < min)
			{
				min = a[k];
			}
		}

		if ((max - average) > (average - min))
		{
			System.out.printf("%d",max);
		}
		else if ((max - average) < (average - min))
		{
			System.out.printf("%d",min);
		}
		else
		{
			System.out.printf("%d,%d",min,max);
		}
	}

}

