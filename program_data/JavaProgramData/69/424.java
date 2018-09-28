package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int m;
		  int n;
		  String a = new String(new char[250]);
		  String b = new String(new char[250]);
		  a = new Scanner(System.in).nextLine();
		  b = new Scanner(System.in).nextLine();
		  m = b.length();
		  n = a.length();


		  if (m <= n)
		  {
		  for (i = n;i > 0;i = i - 1)
		  {
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i - 1) - '0');
		  }
		  a = null;

		  for (i = m - 1;i >= 0;i = i - 1)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i) - '0');
		  }


		  for (i = 0;i < m;i = i + 1)
		  {
		  a = tangible.StringFunctions.changeCharacter(a, n - 1 - i, a.charAt(n - 1 - i) + (a.charAt(n - i) + b.charAt(m - 1 - i)) / 10);
		  a = tangible.StringFunctions.changeCharacter(a, n - i, (a.charAt(n - i) + b.charAt(m - 1 - i)) % 10);
		  }
		  for (i = m;i < n;i = i + 1)
		  {
		  a = tangible.StringFunctions.changeCharacter(a, n - 1 - i, a.charAt(n - 1 - i) + a.charAt(n - i) / 10);
		  a = tangible.StringFunctions.changeCharacter(a, n - i, a.charAt(n - i) % 10);

		  }


		  for (i = 0;a.charAt(i) == 0;i = i + 1)
		  {
		  if (i == n + 1)
		  {
		  break;
		  }
		  }
		  if (i == n + 1)
		  {
		  System.out.print("0");
		  }
		  for (;i < n + 1;i = i + 1)
		  {
		  System.out.printf("%c",a.charAt(i) + '0');
		  }



		  }
		  else
		  {
		  for (i = m;i > 0;i = i - 1)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(i - 1) - '0');
		  }
		  b = null;

		  for (i = n - 1;i >= 0;i = i - 1)
		  {
		  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
		  }


		  for (i = 0;i < n;i = i + 1)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, m - 1 - i, b.charAt(m - 1 - i) + (b.charAt(m - i) + a.charAt(n - 1 - i)) / 10);
		  b = tangible.StringFunctions.changeCharacter(b, m - i, (b.charAt(m - i) + a.charAt(n - 1 - i)) % 10);
		  }
		  for (i = n;i < m;i = i + 1)
		  {
		  b = tangible.StringFunctions.changeCharacter(b, m - 1 - i, b.charAt(m - 1 - i) + b.charAt(m - i) / 10);
		  b = tangible.StringFunctions.changeCharacter(b, m - i, b.charAt(m - i) % 10);

		  }

		  for (i = 0;b.charAt(i) == 0;i = i + 1)
		  {
		  ;
		  }

		  for (;i < m + 1;i = i + 1)
		  {
		  System.out.printf("%c",b.charAt(i) + '0');
		  }

		  }

	}

}

