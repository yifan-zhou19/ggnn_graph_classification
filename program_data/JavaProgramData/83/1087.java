package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[101];
		float gpa;
		float sumjidian = 0F;
		float sumxuefen = 0F;
	 int i;
	 int n;
	 int[] b = new int[101];
	 int[] c = new int[101];
	 for (i = 60;i <= 63;i++)
	 {
		 a[i] = 1.0F;
	 }
	 for (i = 64;i <= 67;i++)
	 {
		 a[i] = 1.5F;
	 }
	 for (i = 68;i <= 71;i++)
	 {
		 a[i] = 2.0F;
	 }
	 for (i = 72;i <= 74;i++)
	 {
		 a[i] = 2.3F;
	 }
	 for (i = 75;i <= 77;i++)
	 {
		 a[i] = 2.7F;
	 }
	 for (i = 78;i <= 81;i++)
	 {
		 a[i] = 3.0F;
	 }
	 for (i = 82;i <= 84;i++)
	 {
		 a[i] = 3.3F;
	 }
	 for (i = 85;i <= 89;i++)
	 {
		 a[i] = 3.7F;
	 }
	 for (i = 90;i <= 100;i++)
	 {
		 a[i] = 4.0F;
	 }
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
			 b[i] = Integer.parseInt(tempVar2);
		 }
		 sumxuefen = sumxuefen + b[i];
	 }
	 for (i = 0;i < n;i++)
	 {
		   String tempVar3 = ConsoleInput.scanfRead();
		   if (tempVar3 != null)
		   {
			   c[i] = Integer.parseInt(tempVar3);
		   }
		sumjidian = sumjidian + a[c[i]] * b[i];
	 }
	 gpa = sumjidian / sumxuefen;
	 System.out.printf("%.2f",gpa);
	 scanf("\n");




	}

}

