package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[200]);
		String x = new String(new char[200]);
		String y = new String(new char[200]);
		int i;
		int j;
		int len = 0;
		int[] t = new int[200];
		char c;
		word = new Scanner(System.in).nextLine();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = tempVar2.charAt(0);
		}
		for (i = 0;i < word.length();i++)
		{
			if ((i == 0) || word.charAt(i - 1) == ' ')
			{
			for (j = 0;j < x.length();j++)
			{
				if (word.charAt(i + j) != x.charAt(j))
				{
					break;
				}
				else if ((j == x.length() - 1) && (word.charAt(i + j + 1) == ' ' || word.charAt(i + j + 1) == '\0'))
				{
				   t[i] = 1;
				}
			}
			}
		}
		for (i = 0;i < word.length();i++)
		{
			if (t[i] == 0)
			{
				System.out.printf("%c",word.charAt(i));
			}
			else
			{
				System.out.printf("%s",y);
				i = i + x.length() - 1;
			}
		}
	}
}

