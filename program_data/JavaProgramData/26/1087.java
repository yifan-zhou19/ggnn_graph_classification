package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j = 0;
	   String sz = new String(new char[101]);
	   String a = new String(new char[101]);
	   sz = new Scanner(System.in).nextLine();
	   int n = sz.length();
	   for (i = 0;i < n - 1;i++)
	   {
		if (sz.charAt(i) == ' ' && sz.charAt(i + 1) == ' ')
		{
			continue;
		}
		else if (sz.charAt(i) != ' ' || (sz.charAt(i) == ' ' && sz.charAt(i + 1) != ' '))
		{
			a = tangible.StringFunctions.changeCharacter(a, j, sz.charAt(i));
			j++;
		}
	   }
		a = tangible.StringFunctions.changeCharacter(a, j, sz.charAt(n - 1));
	   a = tangible.StringFunctions.changeCharacter(a, j + 1, '\0');
		System.out.printf("%s",a);
	return 0;
	}
}

