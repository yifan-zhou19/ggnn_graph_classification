package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[20];
		int[] b = new int[20];
		int n;
		int i;
		int j;
		int sum = 0;
		float c1;
		float d;
		float d1;
		float k;
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
		for (j = 0;j < n;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
		}
		for (j = 0;j < n;j++)
		{
			if (b[j] > 89)
			{
				c1 = 4.0F;
			}
			else if (b[j] > 84)
			{
				c1 = 3.7F;
			}
			else if (b[j] > 81)
			{
				c1 = 3.3F;
			}
			else if (b[j] > 77)
			{
				c1 = 3.0F;
			}
			else if (b[j] > 71)
			{
				c1 = 2.3F;
			}
			else if (b[j] > 67)
			{
				c1 = 2.0F;
			}
			else if (b[j] > 63)
			{
				c1 = 1.5F;
			}
			else if (b[j] > 59)
			{
				c1 = 1.0F;
			}
			else
			{
				c1 = 0.0F;
			}
			d1 = a[j] * c1;
			d = d + d1;
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		k = d / sum;
		System.out.printf("%.2f",k);
	}

}

