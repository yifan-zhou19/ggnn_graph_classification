package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] jiwei = new double[2];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			jiwei[0] = Double.parseDouble(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			jiwei[1] = Double.parseDouble(tempVar3);
		}
		double b;
		b = jiwei[1] / jiwei[0] * 100;
		double[][] qita = new double[100][2];
		for (int i = 0;i < n - 1;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				qita[i][0] = Double.parseDouble(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				qita[i][1] = Double.parseDouble(tempVar5);
			}
		}
		double a;
		 a = qita[0][1] / qita[0][0] * 100;
			if (a - b > 5)
			{
				System.out.print("better");
			}
			else if (b - a > 5)
			{
				System.out.print("worse");
			}
			else
			{
				System.out.print("same");
			}
		for (int j = 1;j < n - 1;j++)
		{
			a = qita[j][1] / qita[j][0] * 100;
			if (a - b > 5)
			{
				System.out.print("\nbetter");
			}
			else if (b - a > 5)
			{
				System.out.print("\nworse");
			}
			else
			{
				System.out.print("\nsame");
			}
		}
		return 0;
	}

}

