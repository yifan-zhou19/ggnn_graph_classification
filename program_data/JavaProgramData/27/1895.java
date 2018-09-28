package <missing>;

public class GlobalMembers
{
	public static String solve_x(int xn, float a, float b, float c)
	{
		double in_sqrt = b * b - 4 * a * c;
		double x;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * res;
		double real;
		double imaginary;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		res = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		if (in_sqrt >= 0)
		{
			if (xn == 1)
			{
				x = (-b + Math.sqrt(in_sqrt)) / (2 * a);
			}
			else
			{
				x = (-b - Math.sqrt(in_sqrt)) / (2 * a);
			}
			res = String.format("%.05f", x);
			if (!strcmp(res, "-0.00000"))
			{
				res++;
			}
		}
		else
		{
			real = -b / (2 * a);
			imaginary = Math.sqrt(-in_sqrt) / (2 * a);
			res = String.format("%.05f", real);
			if (!strcmp(res, "-0.00000"))
			{
				res++;
			}
			if (xn == 1)
			{
				res = res.substring(0, res.length()) + String.format("+%.05fi", imaginary);
			}
			else
			{
				res = res.substring(0, res.length()) + String.format("-%.05fi", imaginary);
			}
		}
		return res;
	}

	public static int Main()
	{
		int n;
		double a;
		double b;
		double c;
		String x1;
		String x2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		while (n-- != 0)
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
			x1 = solve_x(1, a, b, c);
			x2 = solve_x(2, a, b, c);
			if (!strcmp(x1, x2))
			{
				System.out.printf("x1=x2=%s\n", x1);
			}
			else
			{
				System.out.printf("x1=%s;x2=%s\n", x1, x2);
			}
		}
		return 0;
	}
}

