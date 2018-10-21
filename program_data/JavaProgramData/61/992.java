package <missing>;

public class GlobalMembers
{
	public static int F(int m)
	{
	if (m == 1 || m == 2)
	{
		return 1;
	}
	else
	{
		return F(m - 1) + F(m - 2);
	}
	}

	public static int Main()
	{
		int Z;
		int[] a = new int[23];
		int i;
	Z = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= Z;i++)
	{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (i = 1;i <= Z;i++)
	{
		System.out.print(F(a[i]));
		System.out.print("\n");
	}

	 return 0;
	}

}

