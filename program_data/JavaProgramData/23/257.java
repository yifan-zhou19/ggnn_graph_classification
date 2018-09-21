package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int n;
		int i = 99;
		int j;
		str = new Scanner(System.in).nextLine();
		while (i >= 0)
		{
			n = str.length();
			if (str.charAt(i) == ' ')
			{
			   j = i + 1;
			   while (j < n)
			   {
				   System.out.printf("%c",str.charAt(j));
				j = j + 1;
			   }
			  System.out.print(" ");
			  str = tangible.StringFunctions.changeCharacter(str, i, '\0');
			}
			if (i == 0)
			{
			System.out.println(str);
			}
			i = i - 1;
		}
		 return 0;
	}

}

