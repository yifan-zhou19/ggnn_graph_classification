package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		double[] a = new double[41];
		double[] b = new double[41];
		char[][] s1 = new char[41][10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String c = new String(new char[10]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s1[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Double.parseDouble(tempVar3);
			}
			c = new Scanner(System.in).nextLine();
		}
		int j = 0;
		int k = 0;
		for (i = 1;i <= n;i++)
		{
			if (s1[i][0] == 'm')
			{
				a[j] = a[i];
				j++;
			}
			if (s1[i][0] == 'f')
			{
				b[k] = a[i];
				k++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (m = i + 1;m < j;m++)
			{
				if (a[i] > a[m])
				{
					double p;
					p = a[i];
					a[i] = a[m];
					a[m] = p;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			for (m = i + 1;m < k;m++)
			{
				if (b[i] < b[m])
				{
					double p;
					p = b[i];
					b[i] = b[m];
					b[m] = p;
				}
			}
		}
		System.out.printf("%.2f",a[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2f",a[i]);
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf(" %.2f",b[i]);
		}
	}

}

