package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int r = 0;
		int t;
		float n;
		float sum = 0F;
		float[] a = new float[100];
		float[] b = new float[100];
		int[] c = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			sum += a[i];
		}
		sum = sum / n;
		for (i = 0;i < n;i++)
		{
			for (j = i;j < n;j++)
			{
				if (a[i] > a[j])
				{
					t = a[i];
					a[i] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] > sum)
			{
				b[i] = a[i] - sum;
			}
			else if (a[i] < sum)
			{
				b[i] = sum - a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (b[i] < b[j])
				{
					break;
				}
			}
			if (j == n)
			{
				c[r] = a[i];
				r++;
			}
		}
		for (i = 0;i < r;i++)
		{
			System.out.printf("%d",c[i]);
			if (i != r - 1)
			{
				System.out.print(",");
			}
		}

	}
}

