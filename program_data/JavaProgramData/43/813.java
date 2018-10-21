package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int a;
		int b;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = 3;
		b = m - 3;
		do
		{
			for (i = 2; i < a; i++)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			for (j = 2; j < b; j++)
			{
				if (b % j == 0)
				{
					break;
				}
			}
			if (i == a && j == b)
			{
				System.out.print(a);
				System.out.print(" ");
				System.out.print(b);
				System.out.print("\n");
			}
			a = a + 1;
			b = m - a;
		}while (a <= b);
		return 0;
	}


}

