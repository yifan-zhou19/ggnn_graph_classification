package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[] nan = new double[100];
		double[] nv = new double[100];
		String zfc = new String(new char[100]);
		double[] gao = new double[100];
		double e;
		int j = 0;
		int m = 0;
		int k;
		int s;
		int p;
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
				zfc = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				gao[i] = Double.parseDouble(tempVar3);
			}
			if (zfc.charAt(0) == 'm')
			{
				nv[j] = gao[i];
				j++;
			}
			else if (zfc.charAt(0) == 'f')
			{
				nan[m] = gao[i];
				m++;
			}
		}
		s = j;
		p = m;







	  for (k = 1;k <= s;k++)
	  {
		  for (j = 0;j < s - k;j++)
		  {
			  if (nv[j] > nv[j + 1])
			  {
				  e = nv[j];
				  nv[j] = nv[j + 1];
				  nv[j + 1] = e;
			  }
		  }
	  }
	 for (k = 0;k < s;k++)
	 {
		 if (k == 0)
		 {
			 System.out.printf("%.2lf",nv[k]);
		 }
		 else
		 {
			 System.out.printf(" %.2lf",nv[k]);
		 }
	 }
	 for (k = 1;k <= p;k++)
	 {
		 for (m = 0;m < p - k;m++)
		 {
		 if (nan[m] > nan[m + 1])
		 {
			 e = nan[m];
			 nan[m] = nan[m + 1];
			 nan[m + 1] = e;
		 }
		 }
	 }
	 for (k = p - 1;k >= 0;k--)
	 {
		 System.out.printf(" %.2lf",nan[k]);
	 }




	return 0;
	}
}

