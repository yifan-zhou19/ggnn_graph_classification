package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		float x;
		float[] c = new float[N];
		float[] a = new float[N];
		float[] b = new float[N];
		float y;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		x = (b[0] / a[0]);
		for (i = 0;i < n - 1;i++)
		{
			y = (b[i + 1] / a[i + 1]);

			if ((x - y) > 0.05)
			{
				System.out.print("worse\n");
			}
			else if ((y - x) > 0.05)
			{
				System.out.print("better\n");
			}
			else if ((y - x) <= 0.05 && (x - y) <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


}

