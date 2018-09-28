package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int a = 2;
		int b = 1;
		int c;
		double sum = 2.0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 1;j < n;j++)
			{
				c = b;
				b = a;
				a = a + c;
				sum = sum + a * 1.0 / b;
			}
			System.out.printf("%.3f", sum);
			System.out.printf("%.3f", "\n");
			a = 2,b = 1,sum = 2.0;
		}
		return 0;
	}
}

