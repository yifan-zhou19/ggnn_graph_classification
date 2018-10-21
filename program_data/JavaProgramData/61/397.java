package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int a;
	int r = 1;
	int b;
	int c;
	int d;
	int z;
	int temp;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (r = 1;r <= n;r++)
	{
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = c = 1;
		for (temp = 1;temp <= a;temp++)
		{
		z = b;
		d = b + c;
		b = c;
		c = d;
		}
		System.out.print(z);
		System.out.print("\n");
	}

	return 0;
	}


}

