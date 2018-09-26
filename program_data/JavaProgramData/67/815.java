package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j = 0;
		int k = 0;
		double a;
		double b;
		double[] c = new double[1000];
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
				a = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			c[i] = b / a;
		}
		for (i = 1;i < n;i++)
		{

			if (c[i] - c[0] > 0.05)
			{
				System.out.print("better");
			}
			else if (c[i] - c[0] < -0.05)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
			System.out.print("\n");
		}

		return 0;
	}

}

