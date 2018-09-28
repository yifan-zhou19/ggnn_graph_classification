package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		char[][] word = new char[1000][45];

		for (i = 0; i < n; i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				word[i] = tempVar.charAt(0);
			}
		}
		int sumc = 0;
		for (i = 0; i < n; i++)
		{
			sumc += String.valueOf(word[i]).length() + 1;
			if (sumc + String.valueOf(word[i + 1]).length() > 80)
			{
				System.out.print(word[i]);
				System.out.print("\n");
				sumc = 0;
			}
			else if (sumc == 81)
			{
				System.out.print(word[i]);
				System.out.print("\n");
				sumc = 0;
			}
			else if (i == n - 1)
			{
				System.out.print(word[i]);
			}
			else
			{
				System.out.print(word[i]);
				System.out.print(" ");
			}
		}
		System.out.print("\n");
		return 0;
	}

}

