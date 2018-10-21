package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[] n = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		char[] y = {'0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long r,x1,x=1;
		int r;
		int x1;
		int x = 1;
		int i;
		int a;
		int b;
		int x2 = 0;
		int y1;
		int p;
		int q;
		int xm = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long m=0;
		int m = 0;
		p = n.length();
		r = Math.pow(a,p - 1);

		for (i = 0;i < p;i++)
		{

			if (n[i] > 47 && n[i] < 58)
			{
				q = n[i] - 48;
				m = m + q * r;

			}
			else
			{
				if (n[i] > 64 && n[i] < 91)
				{
					q = n[i] - 55;
					m = m + q * r;

				}
				else if (n[i] > 96 && n[i] < 123)
				{
							q = n[i] - 87;
					m = m + q * r;

				}
			}
			r = r / a;
		}

		while ((m / b) > x)
		{
			x = b * x;
			xm = xm + 1;
		}

		y1 = 0;

		for (i = xm;i >= 0;i--)
		{

			k = m % b;
			if (k < 10)
			{
			y[i] = k + 48;
			}
			else
			{
				y[i] = k + 55;
			}
			m = (m - k) / b;


		}
		System.out.printf("%s",y);
	}
}

