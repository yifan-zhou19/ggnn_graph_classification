package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] word = new char[n][41];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word[i] = tempVar2.charAt(0);
			}
		}
		int l = 0;
		for (int i = 0;i < n;i++)
		{
			if (l == 0)
			{
				System.out.printf("%s",word[i]);
				l += String.valueOf(word[i]).length();
			}
			else
			{
				l += String.valueOf(word[i]).length() + 1;
				if (l < 81)
				{
					System.out.printf(" %s",word[i]);
				}
				else
				{
					System.out.print("\n");
					l = 0;
					i--;
				}
			}
		}
	}

}

