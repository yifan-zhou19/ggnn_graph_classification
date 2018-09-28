package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  double[][] dian = new double[n][2];
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  dian[i][0] = Double.parseDouble(tempVar2);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  dian[i][1] = Double.parseDouble(tempVar3);
				  }
				  //printf("%lf %lf\n",dian[i][0],dian[i][2]);
		  }
		  double max = 0;
		  double ss;
		  for (int i = 0;i < n;i++)
		  {
		  for (int j = 0;j < n;j++)
		  {
				  //printf("%lf\n",dian[i][0]);
				  double a = dian[i][0] - dian[j][0];
				  double b = dian[i][1] - dian[j][1];
				  ss = a * a + b * b;
				  if (ss > max)
				  {
				  max = ss;
				  }
				  //printf("ss%lf\n",ss);
		  }
		  }
		  System.out.printf("%.4lf",Math.sqrt(max));
		  //scanf("%d",&n);
	}

}

