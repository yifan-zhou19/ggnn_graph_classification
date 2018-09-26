package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????   **
	//*????? 1300012845 **
	//*???2013.10.23  **
	//********************************
	public static int Main() //???
	{
		int i; //??????i?k
		int j;
		int k;
		int m;
		int s;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i += 2) //?i?????m/2???
		{
			s = Math.sqrt(i);
			for (j = 2; j <= s;j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == s + 1) //??????????i?????
			{
				k = m - i;
				s = Math.sqrt(k);
				for (j = 2; j <= s;j++) //??k?????
				{
					if (k % j == 0)
					{
						break;
					}
				}
				if (j == s + 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(k);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

