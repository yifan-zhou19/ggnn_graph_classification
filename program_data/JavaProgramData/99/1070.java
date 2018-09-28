package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int s1;
	 int s2;
	 int s3;
	 int s4;
	 int n;
	 int x;
	 double c1;
	 double c2;
	 double c3;
	 double c4;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 s1 = 0;
	 s2 = 0;
	 s3 = 0;
	 s4 = 0;
	 for (i = 1;i <= n;i = i + 1)
	 {
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 x = Integer.parseInt(tempVar2);
	 }
	 if (x <= 18)
	 {
		 s1++;
	 }
	 else if (x > 18 && x <= 35)
	 {
		 s2++;
	 }
	 else if (x > 35 && x <= 60)
	 {
		 s3++;
	 }
	 else
	 {
		 s4++;
	 }
	 }
	 c1 = 1.0 * s1 / n * 100;
	 c2 = 1.0 * s2 / n * 100;
	 c3 = 1.0 * s3 / n * 100;
	 c4 = 1.0 * s4 / n * 100;
	 System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%\n",c1,c2,c3,c4);
	 return 0;
	}
}

