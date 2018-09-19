public class play
{
	   public String sex = new String(new char[10]);
	   public double h;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  double t;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  play[] ab = tangible.Arrays.initializeWithDefaultplayInstances(n);
		  for (int i = 0;i < n;i++)
		  {
				  String tempVar2 = ConsoleInput.scanfRead();
				  if (tempVar2 != null)
				  {
					  ab[i].sex = tempVar2.charAt(0);
				  }
				  String tempVar3 = ConsoleInput.scanfRead(" ");
				  if (tempVar3 != null)
				  {
					  ab[i].h = Double.parseDouble(tempVar3);
				  }
		  }
		  int ma = 0;
		  int fe = 0;
		  double[] nan = new double[50];
		  double[] nv = new double[50];
		  for (i = 0;i < 50;i++)
		  {
						   nan[i] = 1.0;
						   nv[i] = 1.0;
		  }
		  for (i = 0;i < n;i++)
		  {
						  if (strcmp(ab[i].sex,"male") == 0)
						  {
							  nan[ma] = ab[i].h;
						  ma++;
						  }
						  if (strcmp(ab[i].sex,"female") == 0)
						  {
						  nv[fe] = ab[i].h;
						  fe++;
						  }
		  }


		  for (j = 0;j < ma - 1;j++)
		  {
					for (i = 0;i < ma - 1 - j;i++)
					{
					if (nan[i] > nan[i + 1])
					{
									   t = nan[i];
									   nan[i] = nan[i + 1];
									   nan[i + 1] = t;
					}
					}
		  }
			for (j = 0;j < fe-1;j++)
			{
					for (i = 0;i < fe-1 - j;i++)
					{
					if (nv[i] < nv[i + 1])
					{
									   t = nv[i];
									   nv[i] = nv[i + 1];
									   nv[i + 1] = t;
					}
					}
			}
		  for (i = 0;i < ma;i++)
		  {
		  System.out.printf("%.2lf ",nan[i]);
		  }
		  for (i = 0;i < fe-1;i++)
		  {
		  System.out.printf("%.2lf ",nv[i]);
		  }
		  System.out.printf("%.2lf",nv[fe-1]);


	}

}

