package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String a = new String(new char[80]);
	 String b = new String(new char[80]);
	 int i;
	 int j;
	 a = new Scanner(System.in).nextLine();
	 b = new Scanner(System.in).nextLine();
	 for (i = 0;i <= a.length() - 1;i++)
	 {
	   if ((a.charAt(i) >= 65) && (a.charAt(i) <= 96))
	   {
		 a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 32);
	   }
	 }
	 for (i = 0;i <= b.length() - 1;i++)
	 {
	   if ((b.charAt(i) >= 65) && (b.charAt(i) <= 96))
	   {
		 b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) + 32);
	   }
	 }
	 j = strcmp(a,b);
	 if (j == 0)
	 {
	   System.out.print("=\n");
	 }
	   else if (j > 0)
	   {
		 System.out.print(">\n");
	   }
		 else
		 {
			 System.out.print("<\n");
		 }
	}
}

