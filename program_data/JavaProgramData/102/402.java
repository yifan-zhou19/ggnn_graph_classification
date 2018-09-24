package <missing>;

public class GlobalMembers
{
	public static int compare(void p, void q)
	{
		 if ((double)p > (double)q)
		 {
		 return 1;
		 }
		 else
		 {
		 return -1;
		 }
	}
	 public static int Main()
	 {
		int n;
		int i;
		int j;
		int k;
		double[] a = new double[40];
		double[] b = new double[40];
		double[] d = new double[40];
		char[][] c = new char[40][4];
		k = 0;
		j = 0;
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
				c[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				d[i] = Double.parseDouble(tempVar3);
			}
			if (c[i][0] == 'm')
			{
			a[j] = d[i];
			j++;
			}
			else
			{
			 b[k] = d[i];
			 k++;
			}
		}
		qsort(a,j,(Double.SIZE / Byte.SIZE),compare);
		qsort(b,k,(Double.SIZE / Byte.SIZE),compare);
		System.out.printf("%0.2lf",a[0]);
		for (i = 1;i < j;i++)
		{
		 System.out.printf(" %0.2lf",a[i]);
		}
		for (i = k - 1;i > -1;i--)
		{
		 System.out.printf(" %0.2lf",b[i]);
		}
	 }

}

