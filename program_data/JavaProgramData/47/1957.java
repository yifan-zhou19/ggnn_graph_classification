package <missing>;

public class GlobalMembers
{
	//????
	//??????? 
	//?????12.12.08
	public static int n;
	public static int[] a = new int[100];
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true);
		} //????????????
		for (int i = n - 1;i > 0;i--)
		{
			System.out.print((a + i));
			System.out.print(" ");
		} //????????????
		System.out.print(a);
		return 0;
	}

}

