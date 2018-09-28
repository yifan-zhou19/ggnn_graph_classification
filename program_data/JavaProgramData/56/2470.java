package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{ //?????
		int x; //??x,y,a,b,c,d,e?????
		int y;
		int a;
		int b;
		int c;
		int d;
		int e;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (x < 10)
		{
			System.out.print(x);
			System.out.print("\n");
		}
		else if (x < 100) //?x????????????
		{
			a = x % 10;
			b = (x - a) / 10;
			y = a * 10 + b;
			System.out.print(y);
			System.out.print("\n");
		}
		else if (x < 1000) //?x????????????
		{
			a = x % 10;
			b = ((x - a) / 10) % 10;
			c = Math.floor(x / 100);
			y = a * 100 + b * 10 + c;
			System.out.print(y);
			System.out.print("\n");
		}
		else if (x < 10000) //?x????????????
		{
			a = x % 10;
			b = ((x - a) / 10) % 10;
			d = Math.floor(x / 1000);
			c = Math.floor(x / 100) - 10 * d;
			y = a * 1000 + b * 100 + c * 10 + d;
			System.out.print(y);
			System.out.print("\n");
		}
		else if (x < 100000) //?x????????????
		{
			a = x % 10;
			b = ((x - a) / 10) % 10;
			c = ((x - a - 10 * b) / 100) % 10;
			e = Math.floor(x / 10000);
			d = Math.floor(x / 1000) - 10 * e;
			y = a * 10000 + b * 1000 + c * 100 + d * 10 + e;
			System.out.print(y);
			System.out.print("\n");
		}
		return 0;
	} //?????
}

