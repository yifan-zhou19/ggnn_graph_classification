package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] a = new int[110];
		int[] p = a; //????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = n - 1; i > 0; i--)
		{
			System.out.print((p + i));
			System.out.print(' ');
		}
		System.out.print(p);
		System.out.print("\n");
		return 0; //main???????0
	}
}

