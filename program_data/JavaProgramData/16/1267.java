package <missing>;

public class GlobalMembers
{
	//???????
	//??????
	//???10.31
	public static int Main()
	{
	int n;
	int[] a = new int[4];
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (n < 10)
	{
	System.out.print(n);
	System.out.print("\n");
	}
	else if (n >= 10 && n < 100)
	{
		a[1] = n % 10;
	a[2] = (n / 10) % 10;
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print("\n");
	}
	else if (n >= 100 && n < 1000)
	{
		a[1] = n % 10;
	a[2] = (n / 10) % 10;
	a[3] = (n / 100) % 10;
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print(a[3]);
	System.out.print("\n");
	}

	else if (n >= 1000 && n < 10000)
	{
		a[1] = n % 10;
	a[2] = (n / 10) % 10;
	a[3] = (n / 100) % 10;
	a[4] = (n / 1000) % 10;
	System.out.print(a[1]);
	System.out.print(a[2]);
	System.out.print(a[3]);
	System.out.print(a[4]);
	System.out.print("\n");
	}

	else if (n = 10000)
	{
	System.out.print("00001");
	System.out.print("\n");
	}
	return 0;
	}




}

