package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int num = 0;
		int linelen = 0;
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;++i)
		{
			a = ConsoleInput.readToWhiteSpace(true).charAt(0);
			num = a.length(); //&Ecirc;&auml;&Egrave;&euml;&Ograve;&raquo;&cedil;&ouml;&micro;&yen;&acute;&Ecirc;&pound;&not;&frac14;&Ccedil;&Acirc;&frac14;&sup3;�&para;&Egrave;
			if (num + 1 + linelen > 80) //&Egrave;&ccedil;&sup1;&ucirc;&Otilde;&acirc;&cedil;&ouml;&micro;&yen;&acute;&Ecirc;&micro;&Auml;&sup3;�&para;&Egrave;&frac14;&Oacute;&Eacute;&Iuml;&Ccedil;�&Atilde;&aelig;�&Ouml;�&ucirc;&acute;&reg;&sup3;�&para;&Egrave;&acute;�&Oacute;&Uacute;80&micro;&Auml;&raquo;�
			{
				System.out.print("\n");
				System.out.print(a);
				linelen = num; //&sup2;&cent;&Ccedil;&Ograve;&Ouml;&Oslash;&Ouml;&Atilde;&Iuml;&Acirc;&Ograve;&raquo;&ETH;&ETH;&micro;&yen;&acute;&Ecirc;&sup3;�&para;&Egrave;
			}
			else
			{
				if (linelen != 0)
				{
					linelen += num + 1;
					System.out.print(" ");
				}
				else
				{
					linelen = num;
				}
				System.out.print(a);
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}

}

