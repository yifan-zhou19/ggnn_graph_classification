package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int y;
	 int i;
	 int[] a = new int[2];
	 int[] b = new int[2];
	 int[] c = new int[2];
	 int[] z = new int[2];
	 int[] x = {0, 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a[0] = Integer.parseInt(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b[0] = Integer.parseInt(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c[0] = Integer.parseInt(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 a[1] = Integer.parseInt(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 b[1] = Integer.parseInt(tempVar5);
	 }
	 String tempVar6 = ConsoleInput.scanfRead();
	 if (tempVar6 != null)
	 {
		 c[1] = Integer.parseInt(tempVar6);
	 }
	 for (i = 0;i < 2;i++)
	 {
		 y = a[i] / 4 - a[i] / 100 + a[i] / 400 + a[i] * 365;
	 if ((a[i] % (a[i] % 100?4:400) == 0) && b[i] < 3)
	 {
		 y--;
	 }
	 z[i] = x[b[i]] + y + c[i];
	 }
	 System.out.printf("%ld\n",z[1] - z[0]);
	}
}

