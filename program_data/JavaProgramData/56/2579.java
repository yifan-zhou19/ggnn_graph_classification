package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int p1; //????????????????????
		int p2;
		int p3;
		int p4;
		int p5;
		int n;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 10000) //????5??
		{
			p1 = n / 10000; //????
			p2 = (n - 10000 * p1) / 1000; //????
			p3 = (n - 10000 * p1 - 1000 * p2) / 100; //????
			p4 = (n - 10000 * p1 - 1000 * p2 - 100 * p3) / 10; //????
			p5 = n - 10000 * p1 - 1000 * p2 - 100 * p3 - 10 * p4; //????
			x = p5 * 10000 + p4 * 1000 + p3 * 100 + p2 * 10 + p1; //?????
		}
		else if (n >= 1000) //???????
		{
			p1 = n / 1000;
			p2 = (n - 1000 * p1) / 100;
			p3 = (n - 1000 * p1 - 100 * p2) / 10;
			p4 = n - 1000 * p1 - 100 * p2 - 10 * p3;
			x = p4 * 1000 + p3 * 100 + p2 * 10 + p1;
		}
		else if (n >= 100) //???????
		{
			p1 = n / 100;
			p2 = (n - 100 * p1) / 10;
			p3 = n - 100 * p1 - 10 * p2;
			x = p3 * 100 + p2 * 10 + p1;
		}
		else if (n >= 10) //???????
		{
			p1 = n / 10;
			p2 = n - 10 * p1;
			x = p2 * 10 + p1;
		}
		else //???????
		{
			x = n;
		}
		System.out.print(x);
		return 0;
	}
}

