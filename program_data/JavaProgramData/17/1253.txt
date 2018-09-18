package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 String a = new String(new char[101]);
	 while (gets(a))
	 {
			 n = a.length();
			 for (i = 0;i <= n - 2;i++)
			 {
			   System.out.printf("%c",a.charAt(i));
			 }
			 System.out.printf("%c\n",a.charAt(n - 1));
			 for (i = 0;i < n;i++)
			 {
				if (a.charAt(i) == ')')
				{
				   for (j = i;j >= 0;j--)
				   {
					  if (a.charAt(j) == '(')
					  {
						 a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						 a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						 break;
					  }
				   }
				}
			 }
			 for (i = 0;i < n;i++)
			 {
				if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z' || a.charAt(i) >= 'A' && a.charAt(i) <= 'Z' || a.charAt(i) == ' ')
				{
				  a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
				else if (a.charAt(i) == ')')
				{
					 a = tangible.StringFunctions.changeCharacter(a, i, '?');
				}
				else if (a.charAt(i) == '(')
				{
					 a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
			 }
			 for (i = 0;i < n;i++)
			 {
				System.out.printf("%c",a.charAt(i));
			 }
			 System.out.print("\n");
	 }

	}

}

