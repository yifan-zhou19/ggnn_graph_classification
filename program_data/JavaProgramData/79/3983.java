package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int p = 0;
		int[] n = new int[300];
		int[] m = new int[300];

		do
		{
			n[p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m[p] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p++;
		}while (n[p - 1] != 0 && m[p - 1] != 0);
		for (int q = 0;q < p - 1;q++)
		{
				a = 0;
				for (int i = 2;i <= (n[q]);i++)
				{
					a = (a + m[q]) % i;
				}
				System.out.print(a + 1);
				System.out.print("\n");
		}
		return 0;
	}

}

