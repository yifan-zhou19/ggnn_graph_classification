package <missing>;

public class GlobalMembers
{
	public static String strInsert(tangible.RefObject<String> str, int n, String strIn)
	{
		int l = strIn.length();
		int i;
		for (i = str.argValue.length();i > n; i--)
		{
			*(str.argValue.Substring(i) + l) = *(str.argValue.Substring(i));
		}
		for (i = 0;i < l;i++)
		{
			*(str.argValue.Substring(n) + 1 + i) = *(strIn.Substring(i));
		}
		return str.argValue;
	}
	public static void Main()
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
				if (*(str.Substring(i)) > *(str.Substring(max)))
				{
					max = i;
				}
			}
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
			System.out.println(strInsert(tempRef_str, max, substr));
			str = tempRef_str.argValue;
		}while (System.in.read() != EOF);
	}
}

