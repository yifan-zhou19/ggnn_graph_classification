package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m100;
		int m50;
		int m20;
		int m10;
		int m5;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m100 = n % 100;
		System.out.print((n - m100) / 100);
		System.out.print("\n");
		m50 = m100 % 50;
		System.out.print((m100 - m50) / 50);
		System.out.print("\n");
		m20 = m50 % 20;
		System.out.print((m50 - m20) / 20);
		System.out.print("\n");
		m10 = m20 % 10;
		System.out.print((m20 - m10) / 10);
		System.out.print("\n");
		m5 = m10 % 5;
		System.out.print((m10 - m5) / 5);
		System.out.print("\n");
		System.out.print(m5);
		System.out.print("\n");
		return 0;
	}


}

