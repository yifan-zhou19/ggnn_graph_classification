package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float[] b = new float[300];
		float p = 0F;
		float t;
		int i;
		int j = 0;
		int n;
		int max = 0;
		int[] a = new int[300];
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

	 for (j = 0;j < n - 1;j++)
	 {
					for (i = 0;i < n - j - 1;i++)
					{
						if (a[i] > a[i + 1])
						{
							t = a[i];
							a[i] = a[i + 1];
							a[i + 1] = t;
						}
					}
	 }
		for (i = 0;i < n;i++)
		{
			p = p + a[i];
		}
		p = p / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] - p >= 0F)
			{
				b[i] = a[i] - p;
			}
			else
			{
				b[i] = p - a[i];
			}
		}
		for (i = 1;i < n;i++)
		{
			if (b[i] > b[max])
			{
				t = max;
				max = i;
				i = t;
			}
		}
			for (i = 0;i < n;i++)
			{
				if (b[i] < b[max])
				{
					a[i] = -1;
				}
			}
			for (i = 0;i < n;i++)
			{
			if (a[i] >= 0)
			{
				System.out.printf("%d",a[i]);
				for (j = i + 1;j < n;j++)
				{
					if (a[j] >= 0)
					{
						System.out.printf(",%d",a[j]);
					}
				}
					break;
			}
			}
	}
}

