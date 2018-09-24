package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[43];
		double[] f = new double[43];
		double[] m = new double[43];
		double z;
		String sex = new String(new char[10]);
		final String male = "female";
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex,male) == 0)
			{
				m[j] = a[i];
				j++;
			}
			else
			{
				f[k] = a[i];
				k++;
			}
		}
		System.out.print("\n");
		for (i = 0;i < j - 1;i++)
		{
			for (l = 0;l < j - 1;l++)
			{
				if (m[l] < m[l + 1])
				{
					z = m[l];
					m[l] = m[l + 1];
					m[l + 1] = z;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			for (l = 0;l < k - 1;l++)
			{
				if (f[l] > f[l + 1])
				{
					z = f[l];
					f[l] = f[l + 1];
					f[l + 1] = z;
				}
			}
		}
		System.out.printf("%.2f",f[0]);
		for (i = 1;i < n;i++)
		{
			if (i < k)
			{
				System.out.printf(" %.2f",f[i]);
			}
			else
			{
			System.out.printf(" %.2f",m[i - k]);
			}
		}
	}
}

