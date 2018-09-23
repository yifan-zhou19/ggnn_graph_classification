package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int q;
		float sum;
		float ave;
		float p1;
		float p2;
		float k1;
		float k2;
		float[] a = new float[300];
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
				a[i] = Float.parseFloat(tempVar2);
			}
		}
		sum = 0F;
		for (i = 0;i <= n - 1;i++)
		{
			sum = sum + a[i];
		}
		ave = sum / n;

		q = 0;
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[j] < a[i])
				{
					break;
				}
			}
			if (j == n)
			{
				k1 = ave - a[i];
				p1 = a[i];
				q = 1;
			}
			if (q == 1)
			{
				break;
			}
		}

		q = 0;
		for (i = 0;i <= n - 1;i++)
		{
			for (j = 0;j <= n - 1;j++)
			{
				if (a[j] > a[i])
				{
					break;
				}
			}
			if (j == n)
			{
				k2 = a[i] - ave;
				p2 = a[i];
				q = 1;
			}
			if (q == 1)
			{
				break;
			}
		}

		if (k1 > k2)
		{
			System.out.printf("%.0f",p1);
		}
		else if (k1 < k2)
		{
			System.out.printf("%.0f",p2);
		}
		else
		{
			System.out.printf("%.0f,%.0f",p1,p2);
		}


	}
}

