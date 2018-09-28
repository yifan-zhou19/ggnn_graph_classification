package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] b = new int[11];
		int p;
		int sum = 0;
	   float[] a = new float[11];
	   float[] k = new float[101];
	   float GPA = 0F;

	   for (i = 0;i <= 59;i++)
	   {
		   k[i] = 0F;
	   }
	   for (i = 60;i <= 63;i++)
	   {
		   k[i] = 1.0F;
	   }
	   for (i = 64;i <= 67;i++)
	   {
		   k[i] = 1.5F;
	   }
	   for (i = 68;i <= 71;i++)
	   {
		   k[i] = 2.0F;
	   }
	   for (i = 72;i <= 74;i++)
	   {
		   k[i] = 2.3F;
	   }
	   for (i = 75;i <= 77;i++)
	   {
		   k[i] = 2.7F;
	   }
	   for (i = 78;i <= 81;i++)
	   {
		   k[i] = 3.0F;
	   }
	   for (i = 82;i <= 84;i++)
	   {
		   k[i] = 3.3F;
	   }
	   for (i = 85;i <= 89;i++)
	   {
		   k[i] = 3.7F;
	   }
	   for (i = 90;i <= 100;i++)
	   {
		   k[i] = 4.0F;
	   }

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  b[i] = Integer.parseInt(tempVar2);
		  }
	  }
	   scanf("\n");
	   for (i = 1;i <= n;i++)
	   {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 p = Integer.parseInt(tempVar3);
		 }
		 a[i] = k[p];
		 GPA = GPA + a[i] * b[i];
		 sum = sum + b[i];
	   }

	  GPA = GPA / sum;
	  System.out.printf("%.2f",GPA);
	}

}

