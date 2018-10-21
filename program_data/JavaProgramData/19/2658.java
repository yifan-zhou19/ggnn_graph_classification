package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int k;
	public static String a = new String(new char[110]);
	public static String from = new String(new char[110]);
	public static String to = new String(new char[110]);
	public static int Main()
	{
		while (gets(a))
		{
			String temp = new String(new char[110]);
			temp = null;
			int c = 0;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				from = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				to = tempVar2.charAt(0);
			}
			for (int i = 0;a.charAt(i);i++)
			{
				if (a.charAt(i) == ' ')
				{
					if (strcmp(temp,from) == 0)
					{
						System.out.printf("%s ",to);
					}
					else
					{
					System.out.printf("%s ",temp);
					}
					temp = null;
					c = 0;

				}
				else
				{
					temp = tangible.StringFunctions.changeCharacter(temp, c++, a.charAt(i));
					temp = temp.substring(0, c);
				}

			}
		if (strcmp(temp,from) == 0)
		{
						System.out.printf("%s\n",to);
		}
					else
					{
					System.out.printf("%s\n",temp);
					}


		}
		return 0;
	}
}

