package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[102];
	public static int Main()
	{
		int[] p = a;
		int n;
		int m;
		int temp;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		p[i] = ConsoleInput.readToWhiteSpace(true);
		}
		while (m-- != 0)
		{
			temp = p[n - 1];
			for (int i = n - 1;i > 0;i--)
			{
			 p[i] = (p + i - 1);
			}
			p[0] = temp;
		}
		for (int i = 0;i < n - 1;i++)
		{
		System.out.print((p + i));
		System.out.print(" ");
		}
		System.out.print((p + n - 1));
		System.out.print("\n");
	}




}

