package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		char[][] s1 =
		{
			{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
		};
		double[] s2 = new double[40];
		double[] a = new double[40];
		double[] b = new double[40];
		int j;
		int k;
		j = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				s2[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(s1[i],"male") == 0)
			{
				a[j] = s2[i];
				j++;
			}
			if (strcmp(s1[i],"female") == 0)
			{
				b[k] = s2[i];
				k++;
			}
		}

		double slot;
		int aa;
		int bb;
		for (aa = j;aa >= 0;aa--)
		{
			for (bb = 0;bb <= aa;bb++)
			{
				if (a[bb] > a[bb + 1])
				{
					slot = a[bb];
					a[bb] = a[bb + 1];
					a[bb + 1] = slot;
				}
			}
		}
		for (aa = k;aa >= 0;aa--)
		{
			for (bb = 0;bb <= aa;bb++)
			{
				if (b[bb] < b[bb + 1])
				{
					slot = b[bb];
					b[bb] = b[bb + 1];
					b[bb + 1] = slot;
				}
			}
		}

		if (j != 0)
		{
			for (i = 2;i <= j + 1;i++)
			{
				System.out.printf("%.2lf ",a[i]);
			}
		}
		if (k != 0)
		{
			for (i = 0;i < k - 1;i++)
			{
				System.out.printf("%.2lf ",b[i]);
			}
			System.out.printf("%.2lf",b[k - 1]);
		}

		return 0;
	}
}

