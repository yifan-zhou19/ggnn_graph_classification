package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			 int[] a = new int[999];
			 int[] b = new int[999];
			 int c;
			 int i;
			 int m;
			 int[] n = new int[999];
			 int j;
			 double s = 0;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 m = Integer.parseInt(tempVar);
			 }
			 for (i = 0;i < m;i++)
			 {
				 String tempVar2 = ConsoleInput.scanfRead();
				 if (tempVar2 != null)
				 {
					 n[i] = Integer.parseInt(tempVar2);
				 }
			 }
			 a[0] = 1;
			 b[0] = 2;
			 for (i = 0;i < m;i++)
			 {
				 for (j = 0;j < n[i];j++)
				 {
					 s += 1.0 * b[j] / a[j];
					 c = b[j] + a[j];
					 b[j + 1] = c;
					 a[j + 1] = b[j];
				 }
			 System.out.printf("%.3lf\n",s);
			 s = 0;
			 }
			 return 0;
	}


}

