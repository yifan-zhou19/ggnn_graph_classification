package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int k;
	 int b = 0;
	 String jj = new String(new char[255]);
	  jj = new Scanner(System.in).nextLine();
	  n = jj.length();
	  for (k = 0;k < n - 1;k++)
	  {
		  if (jj.charAt(k) == ' ' && jj.charAt(k + 1) == ' ')
		  {
			  b++;
		  for (i = k;jj.charAt(i);i++)
		  {
			  jj = tangible.StringFunctions.changeCharacter(jj, i, jj.charAt(i + 1));
		  }
		  k = k - 2;
		  }
	  }
	  i = 0;
	  for (i = 0;i < n - b;i++)
	  {
		  System.out.printf("%c",jj.charAt(i));
	  }

	 return 0;
	}

}

