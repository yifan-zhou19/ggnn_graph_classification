package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 float a;
	 float b;
	 float c;
	 float d;
	 float D;
	 float S;
	 float s;
	 float sums = new float(float a,float b,float c,float d,float D);
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 a = Float.parseFloat(tempVar);
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 b = Float.parseFloat(tempVar2);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 c = Float.parseFloat(tempVar3);
	 }
	 String tempVar4 = ConsoleInput.scanfRead();
	 if (tempVar4 != null)
	 {
		 d = Float.parseFloat(tempVar4);
	 }
	 String tempVar5 = ConsoleInput.scanfRead();
	 if (tempVar5 != null)
	 {
		 D = Float.parseFloat(tempVar5);
	 }
	 s = sums(a, b, c, d, D);
	 if (s == 0F)
	 {
		 System.out.print("Invalid input");
	 }
		 else
		 {
			 System.out.printf("%.4f",s);
		 }
	}
	public static float sums(float a,float b,float c,float d,float D)
	{
	 double Pi = 3.1415926;
	 float z;
	 float s;
	 float y;
	 z = D / 360 * Pi;
	 s = (a + b + c + d) / 2;
	 y = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * (float)Math.cos(z) * (float)Math.cos(z);
	 if (y < 0F)
	 {
		 return 0F;
	 }
	 else
	 {
		 return Math.sqrt(y);
	 }
	}
}

