package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float s;
		float p;
		float k;
		float i;
		float j;
		float m;
		float n;
		float g;
	 float pi = 3.1415926F;
	 i = 180F;
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
		 k = Float.parseFloat(tempVar5);
	 }
	 s = (a + b + c + d) / 2;
	 j = (k / i) * pi;
	 m = j / 2;
	 p = (Math.cos(m)) * (Math.cos(m));
	 n = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * p;
	 if (n < 0F)
	 {
		 System.out.print("Invalid input");
	 }
	 else
	 {
		 g = Math.sqrt(n);
		  System.out.printf("%.4f",g);

	 }

	}

}

