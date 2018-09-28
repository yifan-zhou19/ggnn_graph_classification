package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  int i;
	  int n;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  m = Integer.parseInt(tempVar);
	  }
	  int[] a = new int[10000];
	  int[] b = new int[10000];
	  a[0] = 2;
	  a[1] = 3;
	  b[0] = 1;
	  b[1] = 2;
	  for (i = 2;i < 10000;i++)
	  {
		  a[i] = a[i - 1] + a[i - 2];
		 b[i] = b[i - 1] + b[i - 2];
	  }
	  for (i = 0;i < m;i++)
	  {
		  float sum = 0F;
	   String tempVar2 = ConsoleInput.scanfRead();
	   if (tempVar2 != null)
	   {
		   n = Integer.parseInt(tempVar2);
	   }
	   for (j = 0;j < n;j++)
	   {
	   sum = sum + (float)a[j] / b[j];
	   }
	  System.out.printf("%.3f\n",sum);
	  }
	  System.in.read();
	  System.in.read();
	  System.in.read();
	}


}

