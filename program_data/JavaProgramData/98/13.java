package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int l;
		int c = 0;
		char[][] word = new char[100000][20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i <= n - 1 ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0 ; i <= n - 1; i++)
		{
			System.out.printf("%s", word[i]);
			l = String.valueOf(word[i]).length();
			j = String.valueOf(word[i + 1]).length();
			c = c + l + 1;
			//	printf("\n%d %d %d" , l , j , c);
			if (c + j > 80)
			{
				System.out.print("\n");
				c = 0;
			}
			else if (i == n - 1)
			{
				System.out.print("\n");
			}
			else
			{
				System.out.print(" ");
			}
		}

		return (0);
	}

}

