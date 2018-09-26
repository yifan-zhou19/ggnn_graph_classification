package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int n;
	   int i;
	   int j;
	   float[] a = new float[n];
	   float[] b = new float[n];
	   float d;
	   float t;
	   float max;
	   max = 0F;
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
			  a[i] = Float.parseFloat(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead(" ");
		  if (tempVar3 != null)
		  {
			  b[i] = Float.parseFloat(tempVar3);
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		   for (j = 0;j < n;j++)
		   {
		   t = (a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]);
		   d = Math.sqrt(t);
		   if (d >= max)
		   {
			  max = d;
		   }
			else
			{
				max = max;
			}
		   }
	   }
		System.out.printf("%.4f",max);
	}












}

