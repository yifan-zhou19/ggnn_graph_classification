package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] zz = {100, 50, 20, 10, 5, 1};
		int[] z = new int[6];
		for (i = 0 ; i < 6 ;i++)
		{
			z[i] = n / zz[i];
			n -= z[i] * zz[i];
		}
		for (i = 0 ; i < 6; i++)
		{
			System.out.print(z[i]);
			System.out.print("\n");
		}
	}
}

