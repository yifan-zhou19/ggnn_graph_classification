package <missing>;

public class GlobalMembers
{
	//***********************************************************************
	//* ��&Ograve;&micro;&pound;&ordm;&Auml;&Uuml;�&raquo;3,5,7&Otilde;&ucirc;&sup3;&yacute;&micro;&Auml;&Ecirc;&yacute;                                             *
	//* ��&Otilde;&szlig;&pound;&ordm;&Aring;&Euml;&ordm;&ccedil;                                                          *
	//* &Ecirc;�&frac14;&auml;&pound;&ordm;2013.09.28                                                    *
	//***********************************************************************
	public static int Main()
	{
		int num;
		int i;
		int[] a = new int[3];
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = 0;

		if (num % 3 == 0)
		{
			a[i] = 3;
			i++;
		}
		if (num % 5 == 0)
		{
			a[i] = 5;
			i++;
		}
		if (num % 7 == 0)
		{
			a[i] = 7;
			i++;
		}
		i--;



		if (i == -1)
		{
			System.out.print("n");
		}
		else
		{
			for (int j = 0; j <= i; j++)
			{
				System.out.print(a[j]);
				if (j < i)
				{
					System.out.print(" ");
				}
			}
		}

		return 0;
	}





}

