package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		//cout<<(a<b)<<endl;
		for (a = 1;a <= 3;a++)
		{
		for (b = 1;b <= 3;b++)
		{
		for (c = 1;c <= 3;c++)
		{
			if (a == b || a == c || b == c)
			{
				continue;
			}
			else
			{
				if (a + (b > a) + (c == a) == b + (a > b) + (a > c) && b + (a > b) + (a > c) == c + (c > b) + (b > a))
				{
					if (a == 3)
					{
						if (b == 2)
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
						else
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
					}
					else if (b == 3)
					{
						if (a == 2)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						else
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
					}
					else
					{
						if (b == 2)
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
						else
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
					}
				}
			}


		}
		}
		}
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

