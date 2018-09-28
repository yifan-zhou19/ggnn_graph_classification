package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int num;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *d,*e,*f,x1,x2,x3,x4,a,b,c;
		double d;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *e;
		double e;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: double *f;
		double f;
		double x1;
		double x2;
		double x3;
		double x4;
		double a;
		double b;
		double c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		d = (double)malloc(num * (Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		e = (double)malloc(num * (Double.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		f = (double)malloc(num * (Double.SIZE / Byte.SIZE));
		int i;
		for (i = 0;i < num;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				d + i = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				e + i = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				f + i = Double.parseDouble(tempVar4);
			}
		}
		for (i = 0;i < num;i++)
		{
			a = d[i];
			b = e[i];
			c = f[i];
			if (b * b - 4 * a * c > 0)
			{
				x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a) + 0;
				x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a) + 0;
				System.out.printf("x1=%.5lf;x2=%.5lf\n",x1,x2);
			}
			if (b * b - 4 * a * c == 0)
			{
				x1 = (-b) / (2 * a) + 0;
				System.out.printf("x1=x2=%.5lf\n",x1);
			}
			if (b * b - 4 * a * c < 0)
			{
				x1 = (-b) / (2 * a) + 0;
				x2 = (-b) / (2 * a) + 0;
				x3 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				x4 = Math.sqrt(-b * b + 4 * a * c) / (2 * a);
				System.out.printf("x1=%.5lf+%.5lfi;x2=%.5lf-%.5lfi\n",x1,x3,x2,x4);
			}
		}
		return 0;
	}
}

