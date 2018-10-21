package <missing>;

public class GlobalMembers
{
	public static String in = new String(new char[102]);
	public static int lenth;
	public static void match(int n)
	{
		 for (int i = 0;i < lenth;i++)
		 {
				 if (in.charAt(i) == '(' && in.charAt(i + n) == ')')
				 {
					  in = tangible.StringFunctions.changeCharacter(in, i, ' ');
					  in = tangible.StringFunctions.changeCharacter(in, i + n, ' ');
				 }
		 }
		 if (n <= lenth - 2)
		 {
		 match(n + 1);
		 }
	}
	public static void print(String in)
	{
		 for (int i = 0;i < lenth;i++)
		 {
				 if (in[i].equals('('))
				 {
					  in[i] = '$';
				 }
				 else if (in[i].equals(')'))
				 {
					  in[i] = '?';
				 }
				 else
				 {
					  in[i] = ' ';
				 }
		 }
		 System.out.print(in);
		 System.out.print("\n");
	}
	public static int Main()
	{
		while ((in = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
		{
			   System.out.print(in);
			   System.out.print("\n");
			   lenth = in.length();
			   match(0);
			   print(in);
		}
		return 0;
	}
}

