package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n; //????
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 100) //????????100?50,20,10,5
		{
			a = n % 100;
			b = (n - a) / 100;
			System.out.print(b);
			System.out.print("\n");
			n = a;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (n >= 50)
		{
			a = n % 50;
			b = (n - a) / 50;
			System.out.print(b);
			System.out.print("\n");
			n = a;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (n >= 20)
		{
			a = n % 20;
			b = (n - a) / 20;
			System.out.print(b);
			System.out.print("\n");
			n = a;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (n >= 10)
		{
			a = n % 10;
			b = (n - a) / 10;
			System.out.print(b);
			System.out.print("\n");
			n = a;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		if (n >= 5)
		{
			a = n % 5;
			b = (n - a) / 5;
			System.out.print(b);
			System.out.print("\n");
			n = a;
		}
		else
		{
			System.out.print("0");
			System.out.print("\n");
		}
		System.out.print(n);
		return 0;

	}

}

