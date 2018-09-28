package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int[] a = new int[100];
	 int b;
	 int c;
	 int d;
	 int i;
	 int j;
	 int k;
	 int n;
	 double w = 0;
	 double x = 0;
	 double y = 0;
	 double z = 0;
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
	 }
	 for (i = 0;i < n;i++)
	 {
	  if (a[i] < 19)
	  {
		  w = w + 1;
	  }
	  if (a[i] > 18 && a[i] < 36)
	  {
		  x = x + 1;
	  }
	  if (a[i] > 35 && a[i] < 61)
	  {
		  y = y + 1;
	  }
	  if (a[i] > 60)
	  {
		  z = z + 1;
	  }
	 }
	 w = w / n * 100;
	 x = x / n * 100;
	 y = y / n * 100;
	 z = z / n * 100;
	System.out.printf("1-18: %.2f%%\n19-35: %.2f%%\n36-60: %.2f%%\n60??: %.2f%%\n",w,x,y,z);
	}
}

