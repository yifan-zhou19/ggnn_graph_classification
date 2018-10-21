package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int w;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		w = Integer.parseInt(tempVar);
	}
	int[] a = new int[365];
	for (i = 0;i < 365;i++,w++)
	{
		a[i] = w % 7;
	}
	if (a[12] == 5)
	{
		System.out.print("1\n");
	}
	if (a[43] == 5)
	{
		System.out.print("2\n");
	}
	if (a[71] == 5)
	{
		System.out.print("3\n");
	}
	if (a[102] == 5)
	{
		System.out.print("4\n");
	}
	if (a[132] == 5)
	{
		System.out.print("5\n");
	}
	if (a[163] == 5)
	{
		System.out.print("6\n");
	}
	if (a[193] == 5)
	{
		System.out.print("7\n");
	}
	if (a[224] == 5)
	{
		System.out.print("8\n");
	}
	if (a[255] == 5)
	{
		System.out.print("9\n");
	}
	if (a[285] == 5)
	{
		System.out.print("10\n");
	}
	if (a[316] == 5)
	{
		System.out.print("11\n");
	}
	if (a[346] == 5)
	{
		System.out.print("12\n");
	}

	return 0;
	}
}

