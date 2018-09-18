package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		float t;
		float sum;
		float[] b = new float[100];
		int[] a = new int[100];
		int max;
		int min;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		for (i = 0;i < n - 1;i++)
		{
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   a[i] = Integer.parseInt(tempVar2);
	   }
		}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[n - 1] = Integer.parseInt(tempVar3);
	}
		sum = 0.0F;
		 for (i = 0;i < n;i++)
		 {
		 sum = sum + a[i];
		 }
		 t = sum / n;
	   max = a[0];
	   min = a[0];
	   for (i = 0;i < n;i++)
	   {
		   if (a[i] > max)
		   {
			   max = a[i];
		   }
		   if (a[i] < min)
		   {
			   min = a[i];
		   }
	   }
		  if (max - t == t - min)
		  {
			  System.out.printf("%d,%d",min,max);
		  }
		else if (max - t > t - min)
		{
			System.out.printf("%d",max);
		}
		else
		{
			System.out.printf("%d",min);
		}
	}



}

