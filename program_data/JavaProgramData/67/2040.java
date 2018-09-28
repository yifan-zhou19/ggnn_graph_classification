package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		float m;
		float n;
		float r;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		r = n / m;
		for (;a > 1;a--)
		{
			m = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			n = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
			System.out.print((n / m - r > 0.05F?"better":(r - n / m > 0.05F?"worse":"same")));
			System.out.print("\n");
		}
		return EXIT_SUCCESS;
	}

}

