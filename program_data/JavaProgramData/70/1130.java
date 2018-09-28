package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  float dis;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  float[][] d = new float[n][2];
		  for (i = 0;i < n;i++)
		  {
						  String tempVar2 = ConsoleInput.scanfRead();
						  if (tempVar2 != null)
						  {
							  d[i][0] = Float.parseFloat(tempVar2);
						  }
						  String tempVar3 = ConsoleInput.scanfRead(" ");
						  if (tempVar3 != null)
						  {
							  d[i][1] = Float.parseFloat(tempVar3);
						  }
		  }
		  dis = 0F;
		  for (i = 0;i < n;i++)
		  {
						  for (j = i + 1;j < n;j++)
						  {

								   if ((d[i][0] - d[j][0]) * (d[i][0] - d[j][0]) + (d[i][1] - d[j][1]) * (d[i][1] - d[j][1]) > dis)
								   {
								   dis = (d[i][0] - d[j][0]) * (d[i][0] - d[j][0]) + (d[i][1] - d[j][1]) * (d[i][1] - d[j][1]);
								   }

						  }
		  }
		  dis = Math.sqrt(dis);
		  System.out.printf("%.4f\n",dis);

	}

}

