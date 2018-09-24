package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		int[] letterN = new int[52];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		int len = s.length();
		int i;
		int exist = 0;
		for (i = 0; i < len; i++)
		{
			if (s.charAt(i) >= 65 && s.charAt(i) <= 90)
			{
				if (exist == 0)
				{
					exist = 1;
				}
				letterN[s.charAt(i) - 65]++;
			}
			else if (s.charAt(i) >= 97 && s.charAt(i) <= 122)
			{
				if (exist == 0)
				{
					exist = 1;
				}
				letterN[s.charAt(i) - 71]++;
			}
		}

		if (exist == 0)
		{
			System.out.print("No\n");
		}
		else
		{
			for (i = 0; i < 26; i++)
			{
				if (letterN[i] > 0)
				{
					System.out.printf("%c=%d\n",i + 65,letterN[i]);
				}
			}
			for (i = 26; i < 52; i++)
			{
				if (letterN[i] > 0)
				{
					System.out.printf("%c=%d\n",i + 71,letterN[i]);
				}
			}
		}

		return 0;
	}

}

