package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		float a;
		float b;
		float c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			if ((b * b - 4 * a * c) == 0)
			{
				System.out.printf("x1=x2=%.5f\n",-b / (2 * a));
			}
			if ((b * b - 4 * a * c) > 0)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt((b * b - 4 * a * c))) / (2 * a),(-b - Math.sqrt((b * b - 4 * a * c))) / (2 * a));
			}
			if ((b * b - 4 * a * c) < 0)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b / (2 * a),(Math.sqrt((-b * b + 4 * a * c)) / (2 * a)),-b / (2 * a),(Math.sqrt((-b * b + 4 * a * c)) / (2 * a)));
			}

		}
		return 0;
	}
}

