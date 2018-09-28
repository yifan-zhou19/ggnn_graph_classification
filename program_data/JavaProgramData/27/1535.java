package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		 double a;
		 double b;
		 double c;
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = Double.parseDouble(tempVar3);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 c = Double.parseDouble(tempVar4);
		 }
		 if (b * b > 4 * a * c)
		 {
			 System.out.printf("x1=%.5lf;x2=%.5lf\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		 }
		 else if (b * b == 4 * a * c)
		 {
			 System.out.printf("x1=x2=%.5lf\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
		 }
		 else
		 {
			 if (b == 0)
			 {
				System.out.printf("x1=0.00000+%.5lfi;x2=0.00000%.5lfi\n",Math.sqrt(-b * b + 4 * a * c) / (2 * a),-Math.sqrt(-b * b + 4 * a * c) / (2 * a));
			 }
			else
			{
			 System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf%.5lfi\n",-b / (2 * a),Math.sqrt(-b * b + 4 * a * c) / (2 * a),-b / (2 * a),-Math.sqrt(-b * b + 4 * a * c) / (2 * a));
			}
		 }
	}
	return 0;
	}

}

