package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int k;
		int n;
		int i;
		int j;
		int nimei = 0;
		int meizi = 0;
		double tem;
		double[] m = new double[100];
		double[] f = new double[100];
		double b;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }

	 for (j = 0;j < n;j++)
	 {
					   String tempVar2 = ConsoleInput.scanfRead();
					   if (tempVar2 != null)
					   {
						   a = tempVar2.charAt(0);
					   }
					   String tempVar3 = ConsoleInput.scanfRead();
					   if (tempVar3 != null)
					   {
						   b = Double.parseDouble(tempVar3);
					   }

					   if (a.charAt(0) == 'm')
					   {
									 m[nimei] = b;
									 nimei++;
					   }
						else
						{
							f[meizi] = b;
							meizi++;
						}
	 }
				for (i = 0;i < nimei;i++)
				{
									 for (k = 0;k < nimei - 1;k++)
									 {
															if (m[k] > m[k + 1])
															{
																			tem = m[k];
																			m[k] = m[k + 1];
																			m[k + 1] = tem;
															}
									 }
				}
	  for (i = 0;i < meizi;i++)
	  {
								  for (k = 0;k < meizi - 1;k++)
								  {
															if (f[k] < f[k + 1])
															{
																			tem = f[k];
																			f[k] = f[k + 1];
																			f[k + 1] = tem;
															}
								  }
	  }
	 for (j = 0;j < nimei;j++)
	 {
		 System.out.printf("%.2lf ",m[j]);
	 }
	 for (j = 0;j < meizi - 1;j++)
	 {
		 System.out.printf("%.2lf ",f[j]);
	 }
	 System.out.printf("%.2lf",f[meizi - 1]);




	return 0;
	}
}

