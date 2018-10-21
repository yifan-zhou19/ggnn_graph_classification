package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int j;
		int i;
		int N;
		int[] a = new int[301];
		int sum;
		int max;
		int min;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Integer.parseInt(tempVar2);
		}
		sum = max = min = a[0];
		for (i = 1;i < N;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			sum += a[i];
			if (a[i] > max)
			{
				max = a[i];
			}
			else if (a[i] < min)
			{
				min = a[i];
			}
		}
		j = (max * N - sum) - (sum - min * N);

		if (j > 0)
		{
			System.out.printf("%d",max);
		}
		else if (j == 0)
		{
			System.out.printf("%d,%d",min,max);
		}
		else
		{
			System.out.printf("%d",min);
		}
	}
}

