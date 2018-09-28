package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int a;
	   int b;
	   int i;
	   int j;
	   int n;
	   int c;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j <= n;j++)
		{
				 a = 1;
				 b = 1;
				 c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				 for (i = 1;i <= c / 2;i++)
				 {
					 a = a + b;
					 b = a + b;
				 }
			if (c % 2 == 0)
			{
				System.out.print(b - a);
				System.out.print("\n");
			}
			else
			{
				System.out.print(a);
				System.out.print("\n");
			}
		}
	return 0;
	}
}

