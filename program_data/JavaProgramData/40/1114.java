package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		float[] a = new float[4];
		float s;
		float S;
		float angle;
		float t;
		int i;
		for (i = 0;i < 4;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Float.parseFloat(tempVar);
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			angle = Float.parseFloat(tempVar2);
		}
		s = (a[0] + a[1] + a[2] + a[3]) / 2;
		t = Math.cos(angle * pi / 360);
		S = Math.sqrt((s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * t * t);
	if ((s - a[0]) * (s - a[1]) * (s - a[2]) * (s - a[3]) - a[0] * a[1] * a[2] * a[3] * t * t < 0F)
	{
		System.out.print("Invalid input");
	}
		else
		{
			System.out.printf("%.4f",S);
		}
	}


}

