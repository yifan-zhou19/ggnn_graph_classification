package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int lena;
		int lenb;
		int m;
		int p;
		String a = new String(new char[110]);
		String b = new String(new char[110]);
		char t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n > 0;n--)
		{
			a = new Scanner(System.in).nextLine();
			b = new Scanner(System.in).nextLine();
			lena = a.length();
			lenb = b.length();
			for (i = 0;i < lenb / 2;i++)
			{
			  t = b.charAt(i);
			  b = tangible.StringFunctions.changeCharacter(b, i, b.charAt(lenb - i - 1));
			  b = tangible.StringFunctions.changeCharacter(b, lenb - i - 1, t);
			}
			for (i = 0;i < lena / 2;i++)
			{
			  t = a.charAt(i);
			  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(lena - i - 1));
			  a = tangible.StringFunctions.changeCharacter(a, lena - i - 1, t);
			}
			for (i = 0;i < lenb;i++)
			{
				if (a.charAt(i) >= b.charAt(i))
				{
				 a = tangible.StringFunctions.changeCharacter(a, i, '0' + a.charAt(i) - b.charAt(i));
				}
				else
				{
				  j = i + 1;
				  while (a.charAt(j) == '0')
				  {
				   a = tangible.StringFunctions.changeCharacter(a, j, '9');
				   j++;
				  }
				  a.charAt(j) -= 1;
				  a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10 - b.charAt(i) + '0');
				}
			}
			for (i = lena - 1;i >= 0;i--)
			{
			  if (a.charAt(i) != '0')
			  {
				  break;
			  }
			}
			for (j = i;j >= 0;j--)
			{
			 System.out.printf("%c",a.charAt(j));
			}
			System.out.print("\n");
			a = new Scanner(System.in).nextLine();
		}
	}

}

