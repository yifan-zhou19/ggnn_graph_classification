package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 int n;
	 int i;
	 int c = 0;
	 int y = 0;
	 int a = 0;
	 int o = 0;
	 int[] sum = new int[100];
	 double cl;
	 double yl;
	 double al;
	 double ol;
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
			 sum[i - 1] = Integer.parseInt(tempVar2);
		 }
		 if (sum[i - 1] <= 18)
		 {
			 c = c + 1;
		 }
		 else if (sum[i - 1] <= 35)
		 {
			 y = y + 1;
		 }
		 else if (sum[i - 1] <= 60)
		 {
			 a = a + 1;
		 }
		 else
		 {
			 o = o + 1;
		 }

	 }
	  cl = c * 1.0 * 100 / n;
	  yl = y * 1.0 * 100 / n;
	  al = a * 1.0 * 100 / n;
	  ol = o * 1.0 * 100 / n;
	  System.out.printf("1-18: %.2lf%\n19-35: %.2lf%\n36-60: %.2lf%\n60??: %.2lf%",cl,yl,al,ol);
	  return 0;
	 }
}

