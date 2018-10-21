package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[400];
		int sum = 0;
		int t;
		float p;
		float max = 0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + a[i];
		}
		p = (float)sum / (float)n;
		for (i = 0;i <= n - 2;i++)
		{
			for (j = 0;j <= n - 2 - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j];
					a[j] = a[j + 1];
					a[j + 1] = t;
				}
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (Math.abs(a[i] - p) > max)
			{
				max = Math.abs(a[i] - p);
			}
		}
		for (i = 0,j = 0;i <= n - 1;i++)
		{
			if (Math.abs(Math.abs(a[i] - p) - max) <= 0.00001)
			{
				if (j == 0)
				{
					System.out.printf("%d",a[i]);
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
				j++;
			}
		}
		System.out.print("\n");
	}


}

