package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		double a;
		double b;
		double c;
		double s;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
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
			s = b * b - 4 * a * c;
			if (s > 0)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			}
			else if (s == 0)
			{
				System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
			}
			else if (s < 0)
			{
			  if (-b / (2 * a) != 0)
			  {
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),Math.sqrt(-(b * b - 4 * a * c)) / (2 * a),-b / (2 * a),Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
			  }
			else
			{
				 System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",b / (2 * a),Math.sqrt(-(b * b - 4 * a * c)) / (2 * a),b / (2 * a),Math.sqrt(-(b * b - 4 * a * c)) / (2 * a));
			}
			}
		}
	}
}

