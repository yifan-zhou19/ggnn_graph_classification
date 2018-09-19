package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int[] a = new int[10];

		int i;
	while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
	{
	if (n == 0)
	{
	 System.out.print(0);
	}
	for (i = 1;i <= 5 && n != 0;i++)
	{
		a[i] = n % 10;
		n = n / 10;
		System.out.print(a[i]);
	}
	System.out.print("\n");
	}



		return 0;
	}



}

