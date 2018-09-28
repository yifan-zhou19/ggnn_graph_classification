package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[1000]);
	char[][] b = new char[300][100];
	int i;
	int m = 0;
	int n = 0;
	a = new Scanner(System.in).nextLine();
	for (i = 0;i < a.length();i++)
	{
	  if (n == 0 && a.charAt(i) == ' ')
	  {
	  continue;
	  }
	  if (a.charAt(i) == ' ')
	  {
	   b[m][n] = '\0';
	   m++;
	   n = 0;
	  }
	  else
	  {
		  b[m][n] = a.charAt(i);
		  n++;
	  }
	}
	b[m][n] = '\0';
	for (i = 0;i < m;i++)
	{
	System.out.printf("%d,",String.valueOf(b[i]).length());
	}
	System.out.printf("%d",String.valueOf(b[i]).length());

	return 0;
	}

}
