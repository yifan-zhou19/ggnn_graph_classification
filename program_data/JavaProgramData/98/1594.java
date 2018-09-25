package <missing>;

public class GlobalMembers
{
	//***************************
	//*��&Otilde;&szlig;&pound;&ordm;&sup1;�&frac12;&iexcl;&Ocirc;&ordf; 1300012809 **
	//*&Ecirc;�&frac14;&auml;&pound;&ordm;2013-12-13        **
	//*&Igrave;&acirc;&Auml;&iquest;&pound;&ordm;&Icirc;&Auml;�&Ouml;&Aring;&Aring;�&aelig;          **
	//***************************
	public static int Main()
	{
		int a;
		int n;
		int i = 0;
		int j = 0;
		int k;
		int jishu = 0;
		int cd = 0;
		final String w = "";
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		do
		{
			a = System.in.read();
			if (a != ' ' && a != '\n')
			{
				w.charAt(i)[j] = a;
				j++;
			}
			else
			{
				i++;
				j = 0;
				jishu++;
			}
		}while (jishu < n);

		for (i = 0; i < n; i++)
		{
			if (cd + String.valueOf(w.charAt(i)).length() <= 80)
			{
				if (cd == 0)
				{
					System.out.print(w.charAt(i));
					cd = cd + 1 + String.valueOf(w.charAt(i)).length();
				}
				else
				{
					System.out.print(" ");
					System.out.print(w.charAt(i));
					cd = cd + 1 + String.valueOf(w.charAt(i)).length();
				}
			}
			else
			{
				System.out.print("\n");
				System.out.print(w.charAt(i));
				cd = String.valueOf(w.charAt(i)).length() + 1;
			}
		}
		return 0;
	}
}

