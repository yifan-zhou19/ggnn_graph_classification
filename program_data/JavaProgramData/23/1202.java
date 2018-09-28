package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String m = new String(new char[100]);
		String b = new String(new char[100]);
	  int i;
	  int j = 0;
	  int k = 0;
	  int p;
	  int n;
	  m = new Scanner(System.in).nextLine();
	  n = m.length();
	 while (true)
	 {
	  for (p = 0;m.charAt(k) != ' ' && m.charAt(k) != 0;k++, p++)
	  {
		  ;
	  }
	  for (i = k;p > 0;j++,i--,p--)
	  {
		  b = tangible.StringFunctions.changeCharacter(b, n - i, m.charAt(j));
	  }
	  if (n - k - 1 >= 0)
	  {
		  b = tangible.StringFunctions.changeCharacter(b, n - k - 1, ' ');
	  }
	  if (m.charAt(k) == 0)
	  {
		  break;
	  }
	  j = (++k);
	 }
	b = tangible.StringFunctions.changeCharacter(b, n, '\0');
	for (i = 0;i < n;i++)
	{
		System.out.printf("%c",b.charAt(i));
	}
	}

}

