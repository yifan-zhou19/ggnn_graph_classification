package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[52]);
		String b = new String(new char[52]);
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = tempVar2.charAt(0);
		}
		for (int c = 0;c < b.length();c++)
		{
				if (a.charAt(0) == b.charAt(c))
				{
					for (int n = 0;n < a.length();n++)
					{
						if (a.charAt(n) == b.charAt(c + n))
						{
							i++;
						}
					}
				if (i == a.length())
				{
					System.out.printf("%d",c);
				}
				}

		}
		return 0;
	}

}

