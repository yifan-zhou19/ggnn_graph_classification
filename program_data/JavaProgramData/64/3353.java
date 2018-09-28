package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int k = 0;
		int len;
		int sum = 0;
		double[] di = new double[100];
		double l;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct i
	//	{
	//		int x,y,z;
	//	}
	//	a[100],b[100],c[100],e;
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
				di[k] = Math.sqrt(1.0 * (a[i].x - a[j].x) * (a[i].x - a[j].x) + 1.0 * (a[i].y - a[j].y) * (a[i].y - a[j].y) + 1.0 * (a[i].z - a[j].z) * (a[i].z - a[j].z));
				 b[k] = a[i];
				 c[k] = a[j];
				 k++;
			}
		  }
		  for (i = 1;i <= k;i++)
		  {
			  for (j = 0;j < k - i;j++)
			  {
				  if (di[j] < di[j + 1])
				  {
					  l = di[j];
					  di[j] = di[j + 1];
					  di[j + 1] = l;
					   e = b[j];
					  b[j] = b[j + 1];
					  b[j + 1] = e;
					  e = c[j];
					  c[j] = c[j + 1];
					  c[j + 1] = e;
				  }
			  }
		  }
		  for (i = 0;i < k;i++)
		  {
			  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2lf\n",b[i].x,b[i].y,b[i].z,c[i].x,c[i].y,c[i].z,di[i]);
		  }
		return 0;
	}
}

