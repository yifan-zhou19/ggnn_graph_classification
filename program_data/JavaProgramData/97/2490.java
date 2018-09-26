package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n >= 100)
		{
			do
			{
			n = n - 100;
			a++;
			}while (n >= 100);
		}
		if (n >= 50)
		{
			do
			{
				n = n - 50;
				b++;
			}while (n >= 50);
		}
		if (n >= 20)
		{
			do
			{
			n = n - 20;
			c++;
			}while (n >= 20);
		}
		if (n >= 10)
		{
			do
			{
			n = n - 10;
			d++;
			}while (n >= 10);
		}
		if (n >= 5)
		{
			do
			{
			n = n - 5;
			e++;
			}while (n >= 5);
		}
		if (n >= 1)
		{
			do
			{
			n = n - 1;
			f++;
			}while (n >= 1);
		}
		System.out.print(a);
		System.out.print("\n");
		System.out.print(b);
		System.out.print("\n");
		System.out.print(c);
		System.out.print("\n");
		System.out.print(d);
		System.out.print("\n");
		System.out.print(e);
		System.out.print("\n");
		System.out.print(f);
		System.out.print("\n");
		return 0;
	}
}

