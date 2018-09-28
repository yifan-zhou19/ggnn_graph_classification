public class dian
{
	   public int c;
	   public int d;
	   public float e;
}

package <missing>;

public class GlobalMembers
{
	public static int fang(int x,int y)
	{
		float z;
		z = (x - y) * (x - y);
		return (z);
	}
		   public static dian[] jl = tangible.Arrays.initializeWithDefaultdianInstances(100);
		   public static dian tem = new dian();
	public static void Main()
	{
		dian[] ji = tangible.Arrays.initializeWithDefaultdianInstances(100);
		dian tem = new dian();
		int fang = new int(int x,int y);
		int[][] a = new int[10][3];
		int n;
		int i;
		int j;
		int k = 0;
		for (i = 0;i < 100;i++)
		{
						   jl[i].c = 0;
						   jl[i].d = 0;
						   jl[i].e = 0F;
		}
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
							 a[i][0] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead(" ");
						 if (tempVar3 != null)
						 {
							 a[i][1] = Integer.parseInt(tempVar3);
						 }
						 String tempVar4 = ConsoleInput.scanfRead(" ");
						 if (tempVar4 != null)
						 {
							 a[i][2] = Integer.parseInt(tempVar4);
						 }
		}
		for (i = 0;i < n - 1;i++)
		{
						 for (j = i + 1;j < n;j++)
						 {
											 jl[k].c = i;
											 jl[k].d = j;
											 jl[k].e = (float)Math.sqrt(fang(a[i][0], a[j][0]) + fang(a[i][1], a[j][1]) + fang(a[i][2], a[j][2]));
											 k++;
						 }
		}
		for (j = 0;j < k - 1;j++)
		{
						   for (i = 0;i < k - 1 - j;i++)
						   {
												if (jl[i].e < jl[i + 1].e)
												{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: tem=jl[i];
																	  tem.copyFrom(jl[i]);
																	  jl[i] = jl[i + 1];
																	  jl[i + 1] = tem;
												}
						   }
		}
		for (i = 0;;i++)
		{
					  if (jl[i].e == 0F)
					  {
					  break;
					  }
					  System.out.printf("(%d,%d,%d)-(%d,%d,%d)=%.2f\n",a[jl[i].c][0],a[jl[i].c][1],a[jl[i].c][2],a[jl[i].d][0],a[jl[i].d][1],a[jl[i].d][2],jl[i].e);
		}
	}








}

