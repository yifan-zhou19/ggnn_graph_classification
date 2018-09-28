package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int n = 0;
		int[] a = new int[100];
		int[] b = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;i < n;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 0;i < n;i++)
	{
		b[i] = a[n - i - 1];
	}
	for (i = 0;i < n;i++)
	{
		if (i < n - 1)
		{
			System.out.print(b[i]);
			System.out.print(" ");
		}
		else
		{
			System.out.print(b[i]);
			System.out.print("\n");
		}
	}
	System.in.read();
	System.in.read();
	return 0;
	}

}

