package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int[] a = new int[20];
		int[] b = new int[20];
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < x;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0;i < y;i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		} //??????
		sort(a,a + x); //?a????
		sort(b,b + y); //?b????
		System.out.print(a[0]);
		for (i = 1;i < x;i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}
		for (i = 0;i < y;i++)
		{
			System.out.print(" ");
			System.out.print(b[i]);
		} //???????
		return 0;
	}
}

