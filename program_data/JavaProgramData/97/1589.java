package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		int p;
		int hun;
		int fif;
		int twenty;
		int ten;
		int five;
		int one;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		hun = n / 100;
		n = n % 100;

		if (n >= 50)
		{
			fif = 1;
			m = n - 50;
		}
		else if (n < 50)
		{
			fif = 0;
			m = n;
		}
		twenty = m / 20;
		m = m % 20;
		if (m >= 10)
		{
			ten = 1;
			p = m - 10;
		}
		else if (m < 10)
		{
			ten = 0;
			p = m;
		}
		if (p >= 5)
		{
			five = 1;
			one = p - 5;
		}
		else if (p < 5)
		{
			five = 0;
			one = p;
		}

		System.out.printf("%d\n%d\n%d\n%d\n%d\n%d\n",hun,fif,twenty,ten,five,one);

	}


}

