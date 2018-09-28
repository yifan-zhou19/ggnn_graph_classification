package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[50];
		int[] b = new int[50];
		float[] c = new float[50];
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
			c[i] = (float)b[i] / a[i];
		}
		for (i = 1;i < n;i++)
		{
			if (c[i] - c[0] > 0.05F)
			{
				System.out.print("better\n");
			}
			if (c[0] - c[i] > 0.05F)
			{
				System.out.print("worse\n");
			}
			if (c[0] - c[i] <= 0.05F && c[i] - c[0] <= 0.05F)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

