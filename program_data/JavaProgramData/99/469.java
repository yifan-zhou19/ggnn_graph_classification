package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] s = new int[100];
		int i;
		float a = 0F;
		float b = 0F;
		float c = 0F;
		float d = 0F;
		float[] h = new float[5];
		float n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Float.parseFloat(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s[i] >= 0 && s[i] <= 18)
			{
				a += 1;
			}
			if (s[i] >= 19 && s[i] <= 35)
			{
				b += 1;
			}
			if (s[i] >= 36 && s[i] <= 60)
			{
				c += 1;
			}
			if (s[i] >= 61)
			{
				d += 1;
			}
		}
		h[0] = a / n;
		h[1] = b / n;
		h[2] = c / n;
		h[3] = d / n;
		System.out.printf("1-18: %.2f%%\n",h[0] * 100);
		System.out.printf("19-35: %.2f%%\n",h[1] * 100);
		System.out.printf("36-60: %.2f%%\n",h[2] * 100);
		System.out.printf("60??: %.2f%%\n",h[3] * 100);

		return 0;
	}


}

