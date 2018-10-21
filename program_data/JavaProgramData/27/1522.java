package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		double a;
		double b;
		double c;
		double x1;
		double x2;
		double disk;
		double[] l = new double[100];
		double[] p = new double[100];
		double[] q = new double[100];
		double realpart;
		double imagpart;
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
				l[i] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p[i] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				q[i] = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			a = l[i];
			b = p[i];
			c = q[i];
			disk = b * b - 4 * a * c;
			if (disk > 0)
			{
				x1 = (-b + Math.sqrt(disk)) / (2 * a);
				x2 = (-b - Math.sqrt(disk)) / (2 * a);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			else if (disk == 0)
			{
				x2 = (-b - Math.sqrt(disk)) / (2 * a);
				System.out.printf("x1=x2=%.5f\n",x2,x2);
			}
			else
			{
				realpart = (-b) / (2 * a);
				if (realpart == 0)
				{
					realpart = Math.abs(realpart);
				}
				imagpart = Math.abs(Math.sqrt(-disk) / (2 * a));
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",realpart,imagpart,realpart,imagpart);
			}
		}
		return 0;
	}
}

