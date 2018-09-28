package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		e = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int a = 3;
		int b;
		while (a <= e / 2)
		{

		int t = 3;
		while (t < a)
		{
			int m = a % t;
			if (m == 0)
			{
				break;
			}
			t += 2;
		}
		int q = 3;
		while (q < e - a)
		{
			int n = (e - a) % q;
			if (n == 0)
			{
				break;
			}
			q += 2;
		}
		if (t == a && q == e - a)
		{
			System.out.print(a);
			System.out.print(" ");
			System.out.print(e - a);
			System.out.print("\n");
		}
		a += 2;
		}
		return 0;
	}

}

