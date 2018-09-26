package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float a;
		float b;
		float c;
		float d;
		float t;
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
		d = b * b - 4 * a * c;
		if (d > 0F)
		{

			   System.out.printf("x1=%.5f;x2=%.5f\n",(-b + Math.sqrt(d)) / (2 * a) + 1e-6,(-b - Math.sqrt(d)) / (2 * a) + 1e-6);
		}
		else if (d < 1e-6F && d>-1e-6F)
		{
					   System.out.printf("x1=x2=%.5f\n",(-b) / (2 * a));
		}
		else
		{
			t = -b / (2 * a) + 1e-8;
			System.out.printf("x1=%.5f%+.5fi;x2=%.5f%+.5fi\n",t,Math.sqrt(-d) / (2 * a),t,-Math.sqrt(-d) / (2 * a));

		}
		}

		//getch();
		return 0;
	}

}

