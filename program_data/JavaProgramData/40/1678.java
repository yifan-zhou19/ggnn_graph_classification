package <missing>;

public class GlobalMembers
{
	public static float sss(float a,float b,float c,float d,float alpha)
	{
		float s = (a + b + c + d) / 2;
		return (float)Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(alpha / 180 * 3.1415926 / 2) * Math.cos(alpha / 180 * 3.1415926 / 2));
	}

	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float alpha;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			alpha = Float.parseFloat(tempVar5);
		}
		float result;
		result = sss(a, b, c, d, alpha);
		if (result > 0F)
		{
			System.out.printf("%.4f\n",result);
		}
		else
		{
			System.out.print("Invalid input\n");
		}
		return 0;
	}
}

