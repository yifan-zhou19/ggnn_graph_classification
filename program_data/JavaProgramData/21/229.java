package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[300];
		int n;
		int i;
		int sum = 0;
		int[] b = new int[300];
		int j = 0;
		int en;
		int d;
		float x;
		float max;
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
		x = sum / (float)(n);
		max = Math.abs(x - (float)(a[0]));
		b[j] = a[0];
		for (i = 1;i < n;i++)
		{
			if (Math.abs(x - (float)(a[i])) == max)
			{
				j++;
				b[j] = a[i];
			}
			else if (Math.abs(x - (float)(a[i])) > max)
			{
				max = Math.abs(x - (float)(a[i]));
				j = 0;
				b[j] = a[i];
				for (d = 1;d < 300;d++)
				{
					b[d] = 0;
				}
			}
		}
		for (i = 0;b[i] != 0;i++)
		{
			for (j = i;b[j] != 0;j++)
			{
				if (b[i] > b[j])
				{
					en = b[i];
					b[i] = b[j];
					b[j] = en;
				}
			}
		}
		System.out.printf("%d",b[0]);
		for (i = 1;b[i] != 0;i++)
		{
			System.out.printf(",%d",b[i]);
		}
	}
}

