package <missing>;

public class GlobalMembers
{
	public static int f(String a)
	{
		 int i;
		 int j;
		 int n;
		 n = a.length();
		 String b = new String(new char[501]);
		 j = 0;
		 for (i = n - 1;i >= 0;i--)
		 {
		   b = tangible.StringFunctions.changeCharacter(b, j++, a[i]);
		 }
		  b = tangible.StringFunctions.changeCharacter(b, j, '\0');
		  if (strcmp(a,b) == 0)
		  {
			  return 1;
		  }
		  else
		  {
			  return 0;
		  }

	}

	public static int Main()
	{
		String a = new String(new char[501]);
		String b = new String(new char[501]);
		a = new Scanner(System.in).nextLine();
		int n;
		int i;
		int j;
		int k;
		int s;
		n = a.length();

		for (i = 2;i <= n;i++)
		{
		   for (j = 0;j + i - 1 < n;j++)
		   {
			 s = 0;
			 for (k = 0;k < 500;k++)
			 {
			 b = tangible.StringFunctions.changeCharacter(b, k, '\0');
			 }
			 for (k = j;k < j + i;k++)
			 {
			   b = tangible.StringFunctions.changeCharacter(b, s++, a.charAt(k));
			 }
			 if (f(b) == 1)
			 {
				 System.out.printf("%s\n",b);
			 }
		   }
		}
			return 0;

	}
}

