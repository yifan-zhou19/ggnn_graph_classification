package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
		int i;
		int j;
		int n;
		int t;
		int x;
		int sum1;
		float c;
		float d = 0F;
		float average;
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
			t = a[j];
			x = b[j];
			if (x >= 90)
			{
				c = 4.0F;
			d += t * c;
			continue;
			}
			else if (x < 90 && x >= 85)
			{
				c = 3.7F;
			d += t * c;
			continue;
			}
			else if (x < 85 && x >= 82)
			{
				c = 3.3F;
			d += t * c;
			continue;
			}
			else if (x < 82 && x >= 78)
			{
				c = 3.0F;
			d += t * c;
			continue;
			}
			else if (x < 78 && x >= 75)
			{
				c = 2.7F;
			d += t * c;
			continue;
			}
			else if (x < 75 && x >= 72)
			{
				c = 2.3F;
			d += t * c;
			continue;
			}
			else if (x < 72 && x >= 68)
			{
				c = 2.0F;
			d += t * c;
			continue;
			}
			else if (x < 68 && x >= 64)
			{
				c = 1.5F;
			d += t * c;
			continue;
			}
			else if (x < 64 && x >= 60)
			{
				c = 1.0F;
			d += t * c;
			continue;
			}
			else
			{
			d += 0;
			}
		}
		sum1 = 0;
		for (i = 0;i < n;i++)
		{

			sum1 += a[i];
		}
		average = (float)d / sum1;
		System.out.printf("%.2f",average);
	}
}

