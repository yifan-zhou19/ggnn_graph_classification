package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j = 0;
		int m;
		int t;
		int p = 1;
		int q;
		float k;
		float c;
		float d;
		int[] a = new int[300];
		float[] b = new float[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 1;i <= n;i++)
		{
			j = j + a[i];
		}
		c = j;
		d = n;
		k = c / d;

		 for (i = 1;i <= n;i++)
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
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n - i;j++)
			{
			if (b[j] < b[j + 1])
			{
				t = b[j];
				q = a[j];
				b[j] = b[j + 1];
				a[j] = a[j + 1];
				b[j + 1] = t;
				a[j + 1] = q;
			}
			}
		}


		for (i = 1;i <= n;i++)
		{
			if (b[i] == b[i + 1])
			{
			p++;
			}
		else
		{
			break;
		}
		}
		for (i = 1;i <= p;i++)
		{
			for (j = 1;j <= p - i;j++)
			{
			if (a[j] > b[j + 1])
			{
				t = a[j];


				a[j] = a[j + 1];
				a[j + 1] = t;

			}
			}
		}

		if (p == 1)
		{
			System.out.printf("%d",a[1]);
		}
		if (p != 1)
		{
			for (i = 1;i < p;i++)
			{
				System.out.printf("%d,",a[i]);
			}
		System.out.printf("%d",a[p]);
		}
	}
}

