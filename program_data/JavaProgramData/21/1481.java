package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] c = new int[100];
		int i;
		int j = 0;
		float ave = 0F;
		float[] b = new float[100];
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
			ave = ave + a[i];
		}
		ave = ave / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - ave);
		}
		ave = b[0];
		for (i = 0;i < n;i++)
		{
			if (b[i] > ave)
			{
				ave = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == ave)
			{
				c[j++] = a[i];
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (n = i + 1;n < j;n++)
			{
				if (c[n] < c[i])
				{
				ave = c[n];
				c[n] = c[i];
				c[i] = ave;
				}
			}
		}
			for (i = 0;i < j;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d",c[i]);
				}
				else
				{
					System.out.printf(",%d",c[i]);
				}
			}
	}
}

