package <missing>;

public class GlobalMembers
{
	public static int Strlen(tangible.RefObject<String> ch1)
	{
		int i = 0;
		for (i = 0;ch1.argValue.charAt(i) != '\0';i++)
		{
			;
		}
		return i;
	}
	public static void Main()
	{
		String ch1 = new String(new char[100]);
		String ch2 = new String(new char[100]);
		String a = new String(new char[20]);
		int i;
		int j;
		int k = 0;
		ch1 = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_ch1 = new tangible.RefObject<String>(ch1);
		for (i = Strlen(tempRef_ch1) - 1;i >= 0;i--)
		{
			ch1 = tempRef_ch1.argValue;
			if (ch1.charAt(i) != ' ')
			{
				j = 0;
				do
				{
					a = tangible.StringFunctions.changeCharacter(a, j++, ch1.charAt(i--));
				} while (ch1.charAt(i) != ' ' && i >= 0);
				a = tangible.StringFunctions.changeCharacter(a, j, ' ');
				for (j = j;j >= 0;j--,k++)
				{
					ch2 = tangible.StringFunctions.changeCharacter(ch2, k - 1, a.charAt(j));
				}
				i++;
			}
		}
		ch1 = tempRef_ch1.argValue;
	ch2 = tangible.StringFunctions.changeCharacter(ch2, k - 1, '\0');
	System.out.printf("%s\n",ch2);
	}

}

