package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int n;
	  int y = 0;
	  double z;
	  double s;
	  double w = 0;
	  int[] a = new int[10];
	  int[] b = new int[10];
	  double[] c = new double[10];
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
	  }
	  for (i = 0;i < n;i++)
	  {
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
	  }
	   for (i = 0;i < n;i++)
	   {


		if (b[i] >= 90)
		{
		   z = 4.0;
		}
		else if (b[i] >= 85)
		{
		   z = 3.7;
		}
	   else if (b[i] >= 82)
	   {
		   z = 3.3;
	   }
	   else if (b[i] >= 78)
	   {
			z = 3.0;
	   }
		else if (b[i] >= 75)
		{
			  z = 2.7;
		}
		else if (b[i] >= 72)
		{
			 z = 2.3;
		}
		  else if (b[i] >= 68)
		  {
			 z = 2.0;
		  }
		 else if (b[i] >= 64)
		 {
			  z = 1.5;
		 }
		 else if (b[i] >= 60)
		 {
			  z = 1.0;
		 }
		 else if (b[i] < 60)
		 {
			 z = 0.0;
		 }
		   c[i] = z;

	   }
		  for (i = 0;i < n;i++)
		  {
		  y += a[i];
		  }
		for (i = 0;i < n;i++)
		{
		  w += a[i] * c[i];
		}
		 s = w / y;
		System.out.printf("%.2lf",s);
		return 0;
	}

}

