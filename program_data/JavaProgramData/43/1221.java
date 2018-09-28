package <missing>;

public class GlobalMembers
{
	//***************************** 
	//* &sup3;&Igrave;&ETH;�&Atilde;&ucirc;&pound;&ordm; &cedil;&ccedil;&micro;&Acirc;�&Iacute;&ordm;&Otilde;&sup2;&Acirc;&Iuml;&euml;    ** 
	//* ��&Otilde;&szlig;&pound;&ordm; &Agrave;&icirc;&Otilde;&aelig;&Ograve;&raquo; 1300012948 ** 
	//* &Ecirc;�&frac14;&auml;&pound;&ordm; 2013.10.24        ** 
	//*****************************
	public static int Main()
	{
		int m;
		int a;
		int b;
		int k;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 3; i <= (m / 2); i += 2)
		{
				a = (int)Math.sqrt(i * 1.0);
				for (k = 2; k <= a + 1; k++)
				{
						if (i % k == 0)
						{
						break;
						}
						else
						{
						continue;
						}
				}
				if (k > (a + 1))
				{
					 b = (int)Math.sqrt((m - i) * 1.0);
					 for (n = 2; n <= b + 1; n++)
					 {
							 if ((m - i) % n == 0)
							 {
							 break;
							 }
							 else
							 {
							 continue;
							 }
					 }
					 if (n > (b + 1))
					 {
					 System.out.print(i);
					 System.out.print(" ");
					 System.out.print((m - i));
					 System.out.print("\n");
					 }
				}
		}
		return 0;
	}
}

