package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void hanshu();
		hanshu();

		return 0;
	}

	public static void hanshu()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
		int l;
		int p;
		int q;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[200];
		int temp;
		int z;
		int d;
		int s;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (i = 0;i < m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}

		for (j = 0;j < n;j++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[j] = Integer.parseInt(tempVar4);
			}
		}

		for (k = 1;k < n;k++)
		{
			for (l = 0;l < m - k;l++)
			{
				if (a[l] > a[l + 1])
				{
					temp = a[l];
					a[l] = a[l + 1];
					a[l + 1] = temp;
				}
			}
		}

		for (p = 1;p < n;p++)
		{
			for (q = 0;q < n - p;q++)
			{
				if (b[q] > b[q + 1])
				{
					temp = b[q];
					b[q] = b[q + 1];
					b[q + 1] = temp;
				}
			}
		}

		for (d = 0;d < m;d++)
		{
			c[d] = a[d];
		}

		for (s = m;s < m + n;s++)
		{
			c[s] = b[s - m];
		}

		System.out.printf("%d",c[0]);

		for (z = 1;z < n + m;z++)
		{
			System.out.printf(" %d",c[z]);
		}

	}



}

