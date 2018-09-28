package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int j;
	int k;
	int i = 0;
	int n;
	String text = new String(new char[40]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	while (i <= n)
	{
		i++;
	 text = new Scanner(System.in).nextLine();
	 k = text.length();
	 if ((text.charAt(k - 1) == 'r' && text.charAt(k - 2) == 'e') || (text.charAt(k - 1) == 'y' && text.charAt(k - 2) == 'l'))
	 {
	  text = tangible.StringFunctions.changeCharacter(text, k - 2, '\0');
	 }
	 else
	 {
		 text = tangible.StringFunctions.changeCharacter(text, k - 3, '\0');
	 }
	System.out.printf("%s\n",text);
	}
	}

}

