package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int i = 0;
		int A;
		int B;
		int C;
		int D;
		int E;


		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}

			A = a / 10000;
		B = (a - A * 10000) / 1000;
		C = (a - A * 10000 - B * 1000) / 100;
		D = (a - A * 10000 - B * 1000 - C * 100) / 10;
		E = (a - A * 10000 - B * 1000 - C * 100 - D * 10) / 1;
		if (a > 9999)
		{
			i = A + B * 10 + C * 100 + D * 1000 + E * 10000;
		}
		else if (a < 10000 && a>999)
		{
			i = B * 1 + C * 10 + D * 100 + E * 1000;
		}
			else if (a < 1000 && a>99)
			{
			i = C * 1 + D * 10 + E * 100;
			}
		System.out.printf("%d\n",i);
		return 0;
	}

}

