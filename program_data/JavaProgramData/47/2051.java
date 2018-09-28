package <missing>;

public class GlobalMembers
{
	public static void run(tangible.RefObject<Integer> p, int n)
	{
		if (n != 1)
		{
			System.out.print(p.argValue);
			System.out.print(" ");
		}
		else
		{
			System.out.print(p.argValue);
			return;
		}
		run(p.argValue-1, n - 1);
		return;
	}
	public static int Main()
	{
		int[] a = new int[110];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		//?????????? 
		run(a + n - 1, n);
		return 0;
	}

}

