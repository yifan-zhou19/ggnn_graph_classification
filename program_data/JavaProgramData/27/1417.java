package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double t;
		double t1;
		double t2;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			t = b * b - 4 * a * c;
			if (t > 0)
			{
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1 = (-b + Math.sqrt(t)) / (2 * a),x2 = (-b - Math.sqrt(t)) / (2 * a));
			}
			else if (t == 0)
			{
				System.out.printf("x1=x2=%.5lf\n",x1 = -b / (2 * a));
			}
			else if (t < 0)
			{
				t = Math.abs(t);
				t1 = -b / (2 * a);
				t2 = Math.sqrt(t) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",t1,t2,t1,t2);
			}
		}
	}
}

