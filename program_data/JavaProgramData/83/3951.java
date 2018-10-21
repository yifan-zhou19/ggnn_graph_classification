package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10];
		int[] b = new int[10];
	 float[] c = new float[10];
	 float e;
	 int n;
	 int i;
	 int f;
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
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Integer.parseInt(tempVar3);
		 }
		 if (b[i] >= 90 && b[i] <= 100)
		 {
		 c[i] = 4.0F;
		 }
		 if (b[i] >= 85 && b[i] <= 89)
		 {
		 c[i] = 3.7F;
		 }
		 if (b[i] >= 82 && b[i] <= 84)
		 {
		 c[i] = 3.3F;
		 }
		 if (b[i] >= 78 && b[i] <= 81)
		 {
		 c[i] = 3.0F;
		 }
		 if (b[i] >= 75 && b[i] <= 77)
		 {
		 c[i] = 2.7F;
		 }
		 if (b[i] >= 72 && b[i] <= 74)
		 {
		 c[i] = 2.3F;
		 }
		 if (b[i] >= 68 && b[i] <= 71)
		 {
		 c[i] = 2.0F;
		 }
		 if (b[i] >= 64 && b[i] <= 67)
		 {
		 c[i] = 1.5F;
		 }
		 if (b[i] >= 60 && b[i] <= 63)
		 {
		 c[i] = 1.0F;
		 }
		 if (b[i] < 60)
		 {
		 c[i] = 0F;
		 }
	 }
	 c[0] = a[0] * c[0];
	 for (i = 1;i < n;i++)
	 {
	   e = c[i] = a[i] * c[i] + c[i - 1];
	   f = a[i] = a[i] + a[i - 1];
	 }
	 System.out.printf("%.2f",e / f);
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 n = Integer.parseInt(tempVar4);
	 }
	 return 0;
	}
}

