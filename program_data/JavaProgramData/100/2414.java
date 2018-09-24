package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String data = new String(new char[301]);
		int[] big = new int[26];
		int[] sma = new int[26];
		int sign = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			data = tempVar.charAt(0);
		}
		for (i = 0;data.charAt(i) != '\0';i++)
		{
			if (data.charAt(i) <= 'Z' && data.charAt(i) >= 'A')
			{
				big[data.charAt(i) - 'A'] += 1;
			}
			if (data.charAt(i) <= 'z' && data.charAt(i) >= 'a')
			{
				sma[data.charAt(i) - 'a'] += 1;
			}
		}

		for (i = 0;i < 26;i++)
		{
			if (big[i] != 0)
			{
				sign += 1;
			}
			if (sma[i] != 0)
			{
				sign += 1;
			}
		}
		if (sign == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 0;i < 26;i++)
			{
				if (big[i] != 0)
				{
					System.out.printf("%c=%d\n", 'A' + i, big[i]);
				}
			}
			for (i = 0;i < 26;i++)
			{
				if (sma[i] != 0)
				{
					System.out.printf("%c=%d\n", 'a' + i, sma[i]);
				}
			}
		}
		return 0;
	}
}

