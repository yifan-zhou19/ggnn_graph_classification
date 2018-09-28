package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????   **
	//*????? 1200012845 **
	//*???2012.10.22  **
	//********************************
	public static int Main()
	{
		int m; //j?a????i?b???
		int a;
		int b;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3; a <= (m / 2); a = a + 2)
		{

			int a1 = (int) Math.sqrt(a);
			for (j = 2; j <= a1; j++)
			{
				if (a % j == 0)
				{
					break; //?a??j??????????????
				}
			}
			if (j == (a1 + 1)) //?j=a1+1?a???j???????a???
			{
				for (b = a; b <= m; b = b + 2)
				{
					int b1 = (int) Math.sqrt(b);
					for (i = 2; i <= b1; i++)
					{
						if (b % i == 0)
						{
							break; //?b??i??????????????
						}
					}
					if ((i == (b1 + 1)) && (a + b == m)) //?i=b1+1?b???i???????b???
					{
						System.out.print(a);
						System.out.print(" ");
						System.out.print(b);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}

