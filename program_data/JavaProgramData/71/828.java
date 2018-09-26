package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int a;
		int b;
		int c;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 c = 0;
			if (a < b)
			{
				for (int j = a;j < b;j++)
				{
						if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
						{
						 c = c + 31;
						}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
							   c = c + 30;
					}
						   else if (j == 2 && (m % 4 == 0 && m % 100 != 0) || m % 400 == 0)
						   {
							   c = c + 29;
						   }
						   else
						   {
							 c = c + 28;
						   }
				}
			}

			else
			{
				for (int j = b;j < a;j++)
				{
						if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
						{
							   c = c + 31;
						}
					else if (j == 4 || j == 6 || j == 9 || j == 11)
					{
								 c = c + 30;
					}
						  else if (j == 2 && (m % 4 == 0 && m % 100 != 0) || m % 400 == 0)
						  {
							  c = c + 29;
						  }
						  else
						  {
							 c = c + 28;
						  }
				}
			}

			if (c % 7 == 0)
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
			return 0;
	}
}

