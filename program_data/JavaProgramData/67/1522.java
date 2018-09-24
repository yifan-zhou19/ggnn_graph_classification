package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int[] b = new int[100];
		int q;
		double x;
		double y;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		x = b[1] / (1.0 * a[1]);
		for (i = 2;i <= n;i++)
		{
						 a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
						 y = b[i] / (1.0 * a[i]);
						 if (x - y > 0.05)
						 {
							 System.out.print("worse");
							 System.out.print("\n");
						 }
						 else if (y - x > 0.05)
						 {
							 System.out.print("better");
							 System.out.print("\n");
						 }
						 else
						 {
							 System.out.print("same");
							 System.out.print("\n");
						 }
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

