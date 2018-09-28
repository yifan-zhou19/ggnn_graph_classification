package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[9];
		int[] b = new int[9];
		int j;
		int i;
		int n;
		float c = 0F;
		float d = 0F;
		float e;
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
			c = c + a[i];
		}
		for (j = 0;j <= n - 1;j++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[j] = Integer.parseInt(tempVar3);
			}
			if (b[j] >= 90)
			{
				e = 4.0F;
			}
			else if (b[j] >= 85)
			{
				e = 3.7F;
			}
			else if (b[j] >= 82)
			{
				e = 3.3F;
			}
			else if (b[j] >= 78)
			{
				e = 3.0F;
			}
			else if (b[j] >= 75)
			{
				e = 2.7F;
			}
			else if (b[j] >= 72)
			{
				e = 2.3F;
			}
			else if (b[j] >= 68)
			{
				e = 2.0F;
			}
			else if (b[j] >= 64)
			{
				e = 1.5F;
			}
			else if (b[j] >= 60)
			{
				e = 1.0F;
			}
			else
			{
				e = 0F;
			}
			d = d + a[j] * e;
		}
		c = d / c;
		System.out.printf("%.2f",c);
	}
}

