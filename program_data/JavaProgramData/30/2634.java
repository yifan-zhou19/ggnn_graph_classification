package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int a;
		int b;
		int c;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= n;k++)
		{
				a = k % 7;
				b = (k + 3) % 10;
				c = k / 10;
		if (a != 0 && b != 0 && c != 7)
		{
		sum = sum + k * k;
		}
		}
	System.out.print(sum);
	System.out.print("\n");
	return 0;
	}
}

