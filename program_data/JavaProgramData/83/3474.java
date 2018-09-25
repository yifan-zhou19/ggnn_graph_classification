package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   int n;
	   int[] a = new int[10];
	   int[] b = new int[10];
	   int i;
	   int j;
	   int k;
	   int l;
	   int d;
	   float[] c = new float[10];
	   float sum = 0F;
	   float GPA;
	   float m = 0F;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   n = Integer.parseInt(tempVar);
	   }
	   for (i = 0;i <= n - 1;i++)
	   {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i] = Integer.parseInt(tempVar2);
		 }
	   }
	   for (l = 0;l <= n - 1;l++)
	   {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   b[l] = Integer.parseInt(tempVar3);
		   }
	   }
	   for (j = 0;j <= n - 1;j++)
	   {
		   d = b[j];
		   if (90 <= d != 0 && d <= 100)
		   {
			   c[j] = 4.0F;
		   }
			else if (85 <= d != 0 && d <= 89)
			{
				c[j] = 3.7F;
			}
			 else if (82 <= d != 0 && d <= 84)
			 {
				 c[j] = 3.3F;
			 }
			 else if (78 <= d != 0 && d <= 81)
			 {
				 c[j] = 3.0F;
			 }
			 else if (75 <= d != 0 && d <= 77)
			 {
				 c[j] = 2.7F;
			 }
			 else if (72 <= d != 0 && d <= 74)
			 {
				 c[j] = 2.3F;
			 }
			 else if (68 <= d != 0 && d <= 71)
			 {
				 c[j] = 2.0F;
			 }
			 else if (64 <= d != 0 && d <= 67)
			 {
				 c[j] = 1.5F;
			 }
			 else if (60 <= d != 0 && d <= 63)
			 {
				 c[j] = 1.0F;
			 }
			 else if (d < 60)
			 {
				 c[j] = 0F;
			 }
	   }
		for (k = 0;k <= n - 1;k++)
		{
				sum = sum + a[k] * c[k];
			m = m + a[k];
		}
		GPA = sum / m;
		System.out.printf("%.2f",GPA);
	}


}

