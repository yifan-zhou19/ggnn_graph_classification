package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
	 int i;
	 int j;
	 int n;
	 int m;
	 a = new Scanner(System.in).nextLine();
	 n = a.length();
	 for (i = 0;i < n;i++)
	 {
		 if (i == n - 1)
		 {
		 b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
		 }
		 else
		 {
		b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		 }
	 }
	 b = tangible.StringFunctions.changeCharacter(b, n, '\0');
	 System.out.printf("%s",b);
	 return 0;
	}
}

