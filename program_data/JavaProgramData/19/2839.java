package <missing>;

public class GlobalMembers
{
	public static String s = new String(new char[110]);
	public static String a = new String(new char[110]);
	public static String b = new String(new char[110]);


	public static int Main()
	{
		while (gets(s))
		{
			//printf("[%s]", s);
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

			int i = 0;
			int lena = a.length();
			while (s.charAt(i) != null)
			{
				if (s.charAt(i) == ' ')
				{
					System.out.print(' '), i++;
				}
				else
				{
					int j = 0;
					for (; a.charAt(j); j++)
					{
						if (a.charAt(j) != s.charAt(i + j))
						{
							break;
						}
					}

					if (a.charAt(j) == 0)
					{
						i += lena;
						System.out.printf("%s", b);
					}
					else
					{
						while (s.charAt(i) && s.charAt(i) != ' ')
						{
							System.out.print(s.charAt(i++));
						}
					}
				}
			}

			System.out.println("");
		}
		return 0;
	}

}

