package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		float sum = 0F;
		float ave;
		float max = 0F;
		float b;
		float c;
		float d;
		float e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum = sum + (float)a[i];
		}
		ave = sum / (float)n;
		c = ave;
		b = ave;
		for (j = 0; j < n; j++)
		{
			if ((float)a[j] > c)
			{
				c = (float)a[j];
			}
			else if ((float)a[j] < b)
			{
				b = (float)a[j];
			}
		}
		d = c - ave;
		e = ave - b;
		if (d > e)
		{
			System.out.printf("%d\n", (int)c);
		}
		else if (d < e)
		{
			System.out.printf("%d\n", (int)b);
		}
		else
		{
			System.out.printf("%d,%d\n", (int)b, (int)c);
		}
		return 0;
	}
}

