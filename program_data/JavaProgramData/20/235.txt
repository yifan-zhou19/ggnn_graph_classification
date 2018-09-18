package <missing>;

public class GlobalMembers
{
	public static String strInsert(tangible.RefObject<String> strDest, int n, String strIn)
	/* ?strIn???strDest[n]?? */
	{
		int l = strIn.length();
		int i;
		for (i = strDest.argValue.length(); i > n; i--)
		{
			strDest.argValue.charAt(i + l) = strDest.argValue.charAt(i);
		}
		for (i = 0; i < l; i++)
		{
			strDest.argValue.charAt(n + 1 + i) = strIn.charAt(i);
		}
		return strDest.argValue;
	}

	public static int Main()
	{
		String str = new String(new char[15]);
		String substr = new String(new char[4]);
		int i;
		int max;
		short flag;

		do
		{
			flag = scanf("%s %s", str, substr);
			if (flag < 2)
			{
				break;
			}
			max = 0;
			for (i = 1; i < String.valueOf(str.charAt(0)).length(); i++)
			{
				if (str.charAt(i) > str.charAt(max))
				{
					max = i;
				}
			}
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			System.out.println(strInsert(tempRef_str, max, substr));
			str = tempRef_str.argValue;
		}while (System.in.read() != EOF);

		return 0;
	}
}

