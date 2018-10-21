package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char x1;
		char x2;
		int n;
		float a;
		float b;
		float c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Float.parseFloat(tempVar4);
			}
			float e;
			e = b * b - 4 * a * c;
			if (e > 0F)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a),(-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a));
			}
			else
			{
				if (e == 0.0F)
				{
				System.out.printf("x1=x2=%.5f\n",(-b) / (2 * a));
				}
				else
				{
					if (b == 0F)
					{
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(b) / (2 * a),Math.sqrt(-e) / (2 * a),(b) / (2 * a),(Math.sqrt(-e)) / (2 * a));
					}
					else
					{
	System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(-b) / (2 * a),Math.sqrt(-e) / (2 * a),(-b) / (2 * a),(Math.sqrt(-e)) / (2 * a));
					}
				}
			}
		}
		return 0;
	}

}

