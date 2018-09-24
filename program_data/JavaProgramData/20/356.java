package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[20]);
		String sub = new String(new char[10]);
	 int max;
	 int i;
	 int j;
	 while (scanf("%s%s",str,sub) != EOF)
	 {
		j = str.length();
		max = 0;
		for (i = 1;str.charAt(i);i++)
		{
		if (str.charAt(i) > str.charAt(max))
		{
			max = i;
		}
		}
		for (i = j;i > max;i--)
		{
		str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
		}
		for (i = 0;i < 3;i++)
		{
		str = tangible.StringFunctions.changeCharacter(str, max + i + 1, sub.charAt(i));
		}
		System.out.printf("%s\n",str);
	 }
	}

}

