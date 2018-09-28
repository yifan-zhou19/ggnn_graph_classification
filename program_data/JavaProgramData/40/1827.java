package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		float a;
		float b;
		float c;
		float d;
		float e;
		float ans;
		float sum;
		float multi;
		float anmul;
		float sq = new float(float p,float q);
		float angle;
		float angle2;
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
			angle2 = Float.parseFloat(tempVar5);
		}
		sum = (a + b + c + d) / 2;
		angle = angle2 / 2;
		multi = (sum - a) * (sum - b) * (sum - c) * (sum - d);
		e = Math.cos(angle * 3.1415926 / 180) * Math.cos(angle * 3.1415926 / 180);
		anmul = a * b * c * d * e;
		ans = sq(multi, anmul);
		if ((multi - anmul) < 0)
		{
			System.out.print("Invalid input");
		}
		else
		{
			System.out.printf("%.4f",ans);
		}
	}
	public static float sq(float p,float q)
	{
		float z;
		z = Math.sqrt((p - q));
		return z;
	}
}

