package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int male;
	int female;
	double t;
	char[][] xingbie = new char[50][10];
	double[] shengao = new double[50];
	double[] nan = new double[50];
	double[] nv = new double[50];
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
						  xingbie[j] = tempVar2.charAt(0);
					  }
					  String tempVar3 = ConsoleInput.scanfRead();
					  if (tempVar3 != null)
					  {
						  shengao[j] = Double.parseDouble(tempVar3);
					  }
	}
	i = 0;
	k = 0;
	for (j = 0;j < n;j++)
	{
					 if (xingbie[j][0] == 'm')
					 {
											nan[i] = shengao[j];
											i++;
					 }
					 else
					 {
						  nv[k] = shengao[j];
						  k++;
					 }
	}
	male = i;
	female = k;
	for (i = 0;i < male-1;i++)
	{
					 for (j = 0;j < male - i - 1;j++)
					 {
										 if (nan[j] > nan[j + 1])
										 {
															 t = nan[j];
															 nan[j] = nan[j + 1];
															 nan[j + 1] = t;
										 }
					 }
	}
	 for (i = 0;i < female;i++)
	 {
					 for (j = 0;j < female - i - 1;j++)
					 {
										 if (nv[j] > nv[j + 1])
										 {
															 t = nv[j];
															 nv[j] = nv[j + 1];
															 nv[j + 1] = t;
										 }
					 }
	 }
	 for (i = 0;i < male;i++)
	 {
		 System.out.printf("%.2lf ",nan[i]);
	 }
	 for (i = female-1;i > 0;i--)
	 {
		 System.out.printf("%.2lf ",nv[i]);
	 }
	 System.out.printf("%.2lf",nv[0]);

	return 0;
	}

}

