package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int i;
		 int j;
		 int k;
		 int n1;
		 int n2;
		 int m;
		 int d;
		 String s1 = new String(new char[81]);
		 String s2 = new String(new char[81]);
		 s1 = new Scanner(System.in).nextLine();
		 s2 = new Scanner(System.in).nextLine();
		 n1 = s1.length();
		 n2 = s2.length();
		 for (i = 0;i < n1;i++)
		 {
						  if (s1.charAt(i) > 'A' && s1.charAt(i) < 'Z')
						  {
						  s1 = tangible.StringFunctions.changeCharacter(s1, i, s1.charAt(i) - 'A'+'a');
						  }
		 }
		 for (i = 0;i < n2;i++)
		 {
						  if (s2.charAt(i) > 'A' && s2.charAt(i) < 'Z')
						  {
						  s2 = tangible.StringFunctions.changeCharacter(s2, i, s2.charAt(i) - 'A'+'a');
						  }
		 }
		 k = strcmp(s1,s2);
		 if (k == 0)
		 {
		 System.out.print("=");
		 }
		 else if (k > 0)
		 {
		 System.out.print(">");
		 }
		 else
		 {
		 System.out.print("<");
		 }

	}

}

