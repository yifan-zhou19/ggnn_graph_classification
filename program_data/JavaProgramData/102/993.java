package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int nan = 0;
		int nv = 0;
		double[] h = new double[100];
		double[] a = new double[100];
		double[] b = new double[100];
		double t;
		String sex = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		j = 1;
		k = 0;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sex = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h[i] = Double.parseDouble(tempVar3);
			}
			if (strcmp(sex,"male") == 0)
			{
				a[j] = h[i];
				j++;
				nan++;
			}
			if (strcmp(sex,"female") == 0)
			{
				b[k] = h[i];
				k++;
				nv++;
			}
		}
		for (i = 0;i < nv;i++)
		{
			for (j = 0;j < nv - i;j++)
			{
				if (b[j] < b[j + 1])
				{
					t = b[j + 1];
					b[j + 1] = b[j];
					b[j] = t;
				}
			}
		}
		for (i = 1;i <= nan;i++)
		{
			for (j = 1;j <= nan - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					t = a[j + 1];
					a[j + 1] = a[j];
					a[j] = t;
				}
			}
		}
		for (i = 1;i <= nan;i++)
		{
			if (i == 1)
			{
				System.out.printf("%.2lf",a[i]);
			}
			else
			{
				System.out.printf(" %.2lf",a[i]);
			}
		}
		for (i = 0;i < nv;i++)
		{
			System.out.printf(" %.2lf",b[i]);
		}
		System.out.print("\n");
		return 0;
	}
}

