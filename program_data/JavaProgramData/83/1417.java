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
	 float GPA;
	 double[] c = new double[10];
	 double s;
	 double r;
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
	 for (j = 0;j < n;j++)
	 {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b[j] = Integer.parseInt(tempVar3);
	  }
	 }
	 i = 0;
	 s = 0;
	 while (i < n)
	 {
	  if (b[i] > 89 && b[i] <= 100)
	  {
	  c[i] = 4.0;
	  }
	 else if (b[i] > 84 && b[i] < 90)
	 {
	  c[i] = 3.7;
	 }
	 else if (b[i] > 81 && b[i] < 85)
	 {
	  c[i] = 3.3;
	 }
	 else if (b[i] > 77 && b[i] < 82)
	 {
	  c[i] = 3.0;
	 }
	 else if (b[i] > 74 && b[i] < 78)
	 {
	  c[i] = 2.7;
	 }
	 else if (b[i] > 71 && b[i] < 75)
	 {
	  c[i] = 2.3;
	 }
	 else if (b[i] > 67 && b[i] < 72)
	 {
	  c[i] = 2.0;
	 }
	 else if (b[i] > 63 && b[i] < 68)
	 {
	  c[i] = 1.5;
	 }
	 else if (b[i] > 59 && b[i] < 64)
	 {
	  c[i] = 1.0;
	 }
	 else
	 {
		 c[i] = 0;
	 }
	 s = s + c[i] * (a[i] + 0.0);
	 i++;
	 }
	 r = 0;
	 for (i = 0;i < n;i++)
	 {
	  r = r + a[i];
	 }
	 GPA = s / r;
	 System.out.printf("%.2f",GPA);
	}


}

