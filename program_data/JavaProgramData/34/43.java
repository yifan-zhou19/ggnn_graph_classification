package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 1)
		{
			System.out.print("End");
			System.out.print("\n");
		}
		else

		{
			for (i = 0; ; i++)
			{
			  if (n % 2 == 0)
			  {
				  a = n / 2;
				  System.out.print(n);
				  System.out.print("/");
				  System.out.print(2);
				  System.out.print("=");
				  System.out.print(a);
				  System.out.print("\n");
				  n = n / 2;
			  }
			  else
			  {
				  b = 3 * n + 1;
				  System.out.print(n);
				  System.out.print("*");
				  System.out.print(3);
				  System.out.print("+");
				  System.out.print(1);
				  System.out.print("=");
				  System.out.print(b);
				  System.out.print("\n");
				  n = 3 * n + 1;
			  }
			  if (n == 1)
			  {
				  break;
			  }
			}


			System.out.print("End");
			System.out.print("\n");
		}
			return 0;
	}
}

