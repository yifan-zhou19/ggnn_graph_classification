package <missing>;

public class GlobalMembers
{
	public static final String A = ""; //??????:??A?????,b`g????????????
	public static char b;
	public static char g;
	public static int i; //??????:????i`j`a,????l,
	public static int j;
	public static int l;
	public static int a;
	public static void outcome() //????
	{
		 for (i = a;i < l;i++)
		 {
			 if (A.charAt(i) == g)
			 {
				 A = tangible.StringFunctions.changeCharacter(A, i, '\0');
				 break;
			 }
		 }
		 for (j = i - 1;j >= 0;j--)
		 {
			 if (A.charAt(j) == b)
			 {
				 A = tangible.StringFunctions.changeCharacter(A, j, '\0');
				 break;
			 }
		 }
		 System.out.print(j);
		 System.out.print(" ");
		 System.out.print(i);
		 System.out.print("\n");
		 if (i != l - 1)
		 {
			 outcome();
		 }
	}
	public static int Main()
	{
		A = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = A.charAt(0);
		l = A.length();
		for (a = 1;a < l;a++) //??????????????????????
		{
			if (A.charAt(a) != b)
			{
				g = A.charAt(a);
				break;
			}
		}
		outcome();
		return 0;
	}
}

