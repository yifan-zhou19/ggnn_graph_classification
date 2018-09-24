package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		String ans = new String(new char[15]);
		int i;
		int index;
		int max;
		int length;
		while (scanf("%s%s",str,substr) != EOF)
		{
		max = str.charAt(0);
		for (i = 0;str.charAt(i) != '\0';i++)
		{
			if (str.charAt(i) > max)
			{
			  max = str.charAt(i);
			  index = i;
			}
		}
		length = i;
		ans = str.substring(0, index + 1);
		for (i = 0;substr.charAt(i) != '\0';i++)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, index + 1 + i, substr.charAt(i));
		}
		for (i = index + 1;str.charAt(i) != '\0';i++)
		{
			ans = tangible.StringFunctions.changeCharacter(ans, i + 3, str.charAt(i));
		}
		ans = tangible.StringFunctions.changeCharacter(ans, length + 3, '\0');
		System.out.printf("%s\n",ans);
		}



	}
}

