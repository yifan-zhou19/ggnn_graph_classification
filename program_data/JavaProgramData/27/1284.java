package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			float a;
			float b;
			float c;
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
			if (b * b - 4 * a * c >= 0F)
			{
				if ((-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a) == (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a))
				{
					System.out.printf("x1=x2=%.5lf\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				}
				else
				{
					System.out.printf("x1=%.5lf;x2=%.5lf\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
				}
			}
			else
			{
				if (b == 0F)
				{
					b = -b;
				}
			System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",-b / (2 * a),Math.sqrt(-b * b + 4 * a * c) / (2 * a),-b / (2 * a),Math.sqrt(-b * b + 4 * a * c) / (2 * a));
			}
		}
			return 0;
	}


}

