package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[100];
	int[] b = new int[100];
	double x;
	double y;
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
		}
		y = (float)b[0] / a[0];
		for (i = 1;i < n;i++)
		{

			x = (float)b[i] / a[i] - y;

			if (x > 0.05)
			{
				System.out.print("better\n");
			}
			else if (x < -0.05)
			{
				System.out.print("worse\n");
			}
			else if (x <= 0.05 && x >= -0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}


}

