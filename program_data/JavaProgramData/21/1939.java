package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int j;
		int temper;
		float average;
		float sum = 0F;
		float[] b = new float[300];
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
		sum = sum + a[i];
		}
		average = sum / n;
		//printf("%f",average);
		for (i = 0;i < n;i++)
		{
			if (a[i] > average)
			{
			b[i] = a[i] - average;
			}
			else
			{
			b[i] = average - a[i];
			}
		}
		//for(i=0;i<n;i++)
		//{
			//printf("%d",b[i]);
		//}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i] < b[j])
				{
					temper = a[i];
				a[i] = a[j];
				a[j] = temper;
				temper = b[i];
				b[i] = b[j];
				b[j] = temper;
				}

			}

		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < n;i++)
		{
			if (b[i] == b[0])
			{
			System.out.printf(",%d",a[i]);
			}
		}

	}

}

