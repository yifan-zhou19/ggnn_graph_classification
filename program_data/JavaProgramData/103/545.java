package <missing>;

public class GlobalMembers
{
	public static void count(tangible.RefObject<String> string)
	{
		int i = 0;
		int j = 0;
		while (String[i] != '\0')
		{
				while (*(string.argValue.Substring(i)) == *(string.argValue.Substring(j)))
				{
			i++;
				}
			System.out.printf("(%c,%d)",*(string.argValue.Substring(j)),i - j);
			j = i;
		}
	}
	public static int Main()
	{
		String string = new String(new char[1001]);
		String = new Scanner(System.in).nextLine();
		int i;
		for (i = 0;string.charAt(i) != '\0';i++)
		{
		if (String[i] >= 'a' && string.charAt(i) <= 'z')
		{
		String[i] = string.charAt(i) - 'a'+'A';
		}
		}
	tangible.RefObject<String> tempRef_String = new tangible.RefObject<String>(String);
		count(tempRef_String);
		String = tempRef_String.argValue;
		return 0;
	}

}

