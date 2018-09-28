package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int max = 0;
	  int emax = 0;
	  int[] a = new int[100];
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
	 if (a[i] > max)
	 {
	   max = a[i];
	 }
	  }
	  for (i = 0;i < n;i++)
	  {
		if (a[i] != max)
		{
			 if (a[i] > emax)
			 {
				 emax = a[i];
			 }
		}
	  }
	 System.out.printf("%d\n%d\n",max,emax);
	 return 0;
	}


}

