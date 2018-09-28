package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int j;
		int sum = 0;
		int l = 0;
		double[] di = new double[100];
		double e;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct i
	//	{
	//		int x,y,z;
	//	}
	//	a[100],b[100],g,c[100];
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
					 a[i].x = tempVar2;
				 }
				 String tempVar3 = ConsoleInput.scanfRead();
				 if (tempVar3 != null)
				 {
					 a[i].y = tempVar3;
				 }
				 String tempVar4 = ConsoleInput.scanfRead();
				 if (tempVar4 != null)
				 {
					 a[i].z = tempVar4;
				 }
		  }
		  for (i = 0;i < n;i++)
		  {
			  for (j = i + 1;j < n;j++)
			  {
				  di[l] = Math.sqrt((a[i].x - a[j].x) * (a[i].x - a[j].x) + (a[i].y - a[j].y) * (a[i].y - a[j].y) + (a[i].z - a[j].z) * (a[i].z - a[j].z));
					b[l] = a[i];
					c[l] = a[j];
					l++;
			  }
		  }
	for (k = 1;k <= l;k++)
	{
		for (i = 0;i < l - k;i++)
		{
			if (di[i] < di[i + 1])
			{
				e = di[i];
				di[i] = di[i + 1];
				di[i + 1] = e;
				g = b[i];
				b[i] = b[i + 1];
				b[i + 1] = g;
				g = c[i];
				c[i] = c[i + 1];
				c[i + 1] = g;
			}
		}
	}
	for (i = 0;i < l;i++)
	{
		System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",b[i].x,b[i].y,b[i].z,c[i].x,c[i].y,c[i].z,di[i]);
	}
		return 0;
	}
}

