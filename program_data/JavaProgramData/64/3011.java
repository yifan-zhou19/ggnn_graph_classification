package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int count = 1;
		double[] x = new double[20];
		double[] y = new double[20];
		double[] z = new double[20];
		double t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			y[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			z[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct position //?????????????
	//	{
	//		double x;
	//		double a;
	//		double y;
	//		double b;
	//		double z;
	//		double c;
	//		double d;
	//	}
	//	p[100];
		for (i = 1;i <= n;i++)
		{
			for (j = i + 1;j <= n;j++)
			{
				p[count].x = x[i];
				p[count].a = x[j];
				p[count].y = y[i];
				p[count].b = y[j];
				p[count].z = z[i];
				p[count].c = z[j];
				p[count].d = Math.sqrt((x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]) + (z[i] - z[j]) * (z[i] - z[j])); //???
				count++;
			}
		}
		for (i = count - 1;i > 0;i--)
		{
			for (j = 1;j < i;j++)
			{
				if (p[j].d < p[j + 1].d)
				{
					swap(p[j].x,p[j + 1].x);
					swap(p[j].y,p[j + 1].y);
					swap(p[j].z,p[j + 1].z);
					swap(p[j].a,p[j + 1].a);
					swap(p[j].b,p[j + 1].b);
					swap(p[j].c,p[j + 1].c);
					swap(p[j].d,p[j + 1].d); //??????????
				}
			}
		}
		for (i = 1;i <= count - 1;i++)
		{
			System.out.print('(');
			System.out.print((int)p[i].x);
			System.out.print(',');
			System.out.print((int)p[i].y);
			System.out.print(',');
			System.out.print((int)p[i].z);
			System.out.print(')');
			System.out.print('-');
			System.out.print('(');
			System.out.print((int)p[i].a);
			System.out.print(',');
			System.out.print((int)p[i].b);
			System.out.print(',');
			System.out.print((int)p[i].c);
			System.out.print(')');
			System.out.print('=');
			System.out.printf("%.2f", p[i].d);
			System.out.printf("%.2f", "\n");
		}
	return 0;
	}
}

