package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[91];
		int i;
		for (i = 0 ; i < 91 ; i++)
		{
			a[i] = 0;
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(i);
		a[i - 10] = 1;
		while (n > 0)
		{
			n--;
			int b;
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[b - 10] == 0)
			{
				System.out.print(' ');
				System.out.print(b);
				a[b - 10] = 1;
			}
		}
	}
}

