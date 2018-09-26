package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		double[] a = new double[10000];
		double[] b = new double[10000];
		double x;
		double y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			b[0] = Double.parseDouble(tempVar3);
		}
		x = b[0] / a[0];
		for (i = 0;i < n - 1;i++)
		{

		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[i] = Double.parseDouble(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			b[i] = Double.parseDouble(tempVar5);
		}
		y = b[i] / a[i];

		if (y - x > 0.05)
		{
			System.out.print("better\n");
		}
		else if (x - y > 0.05)
		{
			System.out.print("worse\n");
		}
		else
		{
			System.out.print("same\n");
		}


		}


	}
}

