package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[1000]);
		String sub = new String(new char[500]);
		String rep = new String(new char[500]);
		int n;
		int m;
		int cut;
		int i = 0;
		int flag = 0;
		str = ConsoleInput.readToWhiteSpace(true).charAt(0);
		sub = ConsoleInput.readToWhiteSpace(true).charAt(0);
		rep = ConsoleInput.readToWhiteSpace(true).charAt(0);
		n = str.length();
		m = sub.length();
		cut = rep.length();
		while (str.charAt(i) != '\0')
		{
			if (str.charAt(i) == sub.charAt(0))
			{
				int j = 0;
				int k = i;
				while (sub.charAt(j) != '\0')
				{
					if (sub.charAt(j) == str.charAt(k))
					{
						j++;
						k++;
					}
					else
					{
						break;
					}
				}
				if (j == m)
				{
					for (int t = n - 1; t >= i + m; t--)
					{
						str = tangible.StringFunctions.changeCharacter(str, t + cut - m, str.charAt(t));
					}
					str = tangible.StringFunctions.changeCharacter(str, n + cut - m, '\0');
					for (int t = i; t < i + cut ;t++)
					{
						str = tangible.StringFunctions.changeCharacter(str, t, rep.charAt(t - i));
					}
					flag = 1;
				}
				if (flag == 1)
				{
					break;
				}
			}
			i++;
		}
		System.out.print(str);
		return 0;
	}
}

