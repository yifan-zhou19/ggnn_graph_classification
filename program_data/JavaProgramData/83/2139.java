package <missing>;

public class GlobalMembers
{
	public static double JiDian(int cj)
	{
	 double jidian;
	 if (cj <= 100 && cj >= 90)
	 {
	  jidian = 4.0;
	 }
	 else if (cj <= 89 && cj >= 85)
	 {
	  jidian = 3.7;
	 }
	 else if (cj <= 84 && cj >= 82)
	 {
	  jidian = 3.3;
	 }
		else if (cj <= 81 && cj >= 78)
		{
	  jidian = 3.0;
		}
	 else if (cj <= 77 && cj >= 75)
	 {
	  jidian = 2.7;
	 }
	 else if (cj <= 74 && cj >= 72)
	 {
	  jidian = 2.3;
	 }
		else if (cj <= 71 && cj >= 68)
		{
	  jidian = 2.0;
		}
	 else if (cj <= 67 && cj >= 64)
	 {
	  jidian = 1.5;
	 }
	 else if (cj <= 63 && cj >= 60)
	 {
	  jidian = 1.0;
	 }
	 else
	 {
	  jidian = 0;
	 }
	 return jidian;
	}
	public static int Main()
	{
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 int[] cj = new int[10];
	 int[] xf = new int[10];
	 int i;
	 int j;
	 for (j = 0;j < n;j++)
	 {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  (xf[j]) = Integer.parseInt(tempVar2);
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  (cj[i]) = Integer.parseInt(tempVar3);
	  }
	 }
	 double x = 0;
	 double y = 0;
	 for (i = 0,j = 0;i < n,j < n;i++,j++)
	 {
	  x += JiDian(cj[i]) * (xf[j]);
	  y += xf[j];
	 }
	double GPA;
	 GPA = x / y;
	 System.out.printf("%.2lf\n",GPA);
	 return 0;
	}


}

