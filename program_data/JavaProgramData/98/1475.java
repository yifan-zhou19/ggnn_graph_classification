package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int len = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		char[][] word = new char[1000][40];
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
			len += String.valueOf(word[i]).length();
			if (len <= 80)
			{
				System.out.printf("%s",word[i]);
				len++;
				if (i != n - 1 && len + String.valueOf(word[i + 1]).length() <= 80)
				{
					System.out.print(" ");
				}
			}
			else
			{
				System.out.printf("\n%s ",word[i]);
				len = String.valueOf(word[i]).length() + 1;
			}
		}
		return 0;
	}

}

