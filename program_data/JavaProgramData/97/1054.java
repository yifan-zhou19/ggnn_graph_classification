package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;(n - 100 * i) >= 0;i++)
		{
		}
		i = i - 1;
		System.out.print(i);
		System.out.print("\n");
		n = n - 100 * i;
		for (i = 0;(n - 50 * i) >= 0;i++)
		{
		}
		i = i - 1;
		System.out.print(i);
		System.out.print("\n");
		n = n - 50 * i;
	   for (i = 0;(n - 20 * i) >= 0;i++)
	   {
	   }
		i = i - 1;
		System.out.print(i);
		System.out.print("\n");
		n = n - 20 * i;
	   for (i = 0;(n - 10 * i) >= 0;i++)
	   {
	   }
		i = i - 1;
		System.out.print(i);
		System.out.print("\n");
		n = n - 10 * i;
		for (i = 0;(n - 5 * i) >= 0;i++)
		{
		}
		i = i - 1;
		System.out.print(i);
		System.out.print("\n");
		n = n - 5 * i;
		System.out.print(n);

		return 0;
	}
}

