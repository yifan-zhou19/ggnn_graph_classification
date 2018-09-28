package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int i;
	 int[] a = new int[100];
	 double s;
	 double c1;
	 double c2;
	 double c3;
	 double c4;
	 int b1 = 0;
	 int b2 = 0;
	 int b3 = 0;
	 int b4 = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 s = (double)n;
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
	 if (a[i] <= 18)
	 {
		 b1++;
	 }
	 else if (a[i] <= 35)
	 {
		 b2++;
	 }
	 else if (a[i] <= 60)
	 {
		 b3++;
	 }
	 else if (a[i] > 60)
	 {
		 b4++;
	 }
	 }
	 c1 = b1 / s * 100;
	 System.out.printf("1-18: %.2lf%%\n",c1);
	 c2 = b2 / s * 100;
	 System.out.printf("19-35: %.2lf%%\n",c2);
	 c3 = b3 / s * 100;
	 System.out.printf("36-60: %.2lf%%\n",c3);
	 c4 = b4 / s * 100;
	 System.out.printf("60??: %.2lf%%\n",c4);

	}
}

