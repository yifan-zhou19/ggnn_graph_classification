package <missing>;

public class GlobalMembers
{
	//******************************
	//* &sup3;&Igrave;&ETH;�&Atilde;&ucirc;&pound;&ordm;&Otilde;&yacute;&sup3;&pound;&Ntilde;&ordf;&Ntilde;&sup1;          ** 
	//* ��&Otilde;&szlig;&pound;&ordm;&Agrave;&icirc;&Otilde;&aelig;&Ograve;&raquo; 1300012948   ** 
	//* &Ecirc;�&frac14;&auml;&pound;&ordm; 2013.10.24         ** 
	//******************************
	public static int Main()
	{
		int n;
		int shou;
		int shu;
		int p = 0;
		int q = 0;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
				shou = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				shu = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				k = ((shou >= 90) && (shou <= 140) && (shu >= 60) && (shu <= 90));
				q += k;
				if (k == 0)
				{
					 q = 0;
					 continue;
				}
				p = p >= q != 0 ? p : q;

		}
		System.out.print(p);
		System.out.print("\n");
		return 0;
	}
}

