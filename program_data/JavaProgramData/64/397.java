package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct juli
	//	{
	//		int a[3];
	//		int b[3];
	//		float dis;
	//	};
	   int n;
	   int m = 0;
	   int i;
	   int j;
	   int k;
	   int x;
	   int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   int[][] c = new int[10][3];
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c[i][0] = Integer.parseInt(tempVar2);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ");
	   if (tempVar3 != null)
	   {
		   c[i][1] = Integer.parseInt(tempVar3);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   c[i][2] = Integer.parseInt(tempVar4);
	   }
	   }
	   juli[] d = tangible.Arrays.initializeWithDefaultjuliInstances(50);
	   juli temp = new juli();
	   for (i = 0;i < n - 1;i++)
	   {
			for (j = i + 1;j < n;j++)
			{
			   x = 0;
			  for (k = 0;k < 3;k++)
			  {
				  d[m].a[k] = c[i][k];
				  d[m].b[k] = c[j][k];
				  x += (c[i][k] - c[j][k]) * (c[i][k] - c[j][k]);
			  }
			  d[m].dis = Math.sqrt(Math.abs(x));
			  m++;
			}
	   }
		k = m;
	   for (;m != 0;m--)
	   {
		   for (i = 0;i < m - 1;i++)
		   {
			   if (d[i].dis < d[i + 1].dis)
			   {
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: temp=d[i];
				   temp.copyFrom(d[i]);
				   d[i] = d[i + 1];
				   d[i + 1] = temp;
			   }
		   }
	   }
	   for (i = 0;i < k;i++)
	   {
		   System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",d[i].a[0],d[i].a[1],d[i].a[2],d[i].b[0],d[i].b[1],d[i].b[2],d[i].dis);
	   }
	}
}

