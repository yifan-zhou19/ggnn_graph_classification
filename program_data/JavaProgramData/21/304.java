package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int k = 0;
		int j;
		int sum = 0;
		int max = 0;

		int[] a = new int[300];
		int[] c = new int[300];
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
		}

		for (i = 0;i < n;i++)
		{
			sum += a[i];
		}


		for (i = 0;i < n;i++)
		{
			if (n * a[i] - sum >= max)
			{
				 max = n * a[i] - sum;
			}
			 else if (sum - n * a[i] >= max)
			 {
				 max = sum - n * a[i];
			 }
		}

		for (i = 0;i < n;i++)
		{
			if (n * a[i] - sum - max == 0 || sum - n * a[i] - max == 0)
			{
				c[k] = a[i];
				k++;
			}
		}

			for (j = 0;j < k;j++)
			{
				System.out.printf("%d%c",c[j],(j != k - 1)?',':'\n');
			}
	}


}

