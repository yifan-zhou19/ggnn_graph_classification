package <missing>;

public class GlobalMembers
{
	public static float find(float a,float b,float c,float d,float p)
	{
		float s = (a + b + c + d) / 2;
		float k;
		float temp;
		float q;
		q = p * Math.asin(1) / 180;
		temp = (s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q);
		if (temp >= 0F)
		{
			k = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos(q) * Math.cos(q));
		}
		else
		{
			k = 0F;
		}
		return k;
	}
	public static int Main()
	{
		float a;
		float b;
		float c;
		float d;
		float p;
		float k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Float.parseFloat(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Float.parseFloat(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Float.parseFloat(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Float.parseFloat(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p = Float.parseFloat(tempVar5);
		}
		k = find(a, b, c, d, p);
		if (k == 0F)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",k);
		}
		return 0;
	}

}

