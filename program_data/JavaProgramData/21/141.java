package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		float k = 0.0F;
		float temp;
		float tempo;
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
			k = k + a[i];
		}
		k = k / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - k);
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (b[i] < b[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					tempo = b[i];
					b[i] = b[j];
					b[j] = tempo;

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

