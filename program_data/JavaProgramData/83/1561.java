package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  int n;
	  int i;
	  int m;
	  int[] a = new int[10];
	  int[] b = new int[10];
	  float s;
	  float k;
	  float t;
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
	  for (i = 0;i <= n - 1;i++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b[i] = Integer.parseInt(tempVar3);
		  }
	  }
	  s = 0F;
	  m = 0;
	  for (i = 0;i <= n - 1;i++)
	  {
		  if (b[i] >= 90)
		  {
			  t = 4.0F;
		  }
		 if ((b[i] >= 85) && (b[i] <= 89))
		 {
			 t = 3.7F;
		 }
		 if ((b[i] >= 82) && (b[i] <= 84))
		 {
			 t = 3.3F;
		 }
		 if ((b[i] >= 78) && (b[i] <= 81))
		 {
			 t = 3.0F;
		 }
		 if ((b[i] >= 75) && (b[i] <= 77))
		 {
			 t = 2.7F;
		 }
		 if ((b[i] >= 72) && (b[i] <= 74))
		 {
			 t = 2.3F;
		 }
		 if ((b[i] >= 68) && (b[i] <= 71))
		 {
			 t = 2.0F;
		 }
		 if ((b[i] >= 64) && (b[i] <= 67))
		 {
			 t = 1.5F;
		 }
		 if ((b[i] >= 60) && (b[i] <= 63))
		 {
			 t = 1.0F;
		 }
		 if (b[i] < 60)
		 {
			 t = 0F;
		 }
	   s = s + t * a[i];
	   m = m + a[i];
	  }
	  k = s / m;
	  System.out.printf("%.2f",k);
	}
}

