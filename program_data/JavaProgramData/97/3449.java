package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[6];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[0] = n / 100;
	n %= 100;
	a[1] = n / 50;
	n %= 50;
	a[2] = n / 20;
	n %= 20;
	a[3] = n / 10;
	n %= 10;
	a[4] = n / 5;
	n %= 5;
	a[5] = n % 5;
	for (i = 0;i < 6;i++)
	{
	System.out.print(a[i]);
	System.out.print("\n");
	}
	return 0;
	}
}

