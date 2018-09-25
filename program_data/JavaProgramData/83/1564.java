package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] f = new int[100];
		int[] g = new int[100];
		int sum;
		float c;
		float b;
		float d;
		float e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		sum = 0;
		c = 0F;

		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				f[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + f[i];
		}

		for (i = 0;i <= (n - 1);i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				g[i] = Integer.parseInt(tempVar3);
			}
			if (g[i] >= 90)
			{
				b = 4.0F;
			}
			else if (g[i] >= 85)
			{
				b = 3.7F;
			}
			else if (g[i] >= 82)
			{
				b = 3.3F;
			}
			else if (g[i] >= 78)
			{
				b = 3.0F;
			}
			else if (g[i] >= 75)
			{
				b = 2.7F;
			}
			else if (g[i] >= 72)
			{
				b = 2.3F;
			}
			else if (g[i] >= 68)
			{
				b = 2.0F;
			}
			else if (g[i] >= 64)
			{
				b = 1.5F;
			}
			else if (g[i] >= 60)
			{
				b = 1.0F;
			}
			else
			{
				b = 0F;
			}

			d = b * f[i];

			c = c + d;
		}

		e = c / sum;
		System.out.printf("%.2f\n",e);
	}




}

