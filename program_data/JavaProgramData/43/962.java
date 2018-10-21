package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		double m;
		m = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		a = 0.5 * (m);
		for (b = 3;b <= a; b++)
		{
			for (int d = b - 1;d >= 2; d--)
			{
				if (b % d == 0)
				{
					break;
				}
				if (d == 2)
				{
					 int e;
					 e = m - b;
					 for (int f = e - 1;f >= 2; f--)
					 {
						 if (e % f == 0)
						 {
							 break;
						 }

						 if (f == 2)
						 {
							 System.out.print(b);
							 System.out.print(" ");
							 System.out.print(e);
							 System.out.print("\n");
						 }
					 }
				}
			}
		}
		return 0;
	}





}

