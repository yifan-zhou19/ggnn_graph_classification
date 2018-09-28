package <missing>;

public class GlobalMembers
{
	 public static int Main()
	 {
	 String a = new String(new char[100]);
	 String b = new String(new char[10]);
	 int n;
	 int i;
	 int j;
	 a = new Scanner(System.in).nextLine();
	 n = a.length();
	 for (i = 0;i < 10;i++)
	 {
	 b = tangible.StringFunctions.changeCharacter(b, i, '0' + i);
	 }
	 for (i = 0;i < n;i++)
	 {
	   for (j = 0;j < 10;j++)
	   {
		if (a.charAt(i) == b.charAt(j) && ((a.charAt(i + 1) - '0' >= 0) || (a.charAt(i + 1) - '0' <= 9)))
		{
		System.out.printf("%c",b.charAt(j));
		}

		if (a.charAt(i) == b.charAt(j) && ((a.charAt(i + 1) - '0' < 0) || (a.charAt(i + 1) - '0'>9)))
		{
		System.out.printf("\n",b.charAt(j));
		}
	   }
	 }
	 }

}

