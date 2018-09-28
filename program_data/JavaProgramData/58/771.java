package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a;
		int i;
		int j;
		int n;
		int b = 1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 1;i <= n;i++)
		{
			b = 1;
						 for (j = 1;j <= 88;j++)
						 {
							a = System.in.read();
						 if (a == '\n')
						 {
							 break;
						 }
						 if (j == 1)
						 {
								 if ((64 < a && a < 91) || a == 95 || (96 < a && a < 123))
								 {
								 }
								 else
								 {
									 b = 0;
								 }
						 }
						 else
						 {
							 if ((64 < a && a < 91) || a == 95 || (96 < a && a < 123) || (47 < a && a < 58))
							 {
							 }
						 else
						 {
							 b = 0;
						 }
						 }
						 }
		if (b == 1)
		{
			System.out.print(1);
			System.out.print("\n");
		}
		else
		{
			System.out.print(0);
			System.out.print("\n");
		}
		}


		return 0;
	}

}

