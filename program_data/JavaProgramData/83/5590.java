package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	  int n;
	  int i;
	  int j;
	  int m;
	  int[] a = new int[10];
	  int[] b = new int[10];
	  float GPA;
	  float[] e = new float[10];
	  float k;
	  float p;
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
	  String tempVar4 = ConsoleInput.scanfRead();
	  if (tempVar4 != null)
	  {
		  b[0] = Integer.parseInt(tempVar4);
	  }
	  for (i = 1;i < n;i++)
	  {
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   b[i] = Integer.parseInt(tempVar5);
	   }
	  }
	 for (m = 0,i = 0;i < n;i++)
	 {
	  m += a[i];
	 }
	  for (i = 0,k = 0F;i < n;i++)
	  {
		if (b[i] >= 90 && b[i] <= 100)
		{
		  e[i] = 4.0F;
		}
		if (b[i] >= 85 && b[i] <= 89)
		{
		  e[i] = 3.7F;
		}
		 if (b[i] >= 82 && b[i] <= 84)
		 {
		   e[i] = 3.3F;
		 }
		  if (b[i] >= 78 && b[i] <= 81)
		  {
		   e[i] = 3.0F;
		  }
		  if (b[i] >= 75 && b[i] <= 77)
		  {
		   e[i] = 2.7F;
		  }
		  if (b[i] >= 72 && b[i] <= 74)
		  {
		   e[i] = 2.3F;
		  }
		  if (b[i] >= 68 && b[i] <= 71)
		  {
			e[i] = 2.0F;
		  }
		 if (b[i] >= 64 && b[i] <= 67)
		 {
			 e[i] = 1.5F;
		 }
		  if (b[i] >= 60 && b[i] <= 63)
		  {
			 e[i] = 1.0F;
		  }
		  if (b[i] < 60)
		  {
			e[i] = 0F;
		  }
		 p = a[i];
		k += (float)(e[i] * p);
	  }
	   GPA = (float)k / (m * 1.0);
	   System.out.printf("%.2f",GPA);
		return 0;
	 }



}

