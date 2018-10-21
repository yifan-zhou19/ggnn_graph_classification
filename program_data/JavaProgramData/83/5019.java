package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int[] y = new int[10];
	   int n;
	   int i;
	   int t;
	   int s2 = 0;
	   float[] x = new float[10];
	   float gpa;
	   float s1 = 0.0F;
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
			  y[i] = Integer.parseInt(tempVar2);
		  }
		  s2 += y[i];

	   }
	   for (i = 0;i < n;i++)
	   {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  t = Integer.parseInt(tempVar3);
		  }
		  if (t >= 90 && t <= 100)
		  {
			 x[i] = 4.0F;
		  }
		  else if (t >= 85 && t <= 89)
		  {
			 x[i] = 3.7F;
		  }
		  else if (t >= 82 && t <= 84)
		  {
			 x[i] = 3.3F;
		  }
		  else if (t >= 78 && t <= 81)
		  {
			 x[i] = 3.0F;
		  }
		  else if (t >= 75 && t <= 77)
		  {
			 x[i] = 2.7F;
		  }
		  else if (t >= 72 && t <= 74)
		  {
			 x[i] = 2.3F;
		  }
		  else if (t >= 68 && t <= 71)
		  {
			 x[i] = 2.0F;
		  }
		  else if (t >= 64 && t <= 67)
		  {
			 x[i] = 1.5F;
		  }
		  else if (t >= 60 && t <= 63)
		  {
			 x[i] = 1.0F;
		  }
		  else
		  {
			 x[i] = 0.0F;
		  }
	   }
	   for (i = 0;i < n;i++)
	   {
		  s1 += x[i] * y[i];
	   }
	   gpa = s1 / s2;
	   System.out.printf("%.2f",gpa);
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   n = Integer.parseInt(tempVar4);
	   }
	   return 0;
	}

}

