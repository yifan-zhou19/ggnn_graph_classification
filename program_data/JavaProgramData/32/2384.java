package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[100]);
	  String b = new String(new char[100]);
	  char[][] c = new char[30][100];
	  int n;
	  int i;
	  int j;
	  int m1;
	  int m2;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }

	  for (i = 0;i < n;i++)
	  {
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		if (i != n - 1)
		{
			System.in.read();
		}

		m1 = a.length();
		m2 = b.length();
		for (j = m2 - 1;j >= 0;j--)
		{
			b = tangible.StringFunctions.changeCharacter(b, j + m1 - m2, b.charAt(j));
		}
		for (j = 0;j < m1 - m2;j++)
		{
			b = tangible.StringFunctions.changeCharacter(b, j, '0');
		}

		for (j = m1 - 1;j >= 0;j--)
		{
			if (a.charAt(j) < b.charAt(j))
			{
				c[i][j] = a.charAt(j) + 10 - b.charAt(j);
				a.charAt(j - 1)--;
			}
			else
			{
				c[i][j] = a.charAt(j) - b.charAt(j);
			}
		}
		c[i][m1] = 10;
	  }

	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;c[i][j] < 10;j++)
		  {
			 System.out.printf("%d",c[i][j]);
		  }
		  System.out.print("\n");
	  }

	}

}

