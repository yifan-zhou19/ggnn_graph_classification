package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float a = 0F;
		float b = 0F;
		float c = 0F;
		float d = 0F;
		float aa = 180F;
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
			aa = Float.parseFloat(tempVar5);
		}

		aa = aa / 180 * 3.1415926;
		float S = 0F;
		float s = (a + b + c + d) / 2;
		if ((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((double)aa / 2) * Math.cos((double)aa / 2) < 0)
		{
		System.out.print("Invalid input");
		}
		else
		{
		S = Math.sqrt((s - a) * (s - b) * (s - c) * (s - d) - a * b * c * d * Math.cos((double)aa / 2) * Math.cos((double)aa / 2));
		System.out.printf("%.4f",S);
		}
		return 0;
	}
}

