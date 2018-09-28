package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static void nixu(int[] a)
	{
		for (i = n - 1;i > 0;i--)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[0]);
	} //????????????
	public static int Main()
	{
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //????
		nixu(a); //????
		return 0;
	}


}

