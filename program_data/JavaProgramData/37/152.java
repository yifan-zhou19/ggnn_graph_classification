package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int l;
		int j;
		int m = 0;
		String c = new String(new char[100000]);
		String a = new String(new char[26]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 0;i < t;i++)
		{
			m = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			l = c.length();
			for (j = 0;j < 26;j++)
			{
				a = a.substring(0, j);
			}
			for (j = 0;j < l;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, c.charAt(j) - 'a', a.charAt(c.charAt(j) - 'a') + 1);
			}

			for (j = 0;j < l;j++)
			{
				if (a.charAt((c.charAt(j) - 'a')) == 1)
				{
					System.out.printf("%c\n",c.charAt(j));
					m++;
					break;
				}
			}
			if (m == 0)
			{
				System.out.print("no\n");
			}
		}
	}
}

