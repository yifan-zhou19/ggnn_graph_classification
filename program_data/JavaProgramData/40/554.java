package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		double a1;
		double a2;
		double a3;
		double a4;
		double b;
		double s;
		double sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a1 = Double.parseDouble(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a2 = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a3 = Double.parseDouble(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a4 = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b = Double.parseDouble(tempVar5);
		}
		s = 0.5 * (a1 + a2 + a3 + a4);
		sum = Math.sqrt((s - a1) * (s - a2) * (s - a3) * (s - a4) - a1 * a2 * a3 * a4 * Math.cos(b * 3.1415926 / 360) * Math.cos(b * 3.1415926 / 360));
		if ((s - a1) * (s - a2) * (s - a3) * (s - a4) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
		System.out.printf("%.4lf",sum);
		}
	}


}

