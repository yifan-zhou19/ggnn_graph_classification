package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int i;
	  int j;
	  int k;
	  char[][] c = new char[n][101];
	  int[] d = new int[n];
	  for (j = 0;j < n;j++)
	  {
		 String a = new String(new char[101]);
		 String b = new String(new char[101]);
		 a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 b = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 if (j == n - 1)
		 {
			 ;
		 }
		 else
		 {
			 System.in.read();
		 }
		 int sizea;
		 int sizeb;
		 sizea = a.length();
		 d[j] = sizea;
		 sizeb = b.length();
		 for (i = sizeb - 1;i >= 0;i--)
		 {
			 b = tangible.StringFunctions.changeCharacter(b, i + sizea - sizeb, b.charAt(i));
		 }
		 for (i = 0;i < sizea - sizeb;i++)
		 {
		 b = tangible.StringFunctions.changeCharacter(b, i, '0');
		 }
		 for (i = sizea - 1;i >= 0;i--)
		 {
			if (a.charAt(i) >= b.charAt(i))
			{
			c[j][i] = a.charAt(i) - b.charAt(i) + '0';
			}
			else if (a.charAt(i) < b.charAt(i))
			{
				a = tangible.StringFunctions.changeCharacter(a, i - 1, a.charAt(i - 1) - 1);
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) + 10);
				c[j][i] = a.charAt(i) - b.charAt(i) + '0';
			}
		 }

	  }
	  for (i = 0;i < n;i++)
	  {
		 for (j = 0;j < n;j++)
		 {
		 if (c[i][j] != '0')
		 {
		 break;
		 }
		 }
		 for (k = j;k < d[i];k++)
		 {
		 System.out.print(c[i][k]);
		 }
		 System.out.print("\n");
	  }

	  return 0;
	}

}

