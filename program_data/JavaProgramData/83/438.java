package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int i;
		int j;
		int s = 0;
	 float g;
	 float G = 0.0F;
	 float GPA;
	 float[] c = new float[111];
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
		  a[i] = Integer.parseInt(tempVar2);
	  }
	 }
	 System.out.print("\n");
	 for (j = 1;j <= n;j++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[j] = Integer.parseInt(tempVar3);
	  }
	 }
	 System.out.print("\n");
	 for (i = 1;i <= n;i++)
	 {
	  s = s + a[i];
	 }
	 for (j = 1;j <= n;j++)
	 {
		  if (b[j] >= 90)
		  {
			  g = 4.0F;
		  }
	   else if (b[j] >= 85)
	   {
		   g = 3.7F;
	   }
	   else if (b[j] >= 82)
	   {
		   g = 3.3F;
	   }
	   else if (b[j] >= 78)
	   {
		   g = 3.0F;
	   }
	   else if (b[j] >= 75)
	   {
		   g = 2.7F;
	   }
	   else if (b[j] >= 72)
	   {
		   g = 2.3F;
	   }
	   else if (b[j] >= 68)
	   {
		   g = 2.0F;
	   }
	   else if (b[j] >= 64)
	   {
		   g = 1.5F;
	   }
	   else if (b[j] >= 60)
	   {
		   g = 1.0F;
	   }
	   else
	   {
		   g = 0.0F;
	   }
	   c[j] = g * a[j];
	 }
	 for (j = 1;j <= n;j++)
	 {
	  G = G + c[j];
	 }
	 GPA = G / s;
	 System.out.printf("%.2f",GPA);
	}

}

