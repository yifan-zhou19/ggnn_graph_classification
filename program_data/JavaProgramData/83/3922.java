package <missing>;

public class GlobalMembers
{
	   public static int Main()
	   {
	   int n;
	   int i;
	   int k;
	   int a;
	   a = 0;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   float d;
	   float e;
	   float g;
	   d = 0F;
	   int[] c = new int[n];
	   int[] b = new int[n];
	   for (i = 0;i < n;i++)
	   {
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   c[i] = Integer.parseInt(tempVar2);
	   }
	   a = a + c[i];
	   }
	   for (k = 0;k < n;k++)
	   {
	   if (k != n - 1)
	   {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   b[k] = Integer.parseInt(tempVar3);
	   }
	   }
	   else
	   {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   b[k] = Integer.parseInt(tempVar4);
	   }
	   }
	   if (b[k] <= 100 && b[k] >= 90)
	   {
		  e = c[k] * 4.0;
	   }
	   if (b[k] <= 89 && b[k] >= 85)
	   {
		  e = c[k] * 3.7;
	   }
	   if (b[k] <= 84 && b[k] >= 82)
	   {
		  e = c[k] * 3.3;
	   }
	   if (b[k] <= 81 && b[k] >= 78)
	   {
		  e = c[k] * 3.0;
	   }
		if (b[k] <= 77 && b[k] >= 75)
		{
		  e = c[k] * 2.7;
		}
		 if (b[k] <= 74 && b[k] >= 72)
		 {
		  e = c[k] * 2.3;
		 }
		if (b[k] <= 71 && b[k] >= 68)
		{
		  e = c[k] * 2.0;
		}
		 if (b[k] <= 67 && b[k] >= 64)
		 {
		  e = c[k] * 1.5;
		 }
		 if (b[k] <= 63 && b[k] >= 60)
		 {
		  e = c[k] * 1.0;
		 }
		 if (b[k] < 60)
		 {
		  e = 0F;
		 }
		d = d + e;
	   }
		g = d / a;
		System.out.printf("%.2f",g);
		return 0;
	   }
}

