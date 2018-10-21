package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int[] a = new int[300];
	  int i;
	  int min;
	  int max;
	  float ave;
	  float sum = 0F;
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
		   a[i] = Integer.parseInt(tempVar2);
	   }
	   sum = sum + a[i];
	  }
	  ave = sum / n;
	  max = a[0];
	  min = a[0];
		for (i = 0;i < n;i++)
		{
	   if (a[i] > max)
	   {
	   max = a[i];
	   }
		}
		  for (i = 0;i < n;i++)
		  {
	   if (a[i] < min)
	   {
	   min = a[i];
	   }
		  }

	  if ((max + min) > 2 * ave)
	  {
	  System.out.printf("%d",max);
	  }
	  else if ((max + min) < 2 * ave)
	  {
	  System.out.printf("%d",min);
	  }
	  else
	  {
	  System.out.printf("%d,%d",min,max);
	  }


	}

}

