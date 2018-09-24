package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 1;
		int a;
		int b;
		int c;
		int d;
		int e;
		char ch;
		a = b = c = d = e = -1;
		while ((ch = System.in.read()) != '\n')
		{
			switch (i)
			{
			case 1:
				a = ch - '0';
				break;
			case 2:
				b = ch - '0';
				break;
			case 3:
				c = ch - '0';
				break;
			case 4:
				d = ch - '0';
				break;
			case 5:
				e = ch - '0';
				break;
			}
			i++;
		}
			if (e == -1 && d != -1)
			{
			System.out.print(d);
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
			}
			else
			{
			if (e == -1 && d == -1 && c != -1)
			{
			System.out.print(c);
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
			}
			else
			{
			if (e == -1 && d == -1 && c == -1 && b != -1)
			{
			System.out.print(b);
			System.out.print(a);
			System.out.print("\n");
			}
			else
			{
			if (e == -1 && d == -1 && c == -1 && b == -1 && a != -1)
			{
			System.out.print(a);
			System.out.print("\n");
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
			}
			}
			}

		return 0;
	}

}
