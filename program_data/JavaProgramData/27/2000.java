package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double a;
		double b;
		double c;
		double[][] x = new double[100][5];
		double dt;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			dt = b * b - 4 * a * c;
			if (dt > 0.0)
			{
				x[i][0] = 1;
				x[i][1] = (-b + Math.sqrt(dt)) / (2 * a);
				x[i][2] = (-b - Math.sqrt(dt)) / (2 * a);
			}
			else if (dt == 0)
			{
				x[i][0] = 2;
				x[i][1] = (-b) / (2 * a);
			}
			else
			{
				x[i][0] = 3;
				x[i][1] = (-b) / (2 * a);
				x[i][3] = (Math.sqrt(-dt)) / (2 * a);
				x[i][2] = (-b) / (2 * a);
				x[i][4] = (Math.sqrt(-dt)) / (2 * a);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (x[i][0] == 1)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",x[i][1],x[i][2]);
			}
			else if (x[i][0] == 2)
			{
				System.out.printf("x1=x2=%.5f\n",x[i][1]);
			}
			else if (x[i][0] == 3)
			{
				if (x[i][1] == -0.0)
				{
				x[i][1] = 0.0;
				}
				if (x[i][2] == -0.0)
				{
				x[i][2] = 0.0;
				}
				System.out.printf("x1=%.5f+%.5f",x[i][1],x[i][3],x[i][2],x[i][4]);
				System.out.printf("i;x2=%.5f-%.5f",x[i][2],x[i][4]);
				System.out.print("i\n");
			}
		}
		return 0;
	}
}

