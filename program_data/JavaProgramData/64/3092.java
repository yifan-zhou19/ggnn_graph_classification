package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] shu = new int[10][3];
	  int i;
	  int j;
	  int n;
	  int a;
	  double[] d = new double[1000];
	  double e;
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
			shu[i][0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			shu[i][1] = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			shu[i][2] = Integer.parseInt(tempVar4);
		}
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			 d[10 * i + j] = 0;
		  }
	  }
	  for (i = 0;i < n;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			  a = (shu[i][0] - shu[j][0]) * (shu[i][0] - shu[j][0]) + (shu[i][1] - shu[j][1]) * (shu[i][1] - shu[j][1]) + (shu[i][2] - shu[j][2]) * (shu[i][2] - shu[j][2]);
			d[10 * i + j] = Math.sqrt(a);
		  }
	  }
	  while (true)
	  {
	  e = 0;
	  for (i = 0;i < n;i++)
	  {
		  for (j = i + 1;j < n;j++)
		  {
			  if (d[10 * i + j] > e)
			  {
			  e = d[10 * i + j];
			  }
		  }
	  }
	  if (e == 0)
	  {
	  break;
	  }
	   for (i = 0;i < n;i++)
	   {
		  for (j = i + 1;j < n;j++)
		  {
			  if (d[10 * i + j] == e)
			  {


		  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",shu[i][0],shu[i][1],shu[i][2],shu[j][0],shu[j][1],shu[j][2],e);
		  d[10 * i + j] = 0;
			  }
		  }
	   }
	  }
		  return 0;
	}
}

