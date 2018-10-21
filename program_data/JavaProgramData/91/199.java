package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
	 int i;
	 int n = 0;
	 String b = new String(new char[200]);
	 a = new Scanner(System.in).nextLine();
	 for (i = 0; * (a.Substring(i)) != '\0';i++)
	 {
		 n++;
	 }
	 for (i = 0;i < n - 1;i++)
	 {
		 b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
	 }
	 b = tangible.StringFunctions.changeCharacter(b, n - 1, a.charAt(0) + a.charAt(n - 1));
	 for (i = 0;i < n;i++)
	 {
	 System.out.printf("%c",b.charAt(i));
	 }
	}
}

