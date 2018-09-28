package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		}
		for (i = n - 1;i > 0;i--)
		{
			System.out.print((a + i));
			System.out.print(" ");
		}
		System.out.print(a);
		System.out.print("\n");
		return 0;
	}


}

