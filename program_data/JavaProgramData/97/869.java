package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m1 = 0;
		int m2 = 0;
		int m3 = 0;
		int m4 = 0;
		int m5 = 0;
		int m6 = 0;
		int m7 = 0;
		int m8 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		m1 = n / 100;
		m7 = n / 10 - m1 * 10;
		m8 = n - m7 * 10 - m1 * 100;
		m2 = m7 / 5;
		m3 = (m7 - 5 * m2) / 2;
		m4 = (m7 - 5 * m2 - 2 * m3);
		m5 = m8 / 5;
		m6 = (m8 - 5 * m5);
		System.out.printf("%d\n",m1);
		System.out.printf("%d\n",m2);
		System.out.printf("%d\n",m3);
		System.out.printf("%d\n",m4);
		System.out.printf("%d\n",m5);
		System.out.printf("%d\n",m6);

		return 0;
	}

}

