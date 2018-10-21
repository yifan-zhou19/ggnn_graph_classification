package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
		  int n;
		  int i;
		  int x;
		  float y;
		  float c;
		  float d;
		  float GPA;
		  int[] a = new int[num];
		  int[] b = new int[num];
		  x = 0;
		  c = 0F;
		  d = 0F;
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
			 x = x + a[i];
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
			 y = 4.0F;
		   }
		   else if (b[i] >= 85)
		   {
			 y = 3.7F;
		   }
		   else if (b[i] >= 82)
		   {
			 y = 3.3F;
		   }
		   else if (b[i] >= 78)
		   {
			 y = 3.0F;
		   }
		   else if (b[i] >= 75)
		   {
			 y = 2.7F;
		   }
		   else if (b[i] >= 72)
		   {
			 y = 2.3F;
		   }
		   else if (b[i] >= 68)
		   {
			 y = 2.0F;
		   }
		   else if (b[i] >= 64)
		   {
			 y = 1.5F;
		   }
		   else if (b[i] >= 60)
		   {
			 y = 1.0F;
		   }
		   else
		   {
			 y = 0F;
		   }
		   c = y * a[i];
		   d = d + c;
		 }
		 GPA = d / x;
		 System.out.printf("%.2f",GPA);
		 return 0;
	   }






}

