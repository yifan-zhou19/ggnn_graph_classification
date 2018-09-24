package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int[] a = new int[310];
	  int i;
	  int s = 0;
	  int temp;
	  int j;
	  float ave;
	  float c;
	  float d;
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
		s += a[i];
	  }
	  ave = (float)s / n;
	  for (i = 0;i < n;i++)
	  {
	   for (j = i;j < n;j++)
	   {
			if (a[j] < a[i])
			{
				temp = a[i];
		 a[i] = a[j];
		 a[j] = temp;
			}
	   }
	  }
	   c = a[n - 1] - ave;
	   d = ave - a[0];
	   if (c == d)
	   {
		   System.out.printf("%d,%d",a[0],a[n - 1]);
	   }
	   if (c > d)
	   {
		   System.out.printf("%d", a[n - 1]);
	   }
	   if (c < d)
	   {
		   System.out.printf("%d", a[0]);
	   }
	   else
	   {
		   ;
	   }

	  return 0;
	}
}

