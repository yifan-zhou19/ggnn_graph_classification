package <missing>;

public class GlobalMembers
{
	public static int Main() //???
	{
		int A; //????????
		int a;
		int b;
		int c;
		int d;
		int e;
		A = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = A / 10000; //????
		b = A / 1000 - a * 10;
		c = A / 100 - a * 100 - b * 10;
		d = A / 10 - a * 1000 - b * 100 - c * 10;
		e = A % 10;
		if (a == 0) //??????????????
		{
			if (b == 0)
			{
				if (c == 0)
				{
					if (d == 0)
					{
						System.out.print(e);
						System.out.print("\n");
					}
					else
					{
						System.out.print(e);
						System.out.print(d);
						System.out.print("\n");
					}
				}
				else
				{
					System.out.print(e);
					System.out.print(d);
					System.out.print(c);
					System.out.print("\n");
				}
			}
			else
			{
				System.out.print(e);
				System.out.print(d);
				System.out.print(c);
				System.out.print(b);
				System.out.print("\n");
			}
		}
		else
		{
			System.out.print(e);
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
		}
		return 0;
	} //????
}

