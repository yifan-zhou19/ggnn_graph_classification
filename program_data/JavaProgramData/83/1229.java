package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int n;
		int i;
	 float sum;
	 float[] f = new float[10];
	 float b = 0F;
	 sum = 0F;
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
			 f[i] = Float.parseFloat(tempVar2);
		 }
		 b += f[i];
	 }
	 for (i = 0;i <= n - 1;i++)
	 {
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 a = Integer.parseInt(tempVar3);
		 }
	  if (a >= 90 && a <= 100)
	  {
		  sum += f[i] * 4.0;
		  continue;
	  }
	  if (a >= 85 && a <= 89)
	  {
		  sum += f[i] * 3.7;
		  continue;
	  }
	  if (a >= 82 && a <= 84)
	  {
		  sum += f[i] * 3.3;
		  continue;
	  }
	  if (a >= 78 && a <= 81)
	  {
		  sum += f[i] * 3.0;
		  continue;
	  }
	  if (a >= 75 && a <= 77)
	  {
		  sum += f[i] * 2.7;
		  continue;
	  }
	  if (a >= 72 && a <= 74)
	  {
		  sum += f[i] * 2.3;
		  continue;
	  }
	  if (a >= 68 && a <= 71)
	  {
		  sum += f[i] * 2.0;
		  continue;
	  }
	  if (a >= 64 && a <= 67)
	  {
		  sum += f[i] * 1.5;
		  continue;
	  }
	  if (a >= 60 && a <= 63)
	  {
		  sum += f[i] * 1.0;
		  continue;
	  }
	 }
	 System.out.printf("%.2f",sum / b);

	}
}

