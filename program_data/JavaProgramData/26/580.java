package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		n = a.length();
		for (i = 1;i < n;i++)
		{
				   if (a.charAt(i) == ' ')
				   {
								 if (a.charAt(i + 1) == ' ')
								 {
												 for (j = i + 1;j < n;j++)
												 {
												 a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
												 }
												 n = n - 1;
												 a = tangible.StringFunctions.changeCharacter(a, n, '\0');
												 i = i - 1;
								 }
				   }
		}
		System.out.printf("%s",a);
		System.in.read();
		System.in.read();
	}
}

