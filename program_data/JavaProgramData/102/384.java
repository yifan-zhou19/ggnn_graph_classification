package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		double[] a = new double[50];
		double[] c = new double[50];
		double p;
		String s = new String(new char[80]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m = 0;
		k = 0;
		for (i = 0;i < n;i++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 s = tempVar2.charAt(0);
			 }
			 if (s.charAt(0) == 'm')
			 {
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[m] = Double.parseDouble(tempVar3);
				}
				m++;
			 }
			 if (s.charAt(0) == 'f')
			 {
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					c[k] = Double.parseDouble(tempVar4);
				}
				k++;
			 }
		}
		for (i = 0;i < m - 1;i++)
		{
		   for (j = i + 1;j < m;j++)
		   {
			   if (a[i] > a[j])
			   {
				  p = a[i];
				  a[i] = a[j];
				  a[j] = p;
			   }
		   }
		}
		for (i = 0;i < k - 1;i++)
		{
		   for (j = i + 1;j < k;j++)
		   {
			  if (c[i] < c[j])
			  {
				 p = c[i];
				 c[i] = c[j];
				 c[j] = p;
			  }
		   }
		}
		System.out.printf("%.2lf",a[0]);
		for (i = 1;i < m;i++)
		{
			System.out.printf(" %.2lf",a[i]);
		}
		for (j = 0;j < k;j++)
		{
			System.out.printf(" %.2lf",c[j]);
		}
		System.out.print("\n");
		//getchar();
		//getchar();
	}

}

