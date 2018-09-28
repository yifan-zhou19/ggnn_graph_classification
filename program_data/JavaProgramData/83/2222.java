package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] xf = new int[10];
	 int i;
	 for (i = 0;i < n;i++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (xf[i]) = Integer.parseInt(tempVar2);
	  }
	 }
	 int[] sjdf = new int[10];
	 for (i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  (sjdf[i]) = Integer.parseInt(tempVar3);
	  }
	 }
	 float gpa;
	 float[] g = new float[10];
	 float s = 0F;
	 for (i = 0;i < n;i++)
	 {
	  if (sjdf[i] <= 100 && sjdf[i] >= 90)
	  {
	   gpa = 4.0F;
	  }
	  else if (sjdf[i] <= 89 && sjdf[i] >= 85)
	  {
	   gpa = 3.7F;
	  }
	  else if (sjdf[i] <= 84 && sjdf[i] >= 82)
	  {
	   gpa = 3.3F;
	  }
	  else if (sjdf[i] <= 81 && sjdf[i] >= 78)
	  {
	   gpa = 3.0F;
	  }
	  else if (sjdf[i] <= 77 && sjdf[i] >= 75)
	  {
	   gpa = 2.7F;
	  }
	  else if (sjdf[i] <= 74 && sjdf[i] >= 72)
	  {
	   gpa = 2.3F;
	  }
	  else if (sjdf[i] <= 71 && sjdf[i] >= 68)
	  {
	   gpa = 2.0F;
	  }
	  else if (sjdf[i] <= 67 && sjdf[i] >= 64)
	  {
	   gpa = 1.5F;
	  }
	  else if (sjdf[i] <= 63 && sjdf[i] >= 60)
	  {
	   gpa = 1.0F;
	  }
	  else if (sjdf[i] < 60)
	  {
	   gpa = 0.0F;
	  }
	  g[i] = gpa * (xf[i]);
	  s += g[i];
	 }
	 int h = 0;
	 for (i = 0;i < n;i++)
	 {
	  h += xf[i];
	 }
	 float GPA;
	 GPA = s / h;
	 System.out.printf("%.2f",GPA);
	 return 0;
	}

}

