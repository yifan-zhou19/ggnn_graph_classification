package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = {100, 50, 20, 10, 5, 1};
		int[] b = new int[6];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < 6; i++)
		{
			if (n >= a[i])
			{
				b[i] = n / a[i];
				n = n - b[i] * a[i];
			}
			else
			{
				continue;
			}
		}
		for (i = 0; i < 6; i++)
		{
			if (i < 5)
			{
				System.out.print(b[i]);
				System.out.print("\n");
			}
			if (i == 5)
			{
				System.out.print(b[i]);
			}
		}
		return 0;
	}

}

