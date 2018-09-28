package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		char[][] word = new char[10000][40];
		int i;
		int n;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (q != 0)
			{
				q = q + 1 + String.valueOf(word[i]).length();
			}
			if (q == 0)
			{
				q = q + String.valueOf(word[i]).length();
			}

			if (q - String.valueOf(word[i]).length() == 0)
			{
				System.out.printf("%s",word[i]);
			}
			if (q - String.valueOf(word[i]).length() != 0 && q <= 80)
			{
				System.out.printf(" %s",word[i]);
			}
			if (q > 80)
			{
				System.out.print("\n");
				System.out.printf("%s",word[i]);
				q = String.valueOf(word[i]).length();
			}
		}
	}
}

