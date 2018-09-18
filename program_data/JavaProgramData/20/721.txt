package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String s1 = new String(new char[13]);
	   String s2 = new String(new char[5]);
	   int i;
	   int j;
	   int m;
	   int a;
	   while (scanf("%s%s",s1,s2) != EOF)
	   {
		 a = 0;
		 m = s1.length();
		 for (i = 0;i < m;i++)
		 {
			 if (s1.charAt(i) > s1.charAt(a))
			 {
			   a = i;
			 }
		 }
		 for (i = m - 1;i > a;i--)
		 {
			 s1 = tangible.StringFunctions.changeCharacter(s1, i + 3, s1.charAt(i));
		 }
		 for (i = a + 1,j = 0;i < a + 1 + 3;i++,j++)
		 {
			 s1 = tangible.StringFunctions.changeCharacter(s1, i, s2.charAt(j));
		 }
		 for (i = 0;i < m + 3;i++)
		 {
		 System.out.printf("%c",s1.charAt(i));
		 }
	System.out.print("\n");
	   }
	}
}

