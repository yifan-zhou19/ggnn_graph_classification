package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[101];
	public static int n = 0;
	public static int i = 0;
	public static char first;
	public static void f()
	{
		char c;
		c = System.in.read();
		if (c != '\n')
		{
			if (i == 0)
			{
				first = c;
			}
			if (c == first)
			{
				a[++n] = i++; //???????????????????????
				f();
			}
			else
			{
				System.out.print(a[n--]);
				System.out.print(" ");
				System.out.print(i++);
				System.out.print("\n");
				f();
			}
		}
	}
	public static int Main()
	{
		f();

		return 0;
	}
}
