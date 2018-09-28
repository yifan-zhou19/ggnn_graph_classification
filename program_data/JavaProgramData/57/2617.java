package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		String word = new String(new char[20]);

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
				word = tempVar2.charAt(0);
			}
			m = word.length();
			if (((word.charAt(m - 1) == 'r') && (word.charAt(m - 2) == 'e')) || ((word.charAt(m - 1) == 'y') && (word.charAt(m - 2) == 'l')))
			{
				m -= 2;
			}
			else if ((word.charAt(m - 1) == 'g') && (word.charAt(m - 2) == 'n') && (word.charAt(m - 3) == 'i'))
			{
					m -= 3;
			}

			for (j = 0;j < m;j++)
			{
				System.out.printf("%c",word.charAt(j));
			}
				System.out.print("\n");
		}
		return 0;
	}

}

