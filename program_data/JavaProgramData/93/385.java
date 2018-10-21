package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int a;
		int b;
		int c;
		char n;
		int i;
		int j;
		int k;
		i = 3;
		j = 5;
		k = 7;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = m % 3;
		b = m % 5;
		c = m % 7;
		if (a == 0 && b == 0 && c == 0)
		{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(j);
			System.out.print(" ");
			System.out.print(k);
		}
		else if (a == 0 && b == 0 && c != 0)
		{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(j);
		}
		else if (a == 0 && b != 0 && c == 0)
		{
			System.out.print(i);
			System.out.print(" ");
			System.out.print(k);
		}
		else if (a != 0 && b == 0 && c == 0)
		{
			System.out.print(j);
			System.out.print(" ");
			System.out.print(k);
		}
		else if (a == 0 && b != 0 && c != 0)
		{
			System.out.print(i);
		}
		else if (a != 0 && b == 0 && c != 0)
		{
			System.out.print(j);
		}
		else if (a != 0 && b != 0 && c == 0)
		{
			System.out.print(k);
		}
		else
		{
			System.out.print("n");
			System.out.print("\n");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		return 0;

	}
}

