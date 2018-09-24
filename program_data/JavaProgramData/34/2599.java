package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int[] a = new int[100];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a[0] = n;
	for (i = 0;;i++)
	{
		if (n - (n / 2) * 2 == 1 && n > 2)
		{
			a[i] = n * 3 + 1;
			System.out.print(n);
			System.out.print("*3+1=");
			System.out.print(a[i]);
			System.out.print("\n");
		}
		if (n - (n / 2) * 2 == 0)
		{
			a[i] = n / 2;
			System.out.print(n);
			System.out.print("/2=");
			System.out.print(a[i]);
			System.out.print("\n");
		}
		n = a[i];
		if (a[i] == 1)
		{
			break;
		}

	}
	System.out.print("End");
	System.out.print("\n");
	return 0;
	}
}

