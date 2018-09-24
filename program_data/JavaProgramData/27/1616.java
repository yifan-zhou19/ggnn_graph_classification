package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double[][] result = new double[1000][3];
		double a;
		double b;
		double c;
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c = Double.parseDouble(tempVar4);
			}
			if (b * b - 4 * a * c > 0)
			{
				result[i][0] = 1;
				result[i][1] = (-b + (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
				result[i][2] = (-b - (Math.sqrt(b * b - 4 * a * c))) / (2 * a);
			}
			else if (b * b - 4 * a * c < 0)
			{
				result[i][0] = 2;
				result[i][1] = (-b) / (2 * a);
				result[i][2] = (Math.sqrt(4 * a * c - b * b)) / (2 * a);
			}
			else
			{
				result[i][0] = 3;
				result[i][1] = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((int)result[i][0] == 1)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n", result[i][1],result[i][2]);
			}
			else if ((int)result[i][0] == 2)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n", result[i][1],result[i][2],result[i][1],result[i][2]);
			}
			else
			{
				System.out.printf("x1=x2=%.5f\n", result[i][1]);
			}
		}
		return 0;
	}

}

