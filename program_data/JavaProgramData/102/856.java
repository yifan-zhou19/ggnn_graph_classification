package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int l;
		int p;
		int q;
		int k;
		int a1;
		int b1;
		double n;
		String s = new String(new char[1000]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  m = Integer.parseInt(tempVar);
		  }
		double[] a = new double[100];
		double[] b = new double[100];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Double.SIZE / Byte.SIZE));
		l = 0;
		a1 = 0;
		b1 = 0;
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Double.parseDouble(tempVar3);
			}

		 if (s.charAt(0) == 'm')
		 {
		   p = 0;
		   for (j = 1;j <= a1;j++)
		   {
		   if (n < a[j])
		   {
			for (k = a1;k >= j;k--)
			{
		   a[k + 1] = a[k];
			}
		   a[j] = n;
		   p = 1;
		   break;
		   }
		   }
			  a1++;
		  if (p == 0)
		  {

			   a[a1] = n;
		  }

		 }
		 else
		 {
		   p = 0;
		   for (j = 1;j <= b1;j++)
		   {
		   if (n > b[j])
		   {
			for (k = b1;k >= j;k--)
			{
		   b[k + 1] = b[k];
			}
		   b[j] = n;
		   p = 1;
		   break;
		   }
		   }
		   b1++;
		  if (p == 0)
		  {

			   b[b1] = n;
		  }

		 }
		}
		 for (i = 1;i <= a1;i++)
		 {
			 System.out.printf("%.2lf ",a[i]);
		 }
		 for (i = 1;i <= b1 - 1;i++)
		 {
			 System.out.printf("%.2lf ",b[i]);
		 }
		 System.out.printf("%.2lf",b[b1]);

		return 0;
	}

}

