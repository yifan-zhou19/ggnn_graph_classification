package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int t = 0;
		int count = 0;
		int j;
		float k;
		float sum = 0F;
		float[] a = new float[300];
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
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		k = (float)sum / (float)n;
		for (i = 0;i < n;i++)
		{
			if (a[i] >= k)
			{
				b[i] = a[i] - k;
			}
			else
			{
				b[i] = k - a[i];
			}
		}
		float x = b[0];
		for (i = 1;i < n;i++)
		{

			if (b[i] > x)
			{
				x = b[i];
				t = i;
			}
		}
		j = n;
		for (i = 0;i < n;i++)
		{
			if (b[i] == b[t])
			{
				if (i != t)
				{
					j = i;
				}
			}
		}
		if (j != n)
		{
			if (a[t] < a[j])
			{
				System.out.printf("%.0f,%.0f\n",a[t],a[j]);
			}
			else
			{
				System.out.printf("%.0f,%.0f\n",a[j],a[t]);
			}
		}
		else
		{
			System.out.printf("%.0f\n",a[t]);
		}
		return 0;
	}
}

