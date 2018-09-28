package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //???????n?????????a,b,c,d,e?????result???
		int a;
		int b;
		int c;
		int d;
		int e;
		int result;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		e = n % 10;
		d = (n % 100 - e) / 10;
		c = (n % 1000 - d * 10 - e) / 100;
		b = (n % 10000 - c * 100 - d * 10 - e) / 1000;
		a = (n - n % 10000) / 10000; //????n?????????
		if (n > 10000)
		{
			result = e * 10000 + d * 1000 + c * 100 + b * 10 + a;
		}
		else if (n > 1000)
		{
			result = e * 1000 + d * 100 + c * 10 + b;
		}
		else if (n > 100)
		{
			result = e * 100 + d * 10 + c;
		}
		else if (n > 10)
		{
			result = e * 10 + d;
		}
		else
		{
			result = e; //????n???????????
		}
		System.out.print(result);
		System.out.print("\n");
		return 0;
	}
}

