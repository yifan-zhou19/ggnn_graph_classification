package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int q = 0;
		String a = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 0;i < n - 1;i++)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				while (a.charAt(i + 1) == ' ')
				{
			   for (j = i;j < n - 1;j++)
			   {
			   a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
			   }
			   q++;
				}
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, n - q, '\0');
		System.out.printf("%s",a);
		return 0;
	}

}

