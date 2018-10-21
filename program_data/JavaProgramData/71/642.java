package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a % 4 != 0 || (a % 100 == 0 & a % 400 != 0))
			{
				if (b == 3 & c == 11)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 4 & c == 7)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 9 & c == 12)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 7 & c == 4)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 12 & c == 9)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 11 & c == 3)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 1 & c == 10)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 10 & c == 1)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 2 & c == 11)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 11 & c == 2)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 3 & c == 2)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 2 & c == 3)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
			else
			{
				if (b == 3 & c == 11)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 4 & c == 7)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 9 & c == 12)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 7 & c == 4)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 12 & c == 9)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 11 & c == 3)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 1 & c == 4)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 1 & c == 7)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 7 & c == 1)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 4 & c == 1)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 2 & c == 8)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else if (b == 8 & c == 2)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

