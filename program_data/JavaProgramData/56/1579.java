package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int B;
		int C;
		int D;
		int E;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		b = a % 10000;
		B = a / 10000;
		c = b % 1000;
		C = b / 1000;
		d = c % 100;
		D = c / 100;
		e = d % 10;
		E = d / 10;
		if ((a >= 10000) && (a <= 99999))
		{
			System.out.printf("%d\n",10000 * e+1000 * E+100 * D + 10 * C + B);
		}
		else if ((a >= 1000) && (a <= 9999))
		{
			System.out.printf("%d\n",1000 * e+100 * E+10 * D + C);
		}
			else if ((a >= 100) && (a <= 999))
			{
				System.out.printf("%d\n",100 * e+10 * E + D);
			}
			else if ((a >= 10) && (a <= 99))
			{
				System.out.printf("%d\n",10 * e + E);
			}
			else
			{
				System.out.printf("%d\n",e);
			}
	}


}

