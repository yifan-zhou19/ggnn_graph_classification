package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double a;
		double b;
		double c;
		double d;
		double e;
		double e1;
		double s;
		double s1;
		double s2;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 a = Double.parseDouble(tempVar);
			 }
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 b = Double.parseDouble(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 c = Double.parseDouble(tempVar3);
			 }
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 d = Double.parseDouble(tempVar4);
			 }
			 String tempVar5 = ConsoleInput.scanfRead();
			 if (tempVar5 != null)
			 {
				 e = Double.parseDouble(tempVar5);
			 }
			e1 = 3.1415926 * e / 180;
			s = (a + b + c + d) / 2;
			s2 = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((e1) / 2) * Math.cos((e1) / 2);

	if (s2 <= 0)
	{
	System.out.print("Invalid input");

	}
	else
	{
	s1 = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((e1) / 2) * Math.cos((e1) / 2));
	System.out.printf("%.4f", s1);
	}
	return 0;
	}
}

