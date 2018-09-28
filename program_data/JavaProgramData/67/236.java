package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int x;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		float[] y = new float[100];
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
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			y[i] = 1.0 * b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (y[i] - y[0] > 0.05F)
			{
			System.out.print("better\n");
			}
			else if (y[0] - y[i] > 0.05F)
			{
				System.out.print("worse\n");
			}
			else
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

