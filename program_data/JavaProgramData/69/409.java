package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  String a = new String(new char[251]);
		  String b = new String(new char[251]);
		  String c = new String(new char[251]);
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  int i;
		  int j;
		  int m;
		  int n;

		  for (i = 0;i <= 250;i++)
		  {
		  if (a.charAt(i) == '\0')
		  {
		  break;
		  }
		  }

		  for (j = 0;j <= 250;j++)
		  {
		  if (b.charAt(j) == '\0')
		  {
		  break;
		  }
		  }

		  if (i >= j)
		  {
			 m = i - j;
			 for (;j >= 0;j--)
			 {
			 b = tangible.StringFunctions.changeCharacter(b, j + m, b.charAt(j));
			 }
			 while (m > 0)
			 {
				   b = tangible.StringFunctions.changeCharacter(b, m - 1, '0');
				   m--;
			 }
			 n = i;
		  }
		  if (i < j)
		  {
			 m = j - i;
			 for (;i >= 0;i--)
			 {
			 a = tangible.StringFunctions.changeCharacter(a, i + m, a.charAt(i));
			 }
			 while (m > 0)
			 {
				   a = tangible.StringFunctions.changeCharacter(a, m - 1, '0');
				   m--;
			 }
			 n = j;
		  }
		  for (i = n - 1;i >= 0;i--)
		  {
			  c = tangible.StringFunctions.changeCharacter(c, i, a.charAt(i) + b.charAt(i) - '0');
			  if ((int)c.charAt(i) >= 10 + '0')
			  {
				 c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i) - 10);
				 a.charAt(i - 1)++;
			  }
		  }

		  if (a.charAt(0) + b.charAt(0) > 9 + '0' + '0')
		  {
			 System.out.print("1");
			 for (i = 0;i <= n - 1;i++)
			 {
			 System.out.printf("%c",c.charAt(i));
			 }
		  }
		  else
		  {
		  for (i = 0;i <= n - 1;i++)
		  {
			  if ((int)c.charAt(0) == 0 + '0' && n != 1)
			  {
			  for (i = 1;i <= n - 1;i++)
			  {
			  System.out.printf("%c",c.charAt(i));
			  }
			  }
			  else
			  {
			  System.out.printf("%c",c.charAt(i));
			  }
		  }
		  }
	}

}

