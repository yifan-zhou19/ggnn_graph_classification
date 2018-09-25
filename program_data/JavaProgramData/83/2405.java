package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  float GPA;
	  float s = 0F;
	  int i;
	  int n;
	  int m;
	  int o;
	  int t = 0;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[n];
	  int[] b = new int[n];
	  float[] c = new float[n];
	  for (m = 1;m <= n;m++)
	  {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   a[m] = Integer.parseInt(tempVar2);
		   }
		t = t + a[m];
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
		  if (b[i] >= 90 && b[i] <= 100)
		  {
		   c[i] = 4.0F;
		  }
	   if (b[i] >= 85 && b[i] <= 89)
	   {
		   c[i] = 3.7F;
	   }
	   if (b[i] >= 82 && b[i] <= 84)
	   {
		   c[i] = 3.3F;
	   }
	   if (b[i] >= 78 && b[i] <= 81)
	   {
		   c[i] = 3.0F;
	   }
	   if (b[i] >= 75 && b[i] <= 77)
	   {
		   c[i] = 2.7F;
	   }
	   if (b[i] >= 72 && b[i] <= 74)
	   {
		   c[i] = 2.3F;
	   }
	   if (b[i] >= 68 && b[i] <= 71)
	   {
		   c[i] = 2.0F;
	   }
	   if (b[i] >= 64 && b[i] <= 67)
	   {
		   c[i] = 1.5F;
	   }
	   if (b[i] >= 60 && b[i] <= 63)
	   {
		   c[i] = 1.0F;
	   }
	   if (b[i] < 60)
	   {
		   c[i] = 0F;
	   }
	  }
	  for (o = 1;o <= n;o++)
	  {
	  s = s + a[o] * c[o];
	  }
	  GPA = s / t;
	  System.out.printf("%.2f",GPA);
	  return 0;
	 }
}

