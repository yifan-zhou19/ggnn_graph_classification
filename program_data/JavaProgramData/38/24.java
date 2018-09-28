package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 double[] a = new double[100];
	 double sum;
	 double jun;
	 double s;
	 double m;
	 double[] p = a;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (j = 0;j < n;j++)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 m = Double.parseDouble(tempVar2);
	 }
	 for (i = 0;i < m;i++)
	 {
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 p + i = tempVar3;
	 }
	 }
	 sum = 0;
	 for (i = 0;i < m;i++)
	 {
	 sum = sum + p[i];
	 }
	 jun = sum / m;
	 sum = 0;
	 for (i = 0;i < m;i++)
	 {
	 sum = sum + (p[i] - jun) * (p[i] - jun);
	 }
	 s = sum / m;
	 s = Math.sqrt(s);
	 System.out.printf("%.5lf\n",s);
	 }
	return 0;
	}

}

